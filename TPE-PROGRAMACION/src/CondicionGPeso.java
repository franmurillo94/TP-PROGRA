
public class CondicionGPeso extends CondicionG{
	
	private double peso;
	
	public CondicionGPeso (double _peso) {
		
		peso=_peso;
		
	}
	
	public boolean compare(Grupo x) {
		
		return x.getPromedioPeso()>peso;
	}

}
