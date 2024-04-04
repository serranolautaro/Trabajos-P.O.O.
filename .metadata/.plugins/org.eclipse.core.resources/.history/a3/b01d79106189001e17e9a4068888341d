package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

import dao.CCDTyEDAO;
import modelo.CCDTyE;
import modelo.Fuerzas;
import dao.FuerzasDAO;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class centroAgregarModificar extends JPanel {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField tNombre;
	private JTextField tUbicacion;
	private JTextField tFechaInicio;
	private JTextField tFechafin;
	private JLabel centroModificado;
	private CCDTyE centro = null;
	private JComboBox combo1;
	private JComboBox combo2;
	private JComboBox combo3;
	private String ubicacionOriginal = null;

	/**
	 * Create the panel.
	 */
	public centroAgregarModificar() {
		setBackground(new Color(2, 0, 34));
		setBounds(0, 0, 600, 400);
		setLayout(null);

		JButton bAtras = new JButton("ATRAS");
		bAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame marco = (JFrame) SwingUtilities.getWindowAncestor((JComponent) e.getSource());
				marco.setContentPane(new centroEliminarConsultar());
				marco.validate();
			}
		}); 
		bAtras.setForeground(new Color(2, 0, 34));
		bAtras.setBackground(new Color(2, 0, 34));
		bAtras.setBounds(54, 279, 133, 31);
		add(bAtras);
		JButton bSiguiente = new JButton("SIGUIENTE\r\n");
		bSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			CCDTyEDAO centroDao = new CCDTyEDAO();
			
			if(esModificacion()) {
				System.out.println(esModificacion());
				centro.setNombre_centro(tNombre.getText());
				centro.setUbicacion(tUbicacion.getText());
				centro.setFecha_inicio(LocalDate.parse(tFechaInicio.getText()));
				centro.setFecha_fin(LocalDate.parse(tFechafin.getText()));
				centroDao.eliminarCentrosFuerzas(tUbicacion.getText());
				centro.eliminarFuerzas();
				if(!combo1.getSelectedItem().toString().equals("vacio")) {
					centro.añadirFuerza(combo1.getSelectedItem().toString());					
				}
				if(!combo2.getSelectedItem().toString().equals("vacio")) {
					centro.añadirFuerza(combo2.getSelectedItem().toString());					
				}
				if(!combo3.getSelectedItem().toString().equals("vacio")) {
					centro.añadirFuerza(combo3.getSelectedItem().toString());					
				}
				centroDao.modificarCentro(centro, ubicacionOriginal);
				centroModificado = new JLabel("Nuevo centro modificado exitosamente");
				centroModificado.setForeground(new Color(255, 255, 255));
				centroModificado.setBounds(208, 322, 138, 14);
				add(centroModificado);
			}else {
				System.out.println(esModificacion());
				CCDTyE nuevoCentro = new CCDTyE();
				//setear valores al nuevo centro
				nuevoCentro.setNombre_centro(tNombre.getText());
				nuevoCentro.setUbicacion(tUbicacion.getText());
				nuevoCentro.setFecha_inicio(LocalDate.parse(tFechaInicio.getText()));
				nuevoCentro.setFecha_fin(LocalDate.parse(tFechafin.getText()));
				nuevoCentro .añadirFuerza(combo1.getSelectedItem().toString());
				nuevoCentro .añadirFuerza(combo2.getSelectedItem().toString());
				nuevoCentro .añadirFuerza(combo3.getSelectedItem().toString());
				centroDao.agregarCentro(nuevoCentro);
				centroModificado = new JLabel("Nuevo centro agregado exitosamente");
				centroModificado.setForeground(new Color(255, 255, 255));
				centroModificado.setBounds(208, 322, 138, 14);
				add(centroModificado);
			}
				JFrame marco = (JFrame) SwingUtilities.getWindowAncestor((JComponent) e.getSource());
				revalidate();
				repaint();
				marco.validate();
		}
	});
		bSiguiente.setBounds(399, 279, 133, 31);
		add(bSiguiente);

		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(119, 56, 68, 14);
		add(lblNewLabel);

		tNombre = new JTextField();
		tNombre.setBounds(188, 53, 86, 20);
		add(tNombre);
		tNombre.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Ubicación");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(119, 100, 68, 14);
		add(lblNewLabel_1);

		tUbicacion = new JTextField();
		tUbicacion.setBounds(188, 97, 86, 20);
		add(tUbicacion);
		tUbicacion.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Fecha inicio");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(119, 145, 144, 14);
		add(lblNewLabel_4);

		tFechaInicio = new JTextField();
		tFechaInicio.setBounds(188, 142, 86, 20);
		add(tFechaInicio);
		tFechaInicio.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Fecha fin");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(119, 191, 68, 14);
		add(lblNewLabel_5);

		tFechafin = new JTextField();
		tFechafin.setBounds(188, 188, 86, 20);
		add(tFechafin);
		tFechafin.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Fuerza uno");

		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(310, 56, 96, 14);
		add(lblNewLabel_6);
		
		combo1 = new JComboBox();
		combo1.setBounds(399, 52, 80, 22);
		agregarFuerzasComboBox(combo1);
		add(combo1);
		JLabel lblNewLabel_7 = new JLabel("Fuerza dos");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBounds(310, 100, 96, 14);
		add(lblNewLabel_7);

		combo2 = new JComboBox();
		combo2.setBounds(399, 96, 80, 22);
		agregarFuerzasComboBox(combo2);
		add(combo2);

		JLabel lblNewLabel_8 = new JLabel("Fuerza tres");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setBounds(310, 145, 96, 14);
		add(lblNewLabel_8);

		combo3 = new JComboBox();
		combo3.setBounds(399, 141, 80, 22);
		agregarFuerzasComboBox(combo3);
		add(combo3);
		
	}
	
	public void agregarFuerzasComboBox(JComboBox comboBox)
	{
		FuerzasDAO fdao = new FuerzasDAO();
		ArrayList<Fuerzas> fuerzas = fdao.traerTodas();
		ArrayList<String> fuerzaString = new ArrayList<>();
		for (Fuerzas f: fuerzas) {
			fuerzaString.add(f.getNombre());
		}
		comboBox.addItem("vacio"); 
		comboBox.addItem(fuerzaString.get(0));
		comboBox.addItem(fuerzaString.get(1));
		comboBox.addItem(fuerzaString.get(2));
		comboBox.setSelectedIndex(0);
	}
	
	public centroAgregarModificar(CCDTyE centroo) //MODIFICAR 
	{
		this();//trae el constructor anterior
		centro = centroo;//el entro q recibe es igual al que declaramos null
		//se escrube lo puesto en los textfields
		System.out.println(centro.getFuerzasEnControl().size());
		ubicacionOriginal = centro.getUbicacion();
		tNombre.setText(centro.getNombre_centro());
		tUbicacion.setText(centro.getUbicacion());
		tNombre.setText(centro.getNombre_centro());
		tFechaInicio.setText(centro.getFecha_inicio().toString());
		tFechafin.setText(centro.getFecha_fin().toString());
		ArrayList<String> fuerzas = centro.getFuerzasEnControl();
		if(fuerzas.size()==3)
		{
			combo1.setSelectedItem(fuerzas.get(0));
			combo2.setSelectedItem(fuerzas.get(1));
			combo3.setSelectedItem(fuerzas.get(2));
		}
		if(fuerzas.size()==2)
		{
			combo1.setSelectedItem(fuerzas.get(0));
			combo2.setSelectedItem(fuerzas.get(1));
			combo3.setSelectedIndex(0);
		}
		if(fuerzas.size()==1)
		{
			combo1.setSelectedItem(fuerzas.get(0));
			combo2.setSelectedIndex(0);
			combo3.setSelectedIndex(0);
		}
		if(fuerzas.size()==0)
		{
			combo1.setSelectedIndex(0);
			combo2.setSelectedIndex(0);
			combo3.setSelectedIndex(0);
		}
	}
	
	public boolean esModificacion()
	{
		if(centro == null)
		{
			return false;
		}
		return true;
	}
	
}
