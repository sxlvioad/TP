import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")

public class App extends JFrame {
	
	public App() {
	}

	public static void main(String[] args) {

		JFrame marco = new JFrame();
		marco.setFont(new Font("Calibri", Font.PLAIN, 13));
		marco.setTitle("Consultora");
		ImageIcon img = (new ImageIcon(marco.getClass().getResource("/home.png")));
		marco.setIconImage(img.getImage());
		marco.setVisible(true);
		marco.setSize(750, 550);
		marco.setResizable(false);
		marco.setLocationRelativeTo(null);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Menu
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(null);
		menuBar.setBackground(new Color(69, 193, 100));

		Font f = (new Font("Calibri", Font.PLAIN, 14));
		// Color c = (new Color(85, 205, 115));
		UIManager.put("Menu.font", f);
		UIManager.put("MenuItem.font", f);

		marco.setJMenuBar(menuBar);

		// Menu > Archivo
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);

		// > Nuevo
		JMenu mnNuevo = new JMenu("Nuevo");
		mnNuevo.setPreferredSize(new Dimension(100, mnNuevo.getPreferredSize().height));
		mnArchivo.add(mnNuevo);

		// >> Tema
		JMenuItem mntmTema = new JMenuItem("Tema");
		mnNuevo.add(mntmTema);

		mnNuevo.add(mntmTema);
		mntmTema.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				marco.setContentPane(new Crear(marco)); // CrearTema
				marco.validate();
			}
		});

		// >> Seguimiento
		JMenuItem mntmSeguimiento = new JMenuItem("Seguimiento");
		mnNuevo.add(mntmSeguimiento);

		mntmSeguimiento.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				marco.setContentPane(new CrearSeguimiento(marco));//Crear Seguimiento
				marco.validate();
			}
		});

		// Separador
		JSeparator separator = new JSeparator();
		mnArchivo.add(separator);

		// Salir
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);
		mntmSalir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				marco.setVisible(false);
				System.exit(1);
			}
		});

		////////////////////////////////////////////////////////////////////

		// Menu > Editar
		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);

		// Tema
		JMenuItem mntmTema_1 = new JMenuItem("Tema");
		mntmTema_1.setPreferredSize(new Dimension(100, mntmTema_1.getPreferredSize().height));
		mnEditar.add(mntmTema_1);
		mntmTema_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//marco.setContentPane(new Modificar(marco));
				//marco.validate();
			}
		});

		// Seguimiento
		JMenuItem mntmSeguimiento_1 = new JMenuItem("Seguimiento");
		mnEditar.add(mntmSeguimiento_1);

		JSeparator separator_1 = new JSeparator();
		mnEditar.add(separator_1);

		JMenuItem mntmEliminar = new JMenuItem("Eliminar");
		mnEditar.add(mntmEliminar);

		mntmSeguimiento_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// marco.setContentPane(new ModificarSeguimiento(marco));
				// marco.validate();
			}
		});

		////////////////////////////////////////////////////////////////////

		// Menu > Consulta
		JMenu mnConsulta = new JMenu("Consultas");
		menuBar.add(mnConsulta);

		// Tema
		JMenuItem mntmTema_2 = new JMenuItem("Tema");
		mntmTema_2.setPreferredSize(new Dimension(100, mntmTema_2.getPreferredSize().height));
		mnConsulta.add(mntmTema_2);
		mntmTema_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				marco.setContentPane(new Consulta(marco));
				marco.validate();
			}
		});

		////////////////////////////////////////////////////////////////////

		// Menu > Ayuda
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);

		JMenuItem mntmAcercaDe = new JMenuItem("Acerca de");
		mntmAcercaDe.setPreferredSize(new Dimension(100, mntmAcercaDe.getPreferredSize().height));
		mnAyuda.add(mntmAcercaDe);
		mntmAcercaDe.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				final JFrame popUp = new JFrame();
				popUp.setContentPane(new AcercaDe(popUp));

				JOptionPane.showMessageDialog(popUp,
						"Version: (4.5.2) \n(c) Copyright Consultora contributors and others 1999, 2017. \nAll rights reserved.",
						"Acerca de", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		marco.setContentPane(new Consulta(marco));
		marco.validate();
	}


}