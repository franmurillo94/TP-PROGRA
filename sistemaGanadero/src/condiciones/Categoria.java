package condiciones;

import sistema.Animal;

public class Categoria{
    CondicionA criterios;
    String nombre;

    public Categoria(String nombre, CondicionA c) {
        this.criterios = c;
        this.nombre = nombre;
    }

    public boolean pertence(Animal a) {
        return criterios.cumple(a);
    }

    @Override
    public String toString() {
        return "Pertenece a la Categoria: " + nombre;
    }
}
