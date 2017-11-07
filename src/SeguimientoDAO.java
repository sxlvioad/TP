import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class SeguimientoDAO {

	private Connection conn = null;
	private String url = "jdbc:mysql://127.0.0.1:3306/consultora?autoReconnect=true&useSSL=false";
	
	public void agregarSeguimiento(Seguimiento seguimiento) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection(url, "root", "admin");

			String query = " insert into seguimiento (cod_tema, nombre_operador, mintv, mincentral, cant_notas, cant_tapas, apreciacion)"
					+ " values (?, ?, ?, ?, ?, ?, ?)";

			PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(query);
			preparedStmt.setString(1, seguimiento.getCodigo());
			preparedStmt.setString(2, seguimiento.getOperador());
			preparedStmt.setInt(3, seguimiento.getMinsTelevion());
			preparedStmt.setInt(4, seguimiento.getMinsHorarioCentral());
			preparedStmt.setInt(5, seguimiento.getCantNotasDiarios());
			preparedStmt.setInt(6, seguimiento.getCantTapasRevistas());
			preparedStmt.setString(7, seguimiento.getApreciacion());

			preparedStmt.execute();

			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
}
