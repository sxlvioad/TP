import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
<<<<<<< HEAD
=======

>>>>>>> 5f87d4858c21a8c45812e995bc41dc163bd5cb01

public class Tema {

	private String codigo;
	private String palabraClave;
	private Date inicio;
	private Date fin;
	private String descripcion;

	public Tema(String codigo, String palabraClave, Date inicio, Date fin, String descripcion) {
		this.codigo = codigo;
		this.palabraClave = palabraClave;
		this.setInicio(inicio);
		this.setFin(fin);
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getPalabraClave() {
		return palabraClave;
	}

	public void setPalabraClave(String palabraClave) {
		this.palabraClave = palabraClave;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
<<<<<<< HEAD
		LocalDate date = inicio.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		this.inicio = date;
=======
		ZoneId defaultZoneId = ZoneId.systemDefault();
		Instant instant = inicio.toInstant();
		LocalDate localDate = instant.atZone(defaultZoneId).toLocalDate();
>>>>>>> 5f87d4858c21a8c45812e995bc41dc163bd5cb01
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		ZoneId defaultZoneId = ZoneId.systemDefault();
		Instant instant = fin.toInstant();
		LocalDate localDate = instant.atZone(defaultZoneId).toLocalDate();
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
