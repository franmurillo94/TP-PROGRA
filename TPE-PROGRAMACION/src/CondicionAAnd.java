public class CondicionAAnd implements CondicionA{
	
	private CondicionA c1;
	private CondicionA c2;
	
	public CondicionAAnd (CondicionA _c1, CondicionA _c2) {
		
		c1 = _c1;
		c2 = _c2;
		
	}
	
	
	public boolean cumple(Animal x) {
		
		return c1.cumple(x)&&c2.cumple(x);
	}
	
	

}
