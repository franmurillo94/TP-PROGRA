
public class CondicionGEdad extends CondicionG {
	
	private double edad;

	public CondicionGEdad (double _edad) {
	
		edad=_edad;
	}

	public boolean compare(Grupo x) {
		return x.getPromedioEdad()>edad; 
	}
}
