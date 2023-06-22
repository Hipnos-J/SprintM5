package controller;

import java.time.LocalDate;
import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;
import model.Administrativo;
import model.Profesional;
import model.Usuario;
import dao.UsuarioDAO;

/**
 * Servlet implementation class CrearUsuario
 */
@WebServlet("/CrearUsuario")
public class CrearUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CrearUsuario() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuarioDAO usuarioDAO = UsuarioDAO.getInstancia();

		List<Usuario> usuarios = usuarioDAO.obtenerUsuarios();
		 request.setAttribute("usuarios", usuarios);
		 request.getRequestDispatcher("listarUsuarios.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String run = request.getParameter("run");
		LocalDate fechaNacimiento = LocalDate.parse(request.getParameter("fechaNacimiento"));
		int tipo =Integer.parseInt(request.getParameter("tipo"));
		
		switch (tipo) {
		case 1: { //request parametros tipo 1 (cliente)
			String direccion = request.getParameter("direccion");
			String comuna = request.getParameter("comuna");
			String telefono = request.getParameter("telefono");
			int edad = Integer.parseInt(request.getParameter("edad"));
			String afp = request.getParameter("afp");    
			int sistemaSalud = Integer.parseInt(request.getParameter("sistemaSalud"));
			
			Cliente cliente = new Cliente();
			cliente.setNombres(nombre);
			cliente.setApellidos(apellido);
			cliente.setRun(run);
			cliente.setFechaNacimiento(fechaNacimiento);
			cliente.setTipo(tipo);
			cliente.setDireccion(direccion);
			cliente.setComuna(comuna);
			cliente.setTelefono(telefono);
			cliente.setEdad(edad);
			cliente.setAfp(afp);
			cliente.setSistemaSalud(sistemaSalud);
			
			UsuarioDAO  usuarioDAO = UsuarioDAO.getInstancia();
			usuarioDAO.agregarUsuarioCliente(cliente);
			
			doGet(request,response);

		}
		case 2 :{ //request parametros tipo 2 (administrativo)
			String expPrevia = request.getParameter("expPrevia");
			String area = request.getParameter("area");
			
			Administrativo administrativo= new Administrativo();
			administrativo.setNombres(nombre);
			administrativo.setApellidos(apellido);
			administrativo.setRun(run);
			administrativo.setFechaNacimiento(fechaNacimiento);
			administrativo.setTipo(tipo);
			administrativo.setExpPrevia(expPrevia);
			administrativo.setArea(area);
			
			UsuarioDAO  usuarioDAO = UsuarioDAO.getInstancia();
			usuarioDAO.agregarUsuarioAdministrativo(administrativo); 
			
			doGet(request,response);

		}
		case 3 :{
			//request parametros tipo 3 (profesional)
			String titulo = request.getParameter("titulo");
			LocalDate fechaIngreso = LocalDate.parse(request.getParameter("fechaIngreso"));
			
			Profesional profesional= new Profesional();
			profesional.setNombres(nombre);
			profesional.setApellidos(apellido);
			profesional.setRun(run);
			profesional.setFechaNacimiento(fechaNacimiento);
			profesional.setTipo(tipo);
			profesional.setTitulo(titulo);
			profesional.setFechaIngreso(fechaIngreso);
			
			UsuarioDAO  usuarioDAO = UsuarioDAO.getInstancia();
			usuarioDAO.agregarUsuarioProfesional(profesional); 
			
			doGet(request,response);

			
		
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipo);
		}
		
	}

}
