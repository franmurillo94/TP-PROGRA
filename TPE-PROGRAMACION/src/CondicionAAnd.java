
public class CondicionAAnd extends CondicionA{
	
	private CondicionA c1;
	private CondicionA c2;
	
	public CondicionAAnd (CondicionA _c1, CondicionA _c2) {
		
		c1 = _c1;
		c2 = _c2;
		
	}
	
	
	public boolean compare(Animal x) {
		
		return c1.compare(x)&&c2.compare(x);
	}
	
	

}
