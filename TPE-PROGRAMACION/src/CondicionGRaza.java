
public class CondicionGRaza extends CondicionG{
	
private String raza;
	
	public CondicionGRaza (String _raza) {
		
		raza=_raza;
		
	}
	/*
	public boolean compare(Grupo x) {
		return x.getRaza().equals(raza);
	}
	*/

	@Override
	public boolean compare(Grupo g) {
		// TODO Auto-generated method stub
		return false;
	}

}

