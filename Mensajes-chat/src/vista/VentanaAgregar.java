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

import modelo.OperacionesBD;
/**
 * 
 * @author Veronica Barrios Nanco
 *
 */
public final class VentanaAgregar extends JFrame implements ActionListener{
	
	private static JLabel lbNom=new JLabel("NOMBRE");
	private static JLabel lbCorreo=new JLabel("PASSWORD");
	private static JTextField txtNom=new JTextField();
	public static JTextField txtNom2=new JTextField();	
	private static JPasswordField txtCorreo=new JPasswordField();
	private static String botonSelec;
	private static JButton btnGuardar=new JButton("Guarda");
	private static JButton btnEliminar=new JButton("Ingresar");
	private Container c=getContentPane();
	public OperacionesBD ge=new OperacionesBD();
	
	private static final VentanaAgregar ventana=new VentanaAgregar();
/**
 * Constructor principal	
 */
	private VentanaAgregar(){
		super.setTitle("Nuevo usuario");
		super.setSize(240,350);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setLocationRelativeTo(null);
		
		cargarControles();
		
	}
	private void cargarControles() {
		c.setLayout(null);
		btnGuardar.setBounds(10, 141, 88, 50);
		btnEliminar.setBounds(121, 141, 88, 50);
		lbNom.setBounds(10,11,80,30);
		txtNom.setBounds(10, 41, 200, 30);
		lbCorreo.setBounds(10,71,200,30);
		txtCorreo.setBounds(10, 100, 200, 30);
		c.add(lbNom);
		c.add(lbCorreo);
		c.add(txtNom);
		c.add(txtCorreo);
		c.add(btnGuardar);
		c.add(btnEliminar);
		
		btnGuardar.addActionListener(this);
		btnEliminar.addActionListener(this);
	}
	public static VentanaAgregar instanciaVentana(){
		return ventana;
	}
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent ex) {
		// TODO Auto-generated method stub
		Object boton=ex.getSource();
		if(boton==btnGuardar){
		if(txtNom.getText().trim().length()==0){
			JOptionPane.showMessageDialog(null, "Campo Nombre Vacio", "Validando Datos",
					 JOptionPane.ERROR_MESSAGE);
			return;
		}else if(txtCorreo.getText().trim().length()==0){
			JOptionPane.showMessageDialog(null, "Campo Contraseña Vacio", "Validando Datos",
					 JOptionPane.ERROR_MESSAGE);
			return;
		}else
			ge.altaUsuario(txtNom.getText(),txtCorreo.getText());
			txtNom.setText("");
			txtCorreo.setText("");
		
		
		}else if(boton==btnEliminar){
			Login v2=Login.instanciaLogin();
			v2.setVisible(true);
			this.setVisible(false);
		}
	}

}
