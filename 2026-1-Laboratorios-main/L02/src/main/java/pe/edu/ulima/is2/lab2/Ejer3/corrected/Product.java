package pe.edu.ulima.is2.lab2.Ejer3.corrected;

public abstract class Product {

    protected String name;
    protected double basePrice;

    public Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public abstract double calculatePrice();

    public String getName() {
        return name;
    }
    public double getBasePrice() {
        return basePrice;
    }

}
