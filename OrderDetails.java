//Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
// Tasks:Define a base class Order with common attributes like orderId and orderDate.
// Create a subclass ShippedOrder with additional attributes like trackingNumber.
// Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
// Implement a method getOrderStatus() to return the current order status based on the class level.

class Order{
    protected int orderId;
    protected String orderDate; 

    Order(int orderId, String orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }
    void getOrderStatus(){
        System.out.println("ORDER DETAILS\nYour order with ID "+orderId+" is placed on "+orderDate);
    }
}
class ShippedOrder extends Order{
    protected long trackingNumber;
    ShippedOrder(int orderId, String orderDate,long trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber=trackingNumber;
    }
    @Override
    void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Order shipped with tracking number: " + trackingNumber);
    }

}
class DeliveredOrder extends ShippedOrder{
    private String deliveryDate;
    DeliveredOrder(int orderId, String orderDate,long trackingNumber,String deliveryDate){
         super(orderId, orderDate,trackingNumber);
         this.deliveryDate=deliveryDate;
    }
    @Override
    void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Order will be delivered on: " + deliveryDate);
    }
}
class OrderDetails{
    public static void main(String[] args) {
        DeliveredOrder o=new DeliveredOrder(103, "2025-09-23", 987654321L, "2025-09-26");
        o.getOrderStatus();
    }
}