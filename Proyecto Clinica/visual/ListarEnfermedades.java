package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import logical.Clinica;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ListarEnfermedades extends JDialog {

	Clinica miClinica;
	private final JPanel contentPanel = new JPanel();
	private static DefaultTableModel tableModel;
	private JTable table;
	static Object[] fila;

	public ListarEnfermedades() {
		setTitle("Listado de Enfermedades");
		setBounds(100, 100, 701, 364);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);

		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE));
		gl_contentPanel.setVerticalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING).addComponent(scrollPane,
				GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE));

		table = new JTable();
		table.setModel(tableModel = new DefaultTableModel(new Object[][] {},
				new String[] { "Nombre", "Porcentaje %" }));
		DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
		tcr.setHorizontalAlignment(SwingConstants.CENTER);
		table.getColumnModel().getColumn(0).setPreferredWidth(96);
		table.getColumnModel().getColumn(1).setPreferredWidth(104);
		fila = new Object[tableModel.getColumnCount()];
		for (int i = 0; i < miClinica.getMisEnfermedades().size(); i++) {
			fila[0] = miClinica.getMisEnfermedades().get(i).getNombre();
			fila[1] = miClinica.porcientoDeEnfermedad(miClinica.getMisEnfermedades().get(i).getNombre());
			if (miClinica.porcientoDeEnfermedad(miClinica.getMisEnfermedades().get(i).getNombre()) <= 0.05)
				table.setBackground(Color.GREEN);
			else if (miClinica.porcientoDeEnfermedad(miClinica.getMisEnfermedades().get(i).getNombre()) > 0.05
					&& miClinica.porcientoDeEnfermedad(miClinica.getMisEnfermedades().get(i).getNombre()) <= 0.15)
				table.setBackground(Color.YELLOW);
			else if (miClinica.porcientoDeEnfermedad(miClinica.getMisEnfermedades().get(i).getNombre()) > 0.15)
				table.setBackground(Color.RED);
			tableModel.addRow(fila);

		}

		scrollPane.setViewportView(table);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}

	}
}
