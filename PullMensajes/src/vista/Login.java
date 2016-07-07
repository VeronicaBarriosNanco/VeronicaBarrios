package vista;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controlador.Pull;
import modelo.OperacionesBD;
/**
 * 
 * @author Veronica Barrios Nanco
 *
 */
public final class Login extends JFrame implements ActionListener{
	
	public static JLabel lbNom=new JLabel("Nombre");
	private JLabel lbCorreo=new JLabel("Contraseña");
	public static JTextField txtNom=new JTextField();
	public static JTextField txtNom2=new JTextField();	
	public static JPasswordField txtCorreo=new JPasswordField();
	
	public static JButton btnGuardar=new JButton("Ingresar");
	public static JButton btnregresar=new JButton("Nuevo usuario");
	
	private Container c=getContentPane();
	public OperacionesBD ge=new OperacionesBD();
	
	private static final Login ventanaLogin=new Login();
	
	private Login(){
		super.setTitle("Entrada");
		super.setSize(260,250);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setLocationRelativeTo(null);
		
		cargarControles();
		
	}
	private void cargarControles() {
		
		c.setLayout(null);
		
		btnGuardar.setBounds(10, 130, 90, 50);
		btnregresar.setBounds(110, 130, 120, 50);
		
		lbNom.setBounds(10,2,50,50);
		txtNom.setBounds(10, 35, 220, 30);
		lbCorreo.setBounds(10,60,200,30);
		txtCorreo.setBounds(10, 90, 220, 30);
		
		c.add(lbNom);
		c.add(lbCorreo);
		c.add(txtNom);
		c.add(txtCorreo);
		c.add(btnGuardar);
		c.add(btnregresar);
		
		btnGuardar.addActionListener(this);
		btnGuardar.setFocusable(false);
		
		btnregresar.addActionListener(this);
		btnregresar.setFocusable(false);
		
	}
	public static Login instanciaLogin(){
		return ventanaLogin;
	}
	@Override
	public void actionPerformed(ActionEvent ex) {
		
		Object boton=ex.getSource();
		if(boton==btnGuardar){
			if(txtNom.getText().trim().length()==0){
				JOptionPane.showMessageDialog(null, "Campo Nombre Vacio", "Validando Datos",
						 JOptionPane.ERROR_MESSAGE);
				return;
			}else if (txtCorreo.getText().trim().length()==0) {
				JOptionPane.showMessageDialog(null, "Campo Contrasela Vacio", "Validando Datos",
						 JOptionPane.ERROR_MESSAGE);
				return;
			}else{
				ge.ConsultaUsuario(txtNom.getText(),txtCorreo.getText());
				Pull v=Pull.instanciaChat();
				v.prueba(txtNom.getText());
				txtNom.setText("");
				txtCorreo.setText("");
			}
		
			}
		if(boton==btnregresar){
			
			VentanaAgregar nu=VentanaAgregar.instanciaVentana();
			nu.setVisible(true);
			this.setVisible(false);
			}
	}

}
