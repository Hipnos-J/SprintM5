<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Contacto" %>
<%@ page import="java.util.List" %>
    
<% if(request.getSession().getAttribute("nombreUsuario") == null) {
       request.getRequestDispatcher("login.jsp").forward(request, response);    
    }
%>
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="css/style.css">
		<meta charset="UTF-8">
		<title>Contacto</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" 
		integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
	</head>
<body>
<div class ="container">
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
          <a class="nav-link disabled" aria-current="page" href="">Contacto</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" href="crearCapacitacion.jsp">Crear capacitacion</a>
        </li>
        <li class="nav-item">
   		  <a class="nav-link active" href="crearUsuario.jsp">Crear Usuario</a>
        </li>
        <li class="nav-item">
		  <a class="nav-link active"  href="listarCapacitaciones.jsp">Listado de Capacitaciones</a>
		 </li>
		  <li class="nav-item">
		  <a class="nav-link active"  href="Login">Cerrar Sesion</a>
		 </li>
		   <li class="nav-item">
		  <a class="nav-link active"  href="listarUsuarios.jsp">Listado de Usuarios</a>
		 </li>
		 
      </ul>
    </div>
  </div>
</nav>
</header>
	<main>
			<form action="ContactoServlet" method="POST">
			
			<div class="form-group">
                <label for="nombre">Nombre :</label>
                <input type="text" class="form-control" id="nombre" name="nombre" required>
      	   </div>
      	   <div class="form-group">
                <label for="apellido">Apellido :</label>
                <input type="text" class="form-control" id="apellido" name="apellido" required>
      	   </div>
      	   <div class="form-group">
                <label for="correo">Correo :</label>
                <input type="email" class="form-control" id="correo" name="correo" required>
      	   </div>
      	   <div class="form-group">
                <label for="numCelular">Numero de celular :</label>
                <input type="text" class="form-control" id="numCelular" name="numCelular" required>
      	   </div>
      	   <div class="form-group">
                <label for="comentario">Comentario :</label>
                <input type="text" class="form-control" id="comentario" name="comentario" required>
      	   </div>
			<button TYPE="SUBMIT" class="btn btn-info btn-lg" NAME="botonEnviar" VALUE="Enviar">Enviar </button>
			<button type="reset" class="btn btn-info btn-lg" NAME="botonLimpiar" VALUE="Limpiar">Limpiar</button>
			 </form>
	 </main>
	 
	 <footer>
		<p>Grupo sala 02 - 2023 </p>
	</footer>
</div>
</body>
</html>