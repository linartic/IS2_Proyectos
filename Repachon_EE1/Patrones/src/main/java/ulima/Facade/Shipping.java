package ulima.Facade;

import java.util.List;

public class Shipping {
    public float calcularShipping(List<Item> items){

        float costo = 10f; //costo de envio
        return items.size() * costo;
    }
}
