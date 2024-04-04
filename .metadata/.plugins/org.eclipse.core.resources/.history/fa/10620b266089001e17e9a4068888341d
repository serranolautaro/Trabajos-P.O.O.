package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class CCDTyE {

	private String nombre_centro;
	private String ubicacion;
	private LocalDate fecha_inicio;
	private LocalDate fecha_fin;
	private ArrayList<String> fuerzasEnControl = new ArrayList<>();
	
//	public Fuerzas getFuerzaUno() {
//		return fuerzasEnControl.get(1);
//	}
//	public Fuerzas getFuerzaDos() {
//		return fuerzasEnControl.get(2);
//	}
//	public Fuerzas getFuerzaTres() {
//		return fuerzasEnControl.get(3);
//	}
	
	public void eliminarFuerzas() {
		this.fuerzasEnControl = new ArrayList<>();
	}
	
	public String getNombre_centro() {
		return nombre_centro;
	}
	public void setNombre_centro(String nombre_centro) {
		this.nombre_centro = nombre_centro;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public void setFecha_inicio(LocalDate fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public void setFecha_fin(LocalDate fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public ArrayList<String> getFuerzasEnControl() {
		return fuerzasEnControl;
	}
	public void añadirFuerza(String f) {
		fuerzasEnControl.add(f);
	}
	public String getFecha_inicio() {
        String f_inicio = fecha_inicio.toString();
        return f_inicio;
    }
    public String getFecha_fin() {
        String f_fin = fecha_fin.toString();
        return f_fin;
    }
    public void setFecha_inicio(String f_inicio) {
        this.fecha_inicio = LocalDate.parse(f_inicio);
    }
    public void setFecha_fin(String f_fin) {
        this.fecha_fin = LocalDate.parse(f_fin);
    }
    
}
