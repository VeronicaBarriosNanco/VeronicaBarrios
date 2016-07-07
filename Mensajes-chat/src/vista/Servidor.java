package vista;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import modelo.Flujo;

/**
 * 
 * @author Veronica Barrios Nanco
 *
 */
public final class Servidor extends JFrame implements Runnable, ActionListener{
	private static final Servidor servidor = new Servidor();
	
     private JTextArea txtarea = new JTextArea();
     private JTextField txtmsn = new JTextField();
     private JLabel estiqueta = new JLabel("SERVIDOR");
     private Container c = getContentPane();
     private JButton btnsalir = new JButton("Enviar");
     ServerSocket ser =null;
     
     
	private Servidor() {
		super.setTitle("Servidor");
		super.setSize(340, 350);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Thread hilo = new Thread(this);
		hilo.start();
		componentes();
	}
	public static Servidor Acceso(){
		return servidor;
		
	}
	
	
	private void componentes() {
		c.setLayout(null);
		txtarea.setBounds(10, 40, 300, 150);
		txtarea.setEnabled(false);
		estiqueta.setBounds(10, 10, 100, 30);
		btnsalir.setBounds(10, 200, 100, 30);
		txtmsn.setBounds(10,250,300,30);
		
		c.add(estiqueta);
		c.add(txtmsn);
		c.add(txtarea);
		c.add(btnsalir);
		
		txtarea.setLineWrap(true);
		txtarea.setWrapStyleWord(true);
		btnsalir.addActionListener(this);
		
		
	}

	@Override
	public void run() {
		try {
			ser =  new ServerSocket(9087);
			Socket  cliente;
			String nick,msn;
			Flujo classClie;
			while (true) {
			cliente = ser.accept();
			ObjectInputStream flujo = new ObjectInputStream(cliente.getInputStream());
			classClie= (Flujo)flujo.readObject();
			nick= classClie.getNick();
			msn = classClie.getMsn();
			txtarea.append("\n"+nick +" dice: "+msn);
			
			Socket clienvia = new Socket( "127.0.0.1",9091);
			ObjectOutputStream flujoenviar = new ObjectOutputStream(clienvia.getOutputStream());
			flujoenviar.writeObject(classClie);
			clienvia.close();
				cliente.close();
			}
			
			
			
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}
	}

	
	public void run1() {
          try {
	Socket cli = new Socket("127.0.0.1",9087);
	Flujo  flujoMsn = Flujo.Acceso();
	flujoMsn.setNick("Servidor");
	
	flujoMsn.setMsn(txtmsn.getText());
	
	ObjectOutputStream flujo = new ObjectOutputStream(cli.getOutputStream());
	
	flujo.writeObject(flujoMsn);
	
	cli.close();
	
		} catch (Exception e) {
	// TODO: handle exception
}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnsalir)) {
			run1();
			txtmsn.setText("");
		}
				
	}
	
	

}
