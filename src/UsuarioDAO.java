import java.sql.DriverManager;
import java.time.LocalDate;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class UsuarioDAO {

	private Connection conn = null;

	public void agregarTema(Tema tema) {
		
	    try
	    {
	      // create a mysql database connection
	      String url = "jdbc:mysql://127.0.0.1:3306/consultora";
	
	      conn = (Connection) DriverManager.getConnection(url, "root", "");
	
	      // the mysql insert statement
	      String query = " insert into seguimiento (cod_tema, palabra_clave, descripcion, fecha_inicio, fecha_fin)"
	        + " values (?, ?, ?, ?, ?)";
	
	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(query);
	      preparedStmt.setString (1, tema.getCodigo());
	      preparedStmt.setString (2, tema.getPalabraClave());
	      preparedStmt.setString (3, tema.getDescripcion());
	      //preparedStmt.setDate   (4, tema.getInicio());
	      //preparedStmt.setDate	 (5, tema.getFin());
	      
	      // execute the preparedstatement
	      preparedStmt.execute();
	      
	      conn.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}

	public void agregarSeguimiento(Seguimiento seguimiento) {

	    try
	    {
	      // create a mysql database connection
	      String url = "jdbc:mysql://127.0.0.1:3306/consultora";
	
	      conn = (Connection) DriverManager.getConnection(url, "root", "");
	
	      // the mysql insert statement
	      String query = " insert into seguimiento (cod_tema, id_operador, mintv, mincentral, cant_notas, cant_tapas, apreciacion)"
	        + " values (?, ?, ?, ?, ?, ?, ?)";
	
	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(query);
	      preparedStmt.setString (1, seguimiento.getCodigo());
	      preparedStmt.setString (2, seguimiento.getOperador());
	      preparedStmt.setInt    (3, seguimiento.getMinsTelevion());
	      preparedStmt.setInt	 (4, seguimiento.getMinsHorarioCentral());
	      preparedStmt.setInt    (5, seguimiento.getCantNotasDiarios());
	      preparedStmt.setInt    (6, seguimiento.getCantTapasRevistas());
	      preparedStmt.setString (7, seguimiento.getApreciacion());
	
	      // execute the preparedstatement
	      preparedStmt.execute();
	      
	      conn.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
  }
}


