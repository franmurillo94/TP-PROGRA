public class CondicionGEdad implements CondicionG {
	
	private double edad;

	public CondicionGEdad (double _edad) {
	
		edad=_edad;
	}

	public boolean cumple(Grupo x) {
		return x.getPromedioEdad()>edad; 
	}
}
