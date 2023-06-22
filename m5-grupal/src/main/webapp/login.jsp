<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Login</title>
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
		          <a class="nav-link disabled "  aria-current="page" href="login.jsp">Login</a>
		        </li>
		      </ul>
		    </div>
		  </div>
		</nav>
		</header>
 	<main>
		<form action="Login" method="POST">
		<h1>INGRESE LOS DATOS CORRESPONDIENTES :</h1>
		Rut <INPUT TYPE="TEXT" NAME="nombre" SIZE=15> <BR>
		Contraseña <INPUT TYPE="PASSWORD" NAME="password" SIZE=15> <BR>
		<INPUT TYPE="SUBMIT" NAME="botonEnviar" VALUE="Enviar">
		<INPUT TYPE="RESET" NAME="botonLimpiar" VALUE="Limpiar">
		 </form>
		 
	</main>
	</div>
</body>
</html>