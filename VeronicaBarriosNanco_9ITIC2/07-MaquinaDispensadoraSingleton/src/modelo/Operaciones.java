package modelo;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import vista.*;
import controlador.Eventos;
/**
 * 
 * @author Barrios Nanco Nancy 
 *
 */
public class Operaciones {// nombre de la clase
	public String[] datos = new String[40];
	private double n1 = 0; //declaras la variable n1 tipo double
	private double n2 = 0;// declaras la variable n2 de tipo double
	private String seleccionados="";
	private int resultadod = 0;//declaras la variable resultd de tipo int
	
	private String resultado = "";
	/**
	 * constructor por defecto
	 */
	public Operaciones() {
		
	}
	/**
	 * 
	 * @param n1 variable en formato double del paramtero 1 para realizar las difrentes operaciones 
	 * @param n2 variable en formato double del paramtero 2 para realizar las difrentes operaciones 
	 * @param resultadod variable en formato double del resultado de las difrentes operaciones 
	 */
	public Operaciones(Double n1, Double n2, int resultadod) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		
		this.resultadod = resultadod;
	}
		/**
		 * 
		 * @return retorna el resultado cunando la clase controlador lo necesita
		 */
    public int getResultadod() {
		return resultadod;	
	}
    /**
     * 
     * @return se retorna el resultado
     */
    
    public String getResultado() {
		return resultado;	
	}
    /**
     * 
     * @return se retorna la variable seleccionados
     */
    
    public String ChekSeleccionados() {
		return seleccionados;	
	}
    
   
	public String Insertardatos(String dato){
		resultado="";
		if(dato.equals("dulces")){	
			
			for(int a=0;a<=9;a++){
			resultado=resultado+datos[a]+",";	
			}
			
		}else if(dato.equals("galletas")){
			
			for(int a=20;a<=29;a++){
				resultado=resultado+datos[a]+",";	
				}
				
			//JOptionPane.showMessageDialog(null, "galletas");
		}else if(dato.equals("chocolates")){
			
			for(int a=10;a<=19;a++){
				resultado=resultado+datos[a]+",";	
				}
			
			//JOptionPane.showMessageDialog(null, "chocolates");
		}else if(dato.equals("refrescos")){
			
			for(int a=30;a<=39;a++){
				resultado=resultado+datos[a]+",";	
				}
			//JOptionPane.showMessageDialog(null, "refrescos");
		}
		
		return resultado;
	}
	
	
	
	public String cambio(int s){
	  resultado="";
		int cincuelta=0;
		int veinte=0;
		int diez=0;
		int cinco=0;
		int peso=0;
		int dato1=100-s;
		if(dato1>=50){
			dato1=dato1-50;
			cincuelta=cincuelta+1;
		}
		
		if(dato1>=20){
			dato1=dato1-20;
			veinte=veinte+1;
		}
		
		if(dato1>=20){
			dato1=dato1-20;
			veinte=veinte+1;
		}
		if(dato1>=10){
			dato1=dato1-10;
			diez=diez+1;
	
		}
		if(dato1>=5){
			dato1=dato1-5;
			cinco=cinco+1;
	
		}
		if(dato1>=5){
			dato1=dato1-5;
			cinco=cinco+1;
	
		}
		if(dato1>=1){
			dato1=dato1-1;
			peso=peso+1;
	
		}
		if(dato1>=1){
			dato1=dato1-1;
			peso=peso+1;
	
		}
		if(dato1>=1){
			dato1=dato1-1;
			peso=peso+1;
	
		}
		if(dato1>=1){
			dato1=dato1-1;
			peso=peso+1;
	
		}if(dato1>=1){
			dato1=dato1-1;
			peso=peso+1;
	
		}
		resultado="CIEN..........0\nCINCUIENTA....."+cincuelta+"\nVEINTE........"+veinte+"\nDIEZ.........."+diez+"\nCINCO........."+cinco+"\nPESO.........."+peso;	
		return resultado;
	}
 
	
    
}
