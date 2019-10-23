
public class CondicionANegada extends CondicionA{

	private CondicionA c1; 
	
	public CondicionANegada(CondicionA c1) {
		this.c1 = c1;
	}

	public boolean compare(Animal x) {
		return !c1.compare(x);
	}
	

}
