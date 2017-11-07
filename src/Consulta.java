import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")

public class Consulta extends JSplitPane {

	private JTextField busquedaTxtFld;
	private JButton imagebutton;
	private JLabel lblConsultas;
	
	private JLabel lblFiltrar;
	private JComboBox<String> filtrarCmbBox;
	private JButton btnCrearTema;
	private JButton btnCrearSeguimiento;
	private JButton btnModificar;
	private JButton btnEliminar;
	private static DefaultTableModel model;
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

		busquedaTxtFld = new JTextField();
		busquedaTxtFld.setBounds(181, 28, 507, 29);
		busquedaTxtFld.setColumns(10);
		busquedaTxtFld.setBorder(null);
		busquedaTxtFld.setBackground(new Color(65, 182, 94));
		busquedaTxtFld.setFont(new Font("Calibri", Font.PLAIN, 14));
		TextPrompt placeholder = new TextPrompt(" Buscar", busquedaTxtFld);
		placeholder.changeAlpha(0.75f);
		placeholder.changeStyle(Font.ITALIC);
		barra.add(busquedaTxtFld);

		imagebutton = new JButton();
		imagebutton.setIcon(new ImageIcon(this.getClass().getResource("/searcher1.png")));
		imagebutton.setBounds(687, 28, 31, 29);
		imagebutton.setBorder(new EmptyBorder(0, 0, 0, 0));
		imagebutton.setBackground(new Color(65, 182, 94));
		barra.add(imagebutton);

		lblConsultas = new JLabel("Consultas");
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

		
		
<<<<<<< HEAD
		//UsuarioDAO usuarioDAO = new UsuarioDAO();
		model = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
=======
		Object[][] data = {{ "ABC123", "Libro", "12", "24" }, { "DEF456", "Cosas", "22", "24" }, { "GHI789", "Politica", "05", "17" }, 
				};
>>>>>>> 5f87d4858c21a8c45812e995bc41dc163bd5cb01

		table = new JTable(model);
		table.getTableHeader().setBackground(new Color(252, 252, 252));
		
		model.addColumn("Codigo tema");
		model.addColumn("Palabra clave");
		model.addColumn("Inicio");
		model.addColumn("Fin");
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(180, 10, 537, 382);
		scrollPane.setViewportBorder(null);
		scrollPane.getViewport().setBackground(new Color(252, 252, 252));;

		panel.add(scrollPane);
	

		lblFiltrar = new JLabel("Filtrar");
		lblFiltrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFiltrar.setBounds(20, 18, 46, 14);
		panel.add(lblFiltrar);

		filtrarCmbBox = new JComboBox<String>();
		filtrarCmbBox.setBounds(20, 43, 144, 20);
		panel.add(filtrarCmbBox);

		btnCrearTema = new JButton("Añadir tema");
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

		btnCrearSeguimiento = new JButton("Añadir seguimiento");
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

		btnModificar = new JButton("Modificar");
		btnModificar.setHorizontalAlignment(SwingConstants.LEFT);
		btnModificar.setBounds(3, 170, 157, 33);
		btnModificar.setIcon(new ImageIcon(this.getClass().getResource("/Modificar.png")));
		btnModificar.setOpaque(false);
		btnModificar.setContentAreaFilled(false);
		btnModificar.setBorderPainted(false);
		panel.add(btnModificar);

		btnEliminar = new JButton("Eliminar tema");
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
