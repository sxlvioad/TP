import java.sql.Date;
import java.time.LocalDate;

public class Tema {

	private String codigo;
	private String palabraClave;
	private LocalDate inicio;
	private LocalDate fin;
	private String descripcion;

	public Tema(String codigo, String palabraClave, LocalDate inicio, LocalDate fin, String descripcion) {
		this.codigo = codigo;
		this.palabraClave = palabraClave;
		this.inicio = inicio;
		this.fin = fin;
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

	public LocalDate getInicio() {
		return inicio;
	}

	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}

	public LocalDate getFin() {
		return fin;
	}

	public void setFin(LocalDate fin) {
		this.fin = fin;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
