package Reto2;

import java.awt.EventQueue;
import java.awt.Font;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bienvenida {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bienvenida window = new bienvenida();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void tiempoEspera(int num) {
		try {								
            Thread.sleep(num*1000);  //Ponemos a "Dormir" el programa durante los ms que queremos
         } catch (Exception e) {
            System.out.println(e);
         }
	}

	/**
	 * Create the application.
	 */
	public bienvenida() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.background"));
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenida");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(149, 75, 126, 53);
		panel.add(lblNewLabel);
		
		JLabel lblImg= new JLabel("Pulsa para continuar");
		lblImg.setBounds(149, 159, 126, 53);
		panel.add(lblImg);
		final JPanel peliculasDrama = new JPanel();
		peliculasDrama.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(peliculasDrama);
		peliculasDrama.setLayout(null);
		JButton btnBienvenida = new JButton("Continuar");
		btnBienvenida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				peliculasDrama.setVisible(true);
				panel.setVisible(false);
			}
		});
		btnBienvenida.setBounds(171, 203, 89, 23);
		panel.add(btnBienvenida);
		
		
		panel.setVisible(true);
		
		String pelisDrama = "peli1#peli2#peli3";
		for(int i=0; i==4;i++) {
			JLabel imgPeli1Drama = new JLabel("New label");
			imgPeli1Drama.setBounds(10, 11, 62, 99);
			peliculasDrama.add(imgPeli1Drama);
		}
		
		
	}

}
