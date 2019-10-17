
public class CondicionAPeso extends CondicionA {
	
	private double peso;
	
	public CondicionAPeso (double _peso) {
		
		peso=_peso;
		
	}
	
	public boolean compare(Animal x) {
		return x.getPeso()>peso;
	}

}
