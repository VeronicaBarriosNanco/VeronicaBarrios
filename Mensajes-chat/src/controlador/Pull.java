package controlador;
import java.awt.Color;
import java.awt.Container;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.mysql.jdbc.EscapeTokenizer;

import conexion.GestionBD;
import modelo.OperacionesBD;
import vista.*;

/**
 * 
 * @author Veronica Barrios Nanco
 *
 */

public final class Pull extends JFrame implements ActionListener{
/**
 * Singleton para la clase Chat que es la interfaz	
 */
	
	public static DefaultListModel minimodel=new DefaultListModel();
	public static JList listaNombre=new JList();
	private JScrollPane scrollLista=new JScrollPane();
	
	JLabel lbTitulo=new JLabel();
	
	JLabel use=new JLabel("Nombre de usuario");
	JLabel mns=new JLabel("Mensaje");
	static JTextField txtNom2=new JTextField();
	JTextField txtMensaje=new JTextField();
	JButton jbEnviar=new JButton("Enviar");
	JButton btnSalir=new JButton("Salir");
	JButton btnChat=new JButton("Chat");
	
	private Container c=getContentPane();
	public OperacionesBD ge=new OperacionesBD();
	private String Nombre;
	
	
	private static final Pull chat=new Pull();

/**
 * Constructor principal  private	
 */
	private Pull(){
		super.setTitle("mensajes");
		super.setSize(240,500);
		super.setLocationRelativeTo(null);
		
		cargarControles();
		
	}
	
/**
 * carga y distribución de controladores
 */
	private void cargarControles() {
		
		c.setLayout(null);
		
/**
 * Esto nos se utiliza para crear la lista del pull de mensajes
 * 
 */
		scrollLista.setViewportView(listaNombre);
		scrollLista.setBounds(10,150,350,200);
		
		setSize(380,480);
		setTitle("Chat");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		mns.setBounds(10, 70, 50, 50);
		txtMensaje.setBounds(10,110,200,30);
		jbEnviar.setBounds(250,110,80,30);
		btnSalir.setBounds(10,10,60,50);
		btnChat.setBounds(100,10,60,50);
		
		c.add(jbEnviar);
		c.add(mns);
		c.add(txtMensaje);
		c.add(scrollLista);
		c.add(lbTitulo);
		c.add(btnSalir);
		c.add(btnChat);
		
		
		jbEnviar.addActionListener(this);
		btnSalir.addActionListener(this);
		btnSalir.setFocusable(false);
		btnChat.addActionListener(this);
		
		llenarPull();
	}
	
	public void llenarPull() {
		/**
		 * LLama del Singleton GestionBD
		 */
		GestionBD ges=GestionBD.instanciaBD();
		
		
		try {
			
		        ResultSet rs = ges.consulta("select concat(fecha,' - ',usuario,' - ',mensajes) from mensaje ");
		        while(rs.next())
		            minimodel.addElement(rs.getString("concat(fecha,' - ',usuario,' - ',mensajes)"));
		        listaNombre.setModel(minimodel);
		    } catch (SQLException ex) {
		        
		        ex.printStackTrace();
		    }
		}
	public static Pull instanciaChat(){
		return chat;
	}
	@Override
	public void actionPerformed(ActionEvent ex) {
		
		Object boton=ex.getSource();
		if(boton==jbEnviar){
			if(txtMensaje.getText().trim().length()==0){
				JOptionPane.showMessageDialog(null, "Debe ingresar un mensaje", "Validando Datos",
						 JOptionPane.ERROR_MESSAGE);
				return;
			}else{
				ge.actualizarMensaje(txtMensaje.getText(), Nombre);
				minimodel.clear();
				llenarPull();
				txtMensaje.setText("");
			}
		}else if(boton==btnChat){
			Servidor servidor = Servidor.Acceso();
			servidor.setVisible(true);
			Cliente cliente = Cliente.Acceso();
			cliente.setVisible(true);
		}else if (boton==btnSalir) {
			Login v1=Login.instanciaLogin();
			v1.setVisible(true);
			this.setVisible(false);
		}
	}
	public void prueba(String nom){
		Nombre=nom;
		
	}

}
