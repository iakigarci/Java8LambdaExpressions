package mayo2018;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CatalogoOfertas catalogo = CatalogoOfertas.getmCatalogoOfertas();
		
		List<Oferta> l = new ArrayList<Oferta>();
		List<Estacion> le = new ArrayList<Estacion>();
		
		Estacion e1 = new Estacion("Bilbao", 5.0);
		Estacion e2 = new Estacion("Barcelona", 7.0);
		Estacion e3 = new Estacion("España", 5.0);
		Estacion e4 = new Estacion("Valencia", 4.0);
		Estacion e5 = new Estacion("Lemoa", 6.0);
		
		Oferta o1 = new Oferta(e1,e5);
		le.add(e1);
		le.add(e3);
		le.add(e4);
		le.add(e5);
		o1.setLista(le);
		
		Oferta o2 = new Oferta(e1, e5);
		le = new ArrayList<Estacion>();
		le.add(e3);
		le.add(e4);
		o2.setLista(le);
		
		Oferta o3 = new Oferta(e1, e5);
		le = new ArrayList<Estacion>();
		le.add(e3);
		le.add(e4);
		le.add(e5);
		o3.setLista(le);
		
		l.add(o1);
		l.add(o2);
		l.add(o3);
		catalogo.setLista(l);

		System.out.println("COMENZAMOS");
		l = catalogo.buscarOfertas("Bilbao","Lemoa");
		l.stream().forEach(a->imprimirLista(a.getL()));
	}
	
	public static void imprimirLista(List<Estacion> pL) {
		System.out.println();
		for (int i = 0; i < pL.size(); i++) {
			System.out.print(pL.get(i).getCiudad()+" ");
		}
	}

}
