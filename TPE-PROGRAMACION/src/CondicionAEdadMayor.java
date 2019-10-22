
public class CondicionAEdadMayor extends CondicionA{
private double edad;
	
	public CondicionAEdadMayor(double _edad) {
		
		edad=_edad;
		
	}

	@Override
	public boolean compare(Animal x) {
		return x.getPeso()>edad;
	}

}
