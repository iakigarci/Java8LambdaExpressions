package ejercicio4;

public class Persona {

	private String DNI;
	private String nombre;
	private String apellidos;
	private int edad;
	private String estadoCivil;
	private String profesion;
	
	public Persona(String dNI, String nombre, String apellidos, int edad, String estadoCivil, String profesion) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.estadoCivil = estadoCivil;
		this.profesion = profesion;
	}

	public String getDNI() {
		return DNI;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public String getProfesion() {
		return profesion;
	}
	
	
}
