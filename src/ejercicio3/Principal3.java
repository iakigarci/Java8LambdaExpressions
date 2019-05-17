package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Principal3 {
	private static List<Libro> l3= Principal3.crearListaLibros();
	
	public Principal3() {
		
	}
	public static List<Libro> crearListaLibros() {
		
		List<Libro> lz = new ArrayList<Libro>();
		
		lz.add(new Libro("Drakula", "Bram Stoker", 220));
		lz.add(new Libro("Frankestein", "Mary Shelley", 360));
		lz.add(new Libro("Cuentos", "Edgar Allan Poe", 2700));
		lz.add(new Libro("The Martian", "Andy Weir", 270));
		lz.add(new Libro("Dune", "Frank Herbert", 1600));
		lz.add(new Libro("Hyperion", "Dan Simmons", 900));
		lz.add(new Libro("La isla del tesoro", "Robert Louis Stevenson", 2200));
		lz.add(new Libro("Las aventuras de Tom Sawyer", "Mark Twain", 230));
		lz.add(new Libro("Las minas del rey Salomon", "Henry Rigger Haggard", 909));
		
		return lz;
	}
	
	public static void mostrarLibrosPorPaginas(int pCant) {
		l3.stream().filter(l1->l1.getNumPaginas()>pCant).forEach(l2->System.out.println("Libro: "+l2.getTitulo()));;
	}
	
	public static void main(String... args) {
		
        // Crar la lista de libros para la Prueba
    
        // 1.- Mostar la lista de libros
        l3.stream().forEach(l1->System.out.println("Libro: "+l1.getTitulo()));
        
        // 2.- Mostrar los libros que tienen más de 1000 paginas
        Principal3.mostrarLibrosPorPaginas(1000);
 }
}
