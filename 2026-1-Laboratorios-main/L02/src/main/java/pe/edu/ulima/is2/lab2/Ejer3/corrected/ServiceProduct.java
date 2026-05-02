package pe.edu.ulima.is2.lab2.Ejer3.corrected;

public class ServiceProduct extends Product implements Serviceable{

    private int duration;

    public ServiceProduct(String name, double basePrice, int duration) {
        super(name, basePrice);
        this.duration = duration;
    }

    @Override
    public double calculatePrice() {
        return basePrice * 1.1;
    }

    @Override
    public void scheduleService() {
        System.out.println("Servicio reservado con exito");
    }

    @Override
    public int getServiceDuration() {
        return duration;
    }
}

/*
    @Override
    public double calculatePrice() {
        return basePrice * 1.1; // Incluye comisión de servicio
    }

    @Override
    public double calculateShippingCost() {
        // VIOLACIÓN LSP: Los servicios no se envían físicamente
        return 0.0; // Comportamiento inconsistente - debería ser null o excepción
    }

    @Override
    public boolean requiresPhysicalDelivery() {
        return false;
    }
* */