package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Censo {

	private static Censo mCenso = new Censo();
	private List<Persona> l;
	
	private Censo() {
		l = new ArrayList<Persona>();
	}
	
	public void setLista(ArrayList<Persona> pL) {
		l = pL;
	}
	
	
	public void mediadEdadPoblacion() {
		Double media = l.stream().mapToInt(a->a.getEdad()).average().getAsDouble();
		System.out.println("Media: "+media);
	}
	
	public void porcentajeIngenieros() {
		int ingenieros = l.stream().filter(b->b.getProfesion().equals("ingeniero")).toArray().length;
		System.out.println("Porcentaje de ingenieros: "+((100*ingenieros)/l.size())+"%");
	}
	
	
	public static Censo getCenso() {
		return mCenso;
	}
}
