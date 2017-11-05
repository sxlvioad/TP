import java.sql.DriverManager;
import java.sql.ResultSet;
import java.time.LocalDate;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class UsuarioDAO {

	private Connection conn = null;
	private String url = "jdbc:mysql://127.0.0.1:3306/consultora";
	
	public void listarTemas(Tema tema){
			 try {

		            conn = (Connection) DriverManager.getConnection(url,"root","");
		            Statement stmt = (Statement) conn.createStatement();
		            ResultSet rs;
		 
		            rs = stmt.executeQuery("SELECT cod_tema, palabra_clave, fecha_inicio, fecha_fin FROM Customers");
		            while ( rs.next() ) {
		                tema.setCodigo(rs.getString("cod_tema"));
		                tema.setPalabraClave(rs.getString("palabra_clave"));
		                tema.setInicio(rs.getDate("fecha_inicio"));
		                tema.setFin(rs.getDate("fecha_fin"));

		            }
		            conn.close();
		        } catch (Exception e) {
		            System.err.println("Got an exception! ");
		            System.err.println(e.getMessage());
		        }

	}

	
	public void agregarTema(Tema tema) {
		
	    try
	    {
	      conn = (Connection) DriverManager.getConnection(url, "root", "");
	
	      String query = " insert into seguimiento (cod_tema, palabra_clave, descripcion, fecha_inicio, fecha_fin)"
	        + " values (?, ?, ?, ?, ?)";
	
	      PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(query);
	      preparedStmt.setString (1, tema.getCodigo());
	      preparedStmt.setString (2, tema.getPalabraClave());
	      preparedStmt.setString (3, tema.getDescripcion());
	      //preparedStmt.setDate   (4, tema.getInicio());
	      //preparedStmt.setDate	 (5, tema.getFin());
	      
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
	
	      conn = (Connection) DriverManager.getConnection(url, "root", "");
	
	      String query = " insert into seguimiento (cod_tema, id_operador, mintv, mincentral, cant_notas, cant_tapas, apreciacion)"
	        + " values (?, ?, ?, ?, ?, ?, ?)";
	
	      PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(query);
	      preparedStmt.setString (1, seguimiento.getCodigo());
	      preparedStmt.setString (2, seguimiento.getOperador());
	      preparedStmt.setInt    (3, seguimiento.getMinsTelevion());
	      preparedStmt.setInt	 (4, seguimiento.getMinsHorarioCentral());
	      preparedStmt.setInt    (5, seguimiento.getCantNotasDiarios());
	      preparedStmt.setInt    (6, seguimiento.getCantTapasRevistas());
	      preparedStmt.setString (7, seguimiento.getApreciacion());
	
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


