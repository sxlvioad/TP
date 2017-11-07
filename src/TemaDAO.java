import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.StatementImpl;

public class TemaDAO {

	private Connection conn = null;
	private String url = "jdbc:mysql://127.0.0.1:3306/consultora?autoReconnect=true&useSSL=false";
	private Statement stmt = null;

	public TemaDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection(url, "root", "admin");
			stmt = (Statement) conn.createStatement();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * nuevo tema
	 */
	
	public void agregarTema(Tema tema) {

		try {

			String query = " insert into tema (cod_tema, palabra_clave, descripcion, fecha_inicio, fecha_fin)"
					+ " values (?, ?, ?, ?, ?)";

			PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(query);
			preparedStmt.setString(1, tema.getCodigo());
			preparedStmt.setString(2, tema.getPalabraClave());
			preparedStmt.setString(3, tema.getDescripcion());
			preparedStmt.setObject(4, tema.getInicio());
			preparedStmt.setObject(5, tema.getFin());

			preparedStmt.execute();

			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	/*
	 * Consulta Temas
	 */

	public ArrayList<Tema> displayTemas() {

		ArrayList<Tema> listarTema = new ArrayList<>();
		try {

			ResultSet rs;
			rs = stmt.executeQuery("SELECT cod_tema, palabra_clave, fecha_inicio, fecha_fin, descripcion FROM Tema");
			while (rs.next()) {
				Tema tema = new Tema(rs.getString("cod_tema"), rs.getString("palabra_clave"),
						rs.getDate("fecha_inicio"), rs.getDate("fecha_fin"), rs.getString("descripcion"));
				listarTema.add(tema);
			}
			

		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, e);

		}
		return listarTema;

	}
	
	/*
	 * Mostrar cod_tema
	 */
	
	public ArrayList<String> showTemas() {
		ArrayList<String> listarTema = new ArrayList<>();
		try {

			ResultSet rs;
			rs = stmt.executeQuery("SELECT cod_tema from tema");
			while (rs.next()) {
				String tema = rs.getString("cod_tema");
				listarTema.add(tema);
			}
			
		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, e);

		}
		return listarTema;
	}

	
	/*
	 * Mostrar palabras clave
	 */
	
	public ArrayList<String> showPalabrasClave() {
		ArrayList<String> listarPalabrasClave = new ArrayList<>();
		try {

			ResultSet rs;
			rs = stmt.executeQuery("SELECT palabra_clave from tema");
			while (rs.next()) {
				String tema = rs.getString("palabra_clave");
				listarPalabrasClave.add(tema);
			}

		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, e);

		}
		return listarPalabrasClave;
	}
	
	/*
	 * Obtener tema por codigo
	 */
	

	/*
	 * Eliminar Tema
	 */
	
	public void obtenerTemaPorCodigo (String cod_tema){
		
	}


	/*
	 * 					dao.eliminarTemaPorID(
							dao.obtenerTemaPorID(table.getValueAt(table.getSelectedRow(), 0).toString()).getID());
					cargarTabla(dao.obtenerTemas());
	 */
	


}
