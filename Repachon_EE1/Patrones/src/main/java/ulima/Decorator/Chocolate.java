package ulima.Decorator;

public class Chocolate extends Decorator {
    public Chocolate(String description, Beverage decorado) {
        super(description, decorado);
    }

    @Override
    public float cost() {

        return decorado.cost() + 4f; //costo del q estamos decorando + valor x chocolate
    }
}
