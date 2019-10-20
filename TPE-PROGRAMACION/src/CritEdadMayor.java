public class CritEdadMayor implements Criterio {
    private int edad;

    public CritEdadMayor(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean cumpleCrit(Animal a) {
        return a.getEdad()>edad;
    }
}
