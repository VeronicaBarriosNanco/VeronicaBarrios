package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import vista.*;

/**
 * 
 * @author Barrios Nanco Nancy 
 *
 */
public class appMaquinaDispensadora{
	
	/**
	 * 
	 * @param args rgs es el parametro de un array en formato String, aparece obligatoriamente como argumento del m�todo main 
	 * @throws ClassNotFoundException Configuraci�n de proxies a trav�s del panel de control de Java
	 * @throws InstantiationException se crea cuando una aplicaci�n trata de crear una instancia de una clase utilizando el newInstance
	 * @throws IllegalAccessException se produce cuando una aplicaci�n intent� crear una instancia reflexiva
	 * @throws UnsupportedLookAndFeelException Una excepci�n que indica el aspecto deseado y sentir clases de gesti�n no est�n presentes en el sistema del usuario.
	 */

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException,
    UnsupportedLookAndFeelException {
		
		
		/**
		 * UIManager gestiona el aspecto actual y la sensaci�n, el conjunto de aspecto disponibles y 
		 * se siente, PropertyChangeListeners que son notificados cuando la apariencia cambios,
		 *  ver y sentir por defecto, y m�todos de conveniencia para la obtenci�n de varios valores por defecto.
		 */
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
SwingUtilities.invokeLater(new Runnable() {

	/**
	 * metodo para ejecutar el SplaceGreen
	 */
    @Override
    public void run() {
        try {
            new SplashGreen().initUI();
        } catch (MalformedURLException e) {
           
            e.printStackTrace();
        }
    }
});
}

	

}
