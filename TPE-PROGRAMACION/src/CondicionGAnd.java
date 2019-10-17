
public class CondicionGAnd extends CondicionG {

	private CondicionG c1;
	private CondicionG c2;
	
	
	
	
	public CondicionGAnd(CondicionG c1, CondicionG c2) {
		this.c1 = c1;
		this.c2 = c2;
	}


	@Override
	public boolean compare(Grupo g) {
		return c1.compare(g)&&c2.compare(g);
	}
	
	

}
