package Reto2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Panel;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;

public class reto2 {

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
					reto2 window = new reto2();
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
	public reto2() {
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
		
		final JPanel login = new JPanel();
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
				
				login.setVisible(false);
			}
		});
		btnLogIn.setBounds(222, 128, 89, 23);
		login.add(btnLogIn);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.background"));
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenida");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(165, 86, 126, 53);
		panel.add(lblNewLabel);
		
		JButton btnBienvenida = new JButton("Continuar");
		btnBienvenida.setBounds(171, 203, 89, 23);
		panel.add(btnBienvenida);
		
		
	}
}
