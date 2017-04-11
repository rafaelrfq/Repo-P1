package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import java.awt.Color;
import com.toedter.calendar.JCalendar;
import javax.swing.JTextArea;

public class RegistrarCita extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombres;
	private JTextField txtCedula;
	private JTextField txtDireccion;
	private JTextField txtAseguradora;
	private JTextField txtPoliza;

	/**
	 * Create the dialog.
	 */
	public RegistrarCita() {
		setTitle("Registrar Cita M\u00E9dica");
		setBounds(100, 100, 753, 590);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Datos Generales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 385, 265);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(10, 18, 60, 14);
		panel.add(lblNombre);
		
		JLabel lblCdula = new JLabel("C\u00E9dula: ");
		lblCdula.setBounds(10, 48, 60, 14);
		panel.add(lblCdula);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n: ");
		lblDireccin.setBounds(10, 78, 60, 14);
		panel.add(lblDireccin);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil: ");
		lblEstadoCivil.setBounds(10, 108, 71, 14);
		panel.add(lblEstadoCivil);
		
		JLabel lblEdad = new JLabel("Edad: ");
		lblEdad.setBounds(10, 168, 46, 14);
		panel.add(lblEdad);
		
		JLabel lblNewLabel = new JLabel("N\u00FAm. de P\u00F3liza:");
		lblNewLabel.setBounds(10, 228, 86, 14);
		panel.add(lblNewLabel);
		
		JLabel lblAseguradora = new JLabel("Aseguradora: ");
		lblAseguradora.setBounds(10, 198, 86, 14);
		panel.add(lblAseguradora);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(92, 15, 283, 23);
		panel.add(txtNombres);
		txtNombres.setColumns(10);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(92, 45, 283, 23);
		panel.add(txtCedula);
		txtCedula.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(92, 75, 283, 23);
		panel.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		JComboBox cmbEstadoCivil = new JComboBox();
		cmbEstadoCivil.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Casado/a", "Soltero/a", "Uni\u00F3n Libre", "Viudo/a"}));
		cmbEstadoCivil.setSelectedIndex(0);
		cmbEstadoCivil.setBounds(92, 105, 120, 23);
		panel.add(cmbEstadoCivil);
		
		JLabel lblSexo = new JLabel("Sexo: ");
		lblSexo.setBounds(10, 138, 46, 14);
		panel.add(lblSexo);
		
		JComboBox cmbSexo = new JComboBox();
		cmbSexo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Masculino", "Femenino"}));
		cmbSexo.setSelectedIndex(0);
		cmbSexo.setBounds(92, 135, 120, 23);
		panel.add(cmbSexo);
		
		JSpinner spnEdad = new JSpinner();
		spnEdad.setModel(new SpinnerNumberModel(1, 1, 125, 1));
		spnEdad.setBounds(92, 165, 120, 23);
		panel.add(spnEdad);
		
		txtAseguradora = new JTextField();
		txtAseguradora.setBounds(92, 195, 283, 23);
		panel.add(txtAseguradora);
		txtAseguradora.setColumns(10);
		
		txtPoliza = new JTextField();
		txtPoliza.setBounds(92, 225, 283, 23);
		panel.add(txtPoliza);
		txtPoliza.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos Administrativos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 280, 385, 227);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Doctor a visitar:");
		lblNewLabel_1.setBounds(10, 18, 90, 14);
		panel_1.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(130, 15, 245, 23);
		panel_1.add(comboBox);
		
		JCalendar calendarioCita = new JCalendar();
		calendarioCita.setBounds(10, 66, 365, 153);
		panel_1.add(calendarioCita);
		
		JLabel lblDaAConsultar = new JLabel("D\u00EDa a consultar: ");
		lblDaAConsultar.setBounds(10, 48, 90, 14);
		panel_1.add(lblDaAConsultar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Raz\u00F3n de la Consulta", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(405, 280, 322, 227);
		contentPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblRazones = new JLabel("Razones:");
		lblRazones.setBounds(10, 25, 64, 14);
		panel_2.add(lblRazones);
		
		JTextArea txtRazones = new JTextArea();
		txtRazones.setBounds(10, 50, 302, 166);
		panel_2.add(txtRazones);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
