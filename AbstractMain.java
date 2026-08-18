import java.util.Scanner;
abstract class Order {

    int orderId;
    String customerName;
    double orderAmount;

    Order(int i, String n, double am)
    {
        this.orderId = i;
        this.customerName = n;
        this.orderAmount = am;
    }

    void displayOrderDetails() {
        System.out.println("Order ID:        " + orderId);
        System.out.println("Customer Name:   " + customerName);
        System.out.println("Order Amount:    " + orderAmount);
        System.out.println();
    }

    abstract double calculateBill();
}

interface DeliveryTracking {
    void trackDelivery();
}

class RestaurantOrder extends Order implements DeliveryTracking{
    static{
        System.out.println("---------RESTAURANT ORDER---------");
    }

    RestaurantOrder(int i, String n, double am) {
        super(i,n,am);
    }
    double calculateBill()
    {
        return orderAmount + (orderAmount*0.05);
    }
    public void trackDelivery()
    {
        System.out.println("Delivery Partner Assigned");
        System.out.println();
    }
}

class CloudKitchenOrder extends Order implements DeliveryTracking{
    static{
        System.out.println("---------CLOUD KITCHEN ORDER---------");
    }
    CloudKitchenOrder(int i, String n, double am) {
        super(i,n,am);
    }
    double calculateBill()
    {
        return orderAmount + 30;
    }
    public void trackDelivery()
    {
        System.out.println("Order is being prepared for pickup");
        System.out.println();
    }
}
public class AbstractMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Restaurant Order Details");
        System.out.println("Order ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Customer Name: ");
        String name1 = sc.nextLine();
        System.out.println("Order Amount: ");
        double am1 = sc.nextDouble();
        RestaurantOrder r1 = new RestaurantOrder(id1,name1,am1);
        r1.displayOrderDetails();
        System.out.println("Final Bill: "+r1.calculateBill());
        r1.trackDelivery();

        System.out.println("Enter Cloud Kitchen Order Details");
        System.out.println("Order ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Customer Name: ");
        String name2 = sc.nextLine();
        System.out.println("Order Amount: ");
        double am2 = sc.nextDouble();
        CloudKitchenOrder c1 = new CloudKitchenOrder(id2,name2,am2);
        c1.displayOrderDetails();
        System.out.println("Final Bill: "+c1.calculateBill());
        c1.trackDelivery();
        



    }
}
