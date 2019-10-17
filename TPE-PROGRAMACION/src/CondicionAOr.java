
public class CondicionAOr extends CondicionA {

	private CondicionA c1;
	private CondicionA c2;
	
	public CondicionAOr(CondicionA c1, CondicionA c2) {
		this.c1 = c1;
		this.c2 = c2;
	}


	public boolean compare(Animal x) {
		return c1.compare(x)||c2.compare(x);
	}
	
}
