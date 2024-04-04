package dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.time.LocalDate;

import modelo.CCDTyE;
import modelo.Fuerzas;

public class CCDTyEDAO {

	public boolean agregarCentro (CCDTyE centro) {
		Connection conn = null;
		int filasAfectadas = 0;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			PreparedStatement pStmt = conn.prepareStatement("INSERT INTO `ccdtye` (`ubicacion_ccdtye`, `nombre`, `fecha_inicio`, `fecha_fin`) VALUES (?,?,?,?)");
			pStmt.setString(1, centro.getUbicacion());
			pStmt.setString(2, centro.getNombre_centro());
			pStmt.setString(3, centro.getFecha_inicio().toString());
			pStmt.setString(4, centro.getFecha_fin().toString());
			filasAfectadas = pStmt.executeUpdate();
			
			agregarFuerzas(centro);
			
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
		return filasAfectadas == 1;
	}
	
	public boolean agregarFuerzas(CCDTyE centro) {
		Connection conn = null;
		int filasAfectas = 0;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			FuerzasDAO fDao = new FuerzasDAO();
			for (String c: centro.getFuerzasEnControl()) {
				PreparedStatement pStmt2 = conn.prepareStatement("INSERT INTO `ccdtye_fuerza` (`idccdtye`, `idfuerzas`) VALUES (?,?)");
				pStmt2.setInt(1, conseguirIDCentro(centro.getUbicacion()));
				pStmt2.setInt(2, fDao.conseguirIDFuerzas(c));
				filasAfectas = pStmt2.executeUpdate();
			}

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

	public boolean eliminarCentrosFuerzas(String ubicacion) {
		Connection conn = null;
		int filasAfectas = 0;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			PreparedStatement pStmt = conn.prepareStatement("DELETE FROM `ccdtye_fuerza` WHERE `idccdtye` = ?");
			pStmt.setInt(1, conseguirIDCentro(ubicacion));
			filasAfectas = pStmt.executeUpdate();	
			System.out.println("filas afectadas:"+filasAfectas);
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
	
	public boolean modificarCentro (CCDTyE centro, String ubicacionOriginal) {
		Connection conn = null;
		int filasAfectadas = 0;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			PreparedStatement pStmt = conn.prepareStatement("UPDATE `ccdtye` SET `nombre` = ?, `fecha_inicio` = ?, `fecha_fin` = ? WHERE `ubicacion_ccdtye` = ?;");
			pStmt.setString(1, centro.getNombre_centro());
			pStmt.setString(2, centro.getFecha_inicio().toString());
			pStmt.setString(3, centro.getFecha_fin().toString());
			pStmt.setString(4, ubicacionOriginal);
			
			filasAfectadas = pStmt.executeUpdate();
			
			eliminarCentrosFuerzas(ubicacionOriginal);
			agregarFuerzas(centro);

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
		return filasAfectadas == 1;
	}
	
	
	
	public boolean eliminarCentro (String ubicacion) {
		Connection conn = null;
		int filasAfectadas = 0;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			eliminarCentrosFuerzas(ubicacion);
			PreparedStatement pStmt = conn.prepareStatement("DELETE FROM `ccdtye` WHERE `idccdtye` = ?;");
			int idCcdtye = conseguirIDCentro(ubicacion);
			pStmt.setInt(1, idCcdtye);

			filasAfectadas = pStmt.executeUpdate();
			
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
		return filasAfectadas == 1;
	}
			
			
			public ArrayList<CCDTyE> traerTodos() {
				ArrayList<CCDTyE> centros = new ArrayList<CCDTyE>();
				Connection conn = null;
				try {
					conn = DriverManager.getConnection(url(), usuario(), contrasenia());
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM ccdtye");

					while (rs.next()) {
						String ubicacion = rs.getString("ubicacion_ccdtye");
						String nombre = rs.getString("nombre");
						LocalDate fecha_in = LocalDate.parse(rs.getString("fecha_inicio"));
						LocalDate fecha_fin = LocalDate.parse(rs.getString("fecha_fin"));
						
						CCDTyE e = new CCDTyE();
						e.setUbicacion(ubicacion);
						e.setNombre_centro(nombre);
						e.setFecha_inicio(fecha_in);
						e.setFecha_fin(fecha_fin);
				
						agregarFuerzasAUnCentro(e);
						centros.add(e);
			
						
						
					}
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

		return centros;
	}
			
	public void agregarFuerzasAUnCentro(CCDTyE e) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			PreparedStatement pStmt = conn.prepareStatement("SELECT `ccdtye_fuerza`.`idfuerzas` FROM `bd_tpfinal`.`ccdtye_fuerza` where `ccdtye_fuerza`.`idccdtye` = ?;");
			int idCentro = conseguirIDCentro(e.getUbicacion());
			pStmt.setInt(1, idCentro);
			System.out.println("idcentro:" + idCentro);
			ResultSet rs2 = pStmt.executeQuery();
			while (rs2.next()) {
				int idFuerza = rs2.getInt(1);
				PreparedStatement pStmtDos = conn.prepareStatement("SELECT  `fuerzas`.`nombreFuerza` FROM `bd_tpfinal`.`fuerzas` where `fuerzas`.`idfuerzas` = ?;");
				pStmtDos.setInt(1, idFuerza);
				ResultSet rsFuerzas = pStmtDos.executeQuery();
				while(rsFuerzas.next()) {
					String fuerzaDelCentro = rsFuerzas.getString(1);
					e.añadirFuerza(fuerzaDelCentro);
				}
			}

		} catch (SQLException ae) {
			ae.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException aae) {
					aae.printStackTrace();
				}
			}
		}
		
		
		
	}
			
			
			public int conseguirIDCentro(String ubicacionCentro) {
				Connection conn = null;
				int id = -1;
				try {
					conn = DriverManager.getConnection(url(),usuario(),contrasenia());
					PreparedStatement pStmt = conn.prepareStatement("SELECT `ccdtye`.`idccdtye` FROM `bd_tpfinal`.`ccdtye` where `ccdtye`.`ubicacion_ccdtye` = ?");
					pStmt.setString(1, ubicacionCentro);
					ResultSet rs = pStmt.executeQuery();
					while (rs.next()) {
						
						id = rs.getInt("idccdtye");
						System.out.println("sys: " + rs.getInt("idccdtye"));
					}
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
				System.out.println(ubicacionCentro);
				System.out.println(id);
				return id;
			}
			
			public CCDTyE traerCentroPorId(int id) {

		        Connection conn = null;
		        CCDTyE e = new CCDTyE();
		        try {
		            conn = DriverManager.getConnection(url(), usuario(), contrasenia());
		            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM ccdtye where idccdtye = ?");
		            stmt.setInt(1, id);
		            ResultSet rs = stmt.executeQuery();
		            while (rs.next()) {
		                String ubicacion = rs.getString("ubicacion_ccdtye");
		                String nombre = rs.getString("nombre");
		                LocalDate fecha_in = LocalDate.parse(rs.getString("fecha_inicio"));
		                LocalDate fecha_fin = LocalDate.parse(rs.getString("fecha_fin"));

		                e.setUbicacion(ubicacion);
		                e.setNombre_centro(nombre);
		                e.setFecha_inicio(fecha_in);
		                e.setFecha_fin(fecha_fin);
		                agregarFuerzasAUnCentro(e);
		                System.out.println("centro obtenido ubicaion: " + e.getUbicacion());
		            }
		        } catch (SQLException ae) {
		            ae.printStackTrace();
		        } finally {
		            if (conn != null) {
		                try {
		                    conn.close();
		                } catch (SQLException ae) {
		                    ae.printStackTrace();
		                }
		            }
		        }

		        return e;
		    }
			
			public boolean desvincularFuerzasDelCentro(CCDTyE c, Fuerzas f) {
		        Connection conn = null;
		        FuerzasDAO fDAO = new FuerzasDAO();
		        int filasAfectadas = 0;
		        try {
		            conn = DriverManager.getConnection(url(), usuario(), contrasenia());
		            PreparedStatement pStmt = conn.prepareStatement("DELETE FROM ccdtye_fuerza WHERE idccdtye = ?, idfuerzas = ? ;");
		            int idCentro = conseguirIDCentro(c.getUbicacion());
		            int idFuerza = fDAO.conseguirIDFuerzas(f.getNombre());
		            pStmt.setInt(1, idCentro);
		            pStmt.setInt(2, idFuerza);
		            pStmt.executeUpdate();
		            c.getFuerzasEnControl().remove(f.getNombre());

		        } 
		        catch (SQLException ae) {
		            ae.printStackTrace();
		        } finally {
		            if (conn != null) {
		                try {
		                    conn.close();
		                } catch (SQLException e) {
		                    e.printStackTrace();
		                }
		            }
		        }
		        return filasAfectadas == 1;
		    }

	
	private String url() {
		String url = "jdbc:mysql://localhost:3306/bd_tpfinal";
		return url;
	}
	private String usuario() {
		String usuario = "root";
		return usuario;
	}
	private String contrasenia() {
		String contrasenia = "admin";
		return contrasenia;
	}
}
