
public class Seguimiento {

	private String codigo;
	private String operador;
	private int minsTelevion;
	private int minsHorarioCentral;
	private int cantNotasDiarios;
	private int cantTapasRevistas;
	private String apreciacion;

	public Seguimiento(String codigo, String operador, int minsTelevion, int minsHorarioCentral, int cantNotasDiarios,
			int cantTapasRevistas, String apreciacion) {
		this.codigo = codigo;
		this.operador = operador;
		this.minsTelevion = minsTelevion;
		this.minsHorarioCentral = minsHorarioCentral;
		this.cantNotasDiarios = cantNotasDiarios;
		this.cantTapasRevistas = cantTapasRevistas;
		this.apreciacion = apreciacion;
	}


	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	public int getMinsTelevion() {
		return minsTelevion;
	}

	public void setMinsTelevion(int minsTelevion) {
		this.minsTelevion = minsTelevion;
	}

	public int getMinsHorarioCentral() {
		return minsHorarioCentral;
	}

	public void setMinsHorarioCentral(int minsHorarioCentral) {
		this.minsHorarioCentral = minsHorarioCentral;
	}

	public int getCantNotasDiarios() {
		return cantNotasDiarios;
	}

	public void setCantNotasDiarios(int cantNotasDiarios) {
		this.cantNotasDiarios = cantNotasDiarios;
	}

	public int getCantTapasRevistas() {
		return cantTapasRevistas;
	}

	public void setCantTapasRevistas(int cantTapasRevistas) {
		this.cantTapasRevistas = cantTapasRevistas;
	}

	public String getApreciacion() {
		return apreciacion;
	}

	public void setApreciacion(String apreciacion) {
		this.apreciacion = apreciacion;
	}

}
