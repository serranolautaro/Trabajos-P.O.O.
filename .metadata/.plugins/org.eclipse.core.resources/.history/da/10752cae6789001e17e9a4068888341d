package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import modelo.CCDTyE;
import modelo.Identificado;
import modelo.Testigo;
import modelo.Profesion;
import modelo.LugarDeDetencion;

public class IdentificadosDAO {

	public boolean agregarIdentificado(Identificado identificados) {
		Connection conn = null;
		int filasAfectadas = 0;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			PreparedStatement pStmt = conn.prepareStatement(
					"INSERT INTO `detenidos_identificados` (`dniDetenido`, `nombreDetenido`, `fechaUltimaVezVisto`, `biografia`, `materialAudiovisual` ) VALUES (?,?,?,?,?)");
			pStmt.setInt(1, identificados.getDniDetenido());
			pStmt.setString(2, identificados.getNombreDetenido());
			String f_ultimaVezVisto = identificados.getFechaUltimaVezVisto().toString();
			pStmt.setString(3, f_ultimaVezVisto);
			pStmt.setString(4, identificados.getBiografia());
			pStmt.setString(5, identificados.getMaterialAudiovisual());

			filasAfectadas = pStmt.executeUpdate();

			PreparedStatement pStmt2 = conn
					.prepareStatement("INSERT INTO `ccdtye_identificados` (`id_ccdtye`, `id_detenido`) VALUES (?,?)");
			for (CCDTyE c : identificados.getCentrosEnLosQueEstuvo()) {
				CCDTyEDAO cd = new CCDTyEDAO();
				pStmt2.setInt(1, cd.conseguirIDCentro(c.getUbicacion()));
				pStmt2.setInt(2, conseguirIDDetenido(identificados.getDniDetenido()));
				filasAfectadas = pStmt2.executeUpdate();
			}
			agregarProfesionAlIdentificado(identificados);
			agregarLugarAlIdentificado(identificados);

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

	public boolean agregarTestigoAlIdentificado(Identificado identificado, int dni_testigo) {
		Connection conn = null;
		int filasAfectadas = 0;														//:V
		Testigo t = new Testigo();
		TestigosDAO td = new TestigosDAO();
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			PreparedStatement pStmt = conn
					.prepareStatement("UPDATE  `detenidos_identificados` SET `idTestigos` = ? WHERE `dniDetenido` = ?");
			pStmt.setInt(1, td.conseguirIDTestigo(dni_testigo));
			pStmt.setInt(2, identificado.getDniDetenido());

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
		identificado.setTestigoDelDetenido(t);
		return filasAfectadas == 1;
	}

	public boolean agregarProfesionAlIdentificado(Identificado identificado) {
		Connection conn = null;
		int filasAfectadas = 0;
		Profesion p = new Profesion();
		ProfesionesDAO pd = new ProfesionesDAO();
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			PreparedStatement pStmt = conn.prepareStatement(
					"UPDATE  `detenidos_identificados` SET `idProfesiones` = ? WHERE `dniDetenido` = ?");
			if(identificado.getProfesionDetenido() != null) {
				pStmt.setInt(1, pd.conseguirIDProfesiones(identificado.getProfesionDetenido().getNombre()));
				pStmt.setInt(2, identificado.getDniDetenido());
				filasAfectadas = pStmt.executeUpdate();
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

	public boolean agregarLugarAlIdentificado(Identificado identificado) {
		Connection conn = null;
		int filasAfectadas = 0;
		LugarDeDetencion ld = new LugarDeDetencion();
		LugaresDeDetencionDAO ldd = new LugaresDeDetencionDAO();
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			PreparedStatement pStmt = conn.prepareStatement(
					"UPDATE  `detenidos_identificados` SET `idLugares` = ? WHERE `dniDetenido` = ?");
			if(identificado.getLugarDetenido() != null) {
				pStmt.setInt(1, ldd.conseguirIDLugaresDeDetencion(identificado.getLugarDetenido().getNombreLugar()));
				pStmt.setInt(2, identificado.getDniDetenido());

				filasAfectadas = pStmt.executeUpdate();
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

	public boolean modificarIdentificado(Identificado identificados, int dniOriginal) {
		Connection conn = null;
		int filasAfectadas = 0;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			PreparedStatement pStmt = conn.prepareStatement(
					"UPDATE `detenidos_identificados` SET `nombreDetenido` = ?, `fechaUltimaVezVisto` = ?, `biografia` = ?, `materialAudiovisual` = ?  WHERE `dniDetenido` = ?;");
			pStmt.setString(1, identificados.getNombreDetenido());
			String f_ultimaVezVisto = identificados.getFechaUltimaVezVisto().toString();
			pStmt.setString(2, f_ultimaVezVisto);
			pStmt.setString(3, identificados.getBiografia());
			pStmt.setString(4, identificados.getMaterialAudiovisual());
			pStmt.setInt(5, dniOriginal);

			filasAfectadas = pStmt.executeUpdate();
			eliminarCentrosDelIdent(dniOriginal);
            agregarCentrosIdent(identificados);

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

	public boolean eliminarIdentificado(int dni) {

		Connection conn = null;
		int filasAfectadas = 0;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			eliminarCentrosDelIdent(dni);
			PreparedStatement pStmt = conn
					.prepareStatement("DELETE FROM `detenidos_identificados` WHERE `dniDetenido` = ?;");
			pStmt.setInt(1, dni);

			filasAfectadas = pStmt.executeUpdate();

			PreparedStatement pStmt2 = conn
					.prepareStatement("DELETE FROM `ccdtye_identificados` WHERE `idDetenido` = ?;");
			pStmt2.setInt(1, conseguirIDDetenido(dni));

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

	public ArrayList<Identificado> traerTodos() {
		ArrayList<Identificado> identificados = new ArrayList<Identificado>();
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM detenidos_identificados");

			while (rs.next()) {
				int dni = rs.getInt(2);
				String nombre = rs.getString(3);
				String fechaUlt = rs.getString(4);
				String bio = rs.getString(5);
				String materialAudiovisual = rs.getString(6);

				Identificado e = new Identificado();
				e.setDniDetenido(dni);
				e.setNombreDetenido(nombre);
				LocalDate f_cierre = LocalDate.parse(fechaUlt);
				e.setFechaUltimaVezVisto(f_cierre);
				e.setBiografia(bio);
				e.setMaterialAudiovisual(materialAudiovisual);
				
				TestigosDAO testigoDao = new TestigosDAO();
				Integer idTestigo = conseguirIDTestigoDeUnDetenido(e);
				System.out.println("identificado: " + " testigo id :" + idTestigo);
				if (idTestigo<=0||idTestigo==null) {
					e.setTestigoDelDetenido(null);
				}else {
					Testigo testigo = testigoDao.traerTestigoPorID(idTestigo);
					e.setTestigoDelDetenido(testigo);
				}
				ArrayList<CCDTyE> centros = traerCentroDeUnIdentificado(e);
				e.setCentrosEnLosQueEstuvo(centros);
				identificados.add(e);
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

		return identificados;
	}

	public ArrayList<CCDTyE> traerCentroDeUnIdentificado(Identificado identificado) {
		ArrayList<CCDTyE> centrosDelIdentificado = new ArrayList<>();
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			PreparedStatement pStmt = conn.prepareStatement("SELECT * FROM ccdtye_identificados WHERE id_detenido = ?");
			int id = conseguirIDDetenido(identificado.getDniDetenido());
			pStmt.setInt(1, id);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				int idCentro = rs.getInt("id_ccdtye");
				CCDTyEDAO centrosDao = new CCDTyEDAO();
				CCDTyE centro = centrosDao.traerCentroPorId(idCentro);
				centrosDelIdentificado.add(centro);
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
		return centrosDelIdentificado;
	}
	
	public int conseguirIDTestigoDeUnDetenido(Identificado identificado) {
		Connection conn = null;
		int id=-1;
		try {
			conn = DriverManager.getConnection(url(),usuario(),contrasenia());
			PreparedStatement pStmt = conn.prepareStatement("SELECT idTestigos FROM detenidos_identificados where dniDetenido = ?");
			pStmt.setInt(1, identificado.getDniDetenido());
			ResultSet rs = pStmt.executeQuery();
			System.out.println(pStmt.toString());
			while (rs.next()) {
				id = rs.getInt("idTestigos");
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
	
	public int conseguirIDProfesionDeUnDetenido(Identificado identificado) {
		Connection conn = null;
		int id=-1;
		try {
			conn = DriverManager.getConnection(url(),usuario(),contrasenia());
			PreparedStatement pStmt = conn.prepareStatement("SELECT idProfesiones FROM detenidos_identificados where dniDetenido = ?");
			pStmt.setInt(1, identificado.getDniDetenido());
			ResultSet rs = pStmt.executeQuery();
			System.out.println(pStmt.toString());
			while (rs.next()) {
				id = rs.getInt("idProfesiones");
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
	
	public int conseguirIDLugarDetencionDeUnDetenido(Identificado identificado) {
		Connection conn = null;
		int id=-1;
		try {
			conn = DriverManager.getConnection(url(),usuario(),contrasenia());
			PreparedStatement pStmt = conn.prepareStatement("SELECT idLugares FROM detenidos_identificados where dniDetenido = ?");
			pStmt.setInt(1, identificado.getDniDetenido());
			ResultSet rs = pStmt.executeQuery();
			System.out.println(pStmt.toString());
			while (rs.next()) {
				id = rs.getInt("idLugares");
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
	
	

	public ArrayList<Identificado> buscarNombre(String nombre_busqueda) {
		ArrayList<Identificado> identificados = new ArrayList<Identificado>();
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			PreparedStatement pStmt = conn
					.prepareStatement("SELECT * FROM detenidos_identificados WHERE `nombreDetenido` = ?;");
			pStmt.setString(1, nombre_busqueda);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				int dni = rs.getInt(2);
				String nombre = rs.getString(3);
				String fechaUlt = rs.getString(4);
				String bio = rs.getString(5);
				String materialAudiovisual = rs.getString(6);

				Identificado e = new Identificado();
				e.setDniDetenido(dni);
				e.setNombreDetenido(nombre);
				LocalDate f_cierre = LocalDate.parse(fechaUlt);
				e.setFechaUltimaVezVisto(f_cierre);
				e.setBiografia(bio);
				e.setMaterialAudiovisual(materialAudiovisual);

				identificados.add(e);
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
		return identificados;
	}

	public ArrayList<Identificado> identificadosConBiografia() {
		ArrayList<Identificado> identificados = new ArrayList<Identificado>();
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM detenidos_identificados WHERE biografia IS NOT NULL");

			while (rs.next()) {
				int dni = rs.getInt(2);
				String nombre = rs.getString(3);
				String fechaUlt = rs.getString(4);
				String bio = rs.getString(5);
				String materialAudiovisual = rs.getString(6);

				Identificado e = new Identificado();
				e.setDniDetenido(dni);
				e.setNombreDetenido(nombre);
				LocalDate f_cierre = LocalDate.parse(fechaUlt);
				e.setFechaUltimaVezVisto(f_cierre);
				e.setBiografia(bio);
				e.setMaterialAudiovisual(materialAudiovisual);

				identificados.add(e);
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
		return identificados;
	}
	
	public boolean agregarCentroAlIdentificado(Identificado ident, CCDTyE c) {
		Connection conn = null;
		CCDTyEDAO cDAO = new CCDTyEDAO();
		int filasAfectadas = 0;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			PreparedStatement pStmt = conn
					.prepareStatement("INSERT INTO `ccdtye_identificados`(`id_detenido`, `id_ccdtye`) VALUES (?,?)");
			int idIdentificado = conseguirIDDetenido(ident.getDniDetenido());
			int idCentro = cDAO.conseguirIDCentro(c.getUbicacion());
			pStmt.setInt(1, idIdentificado);
			pStmt.setInt(2, idCentro);
			ident.añadirCentro(c);
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

	public boolean desvincularCentroDelIdentificado(Identificado ident, CCDTyE c) {
		Connection conn = null;
		CCDTyEDAO cDAO = new CCDTyEDAO();
		int filasAfectadas = 0;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			PreparedStatement pStmt = conn.prepareStatement("DELETE FROM ccdtye_identificados WHERE id_detenido = ? AND id_ccdtye = ? ;");
			int idIdentificado = conseguirIDDetenido(ident.getDniDetenido());
			int idCentro = cDAO.conseguirIDCentro(c.getUbicacion());
			pStmt.setInt(1, idIdentificado);
			pStmt.setInt(2, idCentro);
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

	public ArrayList<Integer> centrosEnLosQueEstuvo(int dni) {
		ArrayList<Integer> ubicaciones = new ArrayList<Integer>();
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			PreparedStatement pStmt = conn
					.prepareStatement("SELECT id_ccdtye FROM ccdtye_identificados WHERE id_detenido = ?");
			pStmt.setInt(1, conseguirIDDetenido(dni));
			ResultSet rs2 = pStmt.executeQuery();
			while (rs2.next()) {
				int centro_id = rs2.getInt(1);
				ubicaciones.add(centro_id);
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
		return ubicaciones;
	}

	public int conseguirIDDetenido(int DNIDetenido) {
		Connection conn = null;
		int id = 0;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			PreparedStatement pStmt = conn
					.prepareStatement("SELECT idDetenido FROM detenidos_identificados where dniDetenido = ?;");
			pStmt.setInt(1, DNIDetenido);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				id = rs.getInt(1);
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
	public int conseguirIdDeUnTestigoDeUnDetenido(int DNIDetenido) {
		Connection conn = null;
		int id =-1;
		try {
			conn = DriverManager.getConnection(url(), usuario(), contrasenia());
			PreparedStatement pStmt = conn
					.prepareStatement("SELECT idTestigos FROM detenidos_identificados where dniDetenido = ?;");
			pStmt.setInt(1, DNIDetenido);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				id = rs.getInt(1);
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
	
	public boolean eliminarCentrosDelIdent(int dni) {
        Connection conn = null;
        int filasAfectas = 0;
        try {
            conn = DriverManager.getConnection(url(), usuario(), contrasenia());
            PreparedStatement pStmt2 = conn.prepareStatement("DELETE FROM ccdtye_identificados WHERE id_detenido = ?;");
            pStmt2.setInt(1, conseguirIDDetenido(dni));
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
	
	 public boolean agregarCentrosIdent(Identificado ident) {
	        Connection conn = null;
	        int filasAfectas = 0;
	        try {
	            conn = DriverManager.getConnection(url(), usuario(), contrasenia());
	            PreparedStatement pStmt2 = conn.prepareStatement("INSERT INTO ccdtye_identificados (id_ccdtye, id_detenido) VALUES (?,?)");
	            CCDTyEDAO cdao = new CCDTyEDAO();
	            for (CCDTyE c: ident.getCentrosEnLosQueEstuvo()) {
	                pStmt2.setInt(1, cdao.conseguirIDCentro(c.getUbicacion()));
	                pStmt2.setInt(2, conseguirIDDetenido(ident.getDniDetenido()));
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
