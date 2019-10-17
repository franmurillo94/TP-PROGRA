
public class SistemaGanadero {
	
	public static void main (String[]args) {
		
		Animal v1 = new Animal(10,20,"Ferrari");
		Animal v2 = new Animal(10,20,"Dark Phoenix");
		Animal v3 = new Animal(10,20,"D Monkey");
		Animal v4 = new Animal(10,30,"D Monkey");
		Animal v5 = new Animal(10,30,"Dark Phoenix");
		Animal v6 = new Animal(10,30,"D Monkey");
		Animal v7 = new Animal(20,20,"Ferrari");
		Animal v8 = new Animal(20,20,"Dark Phoenix");
		Animal v9 = new Animal(20,20,"D Monkey");
		Animal v10 = new Animal(20,30,"D Monkey");
		Animal v11 = new Animal(20,30,"Dark Phoenix");
		Animal v12 = new Animal(20,30,"D Monkey");
		
		Grupo rod1 = new Grupo();
		Grupo rod2 =new Grupo();
		Grupo rod3 = new Grupo();
		Grupo est1 = new Grupo();
		Grupo emp1 = new Grupo();
		
		rod1.additem(v1);
		rod1.additem(v2);
		rod1.additem(v3);
		rod2.additem(v4);
		rod2.additem(v5);
		rod2.additem(v6);
		rod3.additem(v7);
		rod3.additem(v8);
		rod3.additem(v9);
		est1.additem(rod1);
		est1.additem(rod2);
		est1.additem(v10);
		emp1.additem(est1);
		emp1.additem(rod3);
		emp1.additem(v11);
		emp1.additem(v12);	
		
		CondicionGPeso c1 = new CondicionGPeso(20);
		CondicionGEdad c2 = new CondicionGEdad(32);
		CondicionGAnd c3 = new CondicionGAnd(c1,c2);
		CondicionGOr c4 = new CondicionGOr(c1,c2);

			
		System.out.println(emp1.getClass().getSimpleName());
		System.out.println("se puede vender si pesa promedio del grupo mas de : " + emp1.isVendible(c1));
		System.out.println("se puede vender si edad promedio del grupo mas de :" + emp1.isVendible(c2));
		System.out.println("se puede si ambas cumplen: " + emp1.isVendible(c3));
		System.out.println("se puede si una de las dos cumple: " + emp1.isVendible(c4));
		
		System.out.println("El peso total de la hacienda es de "+ emp1.getPeso());
		System.out.println("La cantidad de hacienda es de "+ emp1.getCantidad());
		System.out.println("El peso promedio de la hacienda es de " + emp1.getPromedioPeso());
		System.out.println("La edad promedio de la hacienda es de " + emp1.getPromedioEdad());
		
	}

}
