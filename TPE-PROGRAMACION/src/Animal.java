
public class Animal extends UnidadGanadera {
	
	static private int id=0;
	private int myid;
	private int edad;
	private double peso;
	private String raza;
	private boolean sexo;
	private boolean capado;
	private boolean terneros;
	private int cant_terneros;
	
	public Animal () {
		id++;
	}
	
	public Animal ( int _edad, double _peso, String _raza) {
		
		id++;
		myid=id;
		edad = _edad;
		peso = _peso;
		raza = _raza;
		
	}

	// GETTERS Y SETTERS
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
  
	public boolean isCapado() {
		return capado;
	}

	public void setCapado(boolean capado) {
		this.capado = capado;
	}

	public boolean isTerneros() {
		return terneros;
	}

	public void setTerneros(boolean terneros) {
		this.terneros = terneros;
	}

	public int getCant_terneros() {
		return cant_terneros;
	}

	public void setCant_terneros(int cant_terneros) {
		this.cant_terneros = cant_terneros;
	}
	
	public int getId() {
		return myid;
	}
	
	public int getCantidad() {
		return 1;
	}

	
}
