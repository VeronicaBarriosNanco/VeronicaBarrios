package vista;

import java.awt.Container;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.*;

import modelo.Operaciones;
import controlador.Eventos;

/**
 * 
 * @author Barrios Nanco Nancy 
 *
 */
public final class Detalle extends JFrame { //primer paso se crea la clase de tipo final
	
	/**
	 * segundo paso se crea la instancia del objeto de tipo private, static y final
	 */
	private  static final Detalle s = new Detalle();
	
	private Container c= getContentPane();
	/*Dulces*/
	public JLabel lblNombre1=new JLabel("Nombre: Chicle Bubbaloo");
	public JLabel lblMarca1=new JLabel("Marca: Sonrics");
	public JLabel lblPrecio1=new JLabel("Precio: $5");
	public JLabel lblLogo1 = new JLabel();
	public JCheckBox chec1=new JCheckBox();
	
	
  
	public JLabel lblNombre2=new JLabel("Nombre: Chiclets Menta");
	public JLabel lblMarca2=new JLabel("Marca: Novo");
	public JLabel lblPrecio2=new JLabel("Precio: $5");
	public JLabel lblLogo2 = new JLabel();
	public JCheckBox chec2=new JCheckBox();
	
	public JLabel lblNombre3=new JLabel("Nomre: Chicle Trident");
	public JLabel lblMarca3=new JLabel("Marca: Novo");
	public JLabel lblPrecio3=new JLabel("Precio: $3");
	public JLabel lblLogo3 = new JLabel(); 
	public JCheckBox chec3=new JCheckBox();
	
	public JLabel lblNombre4=new JLabel("Nombre: Chicle Doublemint");
	public JLabel lblMarca4=new JLabel("Marca: Novo");
	public JLabel lblPrecio4=new JLabel("Precio: $2");
	public JLabel lblLogo4 = new JLabel(); 
	public JCheckBox chec4=new JCheckBox();
	
	public JLabel lblNombre5=new JLabel("Nombre: Chicle Orbit");
	public JLabel lblMarca5=new JLabel("Marca: Novo");
	public JLabel lblPrecio5=new JLabel("Precio: $3");
	public JLabel lblLogo5 = new JLabel(); 
	public JCheckBox chec5=new JCheckBox();
	
	public JLabel lblNombre6=new JLabel("Nombre: paleta Chupa Chups");
	public JLabel lblMarca6=new JLabel("Marca: sonrics");
	public JLabel lblPrecio6=new JLabel("Precio: $5");
	public JLabel lblLogo6 = new JLabel(); 
	public JCheckBox chec6=new JCheckBox();
	
	public JLabel lblNombre7=new JLabel("Nombre: Paleta de Sandia");
	public JLabel lblMarca7=new JLabel("Marca: Vero");
	public JLabel lblPrecio7=new JLabel("Precio: $5");
	public JLabel lblLogo7 = new JLabel(); 
	public JCheckBox chec7=new JCheckBox();
	
	public JLabel lblNombre8=new JLabel("Nombre: Paleta de Elote");
	public JLabel lblMarca8=new JLabel("Marca: Vero");
	public JLabel lblPrecio8=new JLabel("Precio: $6");
	public JLabel lblLogo8 = new JLabel();
	public JCheckBox chec8=new JCheckBox();
	
	public JLabel lblNombre9=new JLabel("Nombre: Miguelito");
	public JLabel lblMarca9=new JLabel("Marca: Vero");
	public JLabel lblPrecio9=new JLabel("Precio: $8");
	public JLabel lblLogo9 = new JLabel();
	public JCheckBox chec9=new JCheckBox();
	
	public JLabel lblNombre10=new JLabel("Nombre: Paleta de Cajeta");
	public JLabel lblMarca10=new JLabel("Marca: Coronado");
	public JLabel lblPrecio10=new JLabel("Precio: $4");
	public JLabel lblLogo10 = new JLabel();
	public JCheckBox chec10=new JCheckBox();
	
	
	/*Chocolates*/
	public JLabel lblNombreCHO1=new JLabel("Nombre: chocolates");
	public JLabel lblMarcaCHO1=new JLabel("Marca: Ferrero Rocher");
	public JLabel lblPrecioCHO1=new JLabel("Precio: 40");
	public JLabel lblLogoCHO1 = new JLabel();
	public JCheckBox checCHO1=new JCheckBox();
	
	
  
	public JLabel lblNombreCHO2=new JLabel("Nombre: Chocolates CarlosV");
	public JLabel lblMarcaCHO2=new JLabel("Marca: Nestle");
	public JLabel lblPrecioCHO2=new JLabel("Precio:50");
	public JLabel lblLogoCHO2 = new JLabel();
	public JCheckBox checCHO2=new JCheckBox();
	
	public JLabel lblNombreCHO3=new JLabel("Nomre: Chocolates KitKat");
	public JLabel lblMarcaCHO3=new JLabel("Marca: Nestle");
	public JLabel lblPrecioCHO3=new JLabel("Precio: 60");
	public JLabel lblLogoCHO3 = new JLabel(); 
	public JCheckBox checCHO3=new JCheckBox();
	
	public JLabel lblNombreCHO4=new JLabel("Nombre: Chocolates Hershey's");
	public JLabel lblMarcaCHO4=new JLabel("Marca: Nestle");
	public JLabel lblPrecioCHO4=new JLabel("Precio: 60");
	public JLabel lblLogoCHO4 = new JLabel(); 
	public JCheckBox checCHO4=new JCheckBox();
	
	public JLabel lblNombreCHO5=new JLabel("Nombre: Chocote m&m's");
	public JLabel lblMarcaCHO5=new JLabel("Marca: Nestle");
	public JLabel lblPrecioCHO5=new JLabel("Precio: 90");
	public JLabel lblLogoCHO5 = new JLabel(); 
	public JCheckBox checCHO5=new JCheckBox();
	
	public JLabel lblNombreCHO6=new JLabel("Nombre: Chocolate SNIKERS");
	public JLabel lblMarcaCHO6=new JLabel("Marca: Kinder");
	public JLabel lblPrecioCHO6=new JLabel("Precio: 15");
	public JLabel lblLogoCHO6 = new JLabel(); 
	public JCheckBox checCHO6=new JCheckBox();
	
	public JLabel lblNombreCHO7=new JLabel("Nombre: Kinder Sorpresa");
	public JLabel lblMarcaCHO7=new JLabel("Marca: Kinder");
	public JLabel lblPrecioCHO7=new JLabel("Precio: 10");
	public JLabel lblLogoCHO7 = new JLabel(); 
	public JCheckBox checCHO7=new JCheckBox();
	
	public JLabel lblNombreCHO8=new JLabel("Nombre: HERSHEY's");
	public JLabel lblMarcaCHO8=new JLabel("Marca: Nestle");
	public JLabel lblPrecioCHO8=new JLabel("Precio: 15");
	public JLabel lblLogoCHO8 = new JLabel();
	public JCheckBox checCHO8=new JCheckBox();
	
	public JLabel lblNombreCHO9=new JLabel("Nombre: MilkyWay");
	public JLabel lblMarcaCHO9=new JLabel("Marca: Nestle");
	public JLabel lblPrecioCHO9=new JLabel("Precio: 8");
	public JLabel lblLogoCHO9 = new JLabel();
	public JCheckBox checCHO9=new JCheckBox();
	
	public JLabel lblNombreCHO10=new JLabel("Nombre: CRUNCH");
	public JLabel lblMarcaCHO10=new JLabel("Marca: Nestle");
	public JLabel lblPrecioCHO10=new JLabel("Precio: 15");
	public JLabel lblLogoCHO10 = new JLabel();
	public JCheckBox checCHO10=new JCheckBox();
	/*Galletas*/
	public JLabel lblNombreGA1=new JLabel("Nombre: OREO");
	public JLabel lblMarcaGA1=new JLabel("Marca : Gamesa");
	public JLabel lblPrecioGA1=new JLabel("Precio: 10");
	public JLabel lblLogoGA1 = new JLabel();
	public JCheckBox checGA1=new JCheckBox();
	
	
	public JLabel lblNombreGA2=new JLabel("Nombre: Today");
	public JLabel lblMarcaGA2=new JLabel("Marca: Gamesa");
	public JLabel lblPrecioGA2=new JLabel("Precio: 15");
	public JLabel lblLogoGA2 = new JLabel();
	public JCheckBox checGA2=new JCheckBox();
	
	public JLabel lblNombreGA3=new JLabel("Nomre: Galletas de Avena");
	public JLabel lblMarcaGA3=new JLabel("Marca: All Bran");
	public JLabel lblPrecioGA3=new JLabel("Precio: 15");
	public JLabel lblLogoGA3 = new JLabel();
	public JCheckBox checGA3=new JCheckBox();
	
	public JLabel lblNombreGA4=new JLabel("Nombre: CHOKIS");
	public JLabel lblMarcaGA4=new JLabel("Marca: Gamesa");
	public JLabel lblPrecioGA4=new JLabel("Precio: 10");
	public JLabel lblLogoGA4 = new JLabel();
	public JCheckBox checGA4=new JCheckBox();
	
	public JLabel lblNombreGA5=new JLabel("Nombre: EMPERADOR DE VAINILLA");
	public JLabel lblMarcaGA5=new JLabel("Marca: Gamesa");
	public JLabel lblPrecioGA5=new JLabel("Precio: 10");
	public JLabel lblLogoGA5 = new JLabel();
	public JCheckBox checGA5=new JCheckBox();
	
	public JLabel lblNombreGA6=new JLabel("Nombre: EMPERADOR DE CHOCOLATE");
	public JLabel lblMarcaGA6=new JLabel("Marca: Gamesa");
	public JLabel lblPrecioGA6=new JLabel("Precio: 12");
	public JLabel lblLogoGA6 = new JLabel();
	public JCheckBox checGA6=new JCheckBox();
	
	public JLabel lblNombreGA7=new JLabel("Nombre: Marias");
	public JLabel lblMarcaGA7=new JLabel("Marca: Gamesa");
	public JLabel lblPrecioGA7=new JLabel("Precio: 15");
	public JLabel lblLogoGA7 = new JLabel();
	public JCheckBox checGA7=new JCheckBox();
	
	public JLabel lblNombreGA8=new JLabel("Nombre: Arcoiris");
	public JLabel lblMarcaGA8=new JLabel("Marca: Gamesa");
	public JLabel lblPrecioGA8=new JLabel("Precio: 10");
	public JLabel lblLogoGA8 = new JLabel();
	public JCheckBox checGA8=new JCheckBox();
	
	public JLabel lblNombreGA9=new JLabel("Nombre: florentinas");
	public JLabel lblMarcaGA9=new JLabel("Marca:Gamesa");
	public JLabel lblPrecioGA9=new JLabel("Precio: 15");
	public JLabel lblLogoGA9 = new JLabel();
	public JCheckBox checGA9=new JCheckBox();
	
	public JLabel lblNombreGA10=new JLabel("Nombre: Krakers");
	public JLabel lblMarcaGA10=new JLabel("Marca: Gamesa");
	public JLabel lblPrecioGA10=new JLabel("Precio: 15");
	public JLabel lblLogoGA10 = new JLabel();
	public JCheckBox checGA10=new JCheckBox();
	
	/*Refrescos*/
	public JLabel lblNombreRE1=new JLabel("Nombre: Fanta 600ml ");
	public JLabel lblMarcaRE1=new JLabel("Marca : Fanta");
	public JLabel lblPrecioRE1=new JLabel("Precio: 12");
	public JLabel lblLogoRE1 = new JLabel();
	public javax.swing.JCheckBox checRE1=new JCheckBox();
	
	
	public JLabel lblNombreRE2=new JLabel("Nombre: Pepsi Lata");
	public JLabel lblMarcaRE2=new JLabel("Marca: Pepsi");
	public JLabel lblPrecioRE2=new JLabel("Precio:6");
	public JLabel lblLogoRE2 = new JLabel();
	public JCheckBox checRE2=new JCheckBox();
	
	public JLabel lblNombreRE3=new JLabel("Nomre: Sprite");
	public JLabel lblMarcaRE3=new JLabel("Marca: Sprite");
	public JLabel lblPrecioRE3=new JLabel("Precio: 10");
	public JLabel lblLogoRE3 = new JLabel();
	public JCheckBox checRE3=new JCheckBox();
	
	public JLabel lblNombreRE4=new JLabel("Nombre: pepsi 1l");
	public JLabel lblMarcaRE4=new JLabel("Marca:Pepsi");
	public JLabel lblPrecioRE4=new JLabel("Precio:10");
	public JLabel lblLogoRE4 = new JLabel();
	public JCheckBox checRE4=new JCheckBox();
	
	public JLabel lblNombreRE5=new JLabel("Nombre: Cocacola 600ml ");
	public JLabel lblMarcaRE5=new JLabel("Marca:Cocacola");
	public JLabel lblPrecioRE5=new JLabel("Precio:6");
	public JLabel lblLogoRE5 = new JLabel();
	public JCheckBox checRE5=new JCheckBox();
	
	public JLabel lblNombreRE6=new JLabel("Nombre: Nestea");
	public JLabel lblMarcaRE6=new JLabel("Marca: CocaCola");
	public JLabel lblPrecioRE6=new JLabel("Precio:10");
	public JLabel lblLogoRE6 = new JLabel();
	public JCheckBox checRE6=new JCheckBox();
	
	public JLabel lblNombreRE7=new JLabel("Nombre: Orange Crush");
	public JLabel lblMarcaRE7=new JLabel("Marca: Peñafiel");
	public JLabel lblPrecioRE7=new JLabel("Precio: 12");
	public JLabel lblLogoRE7 = new JLabel();
	public JCheckBox checRE7=new JCheckBox();
	
	public JLabel lblNombreRE8=new JLabel("Nombre: Zup");
	public JLabel lblMarcaRE8=new JLabel("Marca:Zup");
	public JLabel lblPrecioRE8=new JLabel("Precio:12");
	public JLabel lblLogoRE8 = new JLabel();
	public JCheckBox checRE8=new JCheckBox();
	
	public JLabel lblNombreRE9=new JLabel("Nombre: Gatorade");
	public JLabel lblMarcaRE9=new JLabel("Marca: Gatorade");
	public JLabel lblPrecioRE9=new JLabel("Precio: 12");
	public JLabel lblLogoRE9 = new JLabel();
	public JCheckBox checRE9=new JCheckBox();
	
	public JLabel lblNombreRE10=new JLabel("Nombre: RedBull");
	public JLabel lblMarcaRE10=new JLabel("Marca: RedBull");
	public JLabel lblPrecioRE10=new JLabel("Precio: 6");
	public JLabel lblLogoRE10 = new JLabel();
	public JCheckBox checRE10=new JCheckBox();
/*Botones*/
	private JButton btnRegresarR = new JButton("Regresar");
	private JButton btnComprarR = new JButton("Comprar");
	private JPanel panelDulces = new JPanel();		
	private JPanel panelRefrescos = new JPanel();
	private JPanel panelChocolates = new JPanel();		
	private JPanel panelGalletas= new JPanel();
	private String seleccionados="";
	private String totalFinal="";
	private  int total=0;
	
	/**
	 * tercer paso se crea el constructor de tipo privado 
	 */
		private Detalle(){
			
			
			//JCheckBoxR0.addActionListener(e);
			panelRefrescos.setVisible(false);
			panelDulces.setVisible(false);
			
			super.setTitle("Detalle");
			super.setSize(320,520);
			super.setDefaultCloseOperation(HIDE_ON_CLOSE);
			super.setResizable(true); // no redimencionar
			super.setLocationRelativeTo(null);
			cargarControles();
			
			panelRefrescos.setBounds(0, 0, 320, 480);
			panelDulces.setBounds(0, 0, 320, 480);
			panelChocolates.setBounds(0, 0, 320, 480);
			panelGalletas.setBounds(0, 0, 320, 480);
			c.add(panelRefrescos);
			c.add(panelDulces);
			c.add(panelChocolates);
			c.add(panelGalletas);
			
			panelRefrescos.setLayout(null);
			/*Empieza Refresco*/
			lblNombreRE1.setBounds(70, 0, 141, 30);
			lblMarcaRE1.setBounds(70, 14, 109, 30);
			lblPrecioRE1.setBounds(70, 27, 115, 30);
			lblLogoRE1.setIcon(new ImageIcon("imagenes/1.jpg"));
			lblLogoRE1.setBounds(10,14,50,30);
			checRE1.setBounds(217,0,300,50);
			 
			lblNombreRE2.setBounds(70,44,131,30);
			lblMarcaRE2.setBounds(70,55,115,30);
			lblPrecioRE2.setBounds(70,68,91,30);
			lblLogoRE2.setIcon(new ImageIcon("imagenes/2.jpg"));
			lblLogoRE2.setBounds(10,55,50,30);
			checRE2.setBounds(217,44,30,50);
			
			lblNombreRE3.setBounds(70,85,91,30);
			lblMarcaRE3.setBounds(70,96,91,30);
			lblPrecioRE3.setBounds(70,109,91,30);
			lblLogoRE3.setIcon(new ImageIcon("imagenes/3.jpg"));
		    lblLogoRE3.setBounds(10,96,50,30);
		    checRE3.setBounds(217,85,30,50);
		   
			lblNombreRE4.setBounds(70,126,100,30);
			lblMarcaRE4.setBounds(70,137,91,30);
			lblPrecioRE4.setBounds(70,150,91,30);
			lblLogoRE4.setIcon(new ImageIcon("imagenes/4.jpg"));
			lblLogoRE4.setBounds(10,137,50,30);
			checRE4.setBounds(217,126,30,50);
			
			lblNombreRE5.setBounds(70,167,131,30);
			lblMarcaRE5.setBounds(70,178,91,30);
			lblPrecioRE5.setBounds(70,191,56,30);
		    lblLogoRE5.setIcon(new ImageIcon("imagenes/5.png"));
			lblLogoRE5.setBounds(10,178,50,30);
			checRE5.setBounds(217,167,30,50);
			
			lblNombreRE6.setBounds(70,208,91,30);
			lblMarcaRE6.setBounds(70,219,84,30);
			lblPrecioRE6.setBounds(70,232,100,30);
			lblLogoRE6.setIcon(new ImageIcon("imagenes/6.jpg"));
			lblLogoRE6.setBounds(10,219,50,30);
			checRE6.setBounds(217,208,30,50);
			
			lblNombreRE7.setBounds(70,249,141,30);
			lblMarcaRE7.setBounds(70,260,123,30);
			lblPrecioRE7.setBounds(70,273,109,30);
		    lblLogoRE7.setIcon(new ImageIcon("imagenes/7.jpg"));
			lblLogoRE7.setBounds(10,260,50,30);
			checRE7.setBounds(217,244,30,50);
			
			lblNombreRE8.setBounds(70,290,141,30);
			lblMarcaRE8.setBounds(70,300,141,30);
			lblPrecioRE8.setBounds(70,310,56,30);
			lblLogoRE8.setIcon(new ImageIcon("imagenes/8.jpg"));
			lblLogoRE8.setBounds(10,301,50,30);
			checRE8.setBounds(217,290,30,50);
			
			lblNombreRE9.setBounds(70,327,91,30);
			lblMarcaRE9.setBounds(70,339,100,30);
			lblPrecioRE9.setBounds(70,350,78,30);
			lblLogoRE9.setIcon(new ImageIcon("imagenes/9.jpg"));
			lblLogoRE9.setBounds(10,339,50,30);
			checRE9.setBounds(220,330,30,50);
			
			lblNombreRE10.setBounds(70,366,115,30);
			lblMarcaRE10.setBounds(70,379,91,30);
			lblPrecioRE10.setBounds(70,391,115,30);
			lblLogoRE10.setIcon(new ImageIcon("imagenes/10.jpg"));
			lblLogoRE10.setBounds(10,380,50,30);
			checRE10.setBounds(220,370,30,50);			
			
			panelRefrescos.add(lblNombreRE1);
			panelRefrescos.add(lblMarcaRE1);
			panelRefrescos.add(lblPrecioRE1);
			panelRefrescos.add(lblLogoRE1);
			panelRefrescos.add(checRE1);
			
			panelRefrescos.add(lblNombreRE2);
			panelRefrescos.add(lblMarcaRE2);
			panelRefrescos.add(lblPrecioRE2);
			panelRefrescos.add(lblLogoRE2);
			panelRefrescos.add(checRE2);
			
			panelRefrescos.add(lblNombreRE3);
			panelRefrescos.add(lblMarcaRE3);
			panelRefrescos.add(lblPrecioRE3);
			panelRefrescos.add(lblLogoRE3);
			panelRefrescos.add(checRE3);
			
			panelRefrescos.add(lblNombreRE4);
			panelRefrescos.add(lblMarcaRE4);
			panelRefrescos.add(lblPrecioRE4);
			panelRefrescos.add(lblLogoRE4);
			panelRefrescos.add(checRE4);
			
			panelRefrescos.add(lblNombreRE5);
			panelRefrescos.add(lblMarcaRE5);
			panelRefrescos.add(lblPrecioRE5);
			panelRefrescos.add(lblLogoRE5);
			panelRefrescos.add(checRE5);
			
			panelRefrescos.add(lblNombreRE6);
			panelRefrescos.add(lblMarcaRE6);
			panelRefrescos.add(lblPrecioRE6);
			panelRefrescos.add(lblLogoRE6);
			panelRefrescos.add(checRE6);
			
			panelRefrescos.add(lblNombreRE7);
			panelRefrescos.add(lblMarcaRE7);
			panelRefrescos.add(lblPrecioRE7);
			panelRefrescos.add(lblLogoRE7);
			panelRefrescos.add(checRE7);
			
			panelRefrescos.add(lblNombreRE8);
			panelRefrescos.add(lblMarcaRE8);
			panelRefrescos.add(lblPrecioRE8);
			panelRefrescos.add(lblLogoRE8);
			panelRefrescos.add(checRE8);
			
			panelRefrescos.add(lblNombreRE9);
			panelRefrescos.add(lblMarcaRE9);
			panelRefrescos.add(lblPrecioRE9);
			panelRefrescos.add(lblLogoRE9);
			panelRefrescos.add(checRE9);

			
			panelRefrescos.add(lblNombreRE10);
			panelRefrescos.add(lblMarcaRE10);
			panelRefrescos.add(lblPrecioRE10);
			panelRefrescos.add(lblLogoRE10);
			panelRefrescos.add(checRE10);
			/*Termina refresco*/
			
			/*Empieza Panel Dulces*/
			panelDulces.setLayout(null);
			
			lblNombre1.setBounds(70, 0, 115, 30);
			lblMarca1.setBounds(70, 14, 109, 30);
			lblPrecio1.setBounds(70, 27, 115, 30);
			lblLogo1.setIcon(new ImageIcon("imagenes/21.jpg"));
			lblLogo1.setBounds(10,14,50,30);
			chec1.setBounds(217,0,300,50);
			 
			lblNombre2.setBounds(70,44,109,30);
			lblMarca2.setBounds(70,55,115,30);
			lblPrecio2.setBounds(70,68,91,30);
			lblLogo2.setIcon(new ImageIcon("imagenes/22.jpg"));
			lblLogo2.setBounds(10,55,50,30);
			chec2.setBounds(217,44,30,50);
			
			lblNombre3.setBounds(70,85,91,30);
			lblMarca3.setBounds(70,96,91,30);
			lblPrecio3.setBounds(70,109,91,30);
			lblLogo3.setIcon(new ImageIcon("imagenes/23.jpg"));
		    lblLogo3.setBounds(10,96,50,30);
		    chec3.setBounds(217,85,30,50);
		   
			lblNombre4.setBounds(70,126,100,30);
			lblMarca4.setBounds(70,137,91,30);
			lblPrecio4.setBounds(70,150,91,30);
			lblLogo4.setIcon(new ImageIcon("imagenes/24.jpg"));
			lblLogo4.setBounds(10,137,50,30);
			chec4.setBounds(217,126,30,50);
			
			lblNombre5.setBounds(70,167,91,30);
			lblMarca5.setBounds(70,178,91,30);
			lblPrecio5.setBounds(70,191,56,30);
		    lblLogo5.setIcon(new ImageIcon("imagenes/25.jpg"));
			lblLogo5.setBounds(10,178,50,30);
			chec5.setBounds(217,167,30,50);
			
			lblNombre6.setBounds(70,208,91,30);
			lblMarca6.setBounds(70,219,84,30);
			lblPrecio6.setBounds(70,232,100,30);
			lblLogo6.setIcon(new ImageIcon("imagenes/26.jpg"));
			lblLogo6.setBounds(10,219,50,30);
			chec6.setBounds(217,208,30,50);
			
			lblNombre7.setBounds(70,249,115,30);
			lblMarca7.setBounds(70,260,123,30);
			lblPrecio7.setBounds(70,273,109,30);
		    lblLogo7.setIcon(new ImageIcon("imagenes/27.jpg"));
			lblLogo7.setBounds(10,260,50,30);
			chec7.setBounds(217,244,30,50);
			
			lblNombre8.setBounds(70,290,141,30);
			lblMarca8.setBounds(70,300,141,30);
			lblPrecio8.setBounds(70,310,56,30);
			lblLogo8.setIcon(new ImageIcon("imagenes/28.jpg"));
			lblLogo8.setBounds(10,301,50,30);
			chec8.setBounds(217,290,30,50);
			
			lblNombre9.setBounds(70,327,91,30);
			lblMarca9.setBounds(70,339,100,30);
			lblPrecio9.setBounds(70,350,78,30);
			lblLogo9.setIcon(new ImageIcon("imagenes/29.jpg"));
			lblLogo9.setBounds(10,339,50,30);
			chec9.setBounds(220,330,30,50);
			
			lblNombre10.setBounds(70,366,115,30);
			lblMarca10.setBounds(70,379,91,30);
			lblPrecio10.setBounds(70,391,115,30);
			lblLogo10.setIcon(new ImageIcon("imagenes/30.jpg"));
			lblLogo10.setBounds(10,380,50,30);
			chec10.setBounds(220,370,30,50);
			
			panelDulces.add(lblNombre1);
			panelDulces.add(lblMarca1);
			panelDulces.add(lblPrecio1);
			panelDulces.add(lblLogo1);
			panelDulces.add(chec1);
			
			panelDulces.add(lblNombre2);
			panelDulces.add(lblMarca2);
			panelDulces.add(lblPrecio2);
			panelDulces.add(lblLogo2);
			panelDulces.add(chec2);
			
			panelDulces.add(lblNombre3);
			panelDulces.add(lblMarca3);
			panelDulces.add(lblPrecio3);
			panelDulces.add(lblLogo3);
			panelDulces.add(chec3);
			
			panelDulces.add(lblNombre4);
			panelDulces.add(lblMarca4);
			panelDulces.add(lblPrecio4);
			panelDulces.add(lblLogo4);
			panelDulces.add(chec4);
			
			panelDulces.add(lblNombre5);
			panelDulces.add(lblMarca5);
			panelDulces.add(lblPrecio5);
			panelDulces.add(lblLogo5);
			panelDulces.add(chec5);
			
			panelDulces.add(lblNombre6);
			panelDulces.add(lblMarca6);
			panelDulces.add(lblPrecio6);
			panelDulces.add(lblLogo6);
			panelDulces.add(chec6);
			
			panelDulces.add(lblNombre7);
			panelDulces.add(lblMarca7);
			panelDulces.add(lblPrecio7);
			panelDulces.add(lblLogo7);
			panelDulces.add(chec7);
			
			panelDulces.add(lblNombre8);
			panelDulces.add(lblMarca8);
			panelDulces.add(lblPrecio8);
			panelDulces.add(lblLogo8);
			panelDulces.add(chec8);
			
			panelDulces.add(lblNombre9);
			panelDulces.add(lblMarca9);
			panelDulces.add(lblPrecio9);
			panelDulces.add(lblLogo9);
			panelDulces.add(chec9);

			panelDulces.add(lblNombre10);
			panelDulces.add(lblMarca10);
			panelDulces.add(lblPrecio10);
			panelDulces.add(lblLogo10);
			panelDulces.add(chec10);
			/*Termina panel dulces*/
			
			/*Empieza Galletas*/
			panelGalletas.setLayout(null);
			
			lblNombreGA1.setBounds(70, 0, 115, 30);
			lblMarcaGA1.setBounds(70, 14, 109, 30);
			lblPrecioGA1.setBounds(70, 27, 115, 30);
			lblLogoGA1.setIcon(new ImageIcon("imagenes/11.jpg"));
			lblLogoGA1.setBounds(10,14,50,30);
			checGA1.setBounds(217,0,300,50);
			 
			lblNombreGA2.setBounds(70,44,109,30);
			lblMarcaGA2.setBounds(70,55,115,30);
			lblPrecioGA2.setBounds(70,68,91,30);
			lblLogoGA2.setIcon(new ImageIcon("imagenes/12.jpg"));
			lblLogoGA2.setBounds(10,55,50,30);
			checGA2.setBounds(217,44,30,50);
			
			lblNombreGA3.setBounds(70,85,91,30);
			lblMarcaGA3.setBounds(70,96,91,30);
			lblPrecioGA3.setBounds(70,109,91,30);
			lblLogoGA3.setIcon(new ImageIcon("imagenes/13.jpg"));
		    lblLogoGA3.setBounds(10,96,50,30);
		    checGA3.setBounds(217,85,30,50);
		   
			lblNombreGA4.setBounds(70,126,100,30);
			lblMarcaGA4.setBounds(70,137,91,30);
			lblPrecioGA4.setBounds(70,150,91,30);
			lblLogoGA4.setIcon(new ImageIcon("imagenes/14.jpg"));
			lblLogoGA4.setBounds(10,137,50,30);
			checGA4.setBounds(217,126,30,50);
			
			lblNombreGA5.setBounds(70,167,91,30);
			lblMarcaGA5.setBounds(70,178,91,30);
			lblPrecioGA5.setBounds(70,191,56,30);
		    lblLogoGA5.setIcon(new ImageIcon("imagenes/15.jpg"));
			lblLogoGA5.setBounds(10,178,50,30);
			checGA5.setBounds(217,167,30,50);
			
			lblNombreGA6.setBounds(70,208,91,30);
			lblMarcaGA6.setBounds(70,219,84,30);
			lblPrecioGA6.setBounds(70,232,100,30);
			lblLogoGA6.setIcon(new ImageIcon("imagenes/16.jpg"));
			lblLogoGA6.setBounds(10,219,50,30);
			checGA6.setBounds(217,208,30,50);
			
			lblNombreGA7.setBounds(70,249,115,30);
			lblMarcaGA7.setBounds(70,260,123,30);
			lblPrecioGA7.setBounds(70,273,109,30);
		    lblLogoGA7.setIcon(new ImageIcon("imagenes/17.jpg"));
			lblLogoGA7.setBounds(10,260,50,30);
			checGA7.setBounds(217,244,30,50);
			
			lblNombreGA8.setBounds(70,290,141,30);
			lblMarcaGA8.setBounds(70,300,141,30);
			lblPrecioGA8.setBounds(70,310,56,30);
			lblLogoGA8.setIcon(new ImageIcon("imagenes/18.jpg"));
			lblLogoGA8.setBounds(10,301,50,30);
			checGA8.setBounds(217,290,30,50);
			
			lblNombreGA9.setBounds(70,327,91,30);
			lblMarcaGA9.setBounds(70,339,100,30);
			lblPrecioGA9.setBounds(70,350,78,30);
			lblLogoGA9.setIcon(new ImageIcon("imagenes/19.jpg"));
			lblLogoGA9.setBounds(10,339,50,30);
			checGA9.setBounds(220,330,30,50);
			
			lblNombreGA10.setBounds(70,366,115,30);
			lblMarcaGA10.setBounds(70,379,91,30);
			lblPrecioGA10.setBounds(70,391,115,30);
			lblLogoGA10.setIcon(new ImageIcon("imagenes/20.jpg"));
			lblLogoGA10.setBounds(10,380,50,30);
			checGA10.setBounds(220,370,30,50);
			
			panelGalletas.add(lblNombreGA1);
			panelGalletas.add(lblMarcaGA1);
			panelGalletas.add(lblPrecioGA1);
			panelGalletas.add(lblLogoGA1);
			panelGalletas.add(checGA1);
	
			panelGalletas.add(lblNombreGA2);
			panelGalletas.add(lblMarcaGA2);
			panelGalletas.add(lblPrecioGA2);
			panelGalletas.add(lblLogoGA2);
			panelGalletas.add(checGA2);
			
			panelGalletas.add(lblNombreGA3);
			panelGalletas.add(lblMarcaGA3);
			panelGalletas.add(lblPrecioGA3);
			panelGalletas.add(lblLogoGA3);
			panelGalletas.add(checGA3);
			
			panelGalletas.add(lblNombreGA4);
			panelGalletas.add(lblMarcaGA4);
			panelGalletas.add(lblPrecioGA4);
			panelGalletas.add(lblLogoGA4);
			panelGalletas.add(checGA4);
			
			panelGalletas.add(lblNombreGA5);
			panelGalletas.add(lblMarcaGA5);
			panelGalletas.add(lblPrecioGA5);
			panelGalletas.add(lblLogoGA5);
			panelGalletas.add(checGA5);
			
			panelGalletas.add(lblNombreGA6);
			panelGalletas.add(lblMarcaGA6);
			panelGalletas.add(lblPrecioGA6);
			panelGalletas.add(lblLogoGA6);
			panelGalletas.add(checGA6);
			
			panelGalletas.add(lblNombreGA7);
			panelGalletas.add(lblMarcaGA7);
			panelGalletas.add(lblPrecioGA7);
			panelGalletas.add(lblLogoGA7);
			panelGalletas.add(checGA7);
			
			panelGalletas.add(lblNombreGA8);
			panelGalletas.add(lblMarcaGA8);
			panelGalletas.add(lblPrecioGA8);
			panelGalletas.add(lblLogoGA8);
			panelGalletas.add(checGA8);
			
			panelGalletas.add(lblNombreGA9);
			panelGalletas.add(lblMarcaGA9);
			panelGalletas.add(lblPrecioGA9);
			panelGalletas.add(lblLogoGA9);
			panelGalletas.add(checGA9);

			
			panelGalletas.add(lblNombreGA10);
			panelGalletas.add(lblMarcaGA10);
			panelGalletas.add(lblPrecioGA10);
			panelGalletas.add(lblLogoGA10);
			panelGalletas.add(checGA10);
			
			
			/*Termina Panel galletas*/
			
			
			/*Empieza panel Chocolate*/
			panelChocolates.setLayout(null);
			lblNombreCHO1.setBounds(70, 0, 115, 30);
			lblMarcaCHO1.setBounds(70, 14, 109, 30);
			lblPrecioCHO1.setBounds(70, 27, 115, 30);
			lblLogoCHO1.setIcon(new ImageIcon("imagenes/31.jpg"));
			lblLogoCHO1.setBounds(10,14,50,30);
			checCHO1.setBounds(217,0,300,50);
			 
			lblNombreCHO2.setBounds(70,44,109,30);
			lblMarcaCHO2.setBounds(70,55,115,30);
			lblPrecioCHO2.setBounds(70,68,91,30);
			lblLogoCHO2.setIcon(new ImageIcon("imagenes/32.jpg"));
			lblLogoCHO2.setBounds(10,55,50,30);
			checCHO2.setBounds(217,44,30,50);
			
			lblNombreCHO3.setBounds(70,85,91,30);
			lblMarcaCHO3.setBounds(70,96,91,30);
			lblPrecioCHO3.setBounds(70,109,91,30);
			lblLogoCHO3.setIcon(new ImageIcon("imagenes/33.jpg"));
		    lblLogoCHO3.setBounds(10,96,50,30);
		    checCHO3.setBounds(217,85,30,50);
		   
			lblNombreCHO4.setBounds(70,126,100,30);
			lblMarcaCHO4.setBounds(70,137,91,30);
			lblPrecioCHO4.setBounds(70,150,91,30);
			lblLogoCHO4.setIcon(new ImageIcon("imagenes/33.jpg"));
			lblLogoCHO4.setBounds(10,137,50,30);
			checCHO4.setBounds(217,126,30,50);
			
			lblNombreCHO5.setBounds(70,167,91,30);
			lblMarcaCHO5.setBounds(70,178,91,30);
			lblPrecioCHO5.setBounds(70,191,56,30);
		    lblLogoCHO5.setIcon(new ImageIcon("imagenes/34.jpg"));
			lblLogoCHO5.setBounds(10,178,50,30);
			checCHO5.setBounds(217,167,30,50);
			
			lblNombreCHO6.setBounds(70,208,91,30);
			lblMarcaCHO6.setBounds(70,219,84,30);
			lblPrecioCHO6.setBounds(70,232,100,30);
			lblLogoCHO6.setIcon(new ImageIcon("imagenes/35.jpg"));
			lblLogoCHO6.setBounds(10,219,50,30);
			checCHO6.setBounds(217,208,30,50);
			
			lblNombreCHO7.setBounds(70,249,115,30);
			lblMarcaCHO7.setBounds(70,260,123,30);
			lblPrecioCHO7.setBounds(70,273,109,30);
		    lblLogoCHO7.setIcon(new ImageIcon("imagenes/36.jpg"));
			lblLogoCHO7.setBounds(10,260,50,30);
			checCHO7.setBounds(217,244,30,50);
			
			lblNombreCHO8.setBounds(70,290,141,30);
			lblMarcaCHO8.setBounds(70,300,141,30);
			lblPrecioCHO8.setBounds(70,310,56,30);
			lblLogoCHO8.setIcon(new ImageIcon("imagenes/37.jpg"));
			lblLogoCHO8.setBounds(10,301,50,30);
			checCHO8.setBounds(217,290,30,50);
			
			lblNombreCHO9.setBounds(70,327,91,30);
			lblMarcaCHO9.setBounds(70,339,100,30);
			lblPrecioCHO9.setBounds(70,350,78,30);
			lblLogoCHO9.setIcon(new ImageIcon("imagenes/38.jpg"));
			lblLogoCHO9.setBounds(10,339,50,30);
			checCHO9.setBounds(220,330,30,50);
			
			lblNombreCHO10.setBounds(70,366,115,30);
			lblMarcaCHO10.setBounds(70,379,91,30);
			lblPrecioCHO10.setBounds(70,391,115,30);
			lblLogoCHO10.setIcon(new ImageIcon("imagenes/39.jpg"));
			lblLogoCHO10.setBounds(10,380,50,30);
			checCHO10.setBounds(220,370,30,50);
			
			panelChocolates.add(lblNombreCHO1);
			panelChocolates.add(lblMarcaCHO1);
			panelChocolates.add(lblPrecioCHO1);
			panelChocolates.add(lblLogoCHO1);
			panelChocolates.add(checCHO1);
	
			panelChocolates.add(lblNombreCHO2);
			panelChocolates.add(lblMarcaCHO2);
			panelChocolates.add(lblPrecioCHO2);
			panelChocolates.add(lblLogoCHO2);
			panelChocolates.add(checCHO2);
			
			panelChocolates.add(lblNombreCHO3);
			panelChocolates.add(lblMarcaCHO3);
			panelChocolates.add(lblPrecioCHO3);
			panelChocolates.add(lblLogoCHO3);
			panelChocolates.add(checCHO3);
			
			panelChocolates.add(lblNombreCHO4);
			panelChocolates.add(lblMarcaCHO4);
			panelChocolates.add(lblPrecioCHO4);
			panelChocolates.add(lblLogoCHO4);
			panelChocolates.add(checCHO4);
			
			panelChocolates.add(lblNombreCHO5);
			panelChocolates.add(lblMarcaCHO5);
			panelChocolates.add(lblPrecioCHO5);
			panelChocolates.add(lblLogoCHO5);
			panelChocolates.add(checCHO5);
			
			panelChocolates.add(lblNombreCHO6);
			panelChocolates.add(lblMarcaCHO6);
			panelChocolates.add(lblPrecioCHO6);
			panelChocolates.add(lblLogoCHO6);
			panelChocolates.add(checCHO6);
			
			panelChocolates.add(lblNombreCHO7);
			panelChocolates.add(lblMarcaCHO7);
			panelChocolates.add(lblPrecioCHO7);
			panelChocolates.add(lblLogoCHO7);
			panelChocolates.add(checCHO7);
			
			panelChocolates.add(lblNombreCHO8);
			panelChocolates.add(lblMarcaCHO8);
			panelChocolates.add(lblPrecioCHO8);
			panelChocolates.add(lblLogoCHO8);
			panelChocolates.add(checCHO8);
			
			panelChocolates.add(lblNombreCHO9);
			panelChocolates.add(lblMarcaCHO9);
			panelChocolates.add(lblPrecioCHO9);
			panelChocolates.add(lblLogoCHO9);
			panelChocolates.add(checCHO9);

			
			panelChocolates.add(lblNombreCHO10);
			panelChocolates.add(lblMarcaCHO10);
			panelChocolates.add(lblPrecioCHO10);
			panelChocolates.add(lblLogoCHO10);
			panelChocolates.add(checCHO10);
			
			
			btnRegresarR.setBounds(50, 455, 89, 23);
			c.add(btnRegresarR);
			
			
			btnComprarR.setBounds(160, 455, 89, 23);
			c.add(btnComprarR);
			
			
		}
		
		public static Detalle getObjeto(){
			return s;
		}

		private void cargarControles() {
			c.setLayout(null);
		//JOptionPane.showMessageDialog(null, "si entro");	
		}
		
		/**
		 * 
		 * @param e agrega el evento  ActionListener al boton dulces
		 */
		public void onClickRegresarR(ActionListener e){
			btnRegresarR.addActionListener(e);
			
		}
		
		/**
		 * 
		 * @param e agrega el evento  ActionListener al boton dulces
		 */
		public void onClickComprarR(ActionListener e){
			btnComprarR.addActionListener(e);
			
		}
		/**
		 * 
		 * @return se agrega el boton a un evento en especifico
		 */
		public JButton getbtnRegresarR() {
			return btnRegresarR;
		}
		/**
		 * 
		 * @return se agrega el boton a un evento en especifico
		 */
		public JButton getbtnComprarR() {
			return btnComprarR;
			
		}
		public JPanel getPanelR() {
			return panelRefrescos;
		}
		public JPanel getPanelD() {
			return panelDulces;
		}
		public JPanel getPanelG() {
			return panelGalletas;
		}
		public JPanel getPanelC() {
			return panelChocolates;
		}
		
		
		public String SeleccionadosCket(){
			total=0;
			seleccionados="";
			/*refresco*/
				if(checRE1.isSelected()){
					total=total+12;
					seleccionados=seleccionados+"Fanta 600 ml $12"+"\n";
				} if(checRE2.isSelected()){
					total=total+6;
					seleccionados=seleccionados+"Pepsi $6"+"\n";
				} if(checRE3.isSelected()){
					total=total+10;
					seleccionados=seleccionados+"Sprite $10"+"\n";
				} if(checRE4.isSelected()){
					total=total+10;
					seleccionados=seleccionados+"Pepsi $10"+"\n";
				} if(checRE5.isSelected()){
					total=total+6;
					seleccionados=seleccionados+"Cocacola  $6"+"\n";
				} if(checRE6.isSelected()){
					total=total+10;
					seleccionados=seleccionados+"Nestea $10"+"\n";
				} if(checRE7.isSelected()){
					total=total+12;
					seleccionados=seleccionados+"Orange crush $12"+"\n";
				} if(checRE8.isSelected()){
					total=total+12;
					seleccionados=seleccionados+"Zup $12"+"\n";
				} if(checRE9.isSelected()){
					total=total+12;
					seleccionados=seleccionados+"Gatorade $12"+"\n";
				} if(checRE10.isSelected()){
					total=total+6;
					seleccionados=seleccionados+"RedBull $6"+"\n";
				}
				/*Dulces*/
				
				 if(chec1.isSelected()){
					total=total+5;
					seleccionados=seleccionados+"Bubbaloo $5"+"\n";
				} if(chec2.isSelected()){
					total=total+5;
					seleccionados=seleccionados+"Chiclets menta $5"+"\n";
				} if(chec3.isSelected()){
					total=total+3;
					seleccionados=seleccionados+"Trident $3"+"\n";
				} if(chec4.isSelected()){
					total=total+2;
					seleccionados=seleccionados+"Risandias $2"+"\n";
				} if(chec5.isSelected()){
					total=total+3;
					seleccionados=seleccionados+"Mango $3"+"\n";
				} if(chec6.isSelected()){
					total=total+5;
					seleccionados=seleccionados+"Manita $5"+"\n";
				} if(chec7.isSelected()){
					total=total+5;
					seleccionados=seleccionados+"Rebanaditas $5"+"\n";
				} if(chec8.isSelected()){
					total=total+6;
					seleccionados=seleccionados+"Mini Pelon Pelo Rico $6"+"\n";
				} if(chec9.isSelected()){
					total=total+8;
					seleccionados=seleccionados+"Combo $8"+"\n";
				} if(chec10.isSelected()){
					total=total+4;
					seleccionados=seleccionados+"Rellerindos $4"+"\n";
				}
				/*Galletas*/
				 if(checGA1.isSelected()){
					total=total+10;
					seleccionados=seleccionados+"Chokis $10"+"\n";
				} if(checGA2.isSelected()){
					total=total+15;
					seleccionados=seleccionados+"Oreo $15"+"\n";
				} if(checGA3.isSelected()){
					total=total+15;
					seleccionados=seleccionados+"Crackets $15"+"\n";
				} if(checGA4.isSelected()){
					total=total+10;
					seleccionados=seleccionados+"Maria $10"+"\n";
				} if(checGA5.isSelected()){
					total=total+10;
					seleccionados=seleccionados+"Cremax $10"+"\n";
				} if(checGA6.isSelected()){
					total=total+12;
					seleccionados=seleccionados+"Arcoiris $12"+"\n";
				} if(checGA7.isSelected()){
					total=total+15;
					seleccionados=seleccionados+"Fruts $15"+"\n";
				} if(checGA8.isSelected()){
					total=total+10;
					seleccionados=seleccionados+"Oro $10"+"\n";
				} if(checGA9.isSelected()){
					total=total+15;
					seleccionados=seleccionados+"Soda $15"+"\n";
				} if(checGA10.isSelected()){
					total=total+15;
					seleccionados=seleccionados+"Porteñitas $15"+"\n";
				}
				
				/*Chocolates*/
				 if(checCHO1.isSelected()){
					total=total+40;
					seleccionados=seleccionados+"Chocolates $40"+"\n";
				}else if(checCHO2.isSelected()){
					total=total+50;
					seleccionados=seleccionados+"Chocolates Corazon $50"+"\n";
				}else if(checCHO3.isSelected()){
					total=total+60;
					seleccionados=seleccionados+"Chocolate Kisses $60"+"\n";
				} if(checCHO4.isSelected()){
					total=total+60;
					seleccionados=seleccionados+"Chocolate bolas $60"+"\n";
				} if(checCHO5.isSelected()){
					total=total+90;
					seleccionados=seleccionados+"Chocolate Kisses $90"+"\n";
				} if(checCHO6.isSelected()){
					total=total+15;
					seleccionados=seleccionados+"Chocolate Barra $15"+"\n";
				} if(checCHO7.isSelected()){
					total=total+10;
					seleccionados=seleccionados+"Kinder Delice $10"+"\n";
				} if(checCHO8.isSelected()){
					total=total+15;
					seleccionados=seleccionados+"Kinder Sorpresa $10"+"\n";
				} if(checCHO9.isSelected()){
					total=total+8;
					seleccionados=seleccionados+"Stick $8"+"\n";
				} if(checCHO10.isSelected()){
					total=total+15;
					seleccionados=seleccionados+"Cookies´n Creme $15"+"\n";
				}
				return seleccionados;
			}
		
		
		public String ChekSeleccionados() {
			return seleccionados;	
		}
		
		public int TotalNombres() {
			return total;	
		}
}