package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private List<Estanteria> lista;
	private String nombre;
	
	public Biblioteca(String pNombre) {
		lista = new ArrayList<Estanteria>();
		nombre = pNombre;
	}
	
	public List<Estanteria> getLista(){
		return lista;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public static Biblioteca crearBiblioteca() {
		Biblioteca l = new Biblioteca ("EUITI");
		
		Estanteria terror = new Estanteria ("6A7B", "Terror");
		terror.addLibro(new Libro("Drakula", "Bram Stoker", 22));
		terror.addLibro(new Libro("Frankestein", "Mary Shelley", 36));
		terror.addLibro(new Libro("Cuentos", "Edgar Allan Poe", 27));
		l.addEstanterias(terror);
		
		Estanteria cienciaFiccion = new Estanteria ("3X78", "Ciencia Ficcion");
		cienciaFiccion.addLibro(new Libro("The Martian", "Andy Weir", 27));
		cienciaFiccion.addLibro(new Libro("Dune", "Frank Herbert", 16));
		cienciaFiccion.addLibro(new Libro("Hyperion", "Dan Simmons", 9));
		l.addEstanterias(cienciaFiccion);
		
		Estanteria aventura = new Estanteria("43X8", "Aventura");
		aventura.addLibro(new Libro("La Isla del Tesoro", "Robert Louis Stevenson", 22));
		aventura.addLibro(new Libro("Tom Sawyer-en Abenturak", "Mark Twain", 23));
		aventura.addLibro(new Libro("Las minas del rey Salomon", "Henry Rigger Haggard", 9));
		l.addEstanterias(aventura);
		
		return l;
	}
	
	private void addEstanterias(Estanteria pE) {
		// TODO Auto-generated method stub
		lista.add(pE);
	}

	public static void main(String... args) {
        
        // Probetarako liburutegia sortu
        Biblioteca bibliotecaEuiti = crearBiblioteca();
    
        // 1.- Mostrar estanterías de la Biblioteca
        System.out.println("Biblioteca: "+ bibliotecaEuiti.getNombre());
        bibliotecaEuiti.mostrarLibrosEstanterías();
        System.out.println();
        
        // 2.- Haundiagoak bistaratu
        System.out.println("Libros que cuestan más de 18 euros: ");
        bibliotecaEuiti.mostrarMayor(18);
 }
	
	private void mostrarMayor(int i) {
		// TODO Auto-generated method stub
		lista.stream().forEach(a->a.mostrarMasCars(i));
	}

	public void mostrarLibrosEstanterías() {
		
		lista.stream().forEach(a->a.ordenarPorTitulo());
		lista.stream().sorted((a1,a2)->a1.getArea().compareTo(a2.getArea())).forEach(l->System.out.println("Estanteria: "+l.getArea()));
	}
	
	
	
	
}
