public class CondicionAisMacho extends CondicionA {
    @Override
    public boolean compare(Animal a) {
        return a.isMacho();
    }
}
