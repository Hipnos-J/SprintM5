package model;

import java.time.LocalDate;

public class Usuario {
	protected int id;
	protected String nombres;
	protected String apellidos;
	protected String run;
	protected LocalDate fechaNacimiento;
	protected int tipo;
	
	public Usuario() {
		
	}

	public Usuario(int id, String nombres, String apellidos, String run, LocalDate fechaNacimiento, int tipo) {
	super();
	this.id = id;
	this.nombres = nombres;
	this.apellidos = apellidos;
	this.run = run;
	this.fechaNacimiento = fechaNacimiento;
	this.tipo = tipo;
}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public int getTipo() {
	return tipo;
}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Usuario [nombres=" + nombres + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento
				+ ", run=" + run + " ]";
	}
	
}
