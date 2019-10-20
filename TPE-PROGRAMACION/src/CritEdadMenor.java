public class CritEdadMenor implements Criterio {
    private int edad;

    public CritEdadMenor(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean cumpleCrit(Animal a) {
        return a.getEdad()<edad;
    }
}
