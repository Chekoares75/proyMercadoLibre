package mvc.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mvc.controlador.Controlador;

import javax.swing.JDesktopPane;
import java.awt.GridLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class frmPrincipal extends JFrame {

	private JPanel contentPane;
	private JDesktopPane dskEscritorio;
	private JMenuItem jmiPruebasLogin;
	private JMenuItem jmiPruebasCheck;
	private JMenuItem jmiSalir;
	private JMenuItem jmiDesarrollador;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controlador objControlador= new Controlador();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	/**
	 * Create the frame.
	 */
	public frmPrincipal() {
		setTitle("Interfaz amigable para pruebas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Opciones");
		menuBar.add(mnNewMenu);
		
		jmiPruebasLogin = new JMenuItem("Pruebas Login Mercado Libre");
		mnNewMenu.add(jmiPruebasLogin);
		
		jmiPruebasCheck = new JMenuItem("Pruebas CheckBox");
		mnNewMenu.add(jmiPruebasCheck);
		
		jmiSalir = new JMenuItem("Salir");
		mnNewMenu.add(jmiSalir);
		
		JMenu mnNewMenu_1 = new JMenu("Acerca de");
		menuBar.add(mnNewMenu_1);
		
		jmiDesarrollador = new JMenuItem("Del desarrollador");
		mnNewMenu_1.add(jmiDesarrollador);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		dskEscritorio = new JDesktopPane();
		contentPane.add(dskEscritorio);
	}



	public JDesktopPane getDskEscritorio() {
		return dskEscritorio;
	}



	public void setDskEscritorio(JDesktopPane dskEscritorio) {
		this.dskEscritorio = dskEscritorio;
	}



	public JMenuItem getJmiPruebasLogin() {
		return jmiPruebasLogin;
	}



	public void setJmiPruebasLogin(JMenuItem jmiPruebasLogin) {
		this.jmiPruebasLogin = jmiPruebasLogin;
	}



	public JMenuItem getJmiPruebasCheck() {
		return jmiPruebasCheck;
	}



	public void setJmiPruebasCheck(JMenuItem jmiPruebasCheck) {
		this.jmiPruebasCheck = jmiPruebasCheck;
	}



	public JMenuItem getJmiSalir() {
		return jmiSalir;
	}



	public void setJmiSalir(JMenuItem jmiSalir) {
		this.jmiSalir = jmiSalir;
	}



	public JMenuItem getJmiDesarrollador() {
		return jmiDesarrollador;
	}



	public void setJmiDesarrollador(JMenuItem jmiDesarrollador) {
		this.jmiDesarrollador = jmiDesarrollador;
	}
	
}
