package ejercicio5;

import java.util.Date;

public class Producto {

	private int cod;
	private String nombre;
	private Double precio;
	private Date fechaCaducidad;

	
	private Producto(int cod, String nombre, Double precio, Date fechaCaducidad) {
		this.cod = cod;
		this.nombre = nombre;
		this.precio = precio;
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getCod() {
		return cod;
	}

	public String getNombre() {
		return nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}
	
	public boolean estaCaducado() {
		Date ahora = new Date(System.currentTimeMillis());  
		if (fechaCaducidad.compareTo(ahora)<0) {
			return true;
		}else {
			return false;
		}
	}
}
