
public class CondicionARaza extends CondicionA {
	
private String raza;
	
	public CondicionARaza (String _raza) {
		
		raza=_raza;
		
	}
	
	public boolean compare(Animal x) {
		return x.getRaza().equals(raza);
	}

}

