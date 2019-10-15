import java.util.ArrayList;

public class Grupo extends UnidadGanadera{
	
	private String nombre;
	private ArrayList<UnidadGanadera> animales;
	
	public Grupo() {
		
		animales = new ArrayList<UnidadGanadera>();
		
	}
	
	public void additem(UnidadGanadera x) {
		
		animales.add(x);
		
	}

}
