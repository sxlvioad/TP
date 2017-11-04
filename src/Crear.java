import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import java.util.Date;

@SuppressWarnings("serial")

public class Crear extends JPanel {
	
	private JTextField palabraClavetxtFld;

	public Crear(JFrame marco) {

		setLayout(null);

		// Barra

		JPanel barra = new JPanel();
		barra.setLocation(0, 0);
		barra.setSize(749, 85);
		barra.setLayout(null);
		barra.setBackground(new Color(69, 193, 100));
		add(barra);

		setLayout(null);

		// Panel

		JPanel panel = new JPanel();
		panel.setBounds(0, 83, 750, 428);
		panel.setBackground(new Color(246, 246, 246));
		add(panel);

		panel.setLayout(null);

		JLabel lblPalabraClave = new JLabel("Palabra Clave");
		lblPalabraClave.setBounds(39, 25, 104, 20);
		lblPalabraClave.setFont(new Font("Calibri", Font.PLAIN, 18));
		panel.add(lblPalabraClave);

		palabraClavetxtFld = new JTextField();
		palabraClavetxtFld.setBounds(153, 26, 388, 20);
		palabraClavetxtFld.setColumns(10);
		panel.add(palabraClavetxtFld);

		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(563, 25, 64, 20);
		lblCodigo.setFont(new Font("Calibri", Font.PLAIN, 18));
		panel.add(lblCodigo);

		JTextField codigotxtF = new JTextField("ABC654");
		codigotxtF.setBounds(621, 25, 64, 20);
		lblCodigo.setFont(new Font("Calibri", Font.PLAIN, 18));
		panel.add(codigotxtF);

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
		lblDescipcin.setBounds(38, 136, 104, 20);
		lblDescipcin.setFont(new Font("Calibri", Font.PLAIN, 18));
		panel.add(lblDescipcin);

		JTextArea descripciontxtArea = new JTextArea();
		JScrollPane scrollpane = new JScrollPane(descripciontxtArea);
		scrollpane.setBounds(158, 138, 553, 206);
		panel.add(scrollpane);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(617, 355, 94, 23);
		btnCancelar.addActionListener(event -> {
			marco.setContentPane(new Consulta(marco));
			marco.validate();
		});
		panel.add(btnCancelar);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(513, 355, 94, 23);
		btnAceptar.addActionListener(event -> {
			UsuarioDAO usuarioDAO = new UsuarioDAO();
			Tema tema = new Tema(codigotxtF.getText(), palabraClavetxtFld.getText(), inicio, fin, descripciontxtArea.getText()); //local date inicio y fin
			usuarioDAO.agregarTema(tema);
			marco.setContentPane(new Consulta(marco));
			marco.validate();
		});
		panel.add(btnAceptar);
	}
}
