package model;

import java.sql.Date;

public class Visita {
	private int idVisita ;
	private String horaAccidente;
    private	String lugarAccidente;
    private	String comentarios;
    private	String rutCliente;
    private	Date fechaAccidente;
    
public Visita() {}
    
	public Visita(int idVisita, String horaAccidente, String lugarAccidente, String comentarios,
			 String rutCliente, Date fechaAccidente) {
		this.idVisita = idVisita;
		this.horaAccidente = horaAccidente;
		this.lugarAccidente = lugarAccidente;
		this.comentarios = comentarios;
		this.rutCliente = rutCliente;
		this.fechaAccidente = fechaAccidente;
	}

	public int getIdVisita() {
		return idVisita;
	}

	public String getHoraAccidente() {
		return horaAccidente;
	}

	public String getLugarAccidente() {
		return lugarAccidente;
	}

	public String getComentarios() {
		return comentarios;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public Date getFechaAccidente() {
		return fechaAccidente;
	}

	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}

	public void setHoraAccidente(String horaAccidente) {
		this.horaAccidente = horaAccidente;
	}

	public void setLugarAccidente(String lugarAccidente) {
		this.lugarAccidente = lugarAccidente;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public void setFechaAccidente(Date fechaAccidente) {
		this.fechaAccidente = fechaAccidente;
	}

	@Override
	public String toString() {
		return "Visita [idVisita=" + idVisita + ", horaAccidente=" + horaAccidente + ", lugarAccidente="
				+ lugarAccidente + ", comentarios=" + comentarios + ", rutCliente=" + rutCliente + ", fechaAccidente="
				+ fechaAccidente + "]";
	}
    
}
