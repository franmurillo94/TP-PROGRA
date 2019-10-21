import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class Categoria {
    ArrayList<Criterio> criterios;
    String nombre;

    public Categoria(ArrayList<Criterio> criterios, String nombre) {
        this.criterios = criterios;
        this.nombre = nombre;
    }

    public Categoria(String nombre) {
        this.criterios = new ArrayList<Criterio>();
        this.nombre = nombre;
    }

    public boolean pertence(Animal a) {
        boolean pert = true;
        for (Criterio c :
                criterios) {
            pert = pert && c.cumpleCrit(a);
        }
        return pert;
    }

    public void addCriterio(Criterio c) {
        criterios.add(c);
    }

    public void removeCriterio(Criterio c) {
        criterios.remove(c);
    }

    @Override
    public String toString() {
        return "Pertenece a la Categoria: " + nombre;
    }
}
