package ejercicio2;


public class Persona {
	private String nombre;
	private String dni;
	private int edad;
	
	public Persona (String pNombre, String pDni, int pEdad){
		this.nombre = pNombre;
		this.dni = pDni;
		this.edad = pEdad;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getDni(){
		return this.dni;
	}
	
	public int getEdad(){
		return this.edad;
	}
}