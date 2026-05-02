package pe.edu.ulima.is2.lab2.Ejer1.corrected;

public class UserReportGenerator {
    private DiscountCalculator mDiscountCalculator;

    public UserReportGenerator(DiscountCalculator mDiscountCalculator) {
        this.mDiscountCalculator = mDiscountCalculator;
    }

    public String generateUserReport(User usuario) {

        return "=== REPORTE DE USUARIO ===\n"
                + "Nombre: " + usuario.getName() + "\n"
                + "Email: " + usuario.getEmail() + "\n"
                + "Tipo: " + usuario.getUserType() + "\n"
                + "Total Compras: $" + usuario.getTotalPurchases() + "\n"
                + "Descuento Aplicable: " + (mDiscountCalculator.calculateDiscount(usuario) * 100) + "%\n";
    }

}
