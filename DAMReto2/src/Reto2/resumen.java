package Reto2;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class resumen {

	private JFrame frame;
	private JTextField textNombre;
	private JTextField textGenero;
	private JTextField textDuracion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					resumen window = new resumen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		mostrarMenuGeneros();
	}
	 public static void mostrarMenuGeneros() {
		 Scanner teclado= new Scanner(System.in);
		 // Banderas para verificar si se seleccionó una película de cada género sabado
					boolean dramaSeleccionadoSab = false;
					boolean cienciaFiccionSeleccionadoSab = false;
					boolean comediaSeleccionadoSab = false;
					boolean terrorSeleccionadoSab = false;
					// Banderas para verificar si se seleccionó una película de cada género domingo
					boolean dramaSeleccionadoDom = false;
					boolean cienciaFiccionSeleccionadoDom = false;
					boolean comediaSeleccionadoDom = false;
					boolean terrorSeleccionadoDom = false;
					String progrmSab="";
					String progrmDom="";
					int tiempoRestanteSab=480;
					int tiempoRestanteDom=360;
					int generos = 0;
					
		 System.out.println("Menú:");
			System.out.println("0. Salir");
			if (!dramaSeleccionadoSab) {
			System.out.println("1. Drama");
			} else if(!dramaSeleccionadoDom) {
				 System.out.println("1. Drama");
			} else {
			System.out.println("1. Drama - Genero no disponible");
			}
			if (!cienciaFiccionSeleccionadoSab) {
			System.out.println("2. Ciencia Ficción");
			} else if(!cienciaFiccionSeleccionadoDom) {
				 System.out.println("2. Ciencia Ficcion");
			}else {
			System.out.println("2. Ciencia Ficción - Genero no disponible");
			}
			if (!comediaSeleccionadoSab) {
			System.out.println("3. Comedia");
			} else if(!comediaSeleccionadoDom) {
				 System.out.println("3. Comedia");
			}else {
			System.out.println("3. Comedia - Genero no disponible");
			}
			if (!terrorSeleccionadoSab) {
			System.out.println("4. Terror");
			} else if(!terrorSeleccionadoDom) {
				 System.out.println("4. Terror");
			}else {
			System.out.println("4. Terror - Genero no disponible");
			}
			System.out.println("5. Ver resumen");
			generos = teclado.nextInt();
	 }

	/**
	 * Create the application.
	 */
	public resumen() {
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
		
		
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(10, 216, 89, 34);
		
		
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(109, 216, 89, 34);
		;
		
		JButton btnAnadir = new JButton("Añadir");
		btnAnadir.setBounds(208, 216, 89, 34);
		
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(322, 227, 103, 23);
		
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(322, 193, 103, 23);
		
		final JPanel resumen2 = new JPanel();
		resumen2.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(resumen2);
		resumen2.setLayout(null);
		
		String gi="ha";
		JLabel lblPelicula1 = new JLabel(gi);
		lblPelicula1.setBounds(54, 33, 46, 14);
		resumen2.add(lblPelicula1);
		
		JLabel g= new JLabel(gi);
		lblPelicula1= g;
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(54, 85, 46, 14);
		resumen2.add(lblNewLabel_1);
		resumen2.setVisible(false);
		
		resumen2.setVisible(false);
		
		
		textNombre = new JTextField();
		textNombre.setBounds(10, 163, 86, 20);
		frame.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		textGenero = new JTextField();
		textGenero.setColumns(10);
		textGenero.setBounds(109, 163, 86, 20);
		frame.getContentPane().add(textGenero);
		
		textDuracion = new JTextField();
		textDuracion.setColumns(10);
		textDuracion.setBounds(208, 163, 86, 20);
		frame.getContentPane().add(textDuracion);
		
		final JPanel serviceMenu = new JPanel();
		serviceMenu.setLayout(null);
		serviceMenu.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(serviceMenu);
		serviceMenu.add(btnCancelar);
		serviceMenu.add(btnConfirmar);
		serviceMenu.add(btnAnadir);
		serviceMenu.add(btnBorrar);
		serviceMenu.add(btnEditar);
		textNombre.setVisible(false);
		textGenero.setVisible(false);
		textDuracion.setVisible(false);
		
		
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNombre.setVisible(true);
				textGenero.setVisible(true);
				textDuracion.setVisible(true);
			}
		});
		
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resumen2.setVisible(true);
				serviceMenu.setVisible(false);
				
			}
		});
	}
}
