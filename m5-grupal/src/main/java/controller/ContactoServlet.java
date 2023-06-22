package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ContactoDAO;
import dao.UsuarioDAO;
import model.Contacto;
import model.Usuario;

/**
 * Servlet implementation class ContactoServlet
 */
@WebServlet("/ContactoServlet")
public class ContactoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("nombre") ;
		String apellido = request.getParameter("apellido") ;
		String correo= request.getParameter("correo") ;
		String numCelular = request.getParameter("numCelular") ;
		String comentario= request.getParameter("comentario") ;
		
		Contacto contacto = new Contacto();
		
		contacto.setNombre(nombre);
		contacto.setApellido(apellido);
		contacto.setCorreo(correo);
		contacto.setNumCelular(numCelular);
		contacto.setComentario(comentario);
		
		ContactoDAO contactoDAO = ContactoDAO.getInstancia();
		contactoDAO.agregarContacto(contacto);
		
		List<Contacto> contactos = contactoDAO.obtenerContactos();
	    
		request.setAttribute("contactos", contactos);
		request.getRequestDispatcher("crearCapacitacion.jsp").forward(request, response);
	}
}