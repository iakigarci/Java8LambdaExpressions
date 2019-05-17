package junio2017;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

	private List<Alumno> lista;
	
	public Grupo() {
		lista = new ArrayList<Alumno>();
	}

	public List<Alumno> getLista() {
		return lista;
	}

	public void setLista(List<Alumno> lista) {
		this.lista = lista;
	}
	
	public void imprimirListaPorNota(){
		lista.stream().sorted((a1,a2)->a1.getNotaMedia().compareTo(a2.getNotaMedia())).forEach(a->a.imprimirNotasOrdenadas());
	}
	
}
