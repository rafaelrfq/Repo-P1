package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logical.Clinica;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainScreen extends JFrame {

	private JPanel contentPane;
	private Clinica clinica = Clinica.getInstance();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainScreen() {
		setTitle("Cl\u00EDnica Privada");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 769, 21);
		contentPane.add(menuBar);
		
		JMenu mnUsuario = new JMenu("Usuario");
		menuBar.add(mnUsuario);
		
		JMenuItem mntmRegistrarNuevo = new JMenuItem("Registrar Nuevo");
		mntmRegistrarNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegistroUsuario registUser = new RegistroUsuario();
				registUser.setVisible(true);
			}
		});
		mnUsuario.add(mntmRegistrarNuevo);
		
		JMenuItem mntmListarUsuarios = new JMenuItem("Listar Usuarios");
		mnUsuario.add(mntmListarUsuarios);
		
		JMenuItem mntmLogIn = new JMenuItem("Log in");
		mnUsuario.add(mntmLogIn);
		mntmLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn login = new LogIn();
				login.setVisible(true);
			}
		});
		
		JMenuItem mntmLogOut = new JMenuItem("Log out");
		mnUsuario.add(mntmLogOut);
		
		JMenu mnPacientes = new JMenu("Pacientes");
		menuBar.add(mnPacientes);
		
		JMenu mnEnfermedadesBajoObservacin = new JMenu("Enfermedades bajo observaci\u00F3n");
		menuBar.add(mnEnfermedadesBajoObservacin);
		
		JMenu mnVacunas = new JMenu("Vacunas");
		menuBar.add(mnVacunas);
	}
}
