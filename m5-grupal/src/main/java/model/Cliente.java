package model;

import java.time.LocalDate;
import java.util.ArrayList;


public class Cliente extends Usuario {
    private String direccion;
    private String comuna;
    private String telefono;
    private int edad;
    private String afp;
    private int sistemaSalud;
    
public Cliente() {}

public Cliente(int id ,String nombres, String apellidos, String run,LocalDate fechaNacimiento, 
			int tipo, String direccion,String comuna, String telefono, int edad,
			String afp, int sistemaSalud){
		super(id,nombres, apellidos,run , fechaNacimiento,  tipo);
		this.direccion = direccion;
		this.comuna = comuna;
		this.telefono = telefono;
		this.edad = edad;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
	}



	public void analizarUsuario() {
		
	}

	public String getDireccion() {
		return direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public String getTelefono() {
		return telefono;
	}

	public int getEdad() {
		return edad;
	}

	public String getAfp() {
		return afp;
	}

	public int getSistemaSalud() {
		return sistemaSalud;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}
}

