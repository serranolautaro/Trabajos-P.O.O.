package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.CCDTyE;
import modelo.NoIdentificados;
import modelo.Testigo;

public class NoIdentificadosDAO {

	public boolean agregarNoIdentificado(NoIdentificados noIdentificados) {
		Connection conn = null;
		int filasAfectadas = 0;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			PreparedStatement pStmt = conn.prepareStatement("INSERT INTO `detenidos_noidentificados` (`apodo`, `descripcion`) VALUES (?,?)");
			pStmt.setString(1, noIdentificados.getApodo());
			pStmt.setString(2, noIdentificados.getDescripcion());

			filasAfectadas = pStmt.executeUpdate();
			
			PreparedStatement pStmt2 = conn.prepareStatement("INSERT INTO `ccdtye_noidentificados` (`idCcdtye`, `idNoidentificados`) VALUES (?,?)");	
			for (CCDTyE c: noIdentificados.getCentrosEnLosQueEstuvo()) {
				CCDTyEDAO cd = new CCDTyEDAO();
				pStmt2.setInt(1, cd.conseguirIDCentro(c.getUbicacion()));
				pStmt2.setInt(2, conseguirIDDetenido(noIdentificados.getApodo()));
				filasAfectadas = pStmt2.executeUpdate();
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
		return filasAfectadas == 1;
	}
	
	public boolean modificarNoIdentificado(NoIdentificados noIdentificados, String apodoOriginal) {
		Connection conn = null;
		int filasAfectadas = 0;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			PreparedStatement pStmt = conn.prepareStatement("UPDATE `detenidos_noidentificados` SET`descripcion` = ? WHERE `apodo` = ?;");
			pStmt.setString(1, noIdentificados.getDescripcion());
			pStmt.setString(2, apodoOriginal);
			filasAfectadas = pStmt.executeUpdate();
			eliminarCentrosDelNoIdent(apodoOriginal);
            agregarCentrosNoIdent(noIdentificados);

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
	
	public boolean agregarTestigoAlNoIdentificado(NoIdentificados noidentificado, int dni_testigo) {
		Connection conn = null;
		int filasAfectadas = 0;
		Testigo t = new Testigo();
		TestigosDAO td = new TestigosDAO();
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			PreparedStatement pStmt = conn.prepareStatement("UPDATE  `detenidos_noidentificados` SET `idTestigo` = ? WHERE `apodo` = ?;");
			pStmt.setInt(1, td.conseguirIDTestigo(dni_testigo));
			pStmt.setString(2, noidentificado.getApodo());

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
		noidentificado.setTestigoDelDetenido(t);
		return filasAfectadas == 1;
	}
	
	public boolean eliminarNoIdentificado(String apodito) {
		Connection conn = null;
		int filasAfectadas = 0;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			eliminarCentrosDelNoIdent(apodito);
			PreparedStatement pStmt = conn.prepareStatement("DELETE FROM `detenidos_noidentificados` WHERE `apodo` = ?;");
			pStmt.setString(1, apodito);
			filasAfectadas = pStmt.executeUpdate();
			
			PreparedStatement pStmt2 = conn.prepareStatement("DELETE FROM `ccdtye_noidentificados` WHERE `idNoidentificados` = ?;");	
			pStmt2.setInt(1, conseguirIDDetenido(apodito));
			filasAfectadas = pStmt2.executeUpdate();
			

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
	
	public ArrayList<NoIdentificados> traerTodos() {
		ArrayList<NoIdentificados> noidentificados = new ArrayList<NoIdentificados>();
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM detenidos_noidentificados");

			while (rs.next()) {
				String apodo = rs.getString(2);
				String desc = rs.getString(3);
				
				NoIdentificados e = new NoIdentificados();
				e.setApodo(apodo);
				e.setDescripcion(desc);
				ArrayList<CCDTyE> centrosEnLosQueEstuvo = traerCentroDeUnIdentificado(e);
				e.setCentrosEnLosQueEstuvo(centrosEnLosQueEstuvo);
				noidentificados.add(e);
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
		return noidentificados;
	}
	
	public ArrayList<CCDTyE> traerCentroDeUnIdentificado(NoIdentificados noIdentificado) {
		ArrayList<CCDTyE> centrosDelNoIdentificado = new ArrayList<>();
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			PreparedStatement pStmt = conn.prepareStatement("SELECT * FROM ccdtye_noidentificados WHERE idNoidentificados = ?");
			int id = conseguirIDDetenido(noIdentificado.getApodo());
			pStmt.setInt(1, id);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				int idCentro = rs.getInt("idCcdtye");
				CCDTyEDAO centrosDao = new CCDTyEDAO();
				CCDTyE centro = centrosDao.traerCentroPorId(idCentro);
				centrosDelNoIdentificado.add(centro);
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
		return centrosDelNoIdentificado;
	}
	
	public NoIdentificados buscarXApodo(String apodoBusqueda) {
		NoIdentificados noIdentificado = new NoIdentificados();
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			PreparedStatement pStmt = conn.prepareStatement("SELECT * FROM detenidos_identificados WHERE `apodo` = ?;");
			pStmt.setString(1,apodoBusqueda);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				String apodo = rs.getString(1);
				String descripcion = rs.getString(2);
				
				NoIdentificados noI = new NoIdentificados();
				noI.setApodo(apodo);
				noI.setDescripcion(descripcion);
				
				noIdentificado = noI;
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
		return noIdentificado;
	}
	
	
	public int conseguirIDDetenido(String apodoDetenido) {
		Connection conn = null;
		int id=-1;
		try {
			conn = DriverManager.getConnection(url(),usuario(),contrasenia());
			PreparedStatement pStmt = conn.prepareStatement("SELECT idNoIdentificados FROM detenidos_noidentificados where apodo = ?");
			pStmt.setString(1, apodoDetenido);
			ResultSet rs = pStmt.executeQuery();
			
			while (rs.next()) {
				id = rs.getInt("idNoIdentificados");
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
		
		return id;
	}
	public int conseguirIDTestigoDeUnDetenido(String apodoDetenido) {
		Connection conn = null;
		int id=-1;
		try {
			conn = DriverManager.getConnection(url(),usuario(),contrasenia());
			PreparedStatement pStmt = conn.prepareStatement("SELECT idTestigo FROM detenidos_noidentificados where apodo = ?");
			pStmt.setString(1, apodoDetenido);
			ResultSet rs = pStmt.executeQuery();
			
			while (rs.next()) {
				id = rs.getInt("idTestigo");
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
		
		return id;
	}
	public boolean agregarCentroAlNoIdentificado (NoIdentificados noident, CCDTyE c) {
        Connection conn = null;
        CCDTyEDAO cDAO = new CCDTyEDAO();
        int filasAfectadas = 0;
        try {
            conn = DriverManager.getConnection(url(), usuario(), contrasenia());
            PreparedStatement pStmt = conn.prepareStatement("INSERT INTO ccdtye_noidentificados (idNoidentificados, idCcdtye) VALUES (?,?);");
            int idNoIdentificado = conseguirIDDetenido(noident.getApodo());
            int idCentro = cDAO.conseguirIDCentro(c.getUbicacion());
            pStmt.setInt(1, idNoIdentificado);
            pStmt.setInt(2, idCentro);
            noident.añadirCentro(c);
            pStmt.executeUpdate();

        } catch (SQLException ae) {
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
	
	public boolean desvincularCentroDelNoIdentificado(NoIdentificados noident, CCDTyE c) {
        Connection conn = null;
        CCDTyEDAO cDAO = new CCDTyEDAO();
        int filasAfectadas = 0;
        try {
            conn = DriverManager.getConnection(url(), usuario(), contrasenia());
            PreparedStatement pStmt = conn.prepareStatement("DELETE FROM `bd_tpfinal`.`ccdtye_noidentificados`WHERE bd_tpfinal.ccdtye_noidentificados.idCcdtye= ? and bd_tpfinal.ccdtye_noidentificados.idNoidentificados=?;");
            int idNoIdentificado = conseguirIDDetenido(noident.getApodo());
            int idCentro = cDAO.conseguirIDCentro(c.getUbicacion());
            pStmt.setInt(1, idCentro);
            pStmt.setInt(2, idNoIdentificado);
            System.out.println(pStmt.toString());
            pStmt.executeUpdate();
            
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
	
	public boolean eliminarCentrosDelNoIdent(String apodo) {
        Connection conn = null;
        int filasAfectas = 0;
        try {
            conn = DriverManager.getConnection(url(), usuario(), contrasenia());
            PreparedStatement pStmt2 = conn.prepareStatement("DELETE FROM ccdtye_noidentificados WHERE idNoidentificados = ?;");
            pStmt2.setInt(1, conseguirIDDetenido(apodo));
            filasAfectas = pStmt2.executeUpdate();

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

    public boolean agregarCentrosNoIdent(NoIdentificados noIdent) {
        Connection conn = null;
        int filasAfectas = 0;
        try {
            conn = DriverManager.getConnection(url(), usuario(), contrasenia());
            PreparedStatement pStmt2 = conn.prepareStatement("INSERT INTO ccdtye_noidentificados (idCcdtye, idNoidentificados) VALUES (?,?)");
            CCDTyEDAO cdao = new CCDTyEDAO();
            for (CCDTyE c: noIdent.getCentrosEnLosQueEstuvo()) {
                pStmt2.setInt(1, cdao.conseguirIDCentro(c.getUbicacion()));
                pStmt2.setInt(2, conseguirIDDetenido(noIdent.getApodo()));
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
