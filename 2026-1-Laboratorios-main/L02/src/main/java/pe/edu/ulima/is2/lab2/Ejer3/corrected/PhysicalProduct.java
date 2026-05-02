package pe.edu.ulima.is2.lab2.Ejer3.corrected;

public class PhysicalProduct extends Product implements Shippable{

    private double weight;

    public PhysicalProduct(String name, double basePrice, double weight) {
        super(name, basePrice);
        this.weight = weight;
    }

    @Override
    public double calculatePrice() {
        return basePrice * 1.15;
    }

    @Override
    public double calculateShipingCost() {
        return weight * 2.5;
    }

    @Override
    public boolean requiresPhysicalDelivery() {
        return true;
    }
}

/*
 @Override
    public double calculatePrice() {
        return basePrice * 1.15; // Incluye impuestos
    }

    @Override
    public double calculateShippingCost() {
        return weight * 2.5; // $2.5 por kg
    }

    @Override
    public boolean requiresPhysicalDelivery() {
        return true;
    }
* */
