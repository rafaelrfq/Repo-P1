package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logical.Clinica;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class LogIn extends JDialog {

	private static Clinica clinica = Clinica.getInstance();
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField passwordField;

	/**
	 * Create the dialog.
	 */
	public LogIn() {
		setTitle("Log In");
		setBounds(100, 100, 397, 413);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Rafael Felipe\\Pictures\\login.png"));
		label.setBounds(64, 11, 256, 213);
		contentPanel.add(label);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario: ");
		lblNombreDeUsuario.setBounds(10, 245, 118, 14);
		contentPanel.add(lblNombreDeUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a: ");
		lblContrasea.setBounds(10, 285, 104, 14);
		contentPanel.add(lblContrasea);
		
		textField = new JTextField();
		textField.setBounds(126, 242, 247, 23);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField(10);
		passwordField.setBounds(126, 282, 247, 23);
		contentPanel.add(passwordField);
		
		JLabel lblAnNoEst = new JLabel("A\u00FAn no est\u00E1 registrado? ");
		lblAnNoEst.setBounds(8, 350, 146, 14);
		contentPanel.add(lblAnNoEst);
		
		JButton btnHagaClicAqu = new JButton("Haga clic aqu\u00ED!");
		btnHagaClicAqu.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnHagaClicAqu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				RegistroUsuario nuevoUser = new RegistroUsuario();
				nuevoUser.setVisible(true);
			}
		});
		btnHagaClicAqu.setBounds(152, 346, 110, 23);
		contentPanel.add(btnHagaClicAqu);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int ind=0; ind < clinica.getMiPersonal().size(); ind++) {
					if(clinica.getMiPersonal().get(ind).getUsername().equalsIgnoreCase(textField.getText()) && clinica.getMiPersonal().get(ind).getPassword().equalsIgnoreCase(passwordField.getText())) {
						clinica.setIndiceUser(ind);
						JOptionPane.showMessageDialog(null, "LogIn satisfactorio.", null, JOptionPane.INFORMATION_MESSAGE, null);
						dispose();
					} else 	JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrecto.", null, JOptionPane.WARNING_MESSAGE, null);
				}
			}
		});
		btnLogIn.setBounds(300, 316, 71, 23);
		contentPanel.add(btnLogIn);
	}
}
