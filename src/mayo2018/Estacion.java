package mayo2018;

public class Estacion {

	private String ciudad;
	private Double costeParada;
	
	public Estacion(String ciudad, Double costeParada) {
		super();
		this.ciudad = ciudad;
		this.costeParada = costeParada;
	}

	public String getCiudad() {
		return ciudad;
	}

	public Double getCosteParada() {
		return costeParada;
	}
	
	public int esMasCaro(Double pP) {
		if (this.getCosteParada()<pP) {
			return -1;
		}else if (this.getCosteParada()==pP) {
			return 0;
		}else {
			return 1;
		}
	}
}
