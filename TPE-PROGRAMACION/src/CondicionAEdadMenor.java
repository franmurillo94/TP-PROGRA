public class CondicionAEdadMenor implements CondicionA {
    private int edad;

    public CondicionAEdadMenor(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean cumple(Animal a) {
        return a.getEdad()<edad;
    }

}
