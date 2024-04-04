import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.Statement;

public class EstudianteDAO {
	
	public boolean guardarEstudiante(Estudiante estudiante)
	{
		String url = "jdbc:mysql://localhost:3306/estudiantebd";
		String usuario = "root";
		String contrasenia = "admin";
		Connection conn = null;
		int filasAfectas = 0;
		try {
			conn = DriverManager.getConnection(url, usuario, contrasenia);
			PreparedStatement pStmt = conn.prepareStatement("INSERT INTO `estudiantes` (`nombre`, `legajo`) VALUES (?,?)");
			pStmt.setString(1, estudiante.getNombre());
			pStmt.setInt(2, estudiante.getLegajo());

			filasAfectas = pStmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return filasAfectas == 1;
	}
	
	public ArrayList<Estudiante> traerTodos() {
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		String url = "jdbc:mysql://localhost:3306/estudiantebd";
		String usuario = "root";
		String contrasenia = "admin";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, usuario, contrasenia);
			//Statement stmt = conn.createStatement();

			//ResultSet rs = stmt.executeQuery("SELECT nombre, legajo FROM estudiante");

			//while (rs.next()) {
				//String nombre = rs.getString(1);
				//int legajo = rs.getInt(2);
				//Estudiante e = new Estudiante();
				//estudiantes.add(e);
			//}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return estudiantes;
	}
	

}
