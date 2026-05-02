package pe.edu.ulima.is2.lab2.Ejer1.corrected;

public class DiscountCalculator {

    public double calculateDiscount(User usuario) {
        switch (usuario.getUserType()) {
            case "PREMIUM":
                return usuario.getTotalPurchases() > 1000 ? 0.20 : 0.15;
            case "VIP":
                return usuario.getTotalPurchases() > 2000 ? 0.30 : 0.25;
            default:
                return usuario.getTotalPurchases() > 500 ? 0.10 : 0.05;
        }
    }
}
