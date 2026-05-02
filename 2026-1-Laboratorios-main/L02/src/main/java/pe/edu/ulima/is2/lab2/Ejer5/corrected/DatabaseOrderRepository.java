package pe.edu.ulima.is2.lab2.Ejer5.corrected;

public class DatabaseOrderRepository implements OrderRepository {
    @Override
    public void saveOrder(String orderData) {
        System.out.println("Guardando data...\n"+ orderData);
    }

    @Override
    public String getCustomerData(String customerID) {
        return customerID;
    }
}
