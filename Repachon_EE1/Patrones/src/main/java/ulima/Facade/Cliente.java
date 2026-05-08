package ulima.Facade;

import java.util.ArrayList;
import java.util.List;

/* PATRON FACADE
    - "niveles" de un software
    - lo primera q se presenta al entrar a esa capa de funcionalidad

    **PARTICIPANTES**
    1. Interface - IFacade
    2. Clase - Cliente
    3. Clase - FacadeImplementar
*/

public class Cliente {

    static void main() {

        List<Item> Carrito = new ArrayList<>();
        Carrito.add(new Item("compu",12,500f));
        Carrito.add(new Item("compu",12,500f));
        Carrito.add(new Item("compu",12,500f));
        Carrito.add(new Item("compu",12,500f));
        Carrito.add(new Item("compu",12,500f));
        Carrito.add(new Item("compu",12,500f));
        Carrito.add(new Item("compu",12,500f));
        Carrito.add(new Item("compu",12,500f));
        Carrito.add(new Item("compu",12,500f));
        Carrito.add(new Item("compu",12,500f));
        Carrito.add(new Item("compu",12,500f));

        comprar(Carrito);
    }

    public static void comprar(List<Item> carrito){
        VentasManager manager = VentasManager.getInstance(); //unica instancia del Manager (Singleton)

        if(!manager.validarStock(carrito)){
            return;
        }
        float desc = manager.calcularDescuento(carrito);
        float costoShip = manager.calcularCostoShipping(carrito);


    }

}
