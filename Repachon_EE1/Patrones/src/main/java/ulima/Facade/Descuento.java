package ulima.Facade;

import java.util.List;

public class Descuento {

    public float aplicarDescuento(List<Item> items){
        float total = 0f; //si es float siempre poner 'f' al final
        if(items.size() <= 10){
            return 0f;
        }

        for(Item i : items){
            total += i.getPrecio();
        }

        return total * 0.1f; //descuentito
    }

}
