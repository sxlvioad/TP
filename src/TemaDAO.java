import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class TemaDAO {

	private Connection conn = null;
	private String url = "jdbc:mysql://127.0.0.1:3306/consultora?autoReconnect=true&useSSL=false";
	
	public void agregarTema(Tema tema) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection(url, "root", "admin");

			String query = " insert into tema (cod_tema, palabra_clave, descripcion, fecha_inicio, fecha_fin)"
					+ " values (?, ?, ?, ?, ?)";

			PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(query);
			preparedStmt.setString(1, tema.getCodigo());
			preparedStmt.setString(2, tema.getPalabraClave());
			preparedStmt.setString(3, tema.getDescripcion());
			preparedStmt.setObject(4, tema.getInicio());
			preparedStmt.setObject(5, tema.getFin());

			preparedStmt.execute();

			
			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}	
	
	/*
	 * Consulta Temas
	 */
	
	public ArrayList<Tema> displayTemas() {

		ArrayList<Tema> listarTema = new ArrayList<>();
		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection(url, "root", "admin");

			Statement stmt = (Statement) conn.createStatement();
			ResultSet rs;
			rs = stmt.executeQuery("SELECT cod_tema, palabra_clave, fecha_inicio, fecha_fin, descripcion FROM Tema");
			while (rs.next()) {
				Tema tema = new Tema(rs.getString("cod_tema"), rs.getString("palabra_clave"),
						rs.getDate("fecha_inicio").toLocalDate(), rs.getDate("fecha_fin").toLocalDate(), rs.getString("descripcion"));
				listarTema.add(tema);
			}
			conn.close();

		} catch (ClassNotFoundException | SQLException e) {

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

			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection(url, "root", "admin");

			Statement stmt = (Statement) conn.createStatement();
			ResultSet rs;
			rs = stmt.executeQuery("SELECT cod_tema from tema");
			while (rs.next()) {
				String tema = rs.getString("cod_tema");
				listarTema.add(tema);
			}
			conn.close();

		} catch (ClassNotFoundException | SQLException e) {

			JOptionPane.showMessageDialog(null, e);

		}
		return listarTema;
	}

	/*
	 * Eliminar Tema
	 */
	
	public void eliminarTema(Tema tema) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection(url, "root", "admin");

			String query = "DELETE FROM tema where id_tema = ?";
			PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(query);
			preparedStmt.setInt(1, 3); // como hago para seleccionar el id_tema
										// desde mi JTable ¿¿¿¿

			preparedStmt.execute();

			conn.close();

		} catch (ClassNotFoundException | SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}


	
}
