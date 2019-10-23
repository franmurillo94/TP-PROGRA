public class CondicionAPario implements CondicionA{

    @Override
    public boolean cumple(Animal a) {
        return a.getCant_terneros() != 0;
    }
}
