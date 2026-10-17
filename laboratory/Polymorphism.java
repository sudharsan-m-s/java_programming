//Experiment 5

class Payment{
    void makePayment(double am)
    {
        System.out.println("Payment Successful");
    }

    void makePayment(double am, String UPIId)
    {
        System.out.println("Payment Successful thorugh UPI");        
    }

    void makePayment(double am,long cardNum, String bank )
    {
        System.out.println("Payment of " + am + " is successful through Credit Card Transaction of "+bank);
    }
}

class UPIPayment extends Payment{
    @Override
    void makePayment(double amount)
    {
        System.out.println("Payment sucessful through UPI (runtime polymorphism)");
    }
}

public class Polymorphism{
    public static void main(String[] args) {
        UPIPayment u = new UPIPayment();
        u.makePayment(300.56);
        u.makePayment(500.00, "sudharsan@upi");
        u.makePayment(1000.00, 1234567890L, "SBI");

        System.out.println();

        // Runtime polymorphism
        Payment p = new UPIPayment();
        p.makePayment(750.00);
    }
}