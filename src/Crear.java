import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.awt.Font;

public class Crear extends JPanel{
	private JTextField textField;
	
	public Crear(JFrame marco){
		setLayout(null);

		JLabel lblCrear = new JLabel("Nuevo Tema");
		lblCrear.setFont(new Font("Calibri", Font.PLAIN, 22));
		lblCrear.setBounds(178, 11, 166, 21);
		add(lblCrear);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblCodigo.setBounds(288, 46, 56, 21);
		add(lblCodigo);
		
		JLabel lblPlabaraClave = new JLabel("Plabara Clave");
		lblPlabaraClave.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblPlabaraClave.setBounds(26, 46, 93, 21);
		add(lblPlabaraClave);
		
		textField = new JTextField();
		textField.setBounds(129, 46, 109, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblSeguimiento = new JLabel("Seguimiento");
		lblSeguimiento.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblSeguimiento.setBounds(26, 78, 93, 21);
		add(lblSeguimiento);
		
		JLabel lblDesde = new JLabel("Desde");
		lblDesde.setFont(new Font("Calibri", Font.PLAIN, 13));
		lblDesde.setBounds(73, 110, 46, 21);
		add(lblDesde);
		
		JDateChooser fechaInicio = new JDateChooser();
		fechaInicio.setBounds(335,110,130,21);
		add(fechaInicio);
		
		JLabel lblHasta = new JLabel("Hasta");
		lblHasta.setFont(new Font("Calibri", Font.PLAIN, 13));
		lblHasta.setBounds(288, 110, 46, 21);
		add(lblHasta);
		
		JDateChooser fechaFin = new JDateChooser();
		fechaFin.setBounds(111,110,124,21);
		add(fechaFin);
		
		JLabel lblDescipcin = new JLabel("Descipci\u00F3n");
		lblDescipcin.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblDescipcin.setBounds(26, 142, 86, 21);
		add(lblDescipcin);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(26, 162, 438, 111);
		
		JScrollPane scrollpane= new JScrollPane(textArea);
		scrollpane.setBounds(26, 162, 438, 111);
		add(scrollpane);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(273, 286, 91, 23);
		add(btnCancelar);
		btnCancelar.addActionListener(event->{
			marco.setContentPane(new Menu(marco));
			marco.validate();
		});
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(374, 286, 91, 23);
		add(btnAceptar);
		// ¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿

	}
}
