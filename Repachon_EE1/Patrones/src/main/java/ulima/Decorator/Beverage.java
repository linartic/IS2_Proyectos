package ulima.Decorator;

public abstract class Beverage {

    private String description;

    public Beverage(String description) {
        this.description = description;
    }


    public String getDescription() {
        return description;
    }

    public abstract  float cost();
}
