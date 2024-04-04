import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ConexionBD {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/1";
		String usuario = "root";
		String contrasenia = "admin";
		Connection conn;
		try {
			conn = DriverManager.getConnection(url, usuario, contrasenia);
			/*
			Statement statement = conn.createStatement();
			int i = statement.executeUpdate("INSERT INTO `mitabla` (`descripcion`, `numeral`) VALUES ('viri', 456)");
			System.out.println(i);
			PreparedStatement prepareStatement = conn.prepareStatement(
					"INSERT INTO `alumnos` (`idAlumnos`, `Nombre`, `Apellido`, `Edad`) VALUES (?, ?, ?, ?)");
			prepareStatement.setInt(1, 3);
			prepareStatement.setString(2, "Jaz");
			prepareStatement.setString(3, "Valente");
			prepareStatement.setInt(4, 17);
			int i = prepareStatement.executeUpdate();
			System.out.println(i);
		
		//update(url, usuario, contrasenia);
		// UPDATE
		
		//delete(url, usuario, contrasenia);
		// DELETE
		 * 
		
		PreparedStatement select = conn.prepareStatement("SELECT IdAlumnos, Nombre, Apellido, Edad FROM alumnos");
		ResultSet rs = select.executeQuery();
		while(rs.next() == true) {
			int id = rs.getInt(1);
			String nombre = rs.getString("Nombre");
			String apellido = rs.getString("Apellido");
			int edad = rs.getInt(4);
			
			System.out.println("ID: " + id + " |Nombre:" + nombre + " |Apellido: " + apellido + " |Edad: " + edad);
		}
		
		} catch (SQLException e) {
			System.out.println("No pude");
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void select(String url, String usuario, String contrasenia) {
		
	}

	public static void update(String url, String usuario, String contrasenia) {
		Connection conexion;
		try {
			conexion = DriverManager.getConnection(url, usuario, contrasenia);
			System.out.println("Si");

			PreparedStatement preparedStatement = conexion.prepareStatement("UPDATE `alumnos` SET `Nombre` = (?) WHERE `Apellido` = 'Mazza'");
			preparedStatement.setString(1, "Alejandro");
			int i = preparedStatement.executeUpdate();
			System.out.println(i);

		} catch (SQLException e) {
			System.out.println("No pude");
			e.printStackTrace();
			
		}
	}
	
	public static void delete(String url, String usuario, String contrasenia) {
		Connection conexion;
		try {
			conexion = DriverManager.getConnection(url, usuario, contrasenia);
			System.out.println("Si");

			PreparedStatement preparedStatement = conexion.prepareStatement("DELETE from `alumnos` WHERE `Apellido` = 'Mazza'");
			int i = preparedStatement.executeUpdate();
			System.out.println(i);

		} catch (SQLException e) {
			System.out.println("No pude");
			e.printStackTrace();
			
		}
		*/
	}

}
