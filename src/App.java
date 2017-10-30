import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class App {

	public static void main(String[] args) {

		// JFrame

		JFrame marco = new JFrame();

		marco.setVisible(true); // visible
		marco.setBounds(400, 175, 500, 400);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Menu
		JMenuBar menuBar = new JMenuBar();
		marco.setJMenuBar(menuBar);
		
		// Menu > Archivo
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);
		mntmSalir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // hola, cerrate xd
			}
		});

		// Menu > Nuevo
		JMenu mnNuevo = new JMenu("Nuevo");
		menuBar.add(mnNuevo);

		JMenuItem mntmTema = new JMenuItem("Tema");
		mnNuevo.add(mntmTema);
		mntmTema.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				marco.setContentPane(new Crear(marco)); // CrearTema
				marco.validate();
			}
		});

		JMenuItem mntmSeguimiento = new JMenuItem("Seguimiento");
		mnNuevo.add(mntmSeguimiento);

		
		 mntmSeguimiento.addActionListener(new ActionListener(){
		 
		 @Override public void actionPerformed(ActionEvent arg0) {
		 marco.setContentPane(new CrearSeguimiento(marco)); // cambiar
		 marco.validate(); } });
		 
		
		// Menu > Modificar
		JMenu mnModificar = new JMenu("Modificar");
		menuBar.add(mnModificar);

		// Tema
		JMenuItem mntmTema_1 = new JMenuItem("Tema");
		mnModificar.add(mntmTema_1);
		mntmTema_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				marco.setContentPane(new Modificar(marco)); 
				marco.validate();
			}
		});
		
		//Seguimiento
		JMenuItem mntmSeguimiento_1 = new JMenuItem("Seguimiento");
		mnModificar.add(mntmSeguimiento_1);
		
		 mntmSeguimiento_1.addActionListener(new ActionListener(){
		 
		 @Override public void actionPerformed(ActionEvent arg0) {
		 marco.setContentPane(new ModificarSeguimiento(marco)); 
		 marco.validate(); } });
		 

		// Menu > Eliminar
		JMenu mnEliminar = new JMenu("Eliminar");
		menuBar.add(mnEliminar);
		
		JMenuItem mntmTema_3 = new JMenuItem("Tema");
		mnEliminar.add(mntmTema_3);
		mntmTema_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				marco.setContentPane(new Eliminar(marco)); // CrearTema
				marco.validate();
			}
		});
		
		// Menu Listener
		/*
		 * mnEliminar.addMenuListener(new MenuListener(){
		 * 
		 * @Override public void menuSelected(MenuEvent e) {
		 * marco.setContentPane(new Eliminar(marco)); marco.validate(); }
		 * 
		 * @Override public void menuCanceled(MenuEvent e) {}
		 * 
		 * @Override public void menuDeselected(MenuEvent e) {} });
		 */
		
		//Menu > Consulta
		JMenu mnConsulta = new JMenu("Consultar");
		menuBar.add(mnConsulta);

		//Tema
		JMenuItem mntmTema_2 = new JMenuItem("Tema");
		mnConsulta.add(mntmTema_2);
		mntmTema_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				marco.setContentPane(new Consulta(marco));
				marco.validate();
			}
		});
		
		//Menu > Ayuda
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmAcercaDe = new JMenuItem("Acerca de");
		mnAyuda.add(mntmAcercaDe);


		Menu menu = new Menu(marco);
		marco.setContentPane(menu);
		marco.validate();
	}
}
