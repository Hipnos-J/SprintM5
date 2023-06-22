package controller;

import java.io.IOException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CapacitacionDAO;
import model.Capacitacion;

/**
 * Servlet implementation class CrearCapacitacion
 */
@WebServlet("/CrearCapacitacion")
public class CrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("crearCapacitacion.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String rut = request.getParameter("rut");
		String dia = request.getParameter("dia");
		String hora = request.getParameter("hora");
		String lugar = request.getParameter("lugar");
		String duracion = request.getParameter("duracion"); 
		int cantidad = Integer.parseInt(request.getParameter("cantidad"));
		
		Capacitacion capacitacion= new Capacitacion();
		capacitacion.setRutCliente(rut);
		capacitacion.setDia(dia);
		capacitacion.setDia(hora);
		capacitacion.setLugar(lugar);
		capacitacion.setDuracion(duracion);
		capacitacion.setCantAsistentes(cantidad);
		
		CapacitacionDAO capacitacionDAO = CapacitacionDAO.getInstancia();
		capacitacionDAO.agregarCapacitacion(capacitacion);
		
		request.setAttribute("capacitacion", capacitacion);
		request.getRequestDispatcher("listarCapacitaciones.jsp").forward(request, response);;
		}

}
