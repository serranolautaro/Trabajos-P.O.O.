package vista;

import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import modelo.CCDTyE;
import modelo.Identificado;
import modelo.NoIdentificados;
import dao.IdentificadosDAO;
import dao.NoIdentificadosDAO;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class noIdentificadoAgregarModificar extends JPanel {
	private JTextField textFieldApodo;
	private JTextField textFieldDescripcion;
	private JLabel agregadoModificado;
	private NoIdentificados noIdentificado = null;
	private String apodoOriginal = null;
	/**
	 * Create the panel.
	 */
	public noIdentificadoAgregarModificar() {
		setBackground(new Color(0, 0, 28));
		setLayout(null);
		setBounds(0,0,600,400);
		JLabel lblNewLabel = new JLabel("Agregar apodo");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(69, 98, 119, 14);
		add(lblNewLabel);
		
		textFieldApodo = new JTextField();
		textFieldApodo.setBounds(196, 95, 86, 20);
		add(textFieldApodo);
		textFieldApodo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Agregar descripción");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(69, 145, 196, 14);
		add(lblNewLabel_1);
		
		textFieldDescripcion = new JTextField();
		textFieldDescripcion.setBounds(196, 142, 86, 20);
		add(textFieldDescripcion);
		textFieldDescripcion.setColumns(10);
		
		JButton bAtras = new JButton("ATRAS");
		bAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame marco = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
				marco.setContentPane(new desaparecidoTipoAgregarModificar());
				marco.validate();
			}
		});

		bAtras.setBounds(69, 245, 196, 37);
		add(bAtras);
		
		JButton bSiguiente = new JButton("SIGUIENTE");
		bSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NoIdentificadosDAO niDAO = new NoIdentificadosDAO();
				if(esModificacion())
				{
					System.out.println(esModificacion());
					noIdentificado.setApodo(textFieldApodo.getText());
					noIdentificado.setDescripcion(textFieldDescripcion.getText());
					
					niDAO.modificarNoIdentificado(noIdentificado, apodoOriginal);
					agregadoModificado = new JLabel("Desaparecido modificado exitosamente");
					agregadoModificado.setForeground(new Color(255, 255, 255));
					agregadoModificado.setBounds(98, 191, 231, 14);
					add(agregadoModificado);
				} else {
					System.out.println(esModificacion());
					NoIdentificados nuevoNoIdentificado = new NoIdentificados();
					nuevoNoIdentificado.setApodo(textFieldApodo.getText());
					nuevoNoIdentificado.setDescripcion(textFieldDescripcion.getText());
					niDAO.agregarNoIdentificado(nuevoNoIdentificado);
					agregadoModificado = new JLabel("Desaparecido agregado exitosamente");
					agregadoModificado.setForeground(new Color(255, 255, 255));
					agregadoModificado.setBounds(98, 191, 231, 14);
					add(agregadoModificado);
				}
			JFrame marco = (JFrame) SwingUtilities.getWindowAncestor((JComponent)e.getSource());
			revalidate();
			repaint();
			marco.validate();
	}
});
		bSiguiente.setBounds(329, 245, 193, 37);
		add(bSiguiente);
	}
	
	public noIdentificadoAgregarModificar(NoIdentificados nI) //MODIFICAR 
	{
		this();
		noIdentificado = nI;
		apodoOriginal = noIdentificado.getApodo();
		textFieldDescripcion.setText(noIdentificado.getDescripcion());
	}
	
	public boolean esModificacion()
	{
		if(noIdentificado == null)
		{
			return false;
		}
		return true;
	}

}
