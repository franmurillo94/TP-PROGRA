import java.util.ArrayList;
public class SistemaGanadero {
	public SistemaGanadero() {
		ArrayList<UnidadGanadera> unidades = new ArrayList<>();
	}

	public static void main (String[]args) {

		Animal v1 = new Animal(9,20,"Ferrari", true);
		Animal v2 = new Animal(10,20,"Dark Phoenix", true);
		Animal v3 = new Animal(10,20,"D Monkey", false);
		Animal v4 = new Animal(10,30,"D Monkey", false);
		Animal v5 = new Animal(10,30,"Dark Phoenix", true);
		Animal v6 = new Animal(10,30,"D Monkey", false);
		Animal v7 = new Animal(20,20,"Ferrari", true);
		Animal v8 = new Animal(20,20,"Dark Phoenix", false);
		Animal v9 = new Animal(20,20,"D Monkey", true);
		Animal v10 = new Animal(20,30,"D Monkey", true);
		Animal v11 = new Animal(20,30,"Dark Phoenix", false);
		Animal v12 = new Animal(20,30,"D Monkey", true);
		Animal v13 = new Animal(7,200, "Richarson", true);
		Animal v14 = new Animal(16,200, "Richarson", false);
		Animal v15 = new Animal(10,200, "Richarson", true);
		Animal v16 = new Animal(10,200, "Richarson", false);
		Animal v17 = new Animal(32,200, "Richarson", true);



		Grupo rod1 = new Grupo();
		Grupo rod2 = new Grupo();
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
        rod3.additem(v13);
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

		//Nuevas pruebas
		v13.setCapado(true);
		v14.setCant_terneros(3);

		CondicionAisMacho macho = new CondicionAisMacho();
		CondicionANegada hembra = new CondicionANegada(macho);
		CondicionACapado capon = new CondicionACapado();
		CondicionANegada caponN = new CondicionANegada(capon);
		CondicionAPario parida = new CondicionAPario();
		CondicionANegada paridaN = new CondicionANegada(parida);
		CondicionAEdadMenor menor8 = new CondicionAEdadMenor(8);
		CondicionANegada menor8N = new CondicionANegada(menor8);
        CondicionAEdadMenor menor12 = new CondicionAEdadMenor(12);
		CondicionANegada menor12N = new CondicionANegada(menor12);
        CondicionAEdadMenor menor24 = new CondicionAEdadMenor(24);
		CondicionANegada menor24N = new CondicionANegada(menor24);
        CondicionAEdadMenor menor15 = new CondicionAEdadMenor(24);
		CondicionANegada menor15N = new CondicionANegada(menor15);
        CondicionAEdadMenor menor48 = new CondicionAEdadMenor(48);
		CondicionANegada menor48N = new CondicionANegada(menor48);
		CondicionAAnd mayor7menor12 = new CondicionAAnd(menor8N ,menor12);
		CondicionAAnd mayor11menor24 = new CondicionAAnd(menor12N, menor24);
		CondicionAAnd mayor23menor48 = new CondicionAAnd(menor24N, menor48);
		CondicionAAnd mayor12menor48 = new CondicionAAnd(menor12N, menor48);
		CondicionAAnd mayor12menor48Capon = new CondicionAAnd(mayor12menor48, capon);
		CondicionAAnd mayor15Noparida = new CondicionAAnd(menor15N, paridaN);
		CondicionAAnd mayor15NoparidaHembra = new CondicionAAnd(mayor15Noparida, hembra);
		CondicionAAnd mayor15parida = new CondicionAAnd(menor15N, parida);
		CondicionAAnd mayor15paridaHembra= new CondicionAAnd(mayor15parida, parida);
		CondicionAAnd mayor48Capon = new CondicionAAnd(menor48N, capon);
		CondicionAAnd machoCapoN = new CondicionAAnd(macho, caponN);



		Categoria lechal = new Categoria("Lechal", menor8);
		Categoria ternero = new Categoria("Ternero", mayor7menor12);
		Categoria aniojo = new Categoria("Añojo", mayor11menor24);
		Categoria novillo = new Categoria("Novillo", mayor23menor48);
		Categoria cebon = new Categoria("Cebón", mayor12menor48Capon);
		Categoria vaquillona = new Categoria("Vaquillona", mayor15NoparidaHembra);
		Categoria vaca = new Categoria("Vaca", mayor15paridaHembra);
		Categoria buey = new Categoria("Buey", mayor48Capon);
		Categoria toro = new Categoria("Toro", machoCapoN);

		Ministerio minEsp = new Ministerio();
		minEsp.addCategorias(lechal);
		minEsp.addCategorias(ternero);
		minEsp.addCategorias(aniojo);
		minEsp.addCategorias(novillo);
		minEsp.addCategorias(cebon);
		minEsp.addCategorias(vaquillona);
		minEsp.addCategorias(vaca);
		minEsp.addCategorias(buey);
		minEsp.addCategorias(toro);

		minEsp.getCategorias(v13);
		minEsp.getCategorias(v14);
		minEsp.getCategorias(v15);
		minEsp.getCategorias(v16);
		minEsp.getCategorias(v17);

		/////////////////////////////////////////////////////////
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
