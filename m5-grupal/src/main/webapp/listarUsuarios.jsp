<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.Usuario" %>
<%@ page import="model.Administrativo" %>
<%@ page import="model.Cliente" %>
<%@ page import="model.Profesional" %>
<%@ page import="java.util.List" %>
    
     <% if(request.getSession().getAttribute("nombreUsuario") == null) {
       request.getRequestDispatcher("login.jsp").forward(request, response);    
    }%>
    
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" 
		integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
		          <a class="nav-link active" aria-current="page" href="listarCapacitaciones.jsp">Listado de Capacitaciones</a>
		        </li>
		          <li class="nav-item">
				  <a class="nav-link disabled"  href="listarUsuarios.jsp">Listado de Usuarios</a>
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
	<h1 class="mt-5">Listado de Usuarios</h1>
	<table class="table table-striped mt-5">
	<thead>
		<tr>
			<th>ID</th>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>RUN</th>
			<th>Fecha Nacimiento</th>
			<th>Tipo</th>
			<th>Direccion</th>
			<th>Comuna</th>
			<th>Telefono</th>
			<th>Edad</th>
			<th>AFP</th>
			<th>Sistema de salud</th>
			<th>Exp. Previa</th>
			<th>Area</th>
			<th>Titulo</th>
			<th>Fecha de Ingreso</th>
		</tr>
	</thead>
	<tbody>
	
		<% List<Usuario> usuarios = (List<Usuario>)request.getAttribute("usuarios"); %>
		<% if (usuarios != null ){ %>
		<% for (Usuario usuario : usuarios) {   %>
			<tr>
				<td><%= usuario.getId() %></td> 
				<td><%= usuario.getNombres() %></td> 
				<td><%= usuario.getApellidos() %></td> 
				<td><%= usuario.getRun() %></td> 
				<td><%= usuario.getFechaNacimiento()%></td> 
				<td><%= usuario.getTipo() %></td> 
					<a href="editarCapacitacion?rutCliente=<%= usuario.getId() %>" class="btn btn-primary btn-sm">Editar</a>
					<a href="eliminarCapacitacion?rutCliente=<%= usuario.getId() %>" class="btn btn-primary btn-sm">Eliminar</a>
			</tr>
		<% } %>
		<% } %>
	
	</tbody>
	</table>
</main>
</div>
</body>
</html>
