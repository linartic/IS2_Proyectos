package ulima.Decorator;

public abstract class Decorator extends Beverage {

    protected Beverage decorado;

    public Decorator(String description, Beverage decorado) {
        super(description);
        this.decorado = decorado;
    }

    @Override
    public abstract float cost();
}
