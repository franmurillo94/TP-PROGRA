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
	
	// METODOS ARRAYLIST
		public void additem(Animal x) {
			
			animales.add(x);
			
		}
		public void removeitem(int x) {
			animales.remove(x);
		
		}

	// METODOS LLENAR CAMION	
		
		public void subirAnimal(Animal x) {
			
			if (c1.compare(x)&&animales.size()<=capacidad) {
				animales.add(x);
			}
		}
		
		
		
		
		
}
