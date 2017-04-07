package visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import com.toedter.calendar.JCalendar;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegCita {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public RegCita() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 695, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 6, 472, 121);
		panel.add(panel_1);
		panel.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "Datos Generales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(6, 21, 61, 16);
		panel_1.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(6, 49, 61, 16);
		panel_1.add(lblApellido);
		
		JLabel lblCedula = new JLabel("Cedula:");
		lblCedula.setBounds(6, 77, 61, 16);
		panel_1.add(lblCedula);
		
		textField = new JTextField();
		textField.setBounds(79, 16, 130, 26);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(79, 44, 130, 26);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(79, 72, 130, 26);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(221, 21, 61, 16);
		panel_1.add(lblEdad);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setBounds(221, 49, 86, 16);
		panel_1.add(lblEstadoCivil);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Casado", "Soltero"}));
		comboBox.setBounds(308, 48, 147, 20);
		panel_1.add(comboBox);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(308, 16, 46, 26);
		panel_1.add(spinner);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(6, 139, 423, 180);
		panel.add(panel_2);
		panel_2.setBorder(new TitledBorder(null, "Fecha y Hora", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setLayout(null);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(10, 26, 305, 137);
		panel_2.add(calendar);
		
		JLabel lblHora = new JLabel("Hora:");
		lblHora.setBounds(327, 26, 61, 16);
		panel_2.add(lblHora);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(327, 54, 42, 26);
		panel_2.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(327, 92, 42, 26);
		panel_2.add(spinner_2);
		
		JLabel lblNewLabel = new JLabel("Hr");
		lblNewLabel.setBounds(381, 59, 36, 16);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Min");
		lblNewLabel_1.setBounds(381, 97, 36, 16);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Motivo de cita", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(453, 139, 236, 180);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(6, 29, 224, 145);
		panel_3.add(textArea);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setBounds(572, 328, 117, 29);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Confirmar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(443, 328, 117, 29);
		panel.add(btnNewButton_1);
		//contentPanel.add(panel);
		
	}
}
