package Reto2;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class peliculas {

	private JFrame frame;
	private int numeroPelis=0;
	private JTextField textPelicula2;
	private JTextField textPelicula1;
	private static boolean dramaSeleccionadoSab=false;
	private static boolean dramaSeleccionadoDom=false;
	private static int tiempoRestanteSab=480;
	private static int tiempoRestanteDom=360;
	private static int Handia=116;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					peliculas window = new peliculas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	public static void añadirPeliculaDrama(int Pelicula) {
		if (!dramaSeleccionadoSab&&tiempoRestanteSab>=Pelicula) {
			if (tiempoRestanteSab>Pelicula) {
				System.out.println("1. Handia");
				dramaSeleccionadoSab=true;
			}
			}
	else if(!dramaSeleccionadoDom&&tiempoRestanteSab>=116) {
		if (tiempoRestanteDom>Handia) {
			System.out.println("1. Handia");
			dramaSeleccionadoDom=true;;
			}
		}
	else {
		JOptionPane.showMessageDialog(null, "No disponible");
	}
	}
	

	/**
	 * Create the application.
	 */
	public peliculas() {
		initialize("");
	}

	/**
	 * Initialize the contents of the frame.
	 * @param progrmSab 
	 */
	private void initialize(String progrmSab) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final String Hulk="160";
		final String jj="145";
		int tiempoRestanteDom=360;
		
		final JPanel peliculasDrama = new JPanel();
		peliculasDrama.setLayout(null);
		peliculasDrama.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(peliculasDrama);
		
		final JRadioButton rdbtnHandia = new JRadioButton("Handia");
		rdbtnHandia.setBounds(52, 76, 109, 23);
		peliculasDrama.add(rdbtnHandia);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(52, 102, 109, 23);
		peliculasDrama.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1_1.setBounds(52, 154, 109, 23);
		peliculasDrama.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1_2.setBounds(52, 128, 109, 23);
		peliculasDrama.add(rdbtnNewRadioButton_1_2);
		
		final JButton btnborrar = new JButton("borrar");
		btnborrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnHandia.addMouseListener(new MouseAdapter() {
					 
					public void mouseClicked(MouseEvent e) {
						rdbtnHandia.setVisible(false);
						}
				});
				
				
				
			}}
				
		);
		btnborrar.setBounds(230, 227, 89, 23);
		peliculasDrama.add(btnborrar);
		final JTextArea textArea_1 = new JTextArea();
		textArea_1.setRows(6);
		textArea_1.setEditable(false);
		textArea_1.setBounds(53, 78, 59, 23);
		frame.getContentPane().add(textArea_1);
		final JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setRows(6);
		textArea.setBounds(53, 45, 59, 23);
		frame.getContentPane().add(textArea);
		JButton btnHulk = new JButton("Hulk");
		final JTextArea textArea_3 = new JTextArea();
		textArea_3.setRows(6);
		textArea_3.setEditable(false);
		textArea_3.setBounds(122, 45, 59, 23);
		frame.getContentPane().add(textArea_3);
		
		final JTextArea textArea_4 = new JTextArea();
		textArea_4.setRows(6);
		textArea_4.setEditable(false);
		textArea_4.setBounds(191, 45, 59, 23);
		frame.getContentPane().add(textArea_4);
		
		
		JButton btnJJ = new JButton("JJ");
		btnJJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textPelicula1.getText().isEmpty()) {
					textArea_1.setText(jj);
					
				
				}else if(textPelicula2.getText().isEmpty()) {
					textArea_1.setText(jj);
				}
			}
		});
		btnJJ.setBounds(22, 176, 89, 23);
		frame.getContentPane().add(btnJJ);
		
		btnHulk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					if(textPelicula1.getText().isEmpty()) {
					textArea.setText(Hulk);
					textArea_3.setText("Hulk");
					textArea_4.setText("Drama");
					
				
				}else if(textPelicula2.getText().isEmpty()) {
					textArea.setText(Hulk);
				}
				
				
				
				
			
			}});
		btnHulk.setBounds(21, 11, 89, 23);
		frame.getContentPane().add(btnHulk);
		
		textPelicula2 = new JTextField();
		textPelicula2.setBounds(233, 12, 86, 20);
		frame.getContentPane().add(textPelicula2);
		textPelicula2.setColumns(10);
		
		textPelicula1 = new JTextField();
		textPelicula1.setBounds(120, 12, 86, 20);
		frame.getContentPane().add(textPelicula1);
		textPelicula1.setColumns(10);
		
		
		
		
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setRows(6);
		textArea_2.setEditable(false);
		textArea_2.setBounds(120, 79, 59, 23);
		frame.getContentPane().add(textArea_2);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setRows(6);
		textArea_5.setEditable(false);
		textArea_5.setBounds(191, 79, 59, 23);
		frame.getContentPane().add(textArea_5);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setRows(6);
		textArea_6.setEditable(false);
		textArea_6.setBounds(53, 112, 59, 23);
		frame.getContentPane().add(textArea_6);
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setRows(6);
		textArea_7.setEditable(false);
		textArea_7.setBounds(120, 113, 59, 23);
		frame.getContentPane().add(textArea_7);
		
		JTextArea textArea_8 = new JTextArea();
		textArea_8.setRows(6);
		textArea_8.setEditable(false);
		textArea_8.setBounds(191, 113, 59, 23);
		frame.getContentPane().add(textArea_8);
		
		JTextArea textArea_9 = new JTextArea();
		textArea_9.setRows(6);
		textArea_9.setEditable(false);
		textArea_9.setBounds(53, 142, 59, 23);
		frame.getContentPane().add(textArea_9);
		
		JTextArea textArea_10 = new JTextArea();
		textArea_10.setRows(6);
		textArea_10.setEditable(false);
		textArea_10.setBounds(120, 142, 59, 23);
		frame.getContentPane().add(textArea_10);
		
		JTextArea textArea_11 = new JTextArea();
		textArea_11.setRows(6);
		textArea_11.setEditable(false);
		textArea_11.setBounds(191, 142, 59, 23);
		frame.getContentPane().add(textArea_11);
		
		

		if(textPeli1.getText().isEmpty()) {
			textPeli1.setText(textNuevaPelicula.getText());
			textGenero1.setText(textNuevoGenero.getText());
			textDuracion1.setText(textNuevaDuracion.getText());
			
		}
		if else(textPeli2.getText().isEmpty()) {
			textPeli2.setText(textNuevaPelicula.getText());
			textGenero2.setText(textNuevoGenero.getText());
			textDuracion2.setText(textNuevaDuracion.getText());
		}
		if else(textPeli3.getText().isEmpty()) {
			textPeli3.setText(textNuevaPelicula.getText());
			textGenero3.setText(textNuevoGenero.getText());
			textDuracion3.setText(textNuevaDuracion.getText());
		}
		if else(textPeli4.getText().isEmpty()) {
			textPeli4.setText(textNuevaPelicula.getText());
			textGenero4.setText(textNuevoGenero.getText());
			textDuracion4.setText(textNuevaDuracion.getText());
		}
		if else(textPeli5.getText().isEmpty()) {
			textPeli5.setText(textNuevaPelicula.getText());
			textGenero5.setText(textNuevoGenero.getText());
			textDuracion5.setText(textNuevaDuracion.getText());
		}
		if else(textPeli6.getText().isEmpty()) {
			textPeli6.setText(textNuevaPelicula.getText());
			textGenero6.setText(textNuevoGenero.getText());
			textDuracion6.setText(textNuevaDuracion.getText());
		}
		if else(textPeli7.getText().isEmpty()) {
			textPeli7.setText(textNuevaPelicula.getText());
			textGenero7.setText(textNuevoGenero.getText());
			textDuracion7.setText(textNuevaDuracion.getText());
		}
		if else(textPeli8.getText().isEmpty()) {
			textPeli8.setText(textNuevaPelicula.getText());
			textGenero8.setText(textNuevoGenero.getText());
			textDuracion8.setText(textNuevaDuracion.getText());
		}
		if else(textPeli9.getText().isEmpty()) {
			textPeli9.setText(textNuevaPelicula.getText());
			textGenero9.setText(textNuevoGenero.getText()));
			textDuracion9.setText(textNuevaDuracion.getText());
		}
		if else(textPeli10.getText().isEmpty()) {
			textPeli10.setText(textNuevaPelicula.getText());
			textGenero10.setText(textNuevoGenero.getText()));
			textDuracion10.setText(textNuevaDuracion.getText());
		}
		if else(textPeli11.getText().isEmpty()) {
			textPeli11.setText(textNuevaPelicula.getText());
			textGenero11.setText(textNuevoGenero.getText()));
			textDuracion11.setText(textNuevaDuracion.getText());
		}
		if else(textPeli12.getText().isEmpty()) {
			textPeli12.setText(textNuevaPelicula.getText());
			textGenero12.setText(textNuevoGenero.getText()));
			textDuracion12.setText(textNuevaDuracion.getText());
		}
		if else(textPeli13.getText().isEmpty()) {
			textPeli13.setText(textNuevaPelicula.getText());
			textGenero13.setText(textNuevoGenero.getText());
			textDuracion13.setText(textNuevaDuracion.getText());
		}
		if else(textPeli14.getText().isEmpty()) {
			textPeli14.setText(textNuevaPelicula.getText());
			textGenero14.setText(textNuevoGenero.getText()));
			textDuracion14.setText(textNuevaDuracion.getText());
		}
		if else(textPeli15.getText().isEmpty()) {
			textPeli15.setText(textNuevaPelicula.getText());
			textGenero15.setText(textNuevoGenero.getText()));
			textDuracion15.setText(textNuevaDuracion.getText());
		}
		if else(textPeli16.getText().isEmpty()) {
			textPeli16.setText(textNuevaPelicula.getText());
			textGenero16.setText(textNuevoGenero.getText()));
			textDuracion16.setText(textNuevaDuracion.getText());
		}
	
			
			
	}
}
