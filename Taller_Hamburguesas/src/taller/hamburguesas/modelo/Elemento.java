package taller.hamburguesas.modelo;

public class Elemento {

	private String nombre;
	
	private Integer precio;
	
	public Elemento(String elNombre, Integer elPrecio) {
		this.nombre = elNombre;
		this.precio = elPrecio;
	}
	
	public String darNombre() {
		return nombre;
	}
	
	public Integer darPrecio() {
		return precio;
	}
	
}
