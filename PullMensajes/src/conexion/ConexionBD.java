package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 * 
 * @author Veronica Barrios Nanco
 * la Clase singleton se crea final
 *
 */
public final class ConexionBD {
	public String nombrebase;
	public  String usuario;
	public String pass;
    public String url;
    public static Connection local=null;
	/**
	 *  el metodo singleton se crea privado, estatico y final
	 */
	private static final ConexionBD singleton=new ConexionBD();
	/**
	 * El metodo Singleton envia el resultado qe decea demostrar
	 */
	private ConexionBD() {
		nombrebase="mensajespull";
		usuario="root";
		pass="";
	    url="jdbc:mysql://localhost/"+nombrebase;
		conectar();

	}
	
	public Connection  conectar() {
		
		/**
		 * Manejador de errores
		 */
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			local=DriverManager.getConnection(url,usuario,pass);
			//JOptionPane.showMessageDialog(null, "Conecto");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Error al conectar");
	}
		return local;
	}
	/**
	 * 
	 * @return singleton para la informacion que desea mostrar
	 */
	public static ConexionBD instanciaSingleton() {
		return singleton;
	}

}