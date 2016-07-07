package conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
/**
 * 
 * @author Veronica Barrios Nanco
 *
 */
public final class GestionBD{
	/**
	 * Llama a la clase Singleton conexión BD
	 */
	public static ConexionBD condb=ConexionBD.instanciaSingleton();
	
	
	public static final GestionBD gesdb=new GestionBD();
	public String consulta;
/**
 * Contructor de la clase GestionBD	
 */
	private GestionBD(){
		
	}

	
	public void registros(String consulta){
        try {
        	condb.conectar();
            Statement sentencia=condb.local.createStatement();
            sentencia.execute(consulta);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "No se pudo realizar la operacion"+ex,
                    "Error",JOptionPane.ERROR_MESSAGE);
            
        }
    }
	
	public static ResultSet consulta(String consultaSQL){
        try {
            Connection lineaConexion=condb.conectar();
            Statement sentencia = lineaConexion.createStatement();
            ResultSet cdr = sentencia.executeQuery(consultaSQL);
                    return cdr;                   
            
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"se se puede hacer la consulta" +ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return null;
     
 }
	
	
	
	public static GestionBD instanciaBD(){
		return gesdb;
	}
	
	
}