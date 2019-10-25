package condiciones;

import sistema.Animal;

public class CondicionAPeso implements CondicionA {
	
	private double peso;
	
	public CondicionAPeso (double _peso) {
		
		peso=_peso;
		
	}
	
	public boolean cumple(Animal x) {
		return x.getPeso()>peso;
	}

}
