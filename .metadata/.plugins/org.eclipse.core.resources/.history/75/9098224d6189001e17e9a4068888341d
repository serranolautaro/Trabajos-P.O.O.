package vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import dao.CCDTyEDAO;
import dao.IdentificadosDAO;
import dao.ProfesionesDAO;
import dao.LugaresDeDetencionDAO;
import modelo.CCDTyE;
import modelo.Identificado;
import modelo.LugarDeDetencion;
import modelo.Profesion;

import javax.swing.JTextField;
public class identificadoEliminarConsultar extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable tabla;
	private JLabel eliminado;
	private DefaultTableModel mm ;
	private ArrayList<Identificado> identificados = new ArrayList<>();
	private JTextField tBuscarNombre;
	/**
	 * Create the panel.
	 */
	public identificadoEliminarConsultar() {
		setBackground(new Color(0, 0, 28));
		setForeground(new Color(18, 4, 36));
		setLayout(null);
		setBounds(0,0,600,400);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(49, 11, 498, 213);
		add(scrollPane);
		
		tabla = new JTable();
		scrollPane.setViewportView(tabla);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane.setRowHeaderView(scrollPane_1);
		
mm = new DefaultTableModel();
		
		mm.addColumn("DNI");
		mm.addColumn("Nombre");
		mm.addColumn("Fecha: Ultima Vez Visto");
		mm.addColumn("Biografia");
		mm.addColumn("Material Audiovisual");
		mm.addColumn("Tiempo en Cautiverio");
		mm.addColumn("Si Sobrevivio");
		mm.addColumn("Profesion");
		mm.addColumn("Lugar de Detencion");
		
		tabla.setModel(mm);
		
		
		
		JButton bEliminarIdentificado = new JButton("ELIMINAR");
		bEliminarIdentificado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = tabla.getSelectedRow();
				int dni = (Integer) tabla.getModel().getValueAt(a,0);
				IdentificadosDAO iDAO = new IdentificadosDAO();
				iDAO.eliminarIdentificado(dni);
				
				eliminado = new JLabel("Identificado eliminado exitosamente");
				eliminado.setForeground(new Color(255, 255, 255));
				eliminado.setBounds(262, 275, 142, 14);
				add(eliminado);
				JFrame marco = (JFrame) SwingUtilities.getWindowAncestor((JComponent)e.getSource());
				revalidate();
				repaint();
				marco.validate();
			}
		});
		bEliminarIdentificado.setBounds(430, 276, 117, 41);
		add(bEliminarIdentificado);
		
		JButton bAtras = new JButton("ATRAS");
		bAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame marco = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
				marco.setContentPane(new desaparecidoTipoConsultar());
				marco.validate();
			}
		});
		bAtras.setBounds(49, 276, 117, 41);
		add(bAtras);
		
		JButton bAgregar = new JButton("AGREGAR");
		bAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame marco = (JFrame) SwingUtilities.getWindowAncestor((JComponent) e.getSource());
				marco.setContentPane(new identificadoAgregarModificar());
				marco.validate();
			}
		});
		bAgregar.setBounds(176, 276, 117, 41);
		add(bAgregar);
		
		JButton bModificar = new JButton("MODIFICAR");
		bModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame marco = (JFrame) SwingUtilities.getWindowAncestor((JComponent) e.getSource());
				marco.setContentPane(new identificadoAgregarModificar(obtenerIdentificado()));
				marco.validate();
			}
		});
		bModificar.setBounds(303, 276, 117, 41);
		add(bModificar);
		
		JButton btnModificarCentros = new JButton("CENTROS");
        btnModificarCentros.setBounds(392, 328, 117, 41);
        add(btnModificarCentros);
        
        JLabel lblNewLabel = new JLabel("BUSCAR NOMBRE:");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(49, 238, 117, 14);
        add(lblNewLabel);
        
        tBuscarNombre = new JTextField();
        tBuscarNombre.setBounds(150, 235, 86, 20);
        add(tBuscarNombre);
        tBuscarNombre.setColumns(10);
        
        JButton btnNewButton = new JButton("BUSCAR");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		datosXNombre();
        	}
        });
        btnNewButton.setBounds(246, 235, 86, 20);
        add(btnNewButton);
        
        JLabel lblNewLabel_1 = new JLabel("BIOGRAFIA:");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setBounds(362, 238, 86, 14);
        add(lblNewLabel_1);
        
        JButton btnNewButton_2 = new JButton("BUSCAR");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		identificadoSiTieneBiografia();
        	}
        });
        btnNewButton_2.setBounds(430, 234, 86, 20);
        add(btnNewButton_2);
        
        JButton btnNewButton_1 = new JButton("CARGAR DATOS");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		datos();
        	}
        });
        btnNewButton_1.setBounds(100, 328, 117, 41);
        add(btnNewButton_1);
        
        
        btnModificarCentros.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame marco = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                marco.setContentPane(new IdentificadosModificarCentros(obtenerIdentificado()));
                marco.validate();
                
            }
        });
        
		JButton bAgregarTestigo = new JButton("TESTIGOS");
		bAgregarTestigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame marco = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
				marco.setContentPane(new identificadoModificarTestigo(obtenerIdentificado()));
				marco.validate();
			}
		});

		bAgregarTestigo.setBounds(246, 328, 117, 41);
		add(bAgregarTestigo);
	}
	
	private void datos() {
        mm.setRowCount(0);
        int dni;
        String nombre = null, biografia = null, materialAudiovisual = null,profesion = null, lugarDetencion = null;
        LocalDate fechaUltimaVezVisto = null;
        boolean sisobrevivio;
        long tiempoCautiverio;
        IdentificadosDAO identifiDAO = new IdentificadosDAO();
        identificados =  identifiDAO.traerTodos();
        ProfesionesDAO pDAO = new ProfesionesDAO();
        LugaresDeDetencionDAO ldDAO = new LugaresDeDetencionDAO();
        for (Identificado identifi : identificados) {
            dni = identifi.getDniDetenido();
            nombre = identifi.getNombreDetenido();
            fechaUltimaVezVisto = identifi.getFechaUltimaVezVisto();
            biografia = identifi.getBiografia();
            materialAudiovisual = identifi.getMaterialAudiovisual();
            tiempoCautiverio = identifi.tiempoCautiverio();
            sisobrevivio = identifi.sobrevivio();
            profesion = pDAO.traerProfesionPorID(identifiDAO.conseguirIDProfesionDeUnDetenido(identifi)).getNombre();
            identifi.setProfesionDetenido(new Profesion());
            identifi.getProfesionDetenido().setNombre(profesion);
            
            lugarDetencion = ldDAO.traerLugarPorID(identifiDAO.conseguirIDLugarDetencionDeUnDetenido(identifi)).getNombreLugar();
            identifi.setLugarDetenido(new LugarDeDetencion());
            identifi.getLugarDetenido().setNombreLugar(lugarDetencion);
            
            mm.addRow(new Object[] {
                    dni, nombre, fechaUltimaVezVisto, biografia, materialAudiovisual, tiempoCautiverio, sisobrevivio, profesion, lugarDetencion
            });
        }
    }
		
	public Identificado obtenerIdentificado()
	{
		int filaSeleccionada = tabla.getSelectedRow();
		return identificados.get(filaSeleccionada);
	}
	
	private void datosXNombre() {
        mm.setRowCount(0);
        int dni;
        String nombre = null, biografia = null, materialAudiovisual = null,profesion = null, lugarDetencion = null;
        LocalDate fechaUltimaVezVisto = null;
        boolean sisobrevivio;
        long tiempoCautiverio;
        ProfesionesDAO pDAO = new ProfesionesDAO();
        LugaresDeDetencionDAO ldDAO = new LugaresDeDetencionDAO();
        IdentificadosDAO identifiDAO = new IdentificadosDAO();
        identificados =  identifiDAO.buscarNombre(tBuscarNombre.getText());
        for (Identificado identifi : identificados) {
            dni = identifi.getDniDetenido();
            nombre = identifi.getNombreDetenido();
            fechaUltimaVezVisto = identifi.getFechaUltimaVezVisto();
            biografia = identifi.getBiografia();
            materialAudiovisual = identifi.getMaterialAudiovisual();
            tiempoCautiverio = identifi.tiempoCautiverio();
            sisobrevivio = identifi.sobrevivio();
            profesion = pDAO.traerProfesionPorID(identifiDAO.conseguirIDProfesionDeUnDetenido(identifi)).getNombre();
            lugarDetencion = ldDAO.traerLugarPorID(identifiDAO.conseguirIDLugarDetencionDeUnDetenido(identifi)).getNombreLugar();
            
            
            mm.addRow(new Object[] {
                    dni, nombre, fechaUltimaVezVisto, biografia, materialAudiovisual, tiempoCautiverio, sisobrevivio, profesion, lugarDetencion
            });
        }
    }
	
	private void identificadoSiTieneBiografia() {
        mm.setRowCount(0);
        int dni;
        String nombre = null, biografia = null, materialAudiovisual = null, profesion = null, lugarDetencion = null;
        LocalDate fechaUltimaVezVisto = null;
        boolean sisobrevivio;
        long tiempoCautiverio;
        ProfesionesDAO pDAO = new ProfesionesDAO();
        LugaresDeDetencionDAO ldDAO = new LugaresDeDetencionDAO();
        IdentificadosDAO identifiDAO = new IdentificadosDAO();
        identificados =  identifiDAO.identificadosConBiografia();
        for (Identificado identifi : tienenBiografia()) {
            dni = identifi.getDniDetenido();
            nombre = identifi.getNombreDetenido();
            fechaUltimaVezVisto = identifi.getFechaUltimaVezVisto();
            biografia = identifi.getBiografia();
            materialAudiovisual = identifi.getMaterialAudiovisual();
            tiempoCautiverio = identifi.tiempoCautiverio();
            sisobrevivio = identifi.sobrevivio();
            profesion = pDAO.traerProfesionPorID(identifiDAO.conseguirIDProfesionDeUnDetenido(identifi)).getNombre();
            lugarDetencion = ldDAO.traerLugarPorID(identifiDAO.conseguirIDLugarDetencionDeUnDetenido(identifi)).getNombreLugar();
            
            
            
            	mm.addRow(new Object[] {
                        dni, nombre, fechaUltimaVezVisto, biografia, materialAudiovisual, tiempoCautiverio, sisobrevivio, profesion, lugarDetencion});}
            
            
            
        
    }
	
	private ArrayList<Identificado> tienenBiografia(){
		ArrayList<Identificado> listaFinal = new ArrayList<Identificado>();
		IdentificadosDAO idao = new IdentificadosDAO();
		String bio=null;
		for(Identificado i : idao.traerTodos()) {
			bio=i.getBiografia();
			if(bio.equals("") == false) {
				listaFinal.add(i);
			}
		}
		return listaFinal;
	}
}
