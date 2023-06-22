<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.Usuario" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Usuarios</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
	<link rel="stylesheet" href="css/style.css" />
	
</head>
<body>

	<div class="container">
	<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
   
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link disabled" aria-current="page" href="#">Inicio</a>
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
          <a class="nav-link disabled" href="crearUsuario.jsp">Crear Usuario</a>
        </li>
        <li class="nav-item">
		  <a class="nav-link active"  href="listarCapacitaciones.jsp">Listado de Capacitaciones</a>
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
        <h3 class="mt-4">CREAR  USUARIO</h3>
        <form method="post" action="CrearUsuario" class="mt-4">
        
            <div class="form-group">
                <label for="nombre">Nombre:</label>
                <input type="text" class="form-control" id="nombre" name="nombre" required>
            </div>

			<div class="form-group">
                <label for="apellido">Apellido:</label>
                <input type="text" class="form-control" id="apellido" name="apellido" required>
            </div>

            <div class="form-group">
                <label for="run">Run:</label>
                <input type="text" class="form-control" id="run" name="run" required>
            </div>
            
            <div class="form-group">
                <label for="fechaNacimiento">Fecha Nacimiento:</label>
                <input type="date" class="form-control" id="fechaNacimiento" name="fechaNacimiento" required>
            </div>

			<label for="tipoUsuario">Selecciona el tipo de Usuario:</label>
			
			<select class="form-select" aria-label="Seleccion Usuario" onchange="mostrarFormulario()" id="tipo" name="tipo">
				<option selected>Seleccionar</option>
				<option value="1">Cliente</option>
				<option value="2">Administrativo</option>
				<option value="3">Profesional</option>
			</select>
			
			<div id="formulario1" style="display: none;">
				<h3>Aquí va el formulario para datos adicionales del cliente</h3>
			</div>
			<div id="formulario2" style="display: none;">
				<h3>Aquí va el formulario para datos adicionales del administrativo</h3>
			</div>
			<div id="formulario3" style="display: none;">
				<h3>Aquí va el formulario para datos adicionales del profesional</h3>
			</div>
			
			<button type="submit" class="btn btn-info btn-lg">Crear</button>
        </form>
    </div>

	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
	<script type="text/javascript" src="js/js.js"></script>
</body>
</html>