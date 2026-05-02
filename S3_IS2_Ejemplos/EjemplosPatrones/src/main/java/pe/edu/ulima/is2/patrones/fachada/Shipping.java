package pe.edu.ulima.is2.patrones.fachada;

import java.util.List;

public class Shipping {

    public float calcularShipping(List<Item> items){
        float costo = 10f;

        return items.size() * costo;
    }
}
