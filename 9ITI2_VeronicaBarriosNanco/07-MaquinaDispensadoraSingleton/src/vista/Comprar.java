package vista;

import java.awt.Container;
import java.awt.TextArea;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Comprar extends JFrame {
	private JTextField txtN1= new JTextField();
	private JTextField txtN2 = new JTextField("");
	private JLabel txto = new JLabel("Total a pagar: ");
	private TextArea area= new TextArea();
	
	private JButton pagar=new JButton("Pagar");
	private Container c= getContentPane();
	
	public Comprar(){
		super.setTitle("Comprar");
		super.setSize(320,480);
		super.setDefaultCloseOperation(HIDE_ON_CLOSE);
		super.setResizable(true); // no redimencionar
		
		cargarControles();
	}
	
	private void cargarControles() {
		c.setLayout(null);
		
		area.setBounds(10, 10, 270, 310);
		txto.setBounds(20, 340, 110, 25);
		txtN1.setBounds(110, 340, 100, 25);
		txtN2.setBounds(60, 370, 200, 25);
		
		txtN1.setEditable(false);
		pagar.setBounds(100, 410, 89, 23);
		//calcular.setBounds(70, 150, 150, 40);
		//lbResultado.setBounds(70, 200, 150, 40);
		
		c.add(txtN1);
		c.add(txtN2);
		c.add(txto);
		c.add(pagar);
		c.add(area);
		//c.add(calcular);
		//c.add(lbResultado);
	
		
	}
	public String getN1(){
		return txtN1.getText();
	}
	
	
	/**
	 * 
	 * @return envia el contenido de la caja 2, cuando  eventos lo necesite 
	 */
	public String getN2(){
		return txtN2.getText();
	}
    /**
     * 
     * @param resultado resultado resultado envia a la caja lbResultado el resultado de la operacion el resultado es enviado desde la clase eventos
     */
	public void setLbResultado(String resultado) {
		area.setText(resultado);
		area= new TextArea(resultado);
	}
	
	public void setLbcantidad(String resultado) {
		txtN1.setText(resultado);
		//txtN1=new JTextField(resultado);
	}
	
	
	/**
	 * 
	 * @param e agrega el evento  ActionListener al boton calcular area cuadrado
	 */

	public void onClickPagar(ActionListener e){
		pagar.addActionListener(e);
	}
	
	/**
	 * 
	 * @return se agrega el boton a un evento en especifico
	 */
	public JButton getBtnPagar() {
		return pagar;
	}

}
