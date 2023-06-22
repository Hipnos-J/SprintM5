package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CapacitacionDAO;
import model.Capacitacion;

/**
 * Servlet implementation class ListarCapacitaciones
 */
@WebServlet("/ListarCapacitaciones")
public class ListarCapacitaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCapacitaciones() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CapacitacionDAO capacitacionDAO = CapacitacionDAO.getInstancia();
	     
	     List<Capacitacion> capacitaciones = capacitacionDAO.obtenerCapacitaciones();
	     
	     request.setAttribute("capacitaciones", capacitaciones);
	     request.getRequestDispatcher("listarUsuarios.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
