package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Principal4 {

	public static void main(String... args) {
		ArrayList<Persona> l = new ArrayList<Persona>();
		
		Persona p1 = new Persona("123", "Jon", "Garci", 13, "a", "ingeniero");
		Persona p2 = new Persona("1234", "Joni", "Garci", 12, "a", "ingeniero");
		Persona p3 = new Persona("12345", "Jon", "Garci", 12, "a", "ingeniero");
		Persona p4 = new Persona("123456", "Jon", "Garci", 12, "a", "ingeniero");
		Persona p5 = new Persona("1234567", "Jon", "Garci", 14, "a", "ingeniero");
		Persona p6 = new Persona("12345678", "Jon", "Garci", 12, "a", "ingeniero");

		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		l.add(p5);
		l.add(p6);
		
		Censo.getCenso().setLista(l);
		Censo.getCenso().mediadEdadPoblacion();
		Censo.getCenso().porcentajeIngenieros();
	}
	
}
