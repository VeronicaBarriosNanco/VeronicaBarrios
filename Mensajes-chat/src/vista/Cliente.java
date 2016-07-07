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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import modelo.Flujo;

/**
 * 
 * @author Veronica Barrios Nanco
 *
 */
public final class Cliente extends JFrame implements ActionListener, Runnable {
	private static final Cliente formcliente = new Cliente();

	private JTextField caja3 = new JTextField();
	private JLabel estiqueta = new JLabel("CLIENTE");
	private JTextArea txt = new JTextArea();
	private JButton btnenviar = new JButton("Enviar");
	private Container c = getContentPane();
	private JScrollPane scroll = new JScrollPane(txt);

	private Cliente() {
		super.setTitle("Principal Cliente");
		super.setSize(340, 350);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Thread hilo = new Thread(this);
		hilo.start();
		componentes();
	}

	public static Cliente Acceso() {
		return formcliente;
	}

	private void componentes() {
		// TODO Auto-generated method stub
		c.setLayout(null);
		txt.setBounds(10, 40, 300, 150);
		txt.setEnabled(false);
		estiqueta.setBounds(10, 10, 100, 30);
		btnenviar.setBounds(10, 200, 100, 30);
		caja3.setBounds(10,250,300,30);
		
		c.add(estiqueta);
		c.add(txt);
		c.add(caja3);
		c.add(btnenviar);
		txt.setLineWrap(true);
		txt.setWrapStyleWord(true);
		   
        //scroll.setBounds(new Rectangle(10,40,300,300));                                                   
		//c.add(scroll);                   
      
		btnenviar.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnenviar)) {
			try {

				Socket cli = new Socket("127.0.0.1", 9087);
				Flujo flujoMsn = Flujo.Acceso();
				flujoMsn.setNick("Cliente");
				flujoMsn.setMsn(caja3.getText());

				ObjectOutputStream flujo = new ObjectOutputStream(cli.getOutputStream());

				flujo.writeObject(flujoMsn);

				cli.close();
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}

	}

	@Override
	public void run() {
		try {
			ServerSocket serv = new ServerSocket(9091);
			Socket clie;
			Flujo classClie;
			while (true) {

				clie = serv.accept();
				ObjectInputStream flujo = new ObjectInputStream(clie.getInputStream());
				classClie = (Flujo) flujo.readObject();
				txt.append("\n" + classClie.getNick() + " dice: " + classClie.getMsn());
				
				caja3.setText("");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
