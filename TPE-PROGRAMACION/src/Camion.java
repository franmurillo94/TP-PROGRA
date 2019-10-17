import java.util.ArrayList;

public class Camion {
	
	private ArrayList<Animal> animales;
	private CondicionA c1;
	private int capacidad;
	
	public Camion(CondicionA c, int cap) {
		
		animales = new ArrayList<Animal>();
		c1 = c;
		capacidad = cap;
	}
	
	public CondicionA getCondicion() {
		return c1;
	}
	
	// METODOS ARRAYLIST
		public boolean additem(Animal x) {
			if (animales.size()<=capacidad) {
				
				animales.add(x);
			return true;
			}
			return false;
		}
		public void removeitem(int x) {
			animales.remove(x);
		
		}

	// METODOS CAMION
		
		
		
		
		
		
		
		
}
