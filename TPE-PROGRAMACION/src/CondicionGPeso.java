public class CondicionGPeso implements CondicionG{
	
	private double peso;
	
	public CondicionGPeso (double _peso) {
		
		peso=_peso;
		
	}
	
	public boolean cumple(Grupo x) {
		
		return x.getPromedioPeso()>peso;
	}

}
