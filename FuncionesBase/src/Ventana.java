import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField txtNF;
	private JTable table;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 314);
		
		JMenuBar menu1 = new JMenuBar();
		setJMenuBar(menu1);
		
		JMenuItem mntmDatos = new JMenuItem("DATOS DE LA TABLA");
		mntmDatos.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menu1.add(mntmDatos);
		
		JMenuItem mntmExporta = new JMenuItem("EXPORTACI\u00D3N EN MYSQL");
		mntmExporta.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmExporta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventana2 ops = new Ventana2();
				ops.setVisible(true);
			}
		});
		menu1.add(mntmExporta);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDatos = new JLabel("DATOS DE LA TABLA");
		lblDatos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDatos.setBounds(244, 0, 209, 20);
		contentPane.add(lblDatos);
		
		txtNF = new JTextField();
		txtNF.setBounds(143, 180, 86, 20);
		contentPane.add(txtNF);
		txtNF.setColumns(10);
		
		JLabel lblFilas = new JLabel("Fila (s)");
		lblFilas.setBounds(247, 182, 65, 17);
		contentPane.add(lblFilas);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(22, 179, 89, 23);
		contentPane.add(btnAgregar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 32, 525, 123);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Orden", "Titulo dato", "Tipo de dato", "Ejemplos"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(102);
		table.getColumnModel().getColumn(2).setPreferredWidth(95);
		scrollPane.setViewportView(table);
		
		JButton btnEliminarFilas = new JButton("Eliminar Fila");
		btnEliminarFilas.setBounds(353, 166, 159, 23);
		contentPane.add(btnEliminarFilas);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(353, 200, 89, 23);
		contentPane.add(btnLimpiar);
 
	}
}
