package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


import model.Usuario;
import model.Cliente;
import model.Administrativo;
import model.Profesional;


public class UsuarioDAO {
	private static UsuarioDAO instancia;
	private Connection conexion;

	
	private UsuarioDAO() {
        conexion = obtenerConexion();
	}

	public static UsuarioDAO getInstancia() {
        if (instancia == null) {
            instancia = new UsuarioDAO();
        }
        return instancia;
	}	
	
	// Métodos CRUD
    // [C]REATE - Se intenta insertar un nuevo registro en la tabla Capacitacion
//    public void agregarUsuario(Usuario usuario) {
//        String consulta ="" ;
//
//        try {
//            
//            switch (usuario.getTipo()) {
//         
//            //tipo 1 (cliente)
//            case 1: {
//            	consulta="INSERT INTO usuario (nombre,apellido,run,fechaNacimiento,tipo) VALUES (?,?,?,?,?7);";
//            	PreparedStatement statement = conexion.prepareStatement(consulta);
//            	
//            	statement.setString(1, usuario.getNombres());
//            	statement.setString(2, usuario.getApellidos());
//            	statement.setString(3, usuario.getRun());
//            	statement.setObject(4, usuario.getFechaNacimiento());
//            	statement.setInt(5, Cliente.getTipo());
//				statement.executeUpdate();
//					}
//          //tipo 2 (administrativo)
//            case 2: {
//            	consulta="INSERT INTO usuario (nombre,apellido,run,fechaNacimiento,tipo,expPrevia,area) VALUES (?,?,?,?,?,?,?);";
//            	PreparedStatement statement = conexion.prepareStatement(consulta);
//            	
//            	statement.setString(1, usuario.getNombres());
//            	statement.setString(2, usuario.getApellidos());
//            	statement.setString(3, usuario.getRun());
//            	statement.setObject(4, usuario.getFechaNacimiento());
//            	statement.setInt(5, usuario.getTipo());
//            	statement.setInt(5, usuario.g());
//            	statement.setInt(5, usuario.getTipo());
//				statement.setString(0, consulta);;
//				statement.executeUpdate();
//					}
//          //tipo 3(profesional)
//            case 3: {
//            	consulta="INSERT INTO usuario (nombre,apellido,run,fechaNacimiento,tipo,) VALUES (?,?,?,?,?7);";
//            	PreparedStatement statement = conexion.prepareStatement(consulta);
//            	
//            	statement.setString(1, usuario.getNombres());
//            	statement.setString(2, usuario.getApellidos());
//            	statement.setString(3, usuario.getRun());
//            	statement.setObject(4, usuario.getFechaNacimiento());
//            	statement.setInt(5, usuario.getTipo());
//				statement.setString(0, consulta);;
//				statement.executeUpdate();
//					}
//			default:
//				throw new IllegalArgumentException("Unexpected value: " + usuario.getTipo());
//			}
//            
//            
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
	
	public void agregarUsuarioCliente(Cliente cliente) {
        

        try {
        	String consulta="INSERT INTO usuario (nombre,apellido,run,fechaNacimiento,tipo,direccion,comuna,telefono,edad,afp,sistemaSalud) VALUES (?,?,?,?,?,?,?,?,?,?,?);";
            	PreparedStatement statement = conexion.prepareStatement(consulta);
            	
            	statement.setString(1, cliente.getNombres());
            	statement.setString(2, cliente.getApellidos());
            	statement.setString(3, cliente.getRun());
            	statement.setObject(4, cliente.getFechaNacimiento());
            	statement.setInt(5, cliente.getTipo());
            	statement.setString(6, cliente.getDireccion());
            	statement.setString(7, cliente.getComuna());
            	statement.setString(8, cliente.getTelefono());
            	statement.setInt(9, cliente.getEdad());
            	statement.setString(10, cliente.getAfp());
            	statement.setInt(11, cliente.getSistemaSalud());
            	
				statement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        	}
    }
	public void agregarUsuarioAdministrativo(Administrativo administrativo) {
        

        try {
        	String consulta="INSERT INTO usuario (nombre,apellido,run,fechaNacimiento,tipo,expPrevia,area) VALUES (?,?,?,?,?,?,?);";
            	PreparedStatement statement = conexion.prepareStatement(consulta);
            	
            	statement.setString(1, administrativo.getNombres());
            	statement.setString(2, administrativo.getApellidos());
            	statement.setString(3, administrativo.getRun());
            	statement.setObject(4, administrativo.getFechaNacimiento());
            	statement.setInt(5, administrativo.getTipo());
            	statement.setString(6, administrativo.getExpPrevia());
            	statement.setString(7, administrativo.getArea());
            	
				statement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        	}
    }
	public void agregarUsuarioProfesional(Profesional profesional) {

        try {
        	String consulta="INSERT INTO usuario (nombre,apellido,run,fechaNacimiento,tipo,titulo, fechaIngreso) VALUES (?,?,?,?,?,?,?);";
            	PreparedStatement statement = conexion.prepareStatement(consulta);
            	
            	statement.setString(1, profesional.getNombres());
            	statement.setString(2, profesional.getApellidos());
            	statement.setString(3, profesional.getRun());
            	statement.setObject(4, profesional.getFechaNacimiento());
            	statement.setInt(5, profesional.getTipo());
            	statement.setString(6, profesional.getTitulo());
            	statement.setObject(7, profesional.getFechaIngreso());
            	
				statement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        	}
    }
    // [R]EAD I - Se realiza un SELECT general 
    public List<Usuario> obtenerUsuarios() {
    	
        List<Usuario> usuarios = new ArrayList<>();
        String consulta = "SELECT id,nombre,apellido,run,fechaNacimiento,tipo FROM usuario ";

        try {
        	 PreparedStatement statement = conexion.prepareStatement(consulta);
             ResultSet resultSet = statement.executeQuery();
             

            while (resultSet.next()) {
            	Usuario usuario = new Usuario();
            	usuario.setId(resultSet.getInt("id"));
            	usuario.setNombres(resultSet.getString("nombre"));
            	usuario.setApellidos(resultSet.getString("apellido"));
            	usuario.setRun(resultSet.getString("run"));
            	
            	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate localDate = LocalDate.parse(resultSet.getString("fechaNacimiento"), formatter);
            	
            	usuario.setFechaNacimiento(localDate);
            	usuario.setTipo(resultSet.getInt("tipo"));
            	usuarios.add(usuario);
            	System.out.println(usuarios.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    // [U]PDATE - Se intenta realizar la actualización de un registro
    public void actualizarUsuario(Usuario usuario) {
        String consulta = "UPDATE usuario SET nombre = ?, apellido = ? , run = ?, fechaNacimiento = ?, tipo = ? WHERE run = ? ;";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
        	statement.setString(1, usuario.getNombres());
            statement.setString(2, usuario.getApellidos());
            statement.setString(3, usuario.getRun());
            statement.setObject(4, usuario.getFechaNacimiento());
            statement.setInt(5, usuario.getTipo());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // [D]ELETE - Se intenta eliminar un registro por condicion
    public void eliminarUsuario(int id) {
        String consulta = "DELETE FROM usuario WHERE idCapacitacion = ? ;";

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