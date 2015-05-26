package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class conexionDB {

	//Datos de conexión
	static final String Controlador_MYSQL = "com.mysql.jdbc.Driver";
	
	//Datos de BBDD
	private String host;
	private String bbdd;
	private String user;
	private String pass;
	
	//Conexión
	private static Connection conexion = null; //maneja la conexión
	
	public conexionDB(String HOST,String BBDD,String USER,String PASS) {
		this.host = HOST;
		this.bbdd = BBDD;
		this.user = USER;
		this.pass = PASS; 
	}
	
	public boolean conectDB(){
		try{
			//Lo primero es cargar el controlador MySQL el cual automáticamente se registra
			Class.forName(Controlador_MYSQL);
			//Conectarnos a la BBDD
			conexion = DriverManager.getConnection("jdbc:mysql://"+this.host+"/"+this.bbdd,this.user,this.pass);
		} catch(SQLException exceptionSql) { //excepcion de error
			exceptionSql.printStackTrace();
			return false;
		} catch(ClassNotFoundException exceptionSql2) { //excepcion de error
			exceptionSql2.printStackTrace();
			return false;
		}
		return true;
	}
		
	//Metodo que devuelve la conexion a la base de datos
		public static Connection getConexion(){
			return conexion;
		}
	}

