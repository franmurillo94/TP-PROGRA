public class CritPario implements Criterio{
    @Override
    public boolean cumpleCrit(Animal a) {
        return a.getCant_terneros() != 0;
    }
}
