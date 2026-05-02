package pe.edu.ulima.is2.lab2.Ejer4.corrected;

public class BasicOrderProcessor implements OrderManager{
    @Override
    public void createOrder(String customerId, String[] productIds) {
        System.out.println("Cliente "+customerId+", tu orden ha sido creada con exito!!");
    }

    @Override
    public void cancelOrder(String orderId) {
        System.out.println("Cancelando orden N° "+orderId+"...");
    }

    @Override
    public void updateOrderStatus(String orderId, String status) {
        System.out.println("Nuevo estado del pedido "+orderId+": "+status);
    }
}
