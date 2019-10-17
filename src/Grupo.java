import java.util.ArrayList;
import java.util.Iterator;

public class Grupo extends UnidadGanadera{
	
	private String nombre;
	private ArrayList<UnidadGanadera> animales;
	
	public Grupo() {
		
		animales = new ArrayList<UnidadGanadera>();
		
	}
	
	public void additem(UnidadGanadera x) {
		
		animales.add(x);
		
	}

	public int getCantAnimales() {
		return animales.size();
	}

	public double promEdad() {
		double promEdad = 0;
		Iterator<UnidadGanadera> it = animales.iterator();
		while (it.hasNext()) {
			promEdad += (it.next().getEdad());
		}
		return promEdad/animales.size();//Tengo serias dudas al respecto considerando 01:38a.m.
	}

	@Override
	public int getEdad() {
		return 0;
	}

	@Override
	public double getPeso() {
		double pesoTotal = 0;
		Iterator<UnidadGanadera> it = animales.iterator();
		while (it.hasNext()) {
			pesoTotal += it.next().getPeso();
		}
		return pesoTotal;
	}

	@Override
	public double getPromPeso() {
		// TODO Auto-generated method stub
		return 0;
	}


}
