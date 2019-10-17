
public class CondicionAEdad {
private double edad;
	
	public CondicionAEdad (double _edad) {
		
		edad=_edad;
		
	}
	
	public boolean compare(Animal x) {
		return x.getPeso()>edad;
	}

}
