public class CondicionANegada implements CondicionA{

	private CondicionA c1; 
	
	public CondicionANegada(CondicionA c1) {
		this.c1 = c1;
	}

	public boolean cumple(Animal x) {
		return !c1.cumple(x);
	}
	

}
