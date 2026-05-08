package ulima.Facade;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    List<Item> items;

    public Inventario(){
        this.items = new ArrayList<>(); //constructor
    }

    public boolean existeItem(Item item){
        for(Item i : items){
            if(i.getNombre().equals(item.getNombre()) && i.getCantidad() >= item.getCantidad()){
                return true; //encuentra el obj Y hay STOCK suficiente para su demanda
            }
        }
        return false; //No enuentra y/o no hay stock
    }

    public void addItem(Item item){
        items.add(item);
    }
}
