package condiciones;

import sistema.Grupo;

public class CondicionGOr implements CondicionG {

	private CondicionG c1;
	private CondicionG c2;
	
	
	
	
	public CondicionGOr(CondicionG c1, CondicionG c2) {
		this.c1 = c1;
		this.c2 = c2;
	}


	@Override
	public boolean cumple(Grupo g) {
		return c1.cumple(g)||c2.cumple(g);
	}
	
	

}
