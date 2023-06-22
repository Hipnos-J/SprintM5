package model;

public class Contacto {
	protected String nombre;
	protected String apellido;
	protected String correo;
	protected String numCelular;
	protected String comentario;
	
	
	public Contacto() {
		super();
	}

	public Contacto(String nombre, String apellido, String correo, String numCelular, String comentario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.numCelular = numCelular;
		this.comentario = comentario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNumCelular() {
		return numCelular;
	}

	public void setNumCelular(String numCelular) {
		this.numCelular = numCelular;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "Peticiones de usuarios ; Nombre = " + nombre + ", Apellido = " + apellido + ", Correo = " + correo + ", Numero de celular = "
				+ numCelular + ", Comentario = " + comentario + "] ";
	}
	
	
	
	
	
}
