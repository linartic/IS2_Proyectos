package pe.edu.ulima.is2.lab2.Ejer4.corrected;

public class ShippingOrderProcessor implements OrderManager, ShippingService{
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

    @Override
    public void calculateShippingCost(String orderId) {
        System.out.println("Calculando precio de envio de:" + orderId);
    }

    @Override
    public void scheduleDelivery(String orderId, String deliveryDate) {
        System.out.println("Entrega confirmada para la fecha: "+deliveryDate);
    }

    @Override
    public void trackShipment(String orderId) {
        System.out.println("Su paquete se encuentra en camino");
    }
}
