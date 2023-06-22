package model;

import java.sql.Date;

public class Accidente {
	private int idAccidente;
	private String rutCliente;
	private Date fechaAccidente;
	private String horaAccidente;
	private String lugarAccidente;
	private String origenAccidente;
	private String consecuenciaAccidente;
	
	public Accidente() {}

	public Accidente(int idAccidente, String rutCliente, Date fechaAccidente, String horaAccidente,
			String lugarAccidente, String origenAccidente, String consecuenciaAccidente) {
		this.idAccidente = idAccidente;
		this.rutCliente = rutCliente;
		this.fechaAccidente = fechaAccidente;
		this.horaAccidente = horaAccidente;
		this.lugarAccidente = lugarAccidente;
		this.origenAccidente = origenAccidente;
		this.consecuenciaAccidente = consecuenciaAccidente;
	}

	public int getIdAccidente() {
		return idAccidente;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public Date getFechaAccidente() {
		return fechaAccidente;
	}

	public String getHoraAccidente() {
		return horaAccidente;
	}

	public String getLugarAccidente() {
		return lugarAccidente;
	}

	public String getOrigenAccidente() {
		return origenAccidente;
	}

	public String getConsecuenciaAccidente() {
		return consecuenciaAccidente;
	}

	public void setIdAccidente(int idAccidente) {
		this.idAccidente = idAccidente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public void setFechaAccidente(Date fechaAccidente) {
		this.fechaAccidente = fechaAccidente;
	}

	public void setHoraAccidente(String horaAccidente) {
		this.horaAccidente = horaAccidente;
	}

	public void setLugarAccidente(String lugarAccidente) {
		this.lugarAccidente = lugarAccidente;
	}

	public void setOrigenAccidente(String origenAccidente) {
		this.origenAccidente = origenAccidente;
	}

	public void setConsecuenciaAccidente(String consecuenciaAccidente) {
		this.consecuenciaAccidente = consecuenciaAccidente;
	}

	@Override
	public String toString() {
		return "Accidente [idAccidente=" + idAccidente + ", rutCliente=" + rutCliente + ", fechaAccidente="
				+ fechaAccidente + ", horaAccidente=" + horaAccidente + ", lugarAccidente=" + lugarAccidente
				+ ", origenAccidente=" + origenAccidente + ", consecuenciaAccidente=" + consecuenciaAccidente + "]";
	}
}
