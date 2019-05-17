package mayo2018;

import java.util.ArrayList;
import java.util.List;

public class Oferta {

	private List<Estacion> l;
	private Estacion origen;
	private Estacion destino;
	
	public Oferta(Estacion pDestino, Estacion pOrigen) {
		origen = pOrigen;
		destino = pDestino;
		l = new ArrayList<Estacion>();
	}

	public List<Estacion> getL() {
		return l;
	}

	public void setLista(List<Estacion> le) {
		l = le;
	}
	
	public Estacion getOrigen() {
		return origen;
	}

	public Estacion getDestino() {
		return destino;
	}
	
	public void ordenarPorPrecio() {
		l.stream().sorted((a1,a2)->a1.esMasCaro(a2.getCosteParada()));
	}
	
	public Double obtenerPrecio() {
		Double rdo =  l.stream().mapToDouble(a->a.getCosteParada()).sum();
		return rdo;
	}
	
	public int compareTo(Oferta ofer) {
		if (this.obtenerPrecio()<ofer.obtenerPrecio()) {
			return -1;
		}else if (this.obtenerPrecio()==ofer.obtenerPrecio()) {
			return 0;
		}else {
			return 1;
		}
	}
	
	public boolean compare(String pDestino, String pOrigen) {
		if (destino.getCiudad().equals(pDestino) && origen.getCiudad().equals(pOrigen)) {
			return true;
		}else {
			return false;
		}
	}

}
