package pe.edu.ulima.is2.lab2.Ejer5.corrected;

public class MockRepository implements OrderRepository{
    @Override
    public void saveOrder(String orderData) {
        System.out.println("MockRepository - guardado con exito: "+orderData);
    }

    @Override
    public String getCustomerData(String customerID) {
        return "user_"+customerID;
    }
}
