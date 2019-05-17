package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	private static Supermercado mSupermercado = new Supermercado();
	private List<Producto> l;
	
	private Supermercado() {
		l = new ArrayList<Producto>();
		mSupermercado = new Supermercado();
	}

	public static void setmSupermercado(Supermercado mSupermercado) {
		Supermercado.mSupermercado = mSupermercado;
	}

	public void setL(List<Producto> l) {
		this.l = l;
	}
	
	public void setList(ArrayList<Producto> pL) {
		l = pL;
	}
	
	public Double calcularPerdidas() {
		return l.stream().filter(a->a.estaCaducado()).mapToDouble(a->a.getPrecio()).sum(); 
	}
}
