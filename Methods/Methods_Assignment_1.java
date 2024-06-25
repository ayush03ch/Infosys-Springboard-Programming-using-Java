class Order {
    int orderId;
    String orderedFoods;
    double totalPrice;
    String status;

    public double calculateTotalPrice(int unitPrice) {
        totalPrice = unitPrice + (unitPrice * 0.05);
        return totalPrice;
    }
}

public class Methods_Assignment_1 {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderId = 101;
        order.orderedFoods = "Spinach Alfredo Pasta";
        order.status = "Ordered";
        
        int unitPrice = 33; 
        order.calculateTotalPrice(unitPrice);

        System.out.println("Order Details");
        System.out.println("Order Id: " + order.orderId);
        System.out.println("Ordered Food: " + order.orderedFoods);
        System.out.println("Order Status: " + order.status);
        System.out.println("Total Price: " + order.totalPrice);
    }
}
