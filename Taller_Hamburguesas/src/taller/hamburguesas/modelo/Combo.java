package taller.hamburguesas.modelo;

public class Combo {

	private String nombre;
	
	private String descuento;
		
	private String hamburguesa;
	
	private String papas;
	
	private String bebida;
	
	public Combo(String elNombre, String elDescuento, String laHamburguesa, String lasPapas, String laBebida) {
		this.nombre = elNombre;
		this.descuento = elDescuento;
		this.hamburguesa = laHamburguesa;
		this.papas = lasPapas;
		this.bebida = laBebida;
	}
	
	public String darNombreCombo(){
		return nombre;
	}
	
	public String darDescuento() {
		return descuento;
	}
	
	public String darNombreHamburguesa() {
		return hamburguesa;
	}
	
	public String darPapas() {
		return papas;
	}
	
	public String darBebida() {
		return bebida;
	}
	
}
