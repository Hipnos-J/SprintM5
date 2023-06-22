package model;

import java.time.LocalDate;


public class Administrativo extends Usuario {
	
	private String expPrevia;
	private String area;
	
public Administrativo() {}
	
	public void analizarUsuario() {
		
	}
	public Administrativo(int id,String nombres, String apellidos, String run,LocalDate fechaNacimiento,
	    				int tipo, String expPrevia,String area) {
		super(id,nombres, apellidos, run,fechaNacimiento,tipo);
		this.expPrevia = expPrevia;
		this.area = area;
	}
	
	public String getExpPrevia() {
		return expPrevia;
	}
	
	public void setExpPrevia(String expPrevia) {
		this.expPrevia = expPrevia;
	}
	
	public String getArea() {
		return area;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "Administrativo [expPrevia=" + expPrevia + ", area=" + area + "]";
	}
}