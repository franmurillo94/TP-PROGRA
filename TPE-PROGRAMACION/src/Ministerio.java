import java.util.HashSet;
import java.util.Set;

public class Ministerio {

    private Set<Categoria> categorias = new HashSet<>();

    public Set<Categoria> getCategorias(Animal a) {
        Set<Categoria> categoria = new HashSet<>();
        for (Categoria cat :
                categorias) {
            if (cat.pertence(a))
                categoria.add(cat);
        }
        return categoria;
    }

    public void addCategorias(Categoria c) {
        categorias.add(c);
    }
}
