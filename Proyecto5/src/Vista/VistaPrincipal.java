package Vista;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VistaPrincipal extends JPanel {

	private JTextField contraseña;
	
	public VistaPrincipal() {
		setLayout(null);
		
		JLabel lblAvatar = new JLabel("Avatar");
		lblAvatar.setBounds(10, 4, 132, 151);
		lblAvatar.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/Images/usuario1.png")));
		add(lblAvatar);


		//Autentificacion
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10, 150, 111, 14);
		add(lblUsuario);
		
		JComboBox Usuario = new JComboBox();
		Usuario.setBounds(10, 175, 111, 20);
		add(Usuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(10, 206, 111, 14);
		add(lblContrasea);
		
		contraseña = new JTextField();
		contraseña.setBounds(10, 231, 111, 20);
		add(contraseña);
		contraseña.setColumns(10);
		
		
		//Botones entrada
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(10, 313, 111, 23);
		add(btnRegistrar);
		
		JButton btnLogin = new JButton("LogIn");
		btnLogin.setBounds(10, 278, 111, 23);
		add(btnLogin);
		
		
		//Botones cambio pantalla
		JButton btnJuegos = new JButton("Juegos >");
		btnJuegos.setBounds(287, 11, 111, 23);
		add(btnJuegos);
		
		JButton btnPerfil = new JButton("Perfil >");
		btnPerfil.setBounds(287, 45, 111, 23);
		add(btnPerfil);
		
		setVisible(true);
	}

}
