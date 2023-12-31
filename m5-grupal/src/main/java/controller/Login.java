package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (request.getSession().getAttribute("nombreUsuario") == null) {
			request.getRequestDispatcher("login.jsp").forward(request, response); 
		}else {
			request.getSession().invalidate();
			request.getRequestDispatcher("inicio.jsp").forward(request, response); 
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombreUsuario = request.getParameter("nombre");
		String clave = request.getParameter("password");
		
		if(nombreUsuario.equals("admin") && clave.equals("1234")) {
			HttpSession sesion = request.getSession();
			sesion.setAttribute("nombreUsuario", nombreUsuario);
			sesion.setAttribute("clave", clave);
			request.getRequestDispatcher("contacto.jsp")
			.forward(request, response);
			}
		else {	
			request.getRequestDispatcher("login.jsp").forward(request, response);
			}
	}
}

