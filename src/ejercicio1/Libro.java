package ejercicio1;

public class Libro {

	private String titulo;
	private String autor;
	private int precio;
	
	public Libro(String pTitulo, String pAutor, int pPrecio) {
		titulo = pTitulo;
		autor = pAutor;
		precio = pPrecio;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getPrecio() {
		return precio;
	}
	
	
}
