public class CondicionAEdadMenor extends CondicionA {
    private int edad;

    public CondicionAEdadMenor(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean compare(Animal a) {
        return a.getEdad()<edad;
    }

}
