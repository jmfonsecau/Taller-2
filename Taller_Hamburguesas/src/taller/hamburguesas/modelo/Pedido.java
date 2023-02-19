package taller.hamburguesas.modelo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Pedido {

	
	private int idPedido;
	
	private String nombreCliente;
	
	private String direccionCliente;
	
	public Map<String, Objects> elPedido = new HashMap<>();
	
	public Pedido(int idDelPedido, String elNombre, String laDireccion) {
		this.idPedido = idDelPedido;
		this.nombreCliente = elNombre;
		this.direccionCliente = laDireccion;
		
	}
	
	public int darIdPedido() {
		return idPedido;
	}
}
