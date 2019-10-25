package condiciones;

import sistema.Animal;

public class CondicionARaza implements CondicionA {
	
private String raza;
	
	public CondicionARaza (String _raza) {
		
		raza=_raza;
		
	}
	
	public boolean cumple(Animal x) {
		return x.getRaza().equals(raza);
	}

}

