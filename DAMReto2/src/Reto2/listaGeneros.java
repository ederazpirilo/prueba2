package Reto2;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;

public class listaGeneros {

	private JFrame frame;
	private JTextField textUsuario;
	private JTextField textContraseña;
	private static int tiempoRestanteSab=480;
	private static int tiempoRestanteDom=360;
	private static boolean dramaSeleccionadoSab=false;
	private static boolean dramaSeleccionadoDom=false;
	private static boolean cienciaFiccionSeleccionadoSab = false;
	private static boolean comediaSeleccionadoSab = false;
	private static boolean terrorSeleccionadoSab = false;
	private static boolean cienciaFiccionSeleccionadoDom = false;
	private static boolean comediaSeleccionadoDom = false;
	private static boolean terrorSeleccionadoDom = false;
	//drama
	private static int Handia=116;
	private static int tpelicula=0;
	private static String pelicula="";
	private static int LaListaDeSchindler = 197;
	private static int CadenaPerpetua = 142;			
	private static int MillionDollarBaby = 133;
	//Ci-Fi
	private static int Odiseaenelespacio = 200;
	private static int LanoviadeFrankenstein = 75;
	private static int Elplanetadelossimios = 240;
	private static int Alien = 75;
		// comedia
	private static int Scarymovie = 278;
	private static int ElgranLebowsky = 137;
	private static int LavidadeBrian = 230;
	private static int Aterrizacomopuedas = 90;
		// terror
	private static int Psicosis = 200;
	private static int Elresplandor = 103;
	private static int Drácula = 140;
	private static int Cisnenegro = 128;
	private JTextField textNuevaPelicula;
	private JTextField textNuevoGenero;
	private JTextField textNuevaDuracion;
	

	/*/**
	 * @param textContraseña textfield
	 * @param textUsuario textfield
	 */

	/**
	 * Launch the application.
	 */
	/**
	 * 
	 * @param args argumentos
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listaGeneros window = new listaGeneros();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	//Metodo para ver si se puede añadir la pelicula de drama
	public static void añadirPeliculaDrama(int tpelicula, String pelicula, JTextArea textPeliculasSabado, JTextArea textPeliculasDomingo) {
		if (!dramaSeleccionadoSab&&tiempoRestanteSab>=tpelicula) {
			if (tiempoRestanteSab>tpelicula) {
				JOptionPane.showMessageDialog(null, "Se ha añadido al sabado");
				textPeliculasSabado.setText(textPeliculasSabado.getText()+"\n"+pelicula);
				dramaSeleccionadoSab=true;
				tiempoRestanteSab-=tpelicula;
			}
			}
	else if(!dramaSeleccionadoDom&&tiempoRestanteSab>=tpelicula) {
		if (tiempoRestanteDom>tpelicula) {
			JOptionPane.showMessageDialog(null, "Se ha añadido al domingo");
			textPeliculasDomingo.setText(textPeliculasDomingo.getText()+"\n"+pelicula);
			dramaSeleccionadoDom=true;
			tiempoRestanteDom-=tpelicula;
			}
		}
	else {
		JOptionPane.showMessageDialog(null, "No disponible");
	}
	}
	//Metodo para ver si se puede añadir la pelicula de CiFi
	public static void añadirPeliculaCiFi(int tpelicula, String pelicula, JTextArea textPeliculasSabado, JTextArea textPeliculasDomingo) {
		if (!cienciaFiccionSeleccionadoSab&&tiempoRestanteSab>=tpelicula) {
			if (tiempoRestanteSab>tpelicula) {
				JOptionPane.showMessageDialog(null, "Se ha añadido al sabado");
				textPeliculasSabado.setText(textPeliculasSabado.getText()+"\n"+pelicula);
				cienciaFiccionSeleccionadoSab=true;
				tiempoRestanteSab-=tpelicula;
			}
			}
	else if(!cienciaFiccionSeleccionadoDom&&tiempoRestanteSab>=tpelicula) {
		if (tiempoRestanteDom>tpelicula) {
			JOptionPane.showMessageDialog(null, "Se ha añadido al domingo");
			textPeliculasDomingo.setText(textPeliculasDomingo.getText()+"\n"+pelicula);
			cienciaFiccionSeleccionadoDom=true;
			tiempoRestanteDom-=tpelicula;
			}
		}
	else {
		JOptionPane.showMessageDialog(null, "No disponible");
	}
	}
	//Metodo para ver si se puede añadir la pelicula de Terror
	public static void añadirPeliculaTerror(int tpelicula, String pelicula, JTextArea textPeliculasSabado, JTextArea textPeliculasDomingo) {
		if (!terrorSeleccionadoSab&&tiempoRestanteSab>=tpelicula) {
			if (tiempoRestanteSab>tpelicula) {
				JOptionPane.showMessageDialog(null, "Se ha añadido al sabado");
				textPeliculasSabado.setText(textPeliculasSabado.getText()+"\n"+pelicula);
				terrorSeleccionadoSab=true;
				tiempoRestanteSab-=tpelicula;
			}
			}
	else if(!terrorSeleccionadoDom&&tiempoRestanteSab>=tpelicula) {
		if (tiempoRestanteDom>tpelicula) {
			JOptionPane.showMessageDialog(null, "Se ha añadido al domingo");
			textPeliculasDomingo.setText(textPeliculasDomingo.getText()+"\n"+pelicula);
			terrorSeleccionadoDom=true;
			tiempoRestanteDom-=tpelicula;
			}
		}
	else {
		JOptionPane.showMessageDialog(null, "No disponible");
	}
	}
	//Metodo para ver si se puede añadir la pelicula de Comedia
	public static void añadirPeliculaComedia(int tpelicula, String pelicula, JTextArea textPeliculasSabado, JTextArea textPeliculasDomingo) {
		if (!comediaSeleccionadoSab&&tiempoRestanteSab>=tpelicula) {
			if (tiempoRestanteSab>tpelicula) {
				JOptionPane.showMessageDialog(null, "Se ha añadido al sabado");
				textPeliculasSabado.setText(textPeliculasSabado.getText()+"\n"+pelicula);
				comediaSeleccionadoSab=true;
				tiempoRestanteSab-=tpelicula;
			}
			}
	else if(!comediaSeleccionadoDom&&tiempoRestanteSab>=tpelicula) {
		if (tiempoRestanteDom>tpelicula) {
			JOptionPane.showMessageDialog(null, "Se ha añadido al domingo");
			textPeliculasDomingo.setText(textPeliculasDomingo.getText()+"\n"+pelicula);
			comediaSeleccionadoDom=true;
			tiempoRestanteDom-=tpelicula;
			}
		}
	else {
		JOptionPane.showMessageDialog(null, "No disponible");
	}
	}
	
	
	//Metodo de espera 
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
	public listaGeneros() {
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
						
						//PANEL SERVICE MENU
						final JPanel serviceMenu = new JPanel();
						serviceMenu.setLayout(null);
						serviceMenu.setBounds(0, 0, 434, 261);
						frame.getContentPane().add(serviceMenu);
						
						JButton btnEditar = new JButton("Editar");
						btnEditar.setBounds(10, 216, 89, 34);
						
						serviceMenu.add(btnEditar);
						
						JButton btnBorrar = new JButton("Borrar");
						btnBorrar.setBounds(109, 216, 89, 34);
						
						serviceMenu.add(btnBorrar);
						
						JButton btnAnadir = new JButton("Añadir");
						btnAnadir.setBounds(208, 216, 89, 34);
						
						serviceMenu.add(btnAnadir);
						
						JButton btnConfirmar = new JButton("Confirmar");
						btnConfirmar.setBounds(322, 227, 103, 23);
						
						serviceMenu.add(btnConfirmar);
						
						JButton btnCancelar = new JButton("Cancelar");
						btnCancelar.setBounds(322, 193, 103, 23);
						
						serviceMenu.add(btnCancelar);
						
						textNuevaPelicula = new JTextField();
						textNuevaPelicula.setBounds(5, 185, 86, 20);
						serviceMenu.add(textNuevaPelicula);
						textNuevaPelicula.setColumns(10);
						
						textNuevoGenero = new JTextField();
						textNuevoGenero.setColumns(10);
						textNuevoGenero.setBounds(93, 185, 86, 20);
						serviceMenu.add(textNuevoGenero);
						
						textNuevaDuracion = new JTextField();
						textNuevaDuracion.setColumns(10);
						textNuevaDuracion.setBounds(184, 185, 86, 20);
						serviceMenu.add(textNuevaDuracion);
						
						final JTextArea textPeli1 = new JTextArea("Handia");
						textPeli1.setEditable(false);
						textPeli1.setBounds(10, 11, 89, 15);
						serviceMenu.add(textPeli1);
						
						final JTextArea textGenero1 = new JTextArea("Drama");
						textGenero1.setEditable(false);
						textGenero1.setBounds(109, 11, 68, 15);
						serviceMenu.add(textGenero1);
						
						final JTextArea textDuracion1 = new JTextArea("116");
						textDuracion1.setEditable(false);
						textDuracion1.setBounds(184, 11, 36, 15);
						serviceMenu.add(textDuracion1);
						
						final JTextArea textPeli2 = new JTextArea("LaListaDeSchindler");
						textPeli2.setEditable(false);
						textPeli2.setBounds(10, 34, 89, 15);
						serviceMenu.add(textPeli2);
						
						final JTextArea textGenero2 = new JTextArea("Drama");
						textGenero2.setEditable(false);
						textGenero2.setBounds(109, 34, 68, 15);
						serviceMenu.add(textGenero2);
						
						final JTextArea textDuracion2 = new JTextArea("197");
						textDuracion2.setEditable(false);
						textDuracion2.setBounds(184, 34, 36, 15);
						serviceMenu.add(textDuracion2);
						
						final JTextArea textPeli3 = new JTextArea("CadenaPerpetua");
						textPeli3.setEditable(false);
						textPeli3.setBounds(10, 53, 89, 15);
						serviceMenu.add(textPeli3);
						
						final JTextArea textGenero3 = new JTextArea("Drama");
						textGenero3.setEditable(false);
						textGenero3.setBounds(109, 53, 68, 15);
						serviceMenu.add(textGenero3);
						
						final JTextArea textDuracion3 = new JTextArea("142");
						textDuracion3.setEditable(false);
						textDuracion3.setBounds(184, 53, 36, 15);
						serviceMenu.add(textDuracion3);
						
						final JTextArea textPeli4 = new JTextArea("MillionDollarBaby");
						textPeli4.setEditable(false);
						textPeli4.setBounds(10, 73, 89, 15);
						serviceMenu.add(textPeli4);
						
						final JTextArea textGenero4 = new JTextArea("Drama");
						textGenero4.setEditable(false);
						textGenero4.setBounds(109, 73, 68, 15);
						serviceMenu.add(textGenero4);
						
						final JTextArea textDuracion4 = new JTextArea("133");
						textDuracion4.setEditable(false);
						textDuracion4.setBounds(184, 73, 36, 15);
						serviceMenu.add(textDuracion4);
						
						final JTextArea textPeli5 = new JTextArea("Odiseaenelespacio");
						textPeli5.setEditable(false);
						textPeli5.setBounds(10, 98, 89, 15);
						serviceMenu.add(textPeli5);
						
						final JTextArea textGenero5 = new JTextArea("Ci-Fi");
						textGenero5.setEditable(false);
						textGenero5.setBounds(109, 98, 68, 15);
						serviceMenu.add(textGenero5);
						
						final JTextArea textDuracion5 = new JTextArea("200");
						textDuracion5.setEditable(false);
						textDuracion5.setBounds(184, 98, 36, 15);
						serviceMenu.add(textDuracion5);
						
						final JTextArea textPeli6 = new JTextArea("LanoviadeFrankenstein");
						textPeli6.setEditable(false);
						textPeli6.setBounds(10, 118, 89, 15);
						serviceMenu.add(textPeli6);
						
						final JTextArea textGenero6 = new JTextArea("Ci-Fi");
						textGenero6.setEditable(false);
						textGenero6.setBounds(109, 118, 68, 15);
						serviceMenu.add(textGenero6);
						
						final JTextArea textDuracion6 = new JTextArea("75");
						textDuracion6.setEditable(false);
						textDuracion6.setBounds(184, 118, 36, 15);
						serviceMenu.add(textDuracion6);
						
						final JTextArea textPeli7 = new JTextArea("Elplanetadelossimios");
						textPeli7.setEditable(false);
						textPeli7.setBounds(10, 138, 89, 15);
						serviceMenu.add(textPeli7);
						
						final JTextArea textGenero7 = new JTextArea("Ci-Fi");
						textGenero7.setEditable(false);
						textGenero7.setBounds(109, 138, 68, 15);
						serviceMenu.add(textGenero7);
						
						final JTextArea textDuracion7 = new JTextArea("240");
						textDuracion7.setEditable(false);
						textDuracion7.setBounds(184, 138, 36, 15);
						serviceMenu.add(textDuracion7);
						
						final JTextArea textPeli8 = new JTextArea("Alien");
						textPeli8.setEditable(false);
						textPeli8.setBounds(10, 161, 89, 15);
						serviceMenu.add(textPeli8);
						
						final JTextArea textGenero8 = new JTextArea("Ci-Fi");
						textGenero8.setEditable(false);
						textGenero8.setBounds(109, 161, 68, 15);
						serviceMenu.add(textGenero8);
						
						final JTextArea textDuracion8 = new JTextArea("75");
						textDuracion8.setEditable(false);
						textDuracion8.setBounds(184, 161, 36, 15);
						serviceMenu.add(textDuracion8);
						
						final JTextArea textPeli9 = new JTextArea("Scarymovie");
						textPeli9.setEditable(false);
						textPeli9.setBounds(224, 11, 89, 15);
						serviceMenu.add(textPeli9);
						
						final JTextArea textGenero9 = new JTextArea("Comedia");
						textGenero9.setEditable(false);
						textGenero9.setBounds(323, 11, 68, 15);
						serviceMenu.add(textGenero9);
						
						final JTextArea textDuracion9 = new JTextArea("278");
						textDuracion9.setEditable(false);
						textDuracion9.setBounds(398, 11, 36, 15);
						serviceMenu.add(textDuracion9);
						
						final JTextArea textPeli10 = new JTextArea("ElgranLebowsky");
						textPeli10.setEditable(false);
						textPeli10.setBounds(224, 34, 89, 15);
						serviceMenu.add(textPeli10);
						
						final JTextArea textGenero10 = new JTextArea("Comedia");
						textGenero10.setEditable(false);
						textGenero10.setBounds(323, 34, 68, 15);
						serviceMenu.add(textGenero10);
						
						final JTextArea textDuracion10 = new JTextArea("137");
						textDuracion10.setEditable(false);
						textDuracion10.setBounds(398, 34, 36, 15);
						serviceMenu.add(textDuracion10);
						
						final JTextArea textPeli11 = new JTextArea("LavidadeBrian");
						textPeli11.setEditable(false);
						textPeli11.setBounds(224, 53, 89, 15);
						serviceMenu.add(textPeli11);
						
						final JTextArea textGenero11 = new JTextArea("Comedia");
						textGenero11.setEditable(false);
						textGenero11.setBounds(323, 53, 68, 15);
						serviceMenu.add(textGenero11);
						
						final JTextArea textDuracion11 = new JTextArea("230");
						textDuracion11.setEditable(false);
						textDuracion11.setBounds(398, 53, 36, 15);
						serviceMenu.add(textDuracion11);
						
						final JTextArea textPeli12 = new JTextArea("Aterrizacomopuedas");
						textPeli12.setEditable(false);
						textPeli12.setBounds(224, 73, 89, 15);
						serviceMenu.add(textPeli12);
						
						final JTextArea textGenero12 = new JTextArea("Comedia");
						textGenero12.setEditable(false);
						textGenero12.setBounds(323, 73, 68, 15);
						serviceMenu.add(textGenero12);
						
						final JTextArea textDuracion12 = new JTextArea("90");
						textDuracion12.setEditable(false);
						textDuracion12.setBounds(398, 73, 36, 15);
						serviceMenu.add(textDuracion12);
						
						final JTextArea textPeli13 = new JTextArea("Psicosis");
						textPeli13.setEditable(false);
						textPeli13.setBounds(224, 98, 89, 15);
						serviceMenu.add(textPeli13);
						
						final JTextArea textGenero13 = new JTextArea("Terror");
						textGenero13.setEditable(false);
						textGenero13.setBounds(323, 98, 68, 15);
						serviceMenu.add(textGenero13);
						
						final JTextArea textDuracion13 = new JTextArea("200");
						textDuracion13.setEditable(false);
						textDuracion13.setBounds(398, 98, 36, 15);
						serviceMenu.add(textDuracion13);
						
						final JTextArea textPeli14 = new JTextArea("Elresplandor");
						textPeli14.setEditable(false);
						textPeli14.setBounds(224, 118, 89, 15);
						serviceMenu.add(textPeli14);
						
						final JTextArea textGenero14 = new JTextArea("Terror");
						textGenero14.setEditable(false);
						textGenero14.setBounds(323, 118, 68, 15);
						serviceMenu.add(textGenero14);
						
						final JTextArea textDuracion14 = new JTextArea("103");
						textDuracion14.setEditable(false);
						textDuracion14.setBounds(398, 118, 36, 15);
						serviceMenu.add(textDuracion14);
						
						final JTextArea textPeli15 = new JTextArea("Drácula");
						textPeli15.setEditable(false);
						textPeli15.setBounds(224, 138, 89, 15);
						serviceMenu.add(textPeli15);
						
						final JTextArea textGenero15 = new JTextArea("Terror");
						textGenero15.setEditable(false);
						textGenero15.setBounds(323, 138, 68, 15);
						serviceMenu.add(textGenero15);
						
						final JTextArea textDuracion15 = new JTextArea("140");
						textDuracion15.setEditable(false);
						textDuracion15.setBounds(398, 138, 36, 15);
						serviceMenu.add(textDuracion15);
						
						final JTextArea textPeli16 = new JTextArea("Cisnenegro");
						textPeli16.setEditable(false);
						textPeli16.setBounds(224, 161, 89, 15);
						serviceMenu.add(textPeli16);
						
						final JTextArea textGenero16 = new JTextArea("Terror");
						textGenero16.setEditable(false);
						textGenero16.setBounds(323, 161, 68, 15);
						serviceMenu.add(textGenero16);
						
						final JTextArea textDuracion16 = new JTextArea("128");
						textDuracion16.setEditable(false);
						textDuracion16.setBounds(398, 161, 36, 15);
						serviceMenu.add(textDuracion16);
						
						final JButton btnAccept = new JButton("->");
						
						btnAccept.setBounds(269, 182, 55, 23);
						serviceMenu.add(btnAccept);
						serviceMenu.setVisible(false);
						
						
						
						
						//BOTON BORRAR ADMIN
						btnBorrar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								textPeli1.addMouseListener(new MouseAdapter() {
									 
									public void mouseClicked(MouseEvent e) {
										textPeli1.setText("");
										textGenero1.setText("");
										textDuracion1.setText("");
										}
								});
								textPeli2.addMouseListener(new MouseAdapter() {
									 
									public void mouseClicked(MouseEvent e) {
										textPeli2.setText("");
										textGenero2.setText("");
										textDuracion2.setText("");
										}
								});
								textPeli3.addMouseListener(new MouseAdapter() {
									 
									public void mouseClicked(MouseEvent e) {
										textPeli3.setText("");
										textGenero3.setText("");
										textDuracion3.setText("");
										}
								});
								textPeli4.addMouseListener(new MouseAdapter() {
									 
									public void mouseClicked(MouseEvent e) {
										textPeli4.setText("");
										textGenero4.setText("");
										textDuracion4.setText("");
										}
								});
								textPeli5.addMouseListener(new MouseAdapter() {
									 
									public void mouseClicked(MouseEvent e) {
										textPeli5.setText("");
										textGenero5.setText("");
										textDuracion5.setText("");
										}
								});
								textPeli6.addMouseListener(new MouseAdapter() {
									 
									public void mouseClicked(MouseEvent e) {
										textPeli6.setText("");
										textGenero6.setText("");
										textDuracion6.setText("");
										}
								});
								textPeli7.addMouseListener(new MouseAdapter() {
									 
									public void mouseClicked(MouseEvent e) {
										textPeli7.setText("");
										textGenero7.setText("");
										textDuracion7.setText("");
										}
								});
								textPeli8.addMouseListener(new MouseAdapter() {
									 
									public void mouseClicked(MouseEvent e) {
										textPeli8.setText("");
										textGenero8.setText("");
										textDuracion8.setText("");
										}
								});
								textPeli9.addMouseListener(new MouseAdapter() {
									 
									public void mouseClicked(MouseEvent e) {
										textPeli9.setText("");
										textGenero9.setText("");
										textDuracion9.setText("");
										}
								});
								textPeli10.addMouseListener(new MouseAdapter() {
									 
									public void mouseClicked(MouseEvent e) {
										textPeli10.setText("");
										textGenero10.setText("");
										textDuracion10.setText("");
										}
								});
								textPeli11.addMouseListener(new MouseAdapter() {
									 
									public void mouseClicked(MouseEvent e) {
										textPeli11.setText("");
										textGenero11.setText("");
										textDuracion11.setText("");
										}
								});
								textPeli1.addMouseListener(new MouseAdapter() {
									 
									public void mouseClicked(MouseEvent e) {
										textPeli1.setText("");
										textGenero1.setText("");
										textDuracion1.setText("");
										}
								});
								textPeli12.addMouseListener(new MouseAdapter() {
									 
									public void mouseClicked(MouseEvent e) {
										textPeli12.setText("");
										textGenero12.setText("");
										textDuracion12.setText("");
										}
								});
								textPeli13.addMouseListener(new MouseAdapter() {
									 
									public void mouseClicked(MouseEvent e) {
										textPeli13.setText("");
										textGenero13.setText("");
										textDuracion13.setText("");
										}
								});
								textPeli14.addMouseListener(new MouseAdapter() {
									 
									public void mouseClicked(MouseEvent e) {
										textPeli14.setText("");
										textGenero14.setText("");
										textDuracion14.setText("");
										}
								});
								textPeli15.addMouseListener(new MouseAdapter() {
									 
									public void mouseClicked(MouseEvent e) {
										textPeli15.setText("");
										textGenero15.setText("");
										textDuracion15.setText("");
										}
								});
								textPeli16.addMouseListener(new MouseAdapter() {
									 
									public void mouseClicked(MouseEvent e) {
										textPeli16.setText("");
										textGenero16.setText("");
										textDuracion16.setText("");
										}
								});
								
								
							}
						
							});
						
						//BOTON EDITAR ADMIN
						btnEditar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								textPeli1.setEditable(true);
								textPeli2.setEditable(true);
								textPeli3.setEditable(true);
								textPeli4.setEditable(true);
								textPeli5.setEditable(true);
								textPeli6.setEditable(true);
								textPeli7.setEditable(true);
								textPeli8.setEditable(true);
								textPeli9.setEditable(true);
								textPeli10.setEditable(true);
								textPeli11.setEditable(true);
								textPeli12.setEditable(true);
								textPeli13.setEditable(true);
								textPeli14.setEditable(true);
								textPeli15.setEditable(true);
								textPeli16.setEditable(true);
								textGenero1.setEditable(true);
								textGenero2.setEditable(true);
								textGenero3.setEditable(true);
								textGenero4.setEditable(true);
								textGenero5.setEditable(true);
								textGenero6.setEditable(true);
								textGenero7.setEditable(true);
								textGenero8.setEditable(true);
								textGenero9.setEditable(true);
								textGenero10.setEditable(true);
								textGenero11.setEditable(true);
								textGenero12.setEditable(true);
								textGenero13.setEditable(true);
								textGenero14.setEditable(true);
								textGenero15.setEditable(true);
								textGenero16.setEditable(true);
								textDuracion1.setEditable(true);
								textDuracion2.setEditable(true);
								textDuracion3.setEditable(true);
								textDuracion4.setEditable(true);
								textDuracion5.setEditable(true);
								textDuracion6.setEditable(true);
								textDuracion7.setEditable(true);
								textDuracion8.setEditable(true);
								textDuracion9.setEditable(true);
								textDuracion10.setEditable(true);
								textDuracion11.setEditable(true);
								textDuracion12.setEditable(true);
								textDuracion13.setEditable(true);
								textDuracion14.setEditable(true);
								textDuracion15.setEditable(true);
								textDuracion16.setEditable(true);
							}
						
							});
						
						final JButton btnAtras = new JButton("<-");
						frame.getContentPane().add(btnAtras);
						btnAtras.setVisible(false);
						
						
						btnAtras.setBounds(0, 0, 45, 23);
						
						
						//PANEL LOGIN
						final JPanel login = new JPanel();
						login.setLayout(null);
						login.setBounds(0, 0, 434, 261);
						frame.getContentPane().add(login);
						
						
						//Items
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
						
						final JButton btnLogIn = new JButton("Login");
						btnLogIn.setBounds(222, 128, 89, 23);
						login.add(btnLogIn);
						login.setVisible(false);
						
						
	//Crear PANELES
						//PANEL BIENVENIDA
						final JPanel panel = new JPanel();
						panel.setBackground(UIManager.getColor("Button.background"));
						panel.setBounds(0, 0, 434, 261);
						frame.getContentPane().add(panel);
						panel.setLayout(null);
						
						//IMAGEN ELORRIETA                              HAY QUE REDIMENSIONARLA!
						JLabel lblElorrieta = new JLabel();
						lblElorrieta.setIcon(new ImageIcon("C:\\Users\\in1dm3\\eclipse-workspace\\DAMReto2\\src\\Reto2\\elorrieta.png"));
						lblElorrieta.setBounds(10, 11, 275, 61);
						panel.add(lblElorrieta);
						
						final JLabel lblBienvenida = new JLabel("Bienvenida");
						lblBienvenida.setFont(new Font("Tahoma", Font.PLAIN, 25));
						lblBienvenida.setBounds(165, 86, 126, 53);
						panel.add(lblBienvenida);
						
						//Elegir cuales estan visibles y cuales no
						panel.setVisible(true);
						
				
				//PANEL RESUMEN
						final JPanel resumen = new JPanel();
						resumen.setLayout(null);
						resumen.setBounds(0, 0, 434, 261);
						frame.getContentPane().add(resumen);
						resumen.setVisible(false);
						
						final JTextArea textPeliculasSabado = new JTextArea();
						textPeliculasSabado.setEditable(false);
						textPeliculasSabado.setBounds(35, 46, 151, 160);
						resumen.add(textPeliculasSabado);
						final JTextArea textPeliculasDomingo = new JTextArea();
						textPeliculasDomingo.setEditable(false);
						textPeliculasDomingo.setBounds(250, 46, 151, 160);
						resumen.add(textPeliculasDomingo);
						
						
						
						
						
						
						
						
						final JTextArea textAreaTiempoSab = new JTextArea("Tiempo restante sabado:");
						textAreaTiempoSab.setBackground(SystemColor.control);
						textAreaTiempoSab.setEditable(false);
						textAreaTiempoSab.setBounds(0, 0, 213, 35);
						resumen.add(textAreaTiempoSab);
						final JTextArea textAreaTiempoDom = new JTextArea("Tiempo restante domingo:");
						textAreaTiempoDom.setBackground(SystemColor.control);
						textAreaTiempoDom.setEditable(false);
						textAreaTiempoDom.setBounds(213, 0, 221, 35);
						resumen.add(textAreaTiempoDom);
						
						JButton btnCancel = new JButton("Cancelar");
						btnCancel.setBounds(10, 227, 89, 23);
						resumen.add(btnCancel);
						
						JButton btnConfirm = new JButton("Confirmar");
						btnConfirm.setBounds(320, 227, 89, 23);
						resumen.add(btnConfirm);
						
						JButton btnAtrasResumen = new JButton("Atras");
						btnAtrasResumen.setBounds(150, 227, 89, 23);
						resumen.add(btnAtrasResumen);
						resumen.setVisible(false);
						
						
				
				
				//PANEL MENU INICIAL
				final JPanel generos = new JPanel();
				generos.setLayout(null);
				generos.setBounds(0, 0, 434, 261);
				frame.getContentPane().add(generos);
				final JButton btnResumen = new JButton("Resumen");
				generos.add(btnResumen);
				final JButton btnGeneros = new JButton("Generos");
				generos.add(btnGeneros);
				final JButton btnSalir = new JButton("X");
				generos.add(btnSalir);
				generos.setVisible(false);
				
				
				btnGeneros.setBounds(70, 82, 117, 58);
				frame.getContentPane().add(generos);
				
				btnSalir.setBounds(389, 0, 45, 23);
				frame.getContentPane().add(generos);
				frame.getContentPane().add(generos);
				
				btnResumen.setBounds(254, 82, 103, 58);
				frame.getContentPane().add(generos);
				generos.setVisible(false);
				
				
		//PANEL PELICULAS CI-FI
				final JPanel peliculasCiFi = new JPanel();
				peliculasCiFi.setLayout(null);
				peliculasCiFi.setBounds(0, 0, 434, 261);
				frame.getContentPane().add(peliculasCiFi);
				
					JButton btnAtrasCiFi = new JButton("Atras");
					btnAtrasCiFi.setBounds(320, 227, 89, 23);
					peliculasCiFi.add(btnAtrasCiFi);
					
					JButton btnResumenCiFi = new JButton("Resumen");
					btnResumenCiFi.setBounds(270, 227, 89, 23);
					peliculasCiFi.add(btnResumenCiFi);
					
					
					final JLabel imgPeli1CiFi = new JLabel("New label");
					imgPeli1CiFi.setBounds(10, 11, 62, 99);
					peliculasCiFi.add(imgPeli1CiFi);
					
					final JLabel imgPeli2CiFi = new JLabel("New label");
					imgPeli2CiFi.setBounds(10, 151, 62, 99);
					peliculasCiFi.add(imgPeli2CiFi);
					
					final JLabel imgPeli4CiFi = new JLabel("New label");
					imgPeli4CiFi.setIcon(new ImageIcon("C:\\Users\\in1dm3\\eclipse-workspace\\DAMReto2\\src\\img\\alien.jpg"));
					imgPeli4CiFi.setBounds(269, 151, 155, 99);
					peliculasCiFi.add(imgPeli4CiFi);
					
					final JLabel imgPeli3CiFi = new JLabel("New label");
					imgPeli3CiFi.setIcon(new ImageIcon("C:\\Users\\in1dm3\\eclipse-workspace\\DAMReto2\\src\\img\\planetasimios.jpg"));
					imgPeli3CiFi.setBounds(269, 11, 155, 99);
					peliculasCiFi.add(imgPeli3CiFi);
					
					final JLabel lblHandia_12 = new JLabel("Odiseaenelespacio 1h 45min");
					lblHandia_12.setBounds(82, 80, 84, 14);
					peliculasCiFi.add(lblHandia_12);
					
					final JLabel lblHandia_13 = new JLabel("LanoviadeFrankenstein 1h 45min");
					lblHandia_13.setBounds(82, 193, 84, 14);
					peliculasCiFi.add(lblHandia_13);
					
					final JLabel lblHandia_14 = new JLabel("Elplanetadelossimios 1h 45min");
					lblHandia_14.setBounds(175, 80, 84, 14);
					peliculasCiFi.add(lblHandia_14);
					
					final JLabel lblHandia_15 = new JLabel("Alien 1h 45min");
					lblHandia_15.setBounds(176, 182, 84, 14);
					peliculasCiFi.add(lblHandia_15);
					peliculasCiFi.setVisible(false);
					
					//IMAGENES CIFI INTERACCION
					
					imgPeli1CiFi.addMouseListener(new MouseAdapter() {
						 
						public void mouseClicked(MouseEvent e) {
							tpelicula=Odiseaenelespacio;
							pelicula="Odisea en el espacio";
							añadirPeliculaCiFi(tpelicula, pelicula=lblHandia_12.getText(), textPeliculasSabado, textPeliculasDomingo);
							}
					});
					imgPeli2CiFi.addMouseListener(new MouseAdapter() {
						 
						public void mouseClicked(MouseEvent e) {
							tpelicula=LanoviadeFrankenstein;
							añadirPeliculaCiFi(tpelicula, pelicula=lblHandia_13.getText(), textPeliculasSabado, textPeliculasDomingo);
							}
					});
					imgPeli3CiFi.addMouseListener(new MouseAdapter() {
						 
						public void mouseClicked(MouseEvent e) {
							tpelicula=Elplanetadelossimios;
							pelicula="El planeta de los simios";
							añadirPeliculaCiFi(tpelicula, pelicula=lblHandia_14.getText(), textPeliculasSabado, textPeliculasDomingo);
							}
					});
					imgPeli4CiFi.addMouseListener(new MouseAdapter() {
						 
						public void mouseClicked(MouseEvent e) {
							tpelicula=Alien;
							pelicula="Alien";
							añadirPeliculaCiFi(tpelicula, pelicula=lblHandia_15.getText(), textPeliculasSabado, textPeliculasDomingo);
							
							}
					});
					peliculasCiFi.setVisible(false);
					
					
		
		//PANEL PELICULAS COMEDIA
				final JPanel peliculasComedia = new JPanel();
				peliculasComedia.setLayout(null);
				peliculasComedia.setBounds(0, 0, 434, 261);
				frame.getContentPane().add(peliculasComedia);
				
				JButton btnAtrasComedia = new JButton("Atras");
				btnAtrasComedia.setBounds(320, 227, 89, 23);
				peliculasComedia.add(btnAtrasComedia);
				
				JButton btnResumenComedia = new JButton("Resumen");
				btnResumenComedia.setBounds(270, 227, 89, 23);
				peliculasComedia.add(btnResumenComedia);
				
				
				
				JLabel imgPeli1Comedia = new JLabel();
				imgPeli1Comedia.setIcon(new ImageIcon("C:\\Users\\in1dm3\\eclipse-workspace\\DAMReto2\\src\\img\\scarymovie.jpg"));
				imgPeli1Comedia.setBounds(10, 11, 167, 99);
				peliculasComedia.add(imgPeli1Comedia);
				
				JLabel imgPeli2Comedia = new JLabel("New label");
				imgPeli2Comedia.setBounds(10, 151, 62, 99);
				peliculasComedia.add(imgPeli2Comedia);
				
				JLabel imgPeli4Comedia = new JLabel("New label");
				imgPeli4Comedia.setBounds(362, 151, 62, 99);
				peliculasComedia.add(imgPeli4Comedia);
				
				JLabel imgPeli3Comedia = new JLabel("New label");
				imgPeli3Comedia.setIcon(new ImageIcon("C:\\Users\\in1dm3\\eclipse-workspace\\DAMReto2\\src\\img\\vidadebrian.jpg"));
				imgPeli3Comedia.setBounds(263, 11, 161, 99);
				peliculasComedia.add(imgPeli3Comedia);
				
				final JLabel lblHandia_8 = new JLabel("Scarymovie 1h 45min");
				lblHandia_8.setBounds(122, 193, 84, 14);
				peliculasComedia.add(lblHandia_8);
				
				final JLabel lblHandia_9 = new JLabel("ElgranLebowsky 1h 45min");
				lblHandia_9.setBounds(122, 121, 84, 14);
				peliculasComedia.add(lblHandia_9);
				
				final JLabel lblHandia_10 = new JLabel("LavidadeBrian 1h 45min");
				lblHandia_10.setBounds(214, 121, 84, 14);
				peliculasComedia.add(lblHandia_10);
				
				final JLabel lblHandia_11 = new JLabel("Aterrizacomopuedas 1h 45min");
				lblHandia_11.setBounds(216, 193, 84, 14);
				peliculasComedia.add(lblHandia_11);
				peliculasComedia.setVisible(false);
				
				//IMAGENES COMEDIA INTERACCION
				
				imgPeli1Comedia.addMouseListener(new MouseAdapter() {
					 
					public void mouseClicked(MouseEvent e) {
						tpelicula=Scarymovie;
						pelicula= "Scary Movie";
						añadirPeliculaComedia(tpelicula, pelicula=lblHandia_8.getText(), textPeliculasSabado, textPeliculasDomingo);
						}
				});
				imgPeli2Comedia.addMouseListener(new MouseAdapter() {
					 
					public void mouseClicked(MouseEvent e) {
						tpelicula=ElgranLebowsky;
						pelicula="El gran Lebowsky";
						añadirPeliculaComedia(tpelicula, pelicula=lblHandia_9.getText(), textPeliculasSabado, textPeliculasDomingo);
						}
				});
				imgPeli3Comedia.addMouseListener(new MouseAdapter() {
					 
					public void mouseClicked(MouseEvent e) {
						tpelicula=LavidadeBrian;
						pelicula="La vidade Brian";
						añadirPeliculaComedia(tpelicula, pelicula=lblHandia_10.getText(), textPeliculasSabado, textPeliculasDomingo);
						}
				});
				imgPeli4Comedia.addMouseListener(new MouseAdapter() {
					 
					public void mouseClicked(MouseEvent e) {
						tpelicula=Aterrizacomopuedas;
						pelicula="Aterriza como puedas";
						añadirPeliculaComedia(tpelicula, pelicula=lblHandia_11.getText(), textPeliculasSabado, textPeliculasDomingo);
						}
				});
				peliculasComedia.setVisible(false);
				
				
		
		//PANEL PELICULAS TERROR
		final JPanel peliculasTerror = new JPanel();
		peliculasTerror.setLayout(null);
		peliculasTerror.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(peliculasTerror);
		
		JLabel imgPeli1Terror = new JLabel("New label");
		imgPeli1Terror.setIcon(new ImageIcon("C:\\Users\\in1dm3\\eclipse-workspace\\DAMReto2\\src\\img\\psicosis.jpg"));
		imgPeli1Terror.setBounds(10, 11, 160, 99);
		peliculasTerror.add(imgPeli1Terror);
		
		JLabel imgPeli2Terror = new JLabel("New label");
		imgPeli2Terror.setIcon(new ImageIcon("C:\\Users\\in1dm3\\eclipse-workspace\\DAMReto2\\src\\img\\elresplandor.jpg"));
		imgPeli2Terror.setBounds(10, 151, 160, 99);
		peliculasTerror.add(imgPeli2Terror);
		
		JLabel imgPeli4Terror = new JLabel("New label");
		imgPeli4Terror.setBounds(362, 151, 62, 99);
		peliculasTerror.add(imgPeli4Terror);
		
		JLabel imgPeli3Terror = new JLabel("New label");
		imgPeli3Terror.setBounds(362, 11, 62, 99);
		peliculasTerror.add(imgPeli3Terror);
		
		final JLabel lblHandia_4 = new JLabel("Psicosis 1h 45min");
		lblHandia_4.setBounds(175, 67, 84, 14);
		peliculasTerror.add(lblHandia_4);
		
		final JLabel lblHandia_5 = new JLabel("Elresplandor 1h 45min");
		lblHandia_5.setBounds(175, 151, 84, 14);
		peliculasTerror.add(lblHandia_5);
		
		final JLabel lblHandia_6 = new JLabel("Drácula 1h 45min");
		lblHandia_6.setBounds(268, 67, 84, 14);
		peliculasTerror.add(lblHandia_6);
		
		final JLabel lblHandia_7 = new JLabel("Cisnenegro 1h 45min");
		lblHandia_7.setBounds(270, 151, 84, 14);
		peliculasTerror.add(lblHandia_7);
		peliculasTerror.setVisible(false);
				
				peliculasTerror.setVisible(false);
				//IMAGENES TERROR INTERACCION
				
				imgPeli1Terror.addMouseListener(new MouseAdapter() {
					 
					public void mouseClicked(MouseEvent e) {
						tpelicula=Psicosis;
						pelicula="Psicosis";
						añadirPeliculaTerror(tpelicula, pelicula=lblHandia_4.getText(), textPeliculasSabado, textPeliculasDomingo);
						
						}
				});
				imgPeli2Terror.addMouseListener(new MouseAdapter() {
					 
					public void mouseClicked(MouseEvent e) {
						tpelicula=Elresplandor;
						pelicula="El Resplandor";
						añadirPeliculaTerror(tpelicula, pelicula=lblHandia_5.getText(), textPeliculasSabado, textPeliculasDomingo);
						}
				});
				imgPeli3Terror.addMouseListener(new MouseAdapter() {
					 
					public void mouseClicked(MouseEvent e) {
						tpelicula=Drácula;
						pelicula="Drácula";
						añadirPeliculaTerror(tpelicula, pelicula=lblHandia_6.getText(), textPeliculasSabado, textPeliculasDomingo);
						}
				});
				imgPeli4Terror.addMouseListener(new MouseAdapter() {
					 
					public void mouseClicked(MouseEvent e) {
						tpelicula=Cisnenegro;
						pelicula="Cisnenegro";
						añadirPeliculaTerror(tpelicula, pelicula=lblHandia_7.getText(), textPeliculasSabado, textPeliculasDomingo);
						}
				});
				
				JButton btnAtrasTerror = new JButton("Atras");
				btnAtrasTerror.setBounds(320, 227, 89, 23);
				peliculasTerror.add(btnAtrasTerror);
				
				JButton btnResumenTerror = new JButton("Resumen");
				btnResumenTerror.setBounds(270, 227, 89, 23);
				peliculasTerror.add(btnResumenTerror);
				
		
		
		//PANEL PELICULAS DRAMA
		final JPanel peliculasDrama = new JPanel();
		peliculasDrama.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(peliculasDrama);
		peliculasDrama.setLayout(null);
		JLabel imgPeli1Drama = new JLabel("New label");
		imgPeli1Drama.setBounds(10, 11, 62, 99);
		peliculasDrama.add(imgPeli1Drama);
		
		final JLabel lblHandia = new JLabel("Handia 1h 45min");
		lblHandia.setBounds(103, 53, 84, 14);
		peliculasDrama.add(lblHandia);
		
		final JLabel imgPeli2Drama = new JLabel("New label");
		imgPeli2Drama.setIcon(new ImageIcon("C:\\Users\\in1dm3\\eclipse-workspace\\DAMReto2\\src\\img\\lalistadeschindler.jpg"));
		imgPeli2Drama.setBounds(10, 151, 122, 99);
		peliculasDrama.add(imgPeli2Drama);
		
		final JLabel imgPeli3Drama = new JLabel("New label");
		imgPeli3Drama.setBounds(362, 11, 62, 99);
		peliculasDrama.add(imgPeli3Drama);
		
		final JLabel imgPeli4Drama = new JLabel("New label");
		imgPeli4Drama.setBounds(362, 151, 62, 99);
		peliculasDrama.add(imgPeli4Drama);
		peliculasDrama.setVisible(false);
		peliculasDrama.setVisible(false);
		
		JButton btnAtrasDrama = new JButton("Atras");
		btnAtrasDrama.setBounds(320, 227, 89, 23);
		peliculasDrama.add(btnAtrasDrama);
		
		JButton btnResumenDrama = new JButton("Resumen");
		btnResumenDrama.setBounds(270, 227, 89, 23);
		peliculasDrama.add(btnResumenDrama);
		
		final JLabel lblHandia_1 = new JLabel("LaListaDeSchindler 1h 45min");
		lblHandia_1.setBounds(103, 137, 84, 14);
		peliculasDrama.add(lblHandia_1);
		
		final JLabel lblHandia_2 = new JLabel("CadenaPerpetua 1h 45min");
		lblHandia_2.setBounds(247, 53, 84, 14);
		peliculasDrama.add(lblHandia_2);
		
		final JLabel lblHandia_3 = new JLabel("MillionDollarBaby 1h 45min");
		lblHandia_3.setBounds(247, 137, 84, 14);
		peliculasDrama.add(lblHandia_3);
		
		//Haciendo click en la imagen la añade a la cartelera
				imgPeli1Drama.addMouseListener(new MouseAdapter() {
					 
					public void mouseClicked(MouseEvent e) {
						tpelicula=Handia;
						pelicula="Handia";
						añadirPeliculaDrama(tpelicula, pelicula=lblHandia.getText(), textPeliculasSabado, textPeliculasDomingo);
						}
				});
				
				//Haciendo click en la imagen la añade a la cartelera
						
						//IMAGENES DRAMA INTERACCION
						
						imgPeli2Drama.addMouseListener(new MouseAdapter() {
							 
							public void mouseClicked(MouseEvent e) {
								tpelicula=LaListaDeSchindler;
								pelicula="LaListaDeSchindler";
								añadirPeliculaDrama(tpelicula, pelicula=lblHandia_1.getText(), textPeliculasSabado, textPeliculasDomingo);
								}
						});
						
						imgPeli3Drama.addMouseListener(new MouseAdapter() {
							 
							public void mouseClicked(MouseEvent e) {
								tpelicula=CadenaPerpetua;
								pelicula="CadenaPerpetua";
								añadirPeliculaDrama(tpelicula, pelicula=lblHandia_2.getText(), textPeliculasSabado, textPeliculasDomingo);
								}
						});
						imgPeli4Drama.addMouseListener(new MouseAdapter() {
							 
							public void mouseClicked(MouseEvent e) {
								tpelicula=MillionDollarBaby;
								pelicula="MillionDollarBaby";
								añadirPeliculaDrama(tpelicula, pelicula=lblHandia_3.getText(), textPeliculasSabado, textPeliculasDomingo);
								}
						});
						peliculasDrama.setVisible(false);
						
				
				
		/*	String pelisDrama = "peli1#peli2#peli3";
			for(int i=0; i==4;) {
				
			}
			
		*/
		//OBJETOS
				
				
				
				JLabel lblNewLabel = new JLabel("Estas de acuerdo?");
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblNewLabel.setBounds(121, 76, 178, 37);
				
				JButton btnSi = new JButton("Yes");
				btnSi.setBounds(108, 124, 72, 53);
				
				JButton btnNo = new JButton("No");
				btnNo.setBounds(227, 124, 72, 53);
		
		//PANEL CONFIRMACION
		final JPanel confirmacion = new JPanel();
		confirmacion.setLayout(null);
		confirmacion.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(confirmacion);
		confirmacion.add(btnSi);
		confirmacion.add(btnNo);
		confirmacion.add(lblNewLabel);
		
		//PANEL LISTA DE GENEROS
		final JPanel listaGeneros = new JPanel();
		listaGeneros.setLayout(null);
		listaGeneros.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(listaGeneros);
		
		JButton btnAtrasConfirmacion = new JButton("Atras");
		btnAtrasConfirmacion.setBounds(150, 227, 89, 23);
		confirmacion.add(btnAtrasConfirmacion);
		
		JButton btnAtrasListaGeneros = new JButton("Atras");
		btnAtrasListaGeneros.setBounds(170, 227, 89, 23);
		listaGeneros.add(btnAtrasListaGeneros);
		
		/*/**
		 * @param lblContraseña
		 */
		/*/**
		 * @param textContraseña textfield
		 */
		/*/**
		 * @param text
		 */
	
		JButton btnTerror = new JButton("Terror");
		btnTerror.setFont(new Font("Sitka Subheading", Font.BOLD, 12));
		btnTerror.setBounds(90, 174, 89, 23);
		
		listaGeneros.add(btnTerror);
		
		JButton btnDrama = new JButton("Drama");
		btnDrama.setFont(new Font("Sitka Subheading", Font.BOLD, 12));
		btnDrama.setBounds(90, 69, 89, 23);
		
		listaGeneros.add(btnDrama);
		
		JButton btnComedia = new JButton("Comedia");
		btnComedia.setFont(new Font("Sitka Subheading", Font.BOLD, 12));
		btnComedia.setBounds(256, 174, 89, 23);
		
		listaGeneros.add(btnComedia);
		
		JButton btnCiFi = new JButton("Ci-Fi");
		btnCiFi.setFont(new Font("Sitka Subheading", Font.BOLD, 12));
		btnCiFi.setBounds(256, 69, 89, 23);
		
		listaGeneros.add(btnCiFi);
		
		
		//FUNCIONES BOTONES
		//BOTON CANCEL
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				login.setVisible(false);
				generos.setVisible(false);
				confirmacion.setVisible(false);
				textContraseña.setText(null);
				textUsuario.setText(null);
				btnAtras.setVisible(false);
				listaGeneros.setVisible(false);
				resumen.setVisible(false);
				serviceMenu.setVisible(false);
				peliculasDrama.setVisible(false);
				peliculasTerror.setVisible(false);
				peliculasComedia.setVisible(false);
				peliculasCiFi.setVisible(false);
				textPeliculasSabado.setText("");
				textPeliculasDomingo.setText("");
				dramaSeleccionadoSab=false;
				dramaSeleccionadoDom=false;
				cienciaFiccionSeleccionadoSab = false;
				comediaSeleccionadoSab = false;
				terrorSeleccionadoSab = false;
				cienciaFiccionSeleccionadoDom = false;
				comediaSeleccionadoDom = false;
				terrorSeleccionadoDom = false;
				tiempoRestanteSab=480;
				tiempoRestanteDom=360;
			}
		});
		//BOTON CONFIRM
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generos.setVisible(false);
				login.setVisible(false);
				panel.setVisible(false);
				btnAtras.setVisible(false);
				confirmacion.setVisible(true);
				peliculasDrama.setVisible(false);
				peliculasTerror.setVisible(false);
				peliculasComedia.setVisible(false);
				peliculasCiFi.setVisible(false);
				resumen.setVisible(false);
			}
		});
		//BOTON ATRAS RESUMEN
		btnAtrasResumen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generos.setVisible(false);
				login.setVisible(false);
				panel.setVisible(false);
				btnAtras.setVisible(true);
				confirmacion.setVisible(false);
				peliculasDrama.setVisible(false);
				peliculasTerror.setVisible(false);
				peliculasComedia.setVisible(false);
				peliculasCiFi.setVisible(false);
				resumen.setVisible(false);
				serviceMenu.setVisible(false);
				listaGeneros.setVisible(true);
				
			}
			
		
});
		confirmacion.setVisible(false);
		listaGeneros.setVisible(false);
		
		
		
		//BOTON DE ATRAS (arriba a la izquierda)
		btnAtras.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel.setVisible(true);
					login.setVisible(false);
					generos.setVisible(false);
					confirmacion.setVisible(false);
					textContraseña.setText(null);
					textUsuario.setText(null);
					btnAtras.setVisible(false);
					listaGeneros.setVisible(false);
					serviceMenu.setVisible(false);
					peliculasDrama.setVisible(false);
					peliculasTerror.setVisible(false);
					peliculasComedia.setVisible(false);
					peliculasCiFi.setVisible(false);
					textPeliculasSabado.setText("");
					textPeliculasSabado.setText("");
					dramaSeleccionadoSab=false;
					dramaSeleccionadoDom=false;
					cienciaFiccionSeleccionadoSab = false;
					comediaSeleccionadoSab = false;
					terrorSeleccionadoSab = false;
					cienciaFiccionSeleccionadoDom = false;
					comediaSeleccionadoDom = false;
					terrorSeleccionadoDom = false;
					tiempoRestanteSab=480;
					tiempoRestanteDom=360;
				}
			});
		
		
		
		
		
		 
		 
		
		
		//BOTON SI
		btnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				login.setVisible(false);
				generos.setVisible(false);
				confirmacion.setVisible(false);
				btnAtras.setVisible(false);
				textContraseña.setText(null);
				textUsuario.setText(null);
				textPeliculasSabado.setText("");
				textPeliculasSabado.setText("");
				dramaSeleccionadoSab=false;
				dramaSeleccionadoDom=false;
				cienciaFiccionSeleccionadoSab = false;
				comediaSeleccionadoSab = false;
				terrorSeleccionadoSab = false;
				cienciaFiccionSeleccionadoDom = false;
				comediaSeleccionadoDom = false;
				terrorSeleccionadoDom = false;
				tiempoRestanteSab=480;
				tiempoRestanteDom=360;
			}
		});
		//BOTON NO
		/**
	     * Invoked when an action occurs.
	     * @param e the event to be processed
	     */
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				login.setVisible(false);
				generos.setVisible(true);
				confirmacion.setVisible(false);
				btnAtras.setVisible(true);
				/*/**
				 * @param textContraseña a
				 * @param textUsuario a
				 */
				textContraseña.setText(null);
				textUsuario.setText(null);
				textPeliculasSabado.setText("");
				textPeliculasSabado.setText("");
				dramaSeleccionadoSab=false;
				dramaSeleccionadoDom=false;
				cienciaFiccionSeleccionadoSab = false;
				comediaSeleccionadoSab = false;
				terrorSeleccionadoSab = false;
				cienciaFiccionSeleccionadoDom = false;
				comediaSeleccionadoDom = false;
				terrorSeleccionadoDom = false;
				tiempoRestanteSab=480;
				tiempoRestanteDom=360;
			}
		});
		
		//BOTON TERROR
		/**
	     * Invoked when an action occurs.
	     * @param e the event to be processed
	     */
		btnTerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				peliculasDrama.setVisible(false);
				panel.setVisible(false);
				login.setVisible(false);
				generos.setVisible(false);
				confirmacion.setVisible(false);
				btnAtras.setVisible(true);
				peliculasTerror.setVisible(true);
				peliculasComedia.setVisible(false);
				peliculasCiFi.setVisible(false);
				serviceMenu.setVisible(false);
				resumen.setVisible(false);
				listaGeneros.setVisible(false);
			}
		});
		
		//BOTON DRAMA
		/**
	     * Invoked when an action occurs.
	     * @param e the event to be processed
	     */
		btnDrama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					
					peliculasDrama.setVisible(true);
					panel.setVisible(false);
					login.setVisible(false);
					generos.setVisible(false);
					confirmacion.setVisible(false);
					btnAtras.setVisible(true);
					peliculasTerror.setVisible(false);
					peliculasComedia.setVisible(false);
					peliculasCiFi.setVisible(false);
					serviceMenu.setVisible(false);
					resumen.setVisible(false);
					listaGeneros.setVisible(false);
					
				
						
					
			}
		});
		
		//BOTON COMEDIA
		/**
	     * Invoked when an action occurs.
	     * @param e the event to be processed
	     */
		btnComedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				peliculasDrama.setVisible(false);
				panel.setVisible(false);
				login.setVisible(false);
				generos.setVisible(false);
				confirmacion.setVisible(false);
				btnAtras.setVisible(true);
				peliculasTerror.setVisible(false);
				peliculasComedia.setVisible(true);
				peliculasCiFi.setVisible(false);
				serviceMenu.setVisible(false);
				resumen.setVisible(false);
				listaGeneros.setVisible(false);
			}
		});
		
		//BOTON CI-FI
		/**
	     * Invoked when an action occurs.
	     * @param e the event to be processed
	     */
		btnCiFi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				peliculasDrama.setVisible(false);
				panel.setVisible(false);
				login.setVisible(false);
				generos.setVisible(false);
				confirmacion.setVisible(false);
				btnAtras.setVisible(true);
				peliculasTerror.setVisible(false);
				peliculasComedia.setVisible(false);
				peliculasCiFi.setVisible(true);
				serviceMenu.setVisible(false);
				resumen.setVisible(false);
				listaGeneros.setVisible(false);
				
				
				
			}
		});
		
		
		//BOTON SALIR(arriba a la derecha)
				/**
			     * Invoked when an action occurs.
			     * @param e the event to be processed
			     */
				//BOTONRESUMEN
						/**
					     * Invoked when an action occurs.
					     * @param e the event to be processed
					     */
		
		//BOTON GENEROS (Te lleva a la lista de generos)
				/**
			     * Invoked when an action occurs.
			     * @param e the event to be processed
			     */
				
				//BOTON ATRAS CONFIRMACION
				btnAtrasConfirmacion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						generos.setVisible(false);
						login.setVisible(false);
						panel.setVisible(false);
						btnAtras.setVisible(false);
						confirmacion.setVisible(false);
						peliculasDrama.setVisible(false);
						peliculasTerror.setVisible(false);
						peliculasComedia.setVisible(false);
						peliculasCiFi.setVisible(false);
						resumen.setVisible(true);
						serviceMenu.setVisible(false);
						listaGeneros.setVisible(false);
						
					}
					
				
			});
				//BOTON ATRAS LISTA GENEROS
				btnAtrasListaGeneros.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						generos.setVisible(true);
						login.setVisible(false);
						panel.setVisible(false);
						btnAtras.setVisible(true);
						confirmacion.setVisible(false);
						peliculasDrama.setVisible(false);
						peliculasTerror.setVisible(false);
						peliculasComedia.setVisible(false);
						peliculasCiFi.setVisible(false);
						resumen.setVisible(false);
						serviceMenu.setVisible(false);
						listaGeneros.setVisible(false);
						
					}
					
				
			});
				
				//BOTON ATRAS DRAMA
				btnAtrasDrama.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						peliculasDrama.setVisible(false);
						panel.setVisible(false);
						login.setVisible(false);
						generos.setVisible(false);
						confirmacion.setVisible(false);
						btnAtras.setVisible(true);
						peliculasTerror.setVisible(false);
						peliculasComedia.setVisible(false);
						peliculasCiFi.setVisible(false);
						serviceMenu.setVisible(false);
						resumen.setVisible(false);
						listaGeneros.setVisible(true);
					}
				});
				//BOTON RESUMEN DRAMA
				btnResumenDrama.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						generos.setVisible(false);
						login.setVisible(false);
						panel.setVisible(false);
						btnAtras.setVisible(false);
						confirmacion.setVisible(false);
						peliculasDrama.setVisible(false);
						peliculasTerror.setVisible(false);
						peliculasComedia.setVisible(false);
						peliculasCiFi.setVisible(false);
						resumen.setVisible(true);
						String tResSab=String.valueOf(tiempoRestanteSab);
						String tResDom=String.valueOf(tiempoRestanteDom);
						textAreaTiempoSab.setText("Tiempo restante sabado:"+tResSab);
						textAreaTiempoDom.setText("Tiempo restante domingo:"+tResDom);
					}
				});
				
				//BOTON ATRAS TERROR
				btnAtrasTerror.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						peliculasDrama.setVisible(false);
						panel.setVisible(false);
						login.setVisible(false);
						generos.setVisible(false);
						confirmacion.setVisible(false);
						btnAtras.setVisible(true);
						peliculasTerror.setVisible(false);
						peliculasComedia.setVisible(false);
						peliculasCiFi.setVisible(false);
						serviceMenu.setVisible(false);
						resumen.setVisible(false);
						listaGeneros.setVisible(true);
					}
				});
				//BOTON RESUMEN TERROR
				btnResumenTerror.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						generos.setVisible(false);
						login.setVisible(false);
						panel.setVisible(false);
						btnAtras.setVisible(false);
						confirmacion.setVisible(false);
						peliculasDrama.setVisible(false);
						peliculasTerror.setVisible(false);
						peliculasComedia.setVisible(false);
						peliculasCiFi.setVisible(false);
						resumen.setVisible(true);
						String tResSab=String.valueOf(tiempoRestanteSab);
						String tResDom=String.valueOf(tiempoRestanteDom);
						textAreaTiempoSab.setText("Tiempo restante sabado:"+tResSab);
						textAreaTiempoDom.setText("Tiempo restante domingo:"+tResDom);
					}
				});
				
				//BOTON ATRAS COMEDIA
				btnAtrasComedia.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						peliculasDrama.setVisible(false);
						panel.setVisible(false);
						login.setVisible(false);
						generos.setVisible(false);
						confirmacion.setVisible(false);
						btnAtras.setVisible(true);
						peliculasTerror.setVisible(false);
						peliculasComedia.setVisible(false);
						peliculasCiFi.setVisible(false);
						serviceMenu.setVisible(false);
						resumen.setVisible(false);
						listaGeneros.setVisible(true);
					}
				});
				//BOTON RESUMEN COMEDIA
				btnResumenComedia.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						generos.setVisible(false);
						login.setVisible(false);
						panel.setVisible(false);
						btnAtras.setVisible(false);
						confirmacion.setVisible(false);
						peliculasDrama.setVisible(false);
						peliculasTerror.setVisible(false);
						peliculasComedia.setVisible(false);
						peliculasCiFi.setVisible(false);
						resumen.setVisible(true);
						String tResSab=String.valueOf(tiempoRestanteSab);
						String tResDom=String.valueOf(tiempoRestanteDom);
						textAreaTiempoSab.setText("Tiempo restante sabado:"+tResSab);
						textAreaTiempoDom.setText("Tiempo restante domingo:"+tResDom);
					}
				});
				
				//BOTON ATRAS CIFI
				btnAtrasCiFi.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						peliculasDrama.setVisible(false);
						panel.setVisible(false);
						login.setVisible(false);
						generos.setVisible(false);
						confirmacion.setVisible(false);
						btnAtras.setVisible(true);
						peliculasTerror.setVisible(false);
						peliculasComedia.setVisible(false);
						peliculasCiFi.setVisible(false);
						serviceMenu.setVisible(false);
						resumen.setVisible(false);
						listaGeneros.setVisible(true);
					}
				});
				//BOTON RESUMEN CIFI
				btnResumenCiFi.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						generos.setVisible(false);
						login.setVisible(false);
						panel.setVisible(false);
						btnAtras.setVisible(false);
						confirmacion.setVisible(false);
						peliculasDrama.setVisible(false);
						peliculasTerror.setVisible(false);
						peliculasComedia.setVisible(false);
						peliculasCiFi.setVisible(false);
						resumen.setVisible(true);
						String tResSab=String.valueOf(tiempoRestanteSab);
						String tResDom=String.valueOf(tiempoRestanteDom);
						textAreaTiempoSab.setText("Tiempo restante sabado:"+tResSab);
						textAreaTiempoDom.setText("Tiempo restante domingo:"+tResDom);
					}
				});
				
				btnSalir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
				btnResumen.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						generos.setVisible(false);
						login.setVisible(false);
						panel.setVisible(false);
						btnAtras.setVisible(false);
						confirmacion.setVisible(false);
						peliculasDrama.setVisible(false);
						peliculasTerror.setVisible(false);
						peliculasComedia.setVisible(false);
						peliculasCiFi.setVisible(false);
						resumen.setVisible(true);
						String tResSab=String.valueOf(tiempoRestanteSab);
						String tResDom=String.valueOf(tiempoRestanteDom);
						textAreaTiempoSab.setText("Tiempo restante sabado:"+tResSab);
						textAreaTiempoDom.setText("Tiempo restante domingo:"+tResDom);
					}
				});
				btnGeneros.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						peliculasDrama.setVisible(false);
						panel.setVisible(false);
						login.setVisible(false);
						generos.setVisible(false);
						confirmacion.setVisible(false);
						btnAtras.setVisible(true);
						peliculasTerror.setVisible(false);
						peliculasComedia.setVisible(false);
						peliculasCiFi.setVisible(false);
						serviceMenu.setVisible(false);
						resumen.setVisible(false);
						listaGeneros.setVisible(true);
					}
				});
				
				//Esto hace que cuando hagamos click en la pantalla de bienvenida espera tres segundos y se muestra el login
				panel.addMouseListener(new MouseAdapter() {
					 
					public void mouseClicked(MouseEvent e) {
						tiempoEspera(0);                                      //HAY QUE PONER los 3 segundos
						panel.setVisible(false);
						login.setVisible(true);
						btnAtras.setVisible(true);
						generos.setVisible(false);
						confirmacion.setVisible(false);
						}
				});
				
				//BOTON DE ACEPTAR EL LOGIN
				btnLogIn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(textContraseña.getText().equals("admin")&&textUsuario.getText().equals("admin")) {
							JOptionPane.showMessageDialog(null, "Bienvenido al menu del administrador");
							generos.setVisible(false);
							login.setVisible(false);
							panel.setVisible(false);
							confirmacion.setVisible(false);
							serviceMenu.setVisible(true);
							btnAtras.setVisible(false);
							peliculasDrama.setVisible(false);
							peliculasTerror.setVisible(false);
							peliculasComedia.setVisible(false);
							peliculasCiFi.setVisible(false);
							resumen.setVisible(false);
							textNuevaPelicula.setVisible(false);
							textNuevoGenero.setVisible(false);
							textNuevaDuracion.setVisible(false);
							btnAccept.setVisible(false);
						}
						/*/**
						 * @param s
						 */
						else if(textContraseña.getText().equals("1")&&textUsuario.getText().equals("1")){
							JOptionPane.showMessageDialog(null, "Bienvenido");
							generos.setVisible(true);
							login.setVisible(false);
							panel.setVisible(false);
							btnAtras.setVisible(true);
							confirmacion.setVisible(false);
							peliculasDrama.setVisible(false);
							peliculasTerror.setVisible(false);
							peliculasComedia.setVisible(false);
							peliculasCiFi.setVisible(false);
							resumen.setVisible(false);
							serviceMenu.setVisible(false);
							listaGeneros.setVisible(false);
							
							
						}
						
						else {
							JOptionPane.showMessageDialog(null, "User o password desconocido");
							
						}
						
					}
				});
				
				//BOTON ACEPTAR AÑADIR
				
				btnAccept.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						/*if(textPeli1.getText().isEmpty()) {
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
						}*/
					}
				});
				//BOTON CANCELAR
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panel.setVisible(true);
						login.setVisible(false);
						generos.setVisible(false);
						confirmacion.setVisible(false);
						textContraseña.setText(null);
						textUsuario.setText(null);
						btnAtras.setVisible(false);
						listaGeneros.setVisible(false);
						serviceMenu.setVisible(false);
						peliculasDrama.setVisible(false);
						peliculasTerror.setVisible(false);
						peliculasComedia.setVisible(false);
						peliculasCiFi.setVisible(false);
						textPeliculasSabado.setText("");
						textPeliculasSabado.setText("");
						dramaSeleccionadoSab=false;
						dramaSeleccionadoDom=false;
						cienciaFiccionSeleccionadoSab = false;
						comediaSeleccionadoSab = false;
						terrorSeleccionadoSab = false;
						cienciaFiccionSeleccionadoDom = false;
						comediaSeleccionadoDom = false;
						terrorSeleccionadoDom = false;
						tiempoRestanteSab=480;
						textNuevaPelicula.setVisible(false);
						textNuevoGenero.setVisible(false);
						textNuevaDuracion.setVisible(false);
						btnAccept.setVisible(false);
						/*textPeli1
						 * ECHARLE UN OJO
						 * 
						*/
					}
				});
				
				//BOTON AÑADIR ADMIN
				btnAnadir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(textPeli1.getText().isEmpty()||textPeli2.getText().isEmpty()||textPeli3.getText().isEmpty()||textPeli4.getText().isEmpty()||textPeli5.getText().isEmpty()||textPeli6.getText().isEmpty()||textPeli7.getText().isEmpty()||textPeli8.getText().isEmpty()||textPeli9.getText().isEmpty()||textPeli10.getText().isEmpty()||textPeli11.getText().isEmpty()||textPeli12.getText().isEmpty()||textPeli13.getText().isEmpty()||textPeli14.getText().isEmpty()||textPeli15.getText().isEmpty()||textPeli16.getText().isEmpty()) {
							textNuevaPelicula.setVisible(true);
							textNuevoGenero.setVisible(true);
							textNuevaDuracion.setVisible(true);
							btnAccept.setVisible(true);
							
							
						}else {
							JOptionPane.showMessageDialog(null, "No se pueden añadir mas peliculas a la cartelera, borra alguna");
						}
						
						
					}
					
					});
				
				//BOTON CONFIRMAR ADMIN
				btnConfirmar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						lblHandia.setText(textPeli1.getText());
						lblHandia_1.setText(textPeli2.getText());
						lblHandia_2.setText(textPeli3.getText());
						lblHandia_3.setText(textPeli4.getText());
						lblHandia_4.setText(textPeli13.getText());
						lblHandia_5.setText(textPeli14.getText());
						lblHandia_6.setText(textPeli15.getText());
						lblHandia_7.setText(textPeli16.getText());
						lblHandia_8.setText(textPeli9.getText());
						lblHandia_9.setText(textPeli10.getText());
						lblHandia_10.setText(textPeli11.getText());
						lblHandia_11.setText(textPeli12.getText());
						lblHandia_12.setText(textPeli5.getText());
						lblHandia_13.setText(textPeli6.getText());
						lblHandia_14.setText(textPeli7.getText());
						lblHandia_15.setText(textPeli8.getText());
						panel.setVisible(true);
						login.setVisible(false);
						generos.setVisible(false);
						confirmacion.setVisible(false);
						textContraseña.setText(null);
						textUsuario.setText(null);
						btnAtras.setVisible(false);
						listaGeneros.setVisible(false);
						serviceMenu.setVisible(false);
						peliculasDrama.setVisible(false);
						peliculasTerror.setVisible(false);
						peliculasComedia.setVisible(false);
						peliculasCiFi.setVisible(false);
						textPeliculasSabado.setText("");
						textPeliculasSabado.setText("");
						dramaSeleccionadoSab=false;
						dramaSeleccionadoDom=false;
						cienciaFiccionSeleccionadoSab = false;
						comediaSeleccionadoSab = false;
						terrorSeleccionadoSab = false;
						cienciaFiccionSeleccionadoDom = false;
						comediaSeleccionadoDom = false;
						terrorSeleccionadoDom = false;
						tiempoRestanteSab=480;
						
						
					}
					
					});
				
	}
}
