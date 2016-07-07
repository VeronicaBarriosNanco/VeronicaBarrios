import vista.Login;

/**
 * 
 * @author Veronica Barrios Nanco
 *
 */
public class Llamada {

	public static void main(String[] args) {
		/**
		 * Clase principal que manda a llamar a la clase sigleton 
		 * New user y le dice que la panga visible
		 */
		Login v=Login.instanciaLogin();
		v.setVisible(true);
	}

}
