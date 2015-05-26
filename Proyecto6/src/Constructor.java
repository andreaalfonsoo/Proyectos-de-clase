import Modelo.conexionDB;
import Vista.VistaVentana;

public class Constructor {

	public static void main(String[] args) {

		//Datos para crear conexion BBDD (donde est� la BD, nombre BD, usuario, contrase�a)
		conexionDB conexion = new conexionDB("localhost","gamesDB","root","");
		conexion.conectDB(); //Rellena la conexion
		
		//Mostrar ventanas
		VistaVentana vistaVentana = new VistaVentana();
		vistaVentana.setVisible(true);
		
	}

}
