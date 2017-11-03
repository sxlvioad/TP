import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")

public class Crear extends JPanel {
	private JTextField textField;

	public Crear(JFrame marco) {

		setLayout(null);

		// Barra

		JPanel barra = new JPanel();
		barra.setLocation(0, 0);
		barra.setSize(749, 85);
		barra.setLayout(null);
		barra.setBackground(new Color(85, 205, 115));
		add(barra);

		setLayout(null);

		JLabel lblCrear = new JLabel("Nuevo Tema");
		lblCrear.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrear.setBounds(301, 42, 166, 21);
		lblCrear.setFont(new Font("Calibri", Font.PLAIN, 22));
		barra.add(lblCrear);

		// Panel

		JPanel panel = new JPanel();
		panel.setBounds(0, 83, 750, 428);
		add(panel);

		panel.setLayout(null);

		JLabel lblPlabaraClave = new JLabel("Plabara Clave");
		lblPlabaraClave.setBounds(39, 25, 104, 20);
		lblPlabaraClave.setFont(new Font("Calibri", Font.PLAIN, 18));
		panel.add(lblPlabaraClave);

		textField = new JTextField();
		textField.setBounds(142, 26, 399, 20);
		textField.setColumns(10);
		panel.add(textField);

		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(563, 25, 64, 20);
		lblCodigo.setFont(new Font("Calibri", Font.PLAIN, 18));
		panel.add(lblCodigo);

		JLabel lblSetCodigo = new JLabel("ABC654");
		lblSetCodigo.setBounds(621, 25, 64, 20);
		lblCodigo.setFont(new Font("Calibri", Font.PLAIN, 18));
		panel.add(lblSetCodigo);

		JLabel lblSeguimiento = new JLabel("Seguimiento");
		lblSeguimiento.setBounds(39, 61, 127, 20);
		lblSeguimiento.setFont(new Font("Calibri", Font.PLAIN, 18));
		panel.add(lblSeguimiento);

		JLabel lblDesde = new JLabel("Desde");
		lblDesde.setBounds(158, 89, 45, 20);
		lblDesde.setFont(new Font("Calibri", Font.PLAIN, 16));
		panel.add(lblDesde);

		JDateChooser fechaInicio = new JDateChooser();
		fechaInicio.setBounds(477, 89, 171, 20);
		panel.add(fechaInicio);

		JLabel lblHasta = new JLabel("Hasta");
		lblHasta.setBounds(426, 89, 58, 20);
		lblHasta.setFont(new Font("Calibri", Font.PLAIN, 16));
		panel.add(lblHasta);

		JDateChooser fechaFin = new JDateChooser();
		fechaFin.setBounds(213, 89, 172, 20);
		panel.add(fechaFin);

		JLabel lblDescipcin = new JLabel("Descipci\u00F3n");
		lblDescipcin.setBounds(42, 140, 104, 20);
		lblDescipcin.setFont(new Font("Calibri", Font.PLAIN, 18));
		panel.add(lblDescipcin);

		JTextArea textArea = new JTextArea();
		JScrollPane scrollpane = new JScrollPane(textArea);
		scrollpane.setBounds(158, 138, 553, 206);
		panel.add(scrollpane);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(617, 355, 94, 23);
		panel.add(btnCancelar);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(513, 355, 94, 23);
		panel.add(btnAceptar);

		btnCancelar.addActionListener(event -> {
			marco.setContentPane(new Consulta(marco));
			marco.validate();
		});

	}
}
