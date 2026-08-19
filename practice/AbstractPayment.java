import java.util.Scanner;

abstract class Payment
{
    double amount;
    Payment (double am)
    {
        this.amount = am;
    
    }
    void showAmount()
    {
        System.out.println("Amount:  "+amount);
    }

    abstract void makePayment();
}

class UPIPayment extends Payment
{
    String upiId;

    public UPIPayment(double a, String id) {
        super(a);
        this.upiId = id;
    }
    
    void makePayment()
    {
        System.out.println("Processing UPI Payment...");
        System.out.println("UPI ID: "+upiId);
        System.out.println("Payment successful!");
    }
}

class CreditCardPayment extends Payment
{
    long cardNumber;

    CreditCardPayment(double a, long num) {
        super(a);
        this.cardNumber = num;
    }
    
    void makePayment()
    {
        System.out.println("Processing Credit Card Payment...");
        System.out.println("Card number: "+cardNumber);
        System.out.println("Payment successful!");
    }
}

public class AbstractPayment
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("UPI PAYMENT");
        System.out.println("Enter Amount: ");
        double am1 = input.nextDouble();
        input.nextLine();
        System.out.println("Enter UPI ID: ");
        String id = input.nextLine();
        UPIPayment u = new UPIPayment(am1,id);
        u.showAmount();
        u.makePayment();
        System.out.println();

        System.out.println("CREDIT CARD PAYMENT");
        System.out.println("Enter Amount: ");
        double am2 = input.nextDouble();
        System.out.println("Enter Card NUmber: ");
        long n = input.nextLong();
        CreditCardPayment c = new CreditCardPayment(am2,n);
        c.showAmount();
        c.makePayment();
    }
}