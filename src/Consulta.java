import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")

public class Consulta extends JSplitPane {

	private JTextField textField;
	@SuppressWarnings("unused")
	private JTable table;

	public Consulta(JFrame marco) {

		setLayout(null);

		// Barra

		JPanel barra = new JPanel();
		barra.setLocation(0, 0);
		barra.setSize(764, 85);
		barra.setLayout(null);
		barra.setBackground(new Color(69, 193, 100));
		add(barra);

		textField = new JTextField();
		textField.setBounds(181, 28, 507, 29);
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(new Color(65, 182, 94));
		textField.setFont(new Font("Calibri", Font.PLAIN, 14));
		TextPrompt placeholder = new TextPrompt(" Buscar", textField);
		placeholder.changeAlpha(0.75f);
		placeholder.changeStyle(Font.ITALIC);
		barra.add(textField);

		JButton imagebutton = new JButton();
		imagebutton.setIcon(new ImageIcon(this.getClass().getResource("/searcher1.png")));
		imagebutton.setBounds(687, 28, 31, 29);
		imagebutton.setBorder(new EmptyBorder(0, 0, 0, 0));
		imagebutton.setBackground(new Color(65, 182, 94));
		barra.add(imagebutton);

		JLabel lblConsultas = new JLabel("Consultas");
		lblConsultas.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultas.setBounds(20, 28, 117, 29);
		lblConsultas.setFont(new Font("Calibri", Font.PLAIN, 20));
		barra.add(lblConsultas);

		// JTable

		JPanel panel = new JPanel();
		panel.setBounds(0, 85, 764, 421);
		panel.setBackground(new Color(246, 246, 246));
		panel.setLayout(null);
		add(panel);

		
		
		Object[][] data = { { "ABC123", "Libro", "12", "24" }, { "DEF456", "Cosas", "22", "24" }, { "GHI789", "Politica", "05", "17" }, 
				};

		
		String[] columnNames = { "Codigo Tema", "Palabra Clave", "Inicio", "Fin" };
		final DefaultTableModel model = new DefaultTableModel(data, columnNames);

		final JTable table = new JTable(model);
		table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		table.setBounds(184, 17, 537, 382);
		panel.add(table);
	

		JLabel lblFiltrar = new JLabel("Filtrar");
		lblFiltrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFiltrar.setBounds(20, 18, 46, 14);
		panel.add(lblFiltrar);

		JComboBox<Operador> comboBox = new JComboBox<Operador>();
		comboBox.setBounds(20, 43, 144, 20);
		panel.add(comboBox);

		JButton btnCrearTema = new JButton("Añadir tema");
		btnCrearTema.setHorizontalAlignment(SwingConstants.LEFT);
		btnCrearTema.setBounds(3, 77, 154, 33);
		btnCrearTema.setIcon(new ImageIcon(this.getClass().getResource("/NuevoTema.png")));
		btnCrearTema.setOpaque(false);
		btnCrearTema.setContentAreaFilled(false);
		btnCrearTema.setBorderPainted(false);
		btnCrearTema.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				marco.setContentPane(new Crear(marco));
				marco.validate();
			}
		});
		panel.add(btnCrearTema);

		JButton btnCrearSeguimiento = new JButton("Añadir seguimiento");
		btnCrearSeguimiento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCrearSeguimiento.setHorizontalAlignment(SwingConstants.LEFT);
		btnCrearSeguimiento.setBounds(0, 126, 181, 33);
		btnCrearSeguimiento.setIcon(new ImageIcon(this.getClass().getResource("/NuevoSeguimiento.png")));
		btnCrearSeguimiento.setOpaque(false);
		btnCrearSeguimiento.setContentAreaFilled(false);
		btnCrearSeguimiento.setBorderPainted(false);
		btnCrearSeguimiento.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				marco.setContentPane(new CrearSeguimiento(marco));
				marco.validate();
			}
		});
		panel.add(btnCrearSeguimiento);

		JButton btnModificar = new JButton("Modificar");
		btnModificar.setHorizontalAlignment(SwingConstants.LEFT);
		btnModificar.setBounds(3, 170, 157, 33);
		btnModificar.setIcon(new ImageIcon(this.getClass().getResource("/Modificar.png")));
		btnModificar.setOpaque(false);
		btnModificar.setContentAreaFilled(false);
		btnModificar.setBorderPainted(false);
		panel.add(btnModificar);

		JButton btnEliminar = new JButton("Eliminar tema");
		btnEliminar.setHorizontalAlignment(SwingConstants.LEFT);
		btnEliminar.setBounds(3, 214, 155, 33);
		btnEliminar.setIcon(new ImageIcon(this.getClass().getResource("/Eliminar.png")));
		btnEliminar.setOpaque(false);
		btnEliminar.setContentAreaFilled(false);
		btnEliminar.setBorderPainted(false);
		btnEliminar.addActionListener(new ActionListener() {
			 @Override
			    public void actionPerformed(ActionEvent arg0) {
			        // check for selected row first
			        if (table.getSelectedRow() != -1) {
			            // remove selected row from the model
			            model.removeRow(table.getSelectedRow());
			        }
			    }
			 });
		
		panel.add(btnEliminar);



	}
}
