function mostrarFormularios (){
    var tipo = document.getElementById('tipo').value;
    var formulario1 = document.getElementById('formulario1').value;
    var formulario2 = document.getElementById('formulario2').value;
    var formulario3 = document.getElementById('formulario3').value;
    
    switch(tipo){
		
		case 1 :
		formulario1.style.display ="block";
		break;
		
		case 2 :
		formulario2.style.display = "block";
		break;
		
		case 3 :
		formulario3.style.display = "block";
		break;
		default:
			break;
	
	}
}
   