package taller.hamburguesas.procesamiento;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class MenuHamburguesas {

	private Map<String, List<Object>> combos;
	
	private Map<String, Integer> elemento;
	
	private Map<String, Integer> menu;
	
	public MenuHamburguesas(Map<String, List<Object>> elCombo, Map<String, Integer> elElemento, Map<String, Integer> elMenu)
	{
		this.combos = new HashMap<>(elCombo);
		this.elemento = new HashMap<>(elElemento);;
		this.menu = new HashMap<>(elMenu);;
	}
	
}
