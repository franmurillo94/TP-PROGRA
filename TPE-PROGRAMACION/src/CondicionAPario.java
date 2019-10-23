public class CondicionAPario extends CondicionA{

    @Override
    public boolean compare(Animal a) {
        return a.getCant_terneros() != 0;
    }
}
