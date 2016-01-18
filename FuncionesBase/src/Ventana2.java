import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;

public class Ventana2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Ventana2() {
		setBounds(100, 100, 451, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblExportacinMysql = new JLabel("EXPORTACI\u00D3N MYSQL");
		lblExportacinMysql.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblExportacinMysql.setBounds(147, 3, 215, 39);
		contentPane.add(lblExportacinMysql);
		
		JLabel lblNombreDeLa = new JLabel("Nombre de la base:");
		lblNombreDeLa.setBounds(25, 49, 130, 29);
		contentPane.add(lblNombreDeLa);
		
		JLabel lblNombreDeLa_1 = new JLabel("Nombre de la tabla:");
		lblNombreDeLa_1.setBounds(24, 89, 131, 29);
		contentPane.add(lblNombreDeLa_1);
		
		JLabel lblOpciones = new JLabel("Opciones:");
		lblOpciones.setBounds(25, 129, 106, 22);
		contentPane.add(lblOpciones);
		
		JLabel lblTipoDeSentencia = new JLabel("Tipo de Sentencia");
		lblTipoDeSentencia.setBounds(25, 207, 106, 26);
		contentPane.add(lblTipoDeSentencia);
		
		JLabel lblClavePrimaria = new JLabel("Clave primaria");
		lblClavePrimaria.setBounds(25, 254, 106, 22);
		contentPane.add(lblClavePrimaria);
		
		JLabel lblGenerar = new JLabel("Generar");
		lblGenerar.setBounds(25, 310, 106, 14);
		contentPane.add(lblGenerar);
		
		textField = new JTextField();
		textField.setBounds(113, 307, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblFilas = new JLabel("Filas");
		lblFilas.setBounds(235, 310, 65, 14);
		contentPane.add(lblFilas);
		
		textField_1 = new JTextField();
		textField_1.setBounds(140, 53, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(141, 93, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Incluir Sentencia CREATE TABLE.");
		chckbxNewCheckBox.setBounds(102, 129, 320, 29);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxIncluirSentenciaDrop = new JCheckBox("Incluir Sentencia DROP TABLE");
		chckbxIncluirSentenciaDrop.setBounds(102, 158, 198, 23);
		contentPane.add(chckbxIncluirSentenciaDrop);
		
		JCheckBox chckbxEntrecomillarNombretablasColumnas = new JCheckBox("Entrecomillar nombre(tablas, columnas)");
		chckbxEntrecomillarNombretablasColumnas.setBounds(102, 182, 260, 23);
		contentPane.add(chckbxEntrecomillarNombretablasColumnas);
		
		JCheckBox chckbxInsert = new JCheckBox("Insert");
		chckbxInsert.setBounds(25, 228, 97, 23);
		contentPane.add(chckbxInsert);
		
		JCheckBox chckbxInsertIgnore = new JCheckBox("Insert ignore");
		chckbxInsertIgnore.setBounds(118, 228, 122, 23);
		contentPane.add(chckbxInsertIgnore);
		
		JCheckBox chckbxUpdate = new JCheckBox("Update");
		chckbxUpdate.setBounds(265, 228, 97, 23);
		contentPane.add(chckbxUpdate);
		
		JRadioButton rdbtnNinguno = new JRadioButton("Ninguno");
		rdbtnNinguno.setBounds(22, 280, 109, 23);
		contentPane.add(rdbtnNinguno);
		
		JRadioButton rdbtnAadirAutoIncrement = new JRadioButton("A\u00F1adir Auto Increment por defecto");
		rdbtnAadirAutoIncrement.setBounds(166, 280, 256, 23);
		contentPane.add(rdbtnAadirAutoIncrement);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.setBounds(265, 340, 89, 23);
		contentPane.add(btnGenerar);
	}
}
