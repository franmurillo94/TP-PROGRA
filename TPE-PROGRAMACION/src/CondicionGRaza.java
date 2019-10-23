public class CondicionGRaza implements CondicionG{
	
private String raza;
	
	public CondicionGRaza (String _raza) {
		
		raza=_raza;
		
	}
	/*
	public boolean cumple(Grupo x) {
		return x.getRaza().equals(raza);
	}
	*/

	@Override
	public boolean cumple(Grupo g) {
		// TODO Auto-generated method stub
		return false;
	}

}

