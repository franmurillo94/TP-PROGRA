
public class SistemaGanadero {
	
	public static void main (String[]args) {
		
		Animal uno = new Animal(9,16.5,"Ferrari");
		Animal dos = new Animal(12,32.4,"Dark Phoenix");
		Animal tres = new Animal(11,29.3,"D Monkey");
		
		Grupo r_uno = new Grupo();
		Grupo r_dos = new Grupo();
		
		r_uno.additem(uno);
		r_uno.additem(dos);
		r_uno.additem(tres);
		r_uno.additem(r_dos);
		
		System.out.println(uno.getId());
		System.out.println(dos.getId());
		System.out.println(tres.getId());
		
		
	}

}
