public class CritCapado implements Criterio {
    @Override
    public boolean cumpleCrit(Animal a) {
        return a.isCapado();
    }
}
