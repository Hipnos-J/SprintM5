<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import="model.Capacitacion" %>
<%@ page import="java.util.List" %>

    <% if(request.getSession().getAttribute("nombreUsuario") == null) {
       request.getRequestDispatcher("login.jsp").forward(request, response);    
    }%>
    
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="../css/style.css">
	<title>Listado de capacitaciones</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" 
		integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
	</head>
<body>
	<div class="container">
		<header>
		<nav class="navbar navbar-expand-lg bg-body-tertiary">
		  <div class="container-fluid">
		    <div class="collapse navbar-collapse" id="navbarNav">
		      <ul class="navbar-nav">
		        <li class="nav-item">
		          <a class="nav-link active"  href="inicio.jsp">Inicio</a>
		        </li>
		         <li class="nav-item">
		          <a class="nav-link active"  href="login.jsp">Login</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link active" href="contacto.jsp">Contacto</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link active" href="crearCapacitacion.jsp">Crear capacitacion</a>
		        </li>
		         <li class="nav-item">
          		  <a class="nav-link active" href="crearUsuario.jsp">Crear Usuario</a>
        		</li>
		         <li class="nav-item">
		          <a class="nav-link disabled" aria-current="page" href="#">Listado de Capacitaciones</a>
		        </li>
		          <li class="nav-item">
				  <a class="nav-link active"  href="listarUsuarios.jsp">Listado de Usuarios</a>
				 </li>
		         <li class="nav-item">
				  <a class="nav-link active"  href="Login">Cerrar Sesion</a>
				 </li>
		      </ul>
		    </div>
		  </div>
		</nav>
		</header>
<main>
	<h1 class="mt-4">Listado de capacitaciones</h1>
	<table class="table table-striped mt-4">
	<thead>
		<tr>
			<th>Rut</th>
			<th>Dia</th>
			<th>Hora</th>
			<th>Lugar</th>
			<th>Duracion</th>
			<th>Comentario</th>
		</tr>
	</thead>
	<tbody>
		<% List<Capacitacion> capacitaciones = (List<Capacitacion>)request.getAttribute("capacitaciones"); %>
		<% if (capacitaciones != null ){ %>
		<% for (Capacitacion capacitacion : capacitaciones) {   %>
			<tr>
				<td><%= capacitacion.getIdCapacitacion() %></td> 
				<td><%= capacitacion.getRutCliente() %></td> 
				<td><%= capacitacion.getDia() %></td> 
				<td><%= capacitacion.getHora() %></td> 
				<td><%= capacitacion.getLugar() %></td> 
				<td><%= capacitacion.getDuracion() %></td> 
		
				<td>
					<a href="editarCapacitacion?rutCliente=<%= capacitacion.getRutCliente() %>" class="btn btn-primary btn-sm">Editar</a>
					<a href="eliminarCapacitacion?rutCliente=<%= capacitacion.getRutCliente() %>" class="btn btn-primary btn-sm">Eliminar</a>
				</td>
			</tr>
		<% } %>
		<% } %>
	</tbody>
	</table>
</main>
</div>
</body>
</html>