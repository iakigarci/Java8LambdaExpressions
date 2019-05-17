package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Estanteria {

	private String lugar;
	private String area;
	private List<Libro> lista = new ArrayList<Libro>();
	
	public Estanteria(String pLugar, String pArea) {
		lugar = pLugar;
		area = pArea;
	}
	
	public String getLugar() {
		return lugar;
	}
	
	public String getArea() {
		return area;
	}
	
	public List<Libro> getLista() {
		return lista;
	}
	
	public void setLista(ArrayList<Libro> pL) {
		lista = pL;
	}
	
	public void ordenarPorTitulo() {
		lista.sort((l1,l2)->l1.getTitulo().compareTo(l2.getTitulo()));
	}

	public void addLibro(Libro pL) {
		lista.add(pL);
	}
	
	public void mostrarMasCars(int pPrecio) {
		lista.stream().filter(l->l.getPrecio()>=pPrecio).forEach(l->System.out.println("Libro: "+l.getTitulo()));
	}
}
