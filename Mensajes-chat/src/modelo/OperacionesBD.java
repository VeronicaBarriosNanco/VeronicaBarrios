package modelo;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import conexion.GestionBD;
import controlador.Pull;
/**
 * 
 * @author Veronica Barrios Nanco
 *
 */

public class OperacionesBD {
/**
 * 
 * @param txtNombre Introduce el nombre del usuario en tipo de variable String
 * @param txtpassword Introduce el password en tipo de variable String
 */
	public void altaUsuario(String txtNombre, String txtpassword) {

		try{
			String consulta="select nombre from usuario where nombre='"+txtNombre+"'";
			GestionBD obj=GestionBD.instanciaBD();
			ResultSet cdr=obj.consulta(consulta);
			if(!cdr.next()){
				String sql="insert into usuario values(null,'"+txtNombre+"','"+txtpassword+"')";
				GestionBD obj2=GestionBD.instanciaBD();
				obj2.registros(sql);
        		JOptionPane.showMessageDialog(null, "Registro Realizado"); 

            }else{
            	JOptionPane.showMessageDialog(null, "Usuario EXISTENTE"); 
            	return;
            }
		} catch (Exception e) {
			
		}
		
	}

/**
 * 
 * @param mensaje Intoduce el mensaje que escribe el en usuario en formato String
 * @param Usuario Introduce el nombre del Usuario en formato String
 */
	public void actualizarMensaje(String mensaje, String Usuario ) {
		String mn="insert into mensaje values(null,'"+mensaje+"',now(),'"+Usuario+"')";
		GestionBD ge=GestionBD.instanciaBD();
		ge.registros(mn);
		
	}
/**
 * 
 * @param txtNombre Permite la consulta del nombre en formato String
 * @param txtContra Introduce  el nombre de usuaio en formato String
 */
	public void ConsultaUsuario(String txtNombre, String txtContra) {
		
		try{
			String consulta="select nombre from usuario where nombre='"+txtNombre+"' and correo='"+txtContra+"'";
			GestionBD obj=GestionBD.instanciaBD();
			ResultSet cdr=obj.consulta(consulta);
			if(cdr.next()){
        		Pull v=Pull.instanciaChat();
        		v.prueba(txtNombre);
    			v.setVisible(true);
            }else{
            	JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña", "Error en datos",
						 JOptionPane.ERROR_MESSAGE);
        		return;
            }
		} catch (Exception e) {
		}
	}
}