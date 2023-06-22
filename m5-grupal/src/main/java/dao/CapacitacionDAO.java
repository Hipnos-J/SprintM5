package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Capacitacion;


public class CapacitacionDAO {
	private static CapacitacionDAO instancia;
	private Connection conexion;

	
	private CapacitacionDAO() {
        conexion = obtenerConexion();
	}

	public static CapacitacionDAO getInstancia() {
        if (instancia == null) {
            instancia = new CapacitacionDAO();
        }
        return instancia;
	}	
	

    // SOLO PARA TESTEAR CONEXIÓN A LA BD.
	
	// Métodos CRUD
    // [C]REATE - Se intenta insertar un nuevo registro en la tabla Capacitacion
    public void agregarCapacitacion(Capacitacion capacitacion) {
        String consulta = "INSERT INTO capacitacion (rutCliente,dia,hora,lugar,duracion,cantAsistentes) VALUES (?,?,?,?,?,?);";

        try (
        		
        	PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, capacitacion.getRutCliente());
            statement.setString(2, capacitacion.getDia());
            statement.setString(3, capacitacion.getHora());
            statement.setString(4, capacitacion.getLugar());
            statement.setString(5, capacitacion.getDuracion());
            statement.setInt(6, capacitacion.getCantAsistentes());
            
            statement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // [R]EAD I - Se realiza un SELECT general o con condición de la tabla Capacitacion
    
    public List<Capacitacion> obtenerCapacitaciones() {
    	
        List<Capacitacion> capacitaciones = new ArrayList<>();
        String consulta = "SELECT idAccidente, rutCliente, fechaAccidente, horaAccidente, lugarAccidente,origenAccidente, consecuenciaAccidente FROM capacitacion";

        try {
        	 PreparedStatement statement = conexion.prepareStatement(consulta);
             ResultSet resultSet = statement.executeQuery();
             

            while (resultSet.next()) {
            	Capacitacion capacitacion = new Capacitacion();
            	
                capacitacion.setIdCapacitacion(resultSet.getInt("idCapacitacion"));
            	capacitacion.setRutCliente(resultSet.getString("nombre"));
            	capacitacion.setDia(resultSet.getString("correo"));
            	capacitacion.setHora(resultSet.getString("correo"));
            	capacitacion.setLugar(resultSet.getString("correo"));
            	capacitacion.setDuracion(resultSet.getString("correo"));
            	capacitaciones.add(capacitacion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return capacitaciones;
    }

    // [R]EAD II - Intenta SELECT específico de la tabla Capacitacion
    
    public Capacitacion obtenerCapacitacionesPorId(int id) {
    	Capacitacion capacitacion = null;
        String consulta = "SELECT idAccidente, rutCliente, fechaAccidente, horaAccidente, lugarAccidente, "
        		+ " origenAccidente, consecuenciaAccidente FROM capacitacion WHERE id = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                	capacitacion = new Capacitacion();
                	capacitacion.setIdCapacitacion(resultSet.getInt("idCapacitacion"));
                	capacitacion.setRutCliente(resultSet.getString("rutCliente"));
                	capacitacion.setDia(resultSet.getString("dia"));
                	capacitacion.setHora(resultSet.getString("hora"));
                	capacitacion.setLugar(resultSet.getString("lugar"));
                	capacitacion.setDuracion(resultSet.getString("duracion"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return capacitacion;
    }

    // [U]PDATE - Se intenta realizar la actualización de un registro
    
    public void actualizarCapacitacion(Capacitacion capacitacion) {
        String consulta = "UPDATE capacitacion SET  rutCliente = ? , dia = ?, hora = ? ,lugar = ? , duracion = ? , cantAsistentes = ?  WHERE id = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, capacitacion.getRutCliente());
            statement.setString(2, capacitacion.getDia());
            statement.setString(3, capacitacion.getHora());
            statement.setString(4, capacitacion.getLugar());
            statement.setString(5, capacitacion.getDuracion());
            statement.setInt(6, capacitacion.getCantAsistentes());
            
            statement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
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