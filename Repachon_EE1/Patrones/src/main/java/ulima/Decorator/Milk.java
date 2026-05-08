package ulima.Decorator;

public class Milk extends  Decorator{
    public Milk(String description, Beverage decorado) {
        super(description, decorado);
    }

    @Override
    public float cost() {
        return decorado.cost() + 2f; //2so extra x la leche
    }
}
