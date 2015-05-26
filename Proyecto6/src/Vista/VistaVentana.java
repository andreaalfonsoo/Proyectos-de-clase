package Vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.CardLayout;


public class VistaVentana extends JFrame {

	private JPanel contentPane;
	private JTextField contraseña;
	private VistaPrincipal vp; //Llama a VistaPrincipal

	/**
	 * Create the frame.
	 */
	
	public VistaVentana() {
		
		vp = new VistaPrincipal(); //Inicializamos la variable
		setBounds(100, 100, 450, 418);
		
		//Barra de menu
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPrincipal = new JMenu("Principal");
		menuBar.add(mnPrincipal);
		
		JMenu mnNewMenu = new JMenu("Juegos");
		menuBar.add(mnNewMenu);
		
		JMenu mnPerfil = new JMenu("Perfil");
		menuBar.add(mnPerfil);
		
		//JPanel de la VentanaPrincipal
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//Crear Layout
		contentPane.setLayout(new CardLayout(0, 0)); 
		contentPane.add(vp, "VistaPrincipal"); //CardLayout añade la vista ventana que tu quieras //Siempre hay que poner un String
		//Se puede hacer nuevo un contenedor que "limpie" el JPanel y asi poder mostrar otra ventana
		
	}
}
