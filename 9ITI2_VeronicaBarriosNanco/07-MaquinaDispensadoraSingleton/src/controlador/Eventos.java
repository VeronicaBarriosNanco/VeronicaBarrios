package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JOptionPane;

import vista.*;
import app.*;
import modelo.Operaciones;
/**
 * 
 * @author Barrios Nanco Nancy
 *
 */

public class Eventos implements ActionListener {
	
	/**
	 * se mandan a llamar las clases
	 */
	private Operaciones modelo=new  Operaciones();
	private Cambio cambio=new  Cambio();
	private Comprar comprar=new  Comprar();
	/**
	 * Se recupera el objeto de la clase detalle 
	 */
	private Detalle detalle = Detalle.getObjeto();
	private Opciones opciones=new  Opciones();
	
/**
 * 
 * @param modelo son las clases de la clase operaciones
 * @param cambio son las clases de la clase Cambio
 * @param comprar son las clases de la clase Comprar
 * @param detalle son las clases de la clase Detalle
 * @param opciones son las clases de la clase Opciones
 */

	public Eventos( Operaciones modelo,Cambio cambio,
			Comprar comprar, Detalle detalle, Opciones opciones) {
		
		super();
		
		/**
		 * se mandan a llamar las clases
		 */
		this.modelo = modelo;
		this.comprar = comprar;
		//this.detalle = detalle;
		this.opciones = opciones;
		
		/**
		 * se mandan a llamar los botones de la clase de opciones
		 */
		opciones.onClickChocolates(this);
		opciones.onClickDulces(this);
		opciones.onClickGalletas(this);
		opciones.onClickRefrescos(this );
		
		/**
		 * se mandan a llamar los botones de la clse Detalle
		 */
		detalle.onClickComprarR(this);
		detalle.onClickRegresarR(this);
		
		/**
		 * se manda a llamar el boton de la clase Comprar
		 */
		comprar.onClickPagar(this);
		
	}



	@Override
	
	public void actionPerformed(ActionEvent e) {
		
		/**
		 *condicion para la clase de Detalle Dulces
		 */
		try {						
			if(e.getSource()==opciones.getBtnDulces()){
			
				detalle.getPanelD().setVisible(true);
				detalle.setVisible(true);
				detalle.getPanelC().setVisible(false);
				detalle.getPanelR().setVisible(false);
				detalle.getPanelG().setVisible(false);
				opciones.dispose();
			}
			/**
			 *Condicion para la compra de cocolates
			 */
			else if(e.getSource()==opciones.getBtnchocolates()){	
			
				detalle.getPanelC().setVisible(true);
				detalle.setVisible(true);
				detalle.getPanelD().setVisible(false);
				detalle.getPanelR().setVisible(false);
				detalle.getPanelG().setVisible(false);

				opciones.dispose();
			}
			/**
			 *condicion para la compra de galletas
			 */
			else if(e.getSource()==opciones.getBtGalletas()){	
				detalle.getPanelG().setVisible(true);
				detalle.setVisible(true);
				detalle.getPanelD().setVisible(false);
				detalle.getPanelR().setVisible(false);
				detalle.getPanelC().setVisible(false);
				opciones.dispose();
			}
			/**
			 * condicion para la compra de Refrescos
			 */
			else if(e.getSource()==opciones.getBtnRefrescos()){	
				
				detalle.getPanelR().setVisible(true);
				detalle.setVisible(true);
				detalle.getPanelD().setVisible(false);
				detalle.getPanelC().setVisible(false);
				detalle.getPanelG().setVisible(false);
				opciones.dispose();
				/**
				 * condicion para los botones de Regresar
				 */
			}else if(e.getSource()==detalle.getbtnRegresarR()){
				/**
				 * se visualizara la clase de opciones
				 */
				opciones.setVisible(true); 
				detalle.setVisible(false);
				/**
				 * Condicion para la compra los productos
				 */
			}else if(e.getSource()==detalle.getbtnComprarR()){
				detalle.SeleccionadosCket();
				comprar.setLbResultado(String.format("%s",detalle.ChekSeleccionados()));
				comprar.setLbcantidad(String.format("%s",String.valueOf(detalle.TotalNombres())));
				int dato=detalle.TotalNombres();
				
				if(dato<99){
					comprar.setVisible(true);
				}else{
					JOptionPane.showMessageDialog(null, "Solo puedes hacer una compra de $100 pesos");
				}
				/**	
				 * condicion para el boton de Pagar
				 */
			}else if(e.getSource()==comprar.getBtnPagar()){
				int n1 = Integer.parseInt(comprar.getN1());
				modelo.cambio(n1);
				cambio.setLbResultado(String.format("%s",modelo.getResultado()));
				cambio.setVisible(true);
				comprar.setVisible(false);
				
			}
			
			
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, ""+e2);
			
		}
	}

}
