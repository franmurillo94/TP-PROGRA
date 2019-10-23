public class CondicionACapado extends CondicionA {
    @Override
    public boolean compare(Animal a) {
        return a.isCapado();
    }
}
