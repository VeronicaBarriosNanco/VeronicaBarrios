package vista;

import java.awt.Container;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cambio extends JFrame{
	

	private TextArea area= new TextArea();
	
	private JButton pagar=new JButton("Pagar");
	private Container c= getContentPane();
	
	public Cambio(){
		super.setTitle("Cambio");
		super.setSize(320,480);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setResizable(true); // no redimencionar
		
		cargarControles();
	}
	
	private void cargarControles() {
		c.setLayout(null);
		area.setBounds(10, 10, 290, 390);
		pagar.setBounds(100, 410, 89, 23);
		//c.add(pagar);
		c.add(area);
		
	}
	

	
	
	public void setLbResultado(String resultado) {
		area.setText(resultado);
		//area= new TextArea(resultado);
	}
}
