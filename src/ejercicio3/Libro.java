package ejercicio3;

public class Libro {
	private String titulo;
	private String autor;
	private int numPaginas;
	
	public Libro (String pTitulo, String pAutor, int pNumPaginas) {
		this.titulo = pTitulo;
		this.autor = pAutor;
		this.numPaginas = pNumPaginas;
	}
	
	public String getTitulo(){
		return this.titulo;
	}
	
	public String getAutor(){
		return this.autor;
	}
	
	public int getNumPaginas(){
		return this.numPaginas;
	}
	
	public String toString() {
	      return String.format("\tTitulo:%1$s\tAutor: %2$s", getTitulo(), getAutor());
	}
}
