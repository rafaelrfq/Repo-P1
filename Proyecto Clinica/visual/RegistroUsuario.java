package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;

import logical.Administracion;
import logical.Clinica;
import logical.Medico;

import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;

public class RegistroUsuario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtCedula;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTextField txtPassword2;
	private JTextField txtPosicion;
	private JRadioButton rdbtnMedico;
	private JRadioButton rdbtnAdministracion;
	private JPanel panel_2;
	private JComboBox cmbEspecialidad;
	private JSpinner spnAnios;
	private JButton btnRegistrar;
	private Clinica clinica = Clinica.getInstance();

	/**
	 * Create the dialog.
	 */
	public RegistroUsuario() {
		setTitle("Registro Nuevo Usuario");
		setBounds(100, 100, 611, 527);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Rafael Felipe\\Pictures\\new_user.png"));
		label.setBounds(340, 11, 245, 256);
		contentPanel.add(label);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Datos Generales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 346, 182);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(10, 25, 77, 14);
		panel.add(lblNombre);
		
		JLabel lblCdula = new JLabel("C\u00E9dula:");
		lblCdula.setBounds(10, 60, 77, 14);
		panel.add(lblCdula);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(10, 90, 77, 14);
		panel.add(lblEdad);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setBounds(10, 120, 77, 14);
		panel.add(lblEstadoCivil);
		
		JLabel lblSexo = new JLabel("Sexo: ");
		lblSexo.setBounds(10, 150, 77, 14);
		panel.add(lblSexo);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(97, 22, 239, 23);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(97, 55, 239, 23);
		panel.add(txtCedula);
		txtCedula.setColumns(10);
		
		JSpinner spnEdad = new JSpinner();
		spnEdad.setModel(new SpinnerNumberModel(18, 18, 110, 1));
		spnEdad.setBounds(97, 86, 113, 23);
		panel.add(spnEdad);
		
		JComboBox cmbEstadoCivil = new JComboBox();
		cmbEstadoCivil.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Casado/a", "Soltero/a", "Uni\u00F3n Libre"}));
		cmbEstadoCivil.setSelectedIndex(0);
		cmbEstadoCivil.setBounds(97, 116, 113, 23);
		panel.add(cmbEstadoCivil);
		
		JComboBox cmbSexo = new JComboBox();
		cmbSexo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Masculino", "Femenino"}));
		cmbSexo.setSelectedIndex(0);
		cmbSexo.setBounds(97, 146, 113, 23);
		panel.add(cmbSexo);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		buttonPanel.setBounds(0, 451, 595, 36);
		contentPanel.add(buttonPanel);
		buttonPanel.setLayout(null);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCancelar.setBounds(507, 2, 89, 34);
		buttonPanel.add(btnCancelar);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setEnabled(false);
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean condicion = false;
				if(rdbtnMedico.isSelected()) {
					if(txtNombre.getText().equals("") || txtCedula.getText().equals("") || cmbEstadoCivil.getSelectedIndex()==0 || cmbSexo.getSelectedIndex()==0 || cmbEspecialidad.getSelectedIndex() == 0) {
						JOptionPane.showMessageDialog(null, "Todos los datos deben ser completados.", null, JOptionPane.WARNING_MESSAGE, null);
					}
				} else if(rdbtnAdministracion.isSelected()) {
					if(txtPosicion.getText().equals("") || txtNombre.getText().equals("") || txtCedula.getText().equals("") || cmbEstadoCivil.getSelectedIndex()==0 || cmbSexo.getSelectedIndex()==0) {
						JOptionPane.showMessageDialog(null, "Todos los datos deben ser completados.", null, JOptionPane.WARNING_MESSAGE, null);
					}
				} 
				if(txtUsername.getText().equals("") || txtPassword.getText().equals("") || txtPassword2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Debe escoger un nombre de usuario y password.", null, JOptionPane.WARNING_MESSAGE, null);
				} else if(!txtPassword.getText().equalsIgnoreCase((txtPassword2.getText()))) {
					JOptionPane.showMessageDialog(null, "Los passwords no coinciden.", null, JOptionPane.WARNING_MESSAGE, null);
				} else condicion = true;
				if(condicion) {
					if(rdbtnMedico.isSelected()) {
						Medico aux = new Medico(txtNombre.getText(), cmbSexo.getSelectedItem().toString(), txtCedula.getText(), cmbEstadoCivil.getSelectedItem().toString(), Integer.parseInt(spnEdad.getValue().toString()), txtUsername.getText(), txtPassword.getText(), cmbEspecialidad.getSelectedItem().toString(), Integer.parseInt(spnAnios.getValue().toString()));
						clinica.agregarPersonal(aux);
						JOptionPane.showMessageDialog(null, "Usuario agregado satisfactoriamente.", null, JOptionPane.INFORMATION_MESSAGE, null);
					}
					if(rdbtnAdministracion.isSelected()) {
						Administracion aux = new Administracion(txtNombre.getText(), cmbSexo.getSelectedItem().toString(), txtCedula.getText(), cmbEstadoCivil.getSelectedItem().toString(), Integer.parseInt(spnEdad.getValue().toString()), txtUsername.getText(), txtPassword.getText(), txtPosicion.getText());
						clinica.agregarPersonal(aux);
						JOptionPane.showMessageDialog(null, "Usuario agregado satisfactoriamente.", null, JOptionPane.INFORMATION_MESSAGE, null);
					}
				}	
			}
		});
		btnRegistrar.setBounds(408, 2, 89, 34);
		buttonPanel.add(btnRegistrar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Tipo de Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 204, 346, 64);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		rdbtnMedico = new JRadioButton("M\u00E9dico");
		rdbtnMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnAdministracion.setSelected(false);
				panel_2.setVisible(true);
				cmbEspecialidad.setEnabled(true);
				spnAnios.setEnabled(true);
				txtPosicion.setEnabled(false);
				btnRegistrar.setEnabled(true);
			}
		});
		rdbtnMedico.setBounds(54, 27, 109, 23);
		panel_1.add(rdbtnMedico);
		
		rdbtnAdministracion = new JRadioButton("Administraci\u00F3n");
		rdbtnAdministracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnMedico.setSelected(false);
				panel_2.setVisible(true);
				cmbEspecialidad.setEnabled(false);
				spnAnios.setEnabled(false);
				txtPosicion.setEnabled(true);
				btnRegistrar.setEnabled(true);
			}
		});
		rdbtnAdministracion.setBounds(180, 27, 121, 23);
		panel_1.add(rdbtnAdministracion);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Datos Espec\u00EDficos seg\u00FAn Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(306, 289, 279, 151);
		contentPanel.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setVisible(false);
		
		JLabel lblEspecialidad = new JLabel("Especialidad: ");
		lblEspecialidad.setBounds(10, 30, 81, 14);
		panel_2.add(lblEspecialidad);
		
		JLabel lblAosDeTrabajo = new JLabel("A\u00F1os en cl\u00EDnica: ");
		lblAosDeTrabajo.setBounds(10, 70, 106, 14);
		panel_2.add(lblAosDeTrabajo);
		
		JLabel lblPosicin = new JLabel("Posici\u00F3n:");
		lblPosicin.setBounds(10, 110, 64, 14);
		panel_2.add(lblPosicin);
		
		txtPosicion = new JTextField();
		txtPosicion.setBounds(115, 107, 156, 23);
		panel_2.add(txtPosicion);
		txtPosicion.setColumns(10);
		
		spnAnios = new JSpinner();
		spnAnios.setBounds(115, 67, 77, 23);
		panel_2.add(spnAnios);
		
		cmbEspecialidad = new JComboBox();
		cmbEspecialidad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Alergolog\u00EDa", "Anestesiolog\u00EDa y reanimaci\u00F3n", "Cardiolog\u00EDa", "Dermatolog\u00EDa", "Endocrinolog\u00EDa", "Gastroenterolog\u00EDa", "Geriatr\u00EDa", "Ginecolog\u00EDa", "Hematolog\u00EDa y hemoterapia", "Hidrolog\u00EDa m\u00E9dica", "Infectolog\u00EDa", "Medicina aeroespacial", "Medicina del deporte", "Medicina del trabajo", "Medicina de urgencias", "Medicina familiar y comunitaria", "Medicina f\u00EDsica y rehabilitaci\u00F3n", "Medicina intensiva", "Medicina interna", "Medicina legal y forense", "Medicina paliativa", "Medicina preventiva y salud p\u00FAblica", "Nefrolog\u00EDa", "Neonatolog\u00EDa", "Neumolog\u00EDa", "Neurolog\u00EDa", "Nutriolog\u00EDa", "Obstetricia", "Oftalmolog\u00EDa", "Oncolog\u00EDa m\u00E9dica", "Oncolog\u00EDa radioter\u00E1pica", "Pediatr\u00EDa", "Psiquiatr\u00EDa", "Rehabilitaci\u00F3n", "Reumatolog\u00EDa", "Toxicolog\u00EDa", "Urolog\u00EDa"}));
		cmbEspecialidad.setSelectedIndex(0);
		cmbEspecialidad.setBounds(115, 27, 156, 23);
		panel_2.add(cmbEspecialidad);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Datos de Log in", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 289, 286, 151);
		contentPanel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNomberDeUsuario = new JLabel("Username:");
		lblNomberDeUsuario.setBounds(10, 30, 73, 14);
		panel_3.add(lblNomberDeUsuario);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(10, 70, 73, 14);
		panel_3.add(lblPassword);
		
		JLabel lblRepetirPassword = new JLabel("Repetir Password:");
		lblRepetirPassword.setBounds(10, 110, 111, 14);
		panel_3.add(lblRepetirPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(119, 27, 160, 23);
		panel_3.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField(10);
		txtPassword.setBounds(119, 67, 160, 23);
		panel_3.add(txtPassword);
		
		txtPassword2 = new JPasswordField(10);
		txtPassword2.setBounds(119, 107, 160, 23);
		panel_3.add(txtPassword2);
	}
}
