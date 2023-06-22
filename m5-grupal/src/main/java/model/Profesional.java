package model;

import java.time.LocalDate;

public class Profesional extends Usuario{
	private String titulo;
	private LocalDate fechaIngreso;
	
public Profesional() {}
	
	
	
	public Profesional(int id,String nombres, String apellidos, String run,LocalDate fechaNacimiento,
					   int tipo,String titulo, LocalDate fechaIngreso) {
		super(id,nombres,apellidos,run,fechaNacimiento,tipo);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}



	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}
}
