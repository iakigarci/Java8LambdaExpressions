package junio2017;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

	private List<Entregable> lista;
	private String nombre;
	
	public Alumno(String pNombre) {
		lista = new ArrayList<Entregable>();
		nombre = pNombre;
	}

	public List<Entregable> getLista() {
		return lista;
	}

	public void setLista(List<Entregable> lista) {
		this.lista = lista;
	}
	
	public Double getNotaMedia() {
		return lista.stream().mapToDouble(a->a.getPuntuacion()).average().getAsDouble();
	}
	
	public void imprimirNotasOrdenadas() {
		System.out.println("NOMBRE: "+nombre);
		lista.stream().sorted((a1,a2)->a1.getPuntuacion().compareTo(a2.getPuntuacion())).forEach(a3->System.out.println(a3.getPuntuacion()));
	}
}
