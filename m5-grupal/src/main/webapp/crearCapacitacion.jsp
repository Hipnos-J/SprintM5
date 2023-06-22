<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% if(request.getSession().getAttribute("nombreUsuario") == null) {
       request.getRequestDispatcher("login.jsp").forward(request, response);    
    }
	%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="css/style.css">
	<title>Capacitacion</title>
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
          <a class="nav-link disabled" aria-current="page" href="#">Crear capacitacion</a>
        </li>
         <li class="nav-item">
          <a class="nav-link active" href="crearUsuario.jsp">Crear Usuario</a>
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
</header>
 	<main>
		<form action="CrearCapacitacion" method="POST">
		<h1>INGRESE LOS DATOS CORRESPONDIENTES :</h1>
		 <div class="form-group">
                <label for="rut">Rut:</label>
                <input type="text" class="form-control" id="rut" name="rut" required>
        </div>
        <div class="form-group">
                <label for="apellido">Dia:</label>
                <input type="date" class="form-control" id="dia" name="dia" required>
       	</div>
        <div class="form-group">
                <label for="hora">Hora:</label>
                <input type="date" class="form-control" id="hora" name="hora" required>
       	</div>
        <div class="form-group">
                <label for="lugar">Lugar:</label>
                <input type="text" class="form-control" id="lugar" name="lugar" required>
       	</div>
        <div class="form-group">
                <label for="duracion">Duracion:</label>
                <input type="text" class="form-control" id="duracion" name="duracion" required>
       	</div>
        <div class="form-group">
                <label for="cantidad">Cantidad:</label>
                <input type="text" class="form-control" id="cantidad" name="cantidad" required>
       	</div>
		
		<button TYPE="SUBMIT" class="btn btn-info btn-lg" NAME="botonEnviar" VALUE="Enviar">Enviar </button>
		<button type="reset" class="btn btn-info btn-lg" NAME="botonLimpiar" VALUE="Limpiar">Limpiar</button>
		
		 </form>
		 
	</main>
</div>
	<footer>
		<p>Grupo sala 02 - 2023 </p>
	</footer>
</body>
</html>