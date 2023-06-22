package model;

public class Capacitacion {
	private int idCapacitacion;
	private String rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int cantAsistentes;
	
	public Capacitacion() {}

	public Capacitacion(int idCapacitacion, String rutCliente, String dia, String hora, String lugar, String duracion,
			int cantAsistentes) {
		this.idCapacitacion = idCapacitacion;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantAsistentes = cantAsistentes;
	}

	public int getIdCapacitacion() {
		return idCapacitacion;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public String getHora() {
		return hora;
	}

	public String getLugar() {
		return lugar;
	}

	public String getDuracion() {
		return duracion;
	}

	public int getCantAsistentes() {
		return cantAsistentes;
	}

	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public void setCantAsistentes(int cantAsistentes) {
		this.cantAsistentes = cantAsistentes;
	}

	@Override
	public String toString() {
		return "Capacitacion [idCapacitacion=" + idCapacitacion + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantAsistentes="
				+ cantAsistentes + "]";
	}
}
