import Modelo.conexionDB;
import Vista.VistaVentana;

public class Constructor {

	public static void main(String[] args) {

		//Datos para crear conexion BBDD (donde está la BD, nombre BD, usuario, contraseña)
		conexionDB conexion = new conexionDB("localhost","gamesDB","root","");
		conexion.conectDB(); //Rellena la conexion
		
		//Mostrar ventanas
		VistaVentana vistaVentana = new VistaVentana();
		vistaVentana.setVisible(true);
		
	}

}
