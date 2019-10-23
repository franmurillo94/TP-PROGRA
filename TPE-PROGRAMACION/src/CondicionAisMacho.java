public class CondicionAisMacho implements CondicionA {
    @Override
    public boolean cumple(Animal a) {
        return a.isMacho();
    }
}
