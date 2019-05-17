package junio2017;

import java.util.ArrayList;
import java.util.List;

public class GruposParticipantes {

	private List<Grupo> lista;
	
	public GruposParticipantes() {
		lista = new ArrayList<Grupo>();
	}

	public List<Grupo> getLista() {
		return lista;
	}

	public void setLista(List<Grupo> lista) {
		this.lista = lista;
	}
	
	public void imprimirListaOrdenada() {
		lista.stream().forEach(a->a.imprimirListaPorNota());
	}
}
