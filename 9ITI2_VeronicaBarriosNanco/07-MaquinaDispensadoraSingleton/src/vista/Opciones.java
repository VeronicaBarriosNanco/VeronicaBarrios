package vista;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Opciones  extends JFrame{
	private JButton Dulces=new JButton("Dulces");
	private JButton Chocolates=new JButton("Chocolates");
	private JButton Galletas=new JButton("Galletas");
	private JButton Refrescos=new JButton("Refrescos");
	
private Container c=getContentPane();
	
	public Opciones(){
		super.setTitle("Opciones");
		super.setSize(320,480);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setResizable(false);
		
		cargarControles();
	}
	
	private void cargarControles() {
		c.setLayout(null);
		
		Dulces.setBounds(100, 50, 100, 50);
		Chocolates.setBounds(100, 150, 100, 50);
		Galletas.setBounds(100, 250, 100, 50);
		Refrescos.setBounds(100, 350, 100, 50);
		
		c.add(Dulces);
		c.add(Chocolates);
		c.add(Galletas);
		c.add(Refrescos);
		

				
	
	}
	
	/**
	 * 
	 * @param e agrega el evento  ActionListener al boton dulces
	 */
	public void onClickDulces(ActionListener e){
		Dulces.addActionListener(e);
		
	}
	/**
	 * 
	 * @param e agrega el evento  ActionListener al boton chocolates
	 */
	public void onClickChocolates(ActionListener e){
		Chocolates.addActionListener(e);
	}
	/**
	 * 
	 * @param e agrega el evento  ActionListener al boton galletas
	 */
	public void onClickGalletas(ActionListener e){
		Galletas.addActionListener(e);
	}
	/**
	 * 
	 * @param e agrega el evento  ActionListener al boton  refrescos
	 */
	
	public void onClickRefrescos(ActionListener e){
		Refrescos.addActionListener(e);
	}
	 
	/**
	 * 
	 * @return se agrega el boton a un evento en especifico
	 */
	public JButton getBtGalletas() {
		return Galletas;
	}
	/**
	 * 
	 * @return se agrega el boton a un evento en especifico
	 */
	public JButton getBtnchocolates() {
		return Chocolates;
	}
	/**
	 * 
	 * @return se agrega el boton a un evento en especifico
	 */
	public JButton getBtnDulces() {
	
		return Dulces;
	}
	/**
	 * 
	 * @return se agrega el boton a un evento en especifico
	 */
	public JButton getBtnRefrescos() {
		return Refrescos;
	}

	

}
