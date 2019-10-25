package condiciones;

import sistema.Animal;

public class CondicionAOr implements CondicionA {

	private CondicionA c1;
	private CondicionA c2;
	
	public CondicionAOr(CondicionA c1, CondicionA c2) {
		this.c1 = c1;
		this.c2 = c2;
	}


	public boolean cumple(Animal x) {
		return c1.cumple(x)||c2.cumple(x);
	}
	
}
