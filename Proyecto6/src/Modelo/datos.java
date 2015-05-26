package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class datos {
	//devolver datos
	private static String DATOS_LIST="SELECT * FROM usuario";
	
	
	//Conexion
	private Connection conexion = null; //maneja la conexion
	Statement instruccion = null; //Cargar sentencias de SQL
	ResultSet resultados = null; //Devuelve datos
	
	
	public datos(){
		this.conexion = conexionDB.getConexion();
	}
	
	public ArrayList<String> getDatos(){
		ArrayList<String> datos=new ArrayList<String>();
		
		try{
			instruccion = this.conexion.createStatement();
			resultados = instruccion.executeQuery(DATOS_LIST);
			
			//Bucle para guardar datos en un array
			while( resultados.next() ) {
				datos.add(resultados.getString("usuarios"));
			}
			
		}catch(SQLException exceptionSql){
			exceptionSql.printStackTrace();
		} finally { //Cerrar conexiones con BD
			try{
				resultados.close();
				instruccion.close();
			}catch( SQLException excepcionSql ) { //excepcion de error
				excepcionSql.printStackTrace();
			}
		}
		return datos;
	}
}
