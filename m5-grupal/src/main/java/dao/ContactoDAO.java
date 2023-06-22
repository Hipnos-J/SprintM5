package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Contacto;

public class ContactoDAO {
	private static ContactoDAO instancia;
	private Connection conexion;

	
	private ContactoDAO() {
        conexion = obtenerConexion();
	}

	public static ContactoDAO getInstancia() {
        if (instancia == null) {
            instancia = new ContactoDAO();
        }
        return instancia;
	}	
	

    // SOLO PARA TESTEAR CONEXIÓN A LA BD.
	
	// Métodos CRUD
    // [C]REATE - Se intenta insertar un nuevo registro en la tabla Capacitacion
    public void agregarContacto(Contacto contacto) {
        String consulta = "INSERT INTO contacto (nombre,apellido,correo,numCelular,comentario) VALUES (?,?,?,?,?);";

        try (
        		
        	PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, contacto.getNombre());
            statement.setString(2, contacto.getApellido());
            statement.setString(3, contacto.getCorreo());
            statement.setString(4, contacto.getNumCelular());
            statement.setString(5, contacto.getComentario());
            
            statement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // [R]EAD I - Se realiza un SELECT general o con condición de la tabla Capacitacion
    
    public List<Contacto> obtenerContactos() {
    	
        List<Contacto> contactos = new ArrayList<>();
        String consulta = "SELECT id,nombre,apellido,correo,numCelular,comentario FROM contacto";

        try {
        	 PreparedStatement statement = conexion.prepareStatement(consulta);
             ResultSet resultSet = statement.executeQuery();
             

            while (resultSet.next()) {
            	Contacto contacto = new Contacto();
            	
            	
            	contacto.setNombre(resultSet.getString("nombre"));
            	contacto.setApellido(resultSet.getString("apellido"));
            	contacto.setCorreo(resultSet.getString("correo"));
            	contacto.setNumCelular(resultSet.getString("numCelular"));
            	contacto.setComentario(resultSet.getString("comentario"));
            	contactos.add(contacto);
            	System.out.println("**Peticiones de usuarios ** \n"
            			+ "Nombre = "+ contacto.getNombre()+" \n"
            			+ "Apellido = "+ contacto.getApellido()+" \n"
            			+ "Correo = " + contacto.getCorreo()+" \n"
            			+ "Numero de celular = "+ contacto.getNumCelular()+" \n"
            			+ "Comentario = "+ contacto.getComentario()+" \n"
            			+ "*******************************************");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return contactos;
    }


    // [D]ELETE - Se intenta eliminar un registro por condicion
    
    public void eliminarCapacitacion(int id) {
        String consulta = "DELETE FROM capacitacion WHERE idCapacitacion = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // SE CREA UNA CONEXIÓN
    
    private Connection obtenerConexion() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/ejercitar";
            String usuario = "root";
            String password = "kizuke2381";
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexion;
    }
}