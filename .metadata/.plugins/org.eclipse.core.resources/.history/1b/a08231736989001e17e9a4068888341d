package vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

import dao.NoIdentificadosDAO;
import dao.TestigosDAO;
import modelo.NoIdentificados;
import modelo.Testigo;
public class noIdentificadoEliminarConsultar extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable tabla;
	private JLabel eliminado;
	private DefaultTableModel mm ;
	private ArrayList<NoIdentificados> noIdentificado;
	/**
	 * Create the panel.
	 */
	/*
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(48, 11, 498, 254);
	add(scrollPane);
	
	tabla = new JTable();
	scrollPane.setViewportView(tabla);
	
	JScrollPane scrollPane_1 = new JScrollPane();
	scrollPane.setRowHeaderView(scrollPane_1);
	
	mm = new DefaultTableModel();

    mm.addColumn("DNI");
    mm.addColumn("Nombre Completo");
    mm.addColumn("Testimonio");

    tabla.setModel(mm);
	
    datos();
    
	JButton bEliminarTestigo = new JButton("ELIMINAR\r\n");
	bEliminarTestigo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			int a = tabla.getSelectedRow();
			int dni = (int) tabla.getModel().getValueAt(a, 0);
			TestigosDAO tDAO = new TestigosDAO();
			tDAO.eliminarTestigo(dni);
			
			desaparecidoEliminado = new JLabel("testigo eliminado exitosamente");
			desaparecidoEliminado.setForeground(new Color(255, 255, 255));
			desaparecidoEliminado.setBounds(262, 275, 142, 14);
			add(desaparecidoEliminado);
			JFrame marco = (JFrame) SwingUtilities.getWindowAncestor((JComponent)e.getSource());
			revalidate();
			repaint();
			marco.validate();
		}
	});
	bEliminarTestigo.setBounds(429, 276, 117, 41);
	add(bEliminarTestigo);
	
	JButton bAtras = new JButton("ATRAS");
	bAtras.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JFrame marco = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
			marco.setContentPane(new testigoOpciones());
			marco.validate();
		}
	});
	bAtras.setBounds(48, 276, 117, 41);
	add(bAtras);
	
	JButton btnAñadirTestigo = new JButton("AGREGAR\r\n");
	btnAñadirTestigo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JFrame marco = (JFrame) SwingUtilities.getWindowAncestor((JComponent) e.getSource());
			marco.setContentPane(new testigoAgregarModificar());
			marco.validate();
		}
	});
	btnAñadirTestigo.setBounds(175, 276, 117, 41);
	add(btnAñadirTestigo);
	
	JButton btnModificar = new JButton("MODIFICAR");
	btnModificar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JFrame marco = (JFrame) SwingUtilities.getWindowAncestor((JComponent) e.getSource());
			marco.setContentPane(new testigoAgregarModificar(obtenerTestigos()));
			marco.validate();
		}
	});
	btnModificar.setBounds(302, 276, 117, 41);
	add(btnModificar);
}*/
	public noIdentificadoEliminarConsultar() {
		setBackground(new Color(0, 0, 28));
		setForeground(new Color(18, 4, 36));
		setLayout(null);
		setBounds(0,0,600,400);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 11, 498, 254);
		add(scrollPane);
		
		tabla = new JTable();
		scrollPane.setViewportView(tabla);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane.setRowHeaderView(scrollPane_1);
		
		mm = new DefaultTableModel();
		
		mm.addColumn("Apodo");
		mm.addColumn("Descripcion");
		mm.addColumn("Tiempo en Cautiverio");
		mm.addColumn("Si Sobrevivio");
		
		tabla.setModel(mm);
		
		JButton btnNewButton_1 = new JButton("CARGAR DATOS");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		datos();
        	}
        });
        btnNewButton_1.setBounds(85, 328, 129, 41);
        add(btnNewButton_1);
		
		JButton bEliminarNoIdentificado = new JButton("ELIMINAR");
		bEliminarNoIdentificado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = tabla.getSelectedRow();
				String apodito = (String) tabla.getModel().getValueAt(a, 0);
				NoIdentificadosDAO nIDAO = new NoIdentificadosDAO();
				nIDAO.eliminarNoIdentificado(apodito);
				
				System.out.println("Se elimino");
				
				eliminado = new JLabel("Desaparecido eliminado exitosamente");
				eliminado.setForeground(new Color(255, 255, 255));
				eliminado.setBounds(262, 275, 142, 14);
				add(eliminado);
				JFrame marco = (JFrame) SwingUtilities.getWindowAncestor((JComponent)e.getSource());
				revalidate();
				repaint();
				marco.validate();
			}
		});
		bEliminarNoIdentificado.setBounds(429, 276, 117, 41);
		add(bEliminarNoIdentificado);
		
		JButton bAtras = new JButton("ATRAS");
		bAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame marco = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
				marco.setContentPane(new desaparecidoTipoConsultar());
				marco.validate();
			}
		});
		bAtras.setBounds(48, 276, 117, 41);
		add(bAtras);
		
		JButton bAgregar = new JButton("AGREGAR");
		bAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame marco = (JFrame) SwingUtilities.getWindowAncestor((JComponent) e.getSource());
				marco.setContentPane(new noIdentificadoAgregarModificar());
				marco.validate();
				//falta conectar con la tabla noIdentificadoAGregar
			}
		});
		bAgregar.setBounds(175, 276, 117, 41);
		add(bAgregar);
		
		JButton bModificar = new JButton("MODIFICAR");
		bModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame marco = (JFrame) SwingUtilities.getWindowAncestor((JComponent) e.getSource());
				marco.setContentPane(new noIdentificadoAgregarModificar(obtenerNoIdentificados()));
				marco.validate();
				//falta conectar con la tabla noIdentificadoAGregar
			}
		});
		bModificar.setBounds(302, 276, 117, 41);
		add(bModificar);
		
		JButton btnCentros = new JButton("CENTROS");
		btnCentros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame marco = (JFrame) SwingUtilities.getWindowAncestor((JComponent) e.getSource());
				marco.setContentPane(new noIdentificadoModificarCentros(obtenerNoIdentificados()));
				marco.validate();
			}
		});
		btnCentros.setBounds(363, 328, 129, 41);
		add(btnCentros);
		
		JButton bAgregarTestigo = new JButton("TESTIGOS");
		bAgregarTestigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame marco = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
				marco.setContentPane(new noIdentificadoModificarTestigo(obtenerNoIdentificados()));
				marco.validate();
			}
		});

		bAgregarTestigo.setBounds(224, 328, 129, 41);
		add(bAgregarTestigo);
	}
		
		private void datos() {
			mm.setRowCount(0);
			NoIdentificadosDAO nIDAO = new NoIdentificadosDAO();
			noIdentificado = nIDAO.traerTodos();
			mm.setRowCount(0);
			for(NoIdentificados nI : noIdentificado)
			{
				Object[] fila = new Object[] {
						nI.getApodo(), nI.getDescripcion(),nI.tiempoCautiverio(), nI.sobrevivio()
					};
			mm.addRow(fila);
			}
		}
		
		public NoIdentificados obtenerNoIdentificados()
		{
			int filaSeleccionada = tabla.getSelectedRow();
			return noIdentificado.get(filaSeleccionada);
		}
}
