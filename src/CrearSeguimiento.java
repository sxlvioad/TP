import javax.swing.*;
import java.awt.Font;

public class CrearSeguimiento extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public CrearSeguimiento(JFrame marco){
		setLayout(null);
		

		
		JLabel lblNuevoSeguimiento = new JLabel("Nuevo Seguimiento");
		lblNuevoSeguimiento.setFont(new Font("Calibri", Font.PLAIN, 22));
		lblNuevoSeguimiento.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevoSeguimiento.setBounds(145, 11, 201, 27);
		add(lblNuevoSeguimiento);
		
		JLabel lblTema = new JLabel("Tema");
		lblTema.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblTema.setBounds(22, 53, 46, 14);
		add(lblTema);
		
		
		// Operador
		
		JLabel lblOperador = new JLabel("Operador");
		lblOperador.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblOperador.setBounds(258, 53, 67, 14);
		add(lblOperador);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(335, 49, 130, 22);
		add(comboBox);
		
		
		//Cantidad de minutos
		
		JLabel lblCantidadDeMinutos = new JLabel("Cantidad de minutos");
		lblCantidadDeMinutos.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblCantidadDeMinutos.setBounds(22, 87, 166, 14);
		add(lblCantidadDeMinutos);
		
		//De televisión
		JLabel lblDeTelevision = new JLabel("De television");
		lblDeTelevision.setFont(new Font("Calibri", Font.PLAIN, 13));
		lblDeTelevision.setBounds(42, 118, 76, 14);
		add(lblDeTelevision);
		
		textField_3 = new JTextField();
		textField_3.setBounds(147, 115, 86, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		//Horario central
		JLabel lblEnHorarioCentral = new JLabel("En horario central");
		lblEnHorarioCentral.setFont(new Font("Calibri", Font.PLAIN, 13));
		lblEnHorarioCentral.setBounds(268, 117, 113, 14);
		add(lblEnHorarioCentral);
		
		textField_2 = new JTextField();
		textField_2.setBounds(378, 114, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		
		//Cantidad de
		
		JLabel lblCantidad = new JLabel("Cantidad de:");
		lblCantidad.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblCantidad.setBounds(22, 143, 85, 22);
		add(lblCantidad);
		
		//Notas en diarios
		JLabel lblNotasEnDiarios = new JLabel("Notas en diarios");
		lblNotasEnDiarios.setHorizontalAlignment(SwingConstants.LEFT);
		lblNotasEnDiarios.setFont(new Font("Calibri", Font.PLAIN, 13));
		lblNotasEnDiarios.setBounds(42, 176, 99, 14);
		add(lblNotasEnDiarios);
		
		textField = new JTextField();
		textField.setBounds(147, 173, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		//Tapas en diarios
		JLabel lblTapasDeDiarios = new JLabel("Tapas de diarios");
		lblTapasDeDiarios.setFont(new Font("Calibri", Font.PLAIN, 13));
		lblTapasDeDiarios.setBounds(268, 176, 100, 14);
		add(lblTapasDeDiarios);
		
		textField_1 = new JTextField();
		textField_1.setBounds(378, 173, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);

		
		//Apreciación
		
		JLabel lblApreciacin = new JLabel("Apreciaci\u00F3n");
		lblApreciacin.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblApreciacin.setBounds(22, 215, 76, 14);
		add(lblApreciacin);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(122, 211, 343, 111);
		add(textArea);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(78, 49, 130, 22);
		add(comboBox_1);
	}
}
