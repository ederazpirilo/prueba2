package Reto2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class login {

	private JFrame frame;
	private JTextField textUsuario;
	private JTextField textContraseña;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel login = new JPanel();
		login.setLayout(null);
		login.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(login);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(112, 70, 46, 14);
		login.add(lblUsuario);
		
		textUsuario = new JTextField();
		textUsuario.setColumns(10);
		textUsuario.setBounds(109, 84, 86, 20);
		login.add(textUsuario);
		
		JLabel lblContraseña = new JLabel("Contraseña");
		lblContraseña.setBounds(115, 115, 80, 14);
		login.add(lblContraseña);
		
		textContraseña = new JTextField();
		textContraseña.setColumns(10);
		textContraseña.setBounds(109, 129, 86, 20);
		login.add(textContraseña);
		
		JButton btnLogIn = new JButton("Login");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textContraseña.getText().equals("admin")&&textUsuario.getText().equals("admin")) {
					JOptionPane.showMessageDialog(null, "Bienvenido al menu del administrador");
				}else if(textContraseña.getText().equals("1")&&textUsuario.getText().equals("1")){
					JOptionPane.showMessageDialog(null, "Bienvenido");
				}
				
				else {
					JOptionPane.showMessageDialog(null, "User o password desconocido");
					
				}
			}
		});
		btnLogIn.setBounds(222, 128, 89, 23);
		login.add(btnLogIn);
		
		
	}

}
