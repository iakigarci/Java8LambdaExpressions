package mayo2018;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class CatalogoOfertas {

	
	private static CatalogoOfertas mCatalogoOfertas = new CatalogoOfertas();
	private List<Oferta> l;
	
	private CatalogoOfertas() {
		l = new ArrayList<Oferta>();
	}
	
	public void setLista(List<Oferta> l2) {
		l = l2;
	}

	public static CatalogoOfertas getmCatalogoOfertas() {
		return mCatalogoOfertas;
	}

	public List<Oferta> getL() {
		return l;
	}
	
	public ArrayList<Oferta> buscarOfertas(String pDestino, String pOrigen){
		List<Oferta> aux = l.stream().filter(c->c.compare(pDestino, pOrigen)).sorted((a1,a2)->a1.compareTo(a2)).collect(Collectors.toList());
		
		return (ArrayList<Oferta>) aux;
	}
	
}
