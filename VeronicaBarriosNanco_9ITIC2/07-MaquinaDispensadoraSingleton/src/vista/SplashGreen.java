package vista;
import java.awt.*;
import controlador.*;
import modelo.*;
import java.util.List;
import javax.swing.*;
import java.net.*;

public class SplashGreen {

    private JDialog dialog;
    private JFrame frame;
    private JProgressBar progress;

    public void initUI() throws MalformedURLException {
        showSplashScreen();
        SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {

            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i < 50; i++) {
                    Thread.sleep(50);// Simulate loading
                    publish(i);// Notify progress
                }
                return null;
            }

            @Override
            protected void process(List<Integer> chunks) {
                progress.setValue(chunks.get(chunks.size() - 1));
            }

            @Override
            protected void done() {
            	Operaciones modelo=new  Operaciones();
            	Cambio cambio=new  Cambio();
            	Comprar comprar=new  Comprar();
            	/**
            	 * se recupera el objeto de la clse detalle 
            	 */
            	 Detalle detalle = Detalle.getObjeto();
            	//Detalle detalle=new  Detalle();
            	Opciones opciones=new  Opciones();
            	Eventos controlador=new Eventos(modelo,cambio, comprar,detalle,opciones);
                opciones.setVisible(true);
                hideSplashScreen();
            }

        };
        worker.execute();
    }

    protected void hideSplashScreen() {
        dialog.setVisible(false);
        dialog.dispose();
    }

    protected void showSplashScreen() throws MalformedURLException {
        dialog = new JDialog((Frame) null);
        dialog.setModal(false);
        dialog.setUndecorated(true);
        JLabel background = new JLabel(new ImageIcon("imagenes/gato.gif"));
        background.setLayout(new BorderLayout());
        dialog.add(background);
        JLabel text = new JLabel("Bienvenidos");
        text.setForeground(Color.WHITE);
        text.setBorder(BorderFactory.createEmptyBorder(100, 50, 100, 50));
        background.add(text);
        progress = new JProgressBar();
        background.add(progress, BorderLayout.SOUTH);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

}
