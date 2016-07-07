package modelo;
import java.io.Serializable;
/**
 * 
 * @author Veronica Barrios Nanco
 *
 */
public final class Flujo implements Serializable {
	private static final Flujo flujomsn = new Flujo();

	private String nick;

	private String msn;

	private Flujo() {
	}
	
	public static Flujo Acceso(){
		return flujomsn;
	}
	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getMsn() {
		return msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

}
