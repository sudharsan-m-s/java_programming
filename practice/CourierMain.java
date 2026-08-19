import java.util.Scanner;
class Courier
{
    String bookingId;
    String senderName;
    long phoneNumber;
    String senderLocation;
    String receiverLocation;
    double parcelWeight;
    double courierCharge;
    static String companyName = "FastTrack Couriers";

    Courier(String book_id)
    {
        this.bookingId = book_id;
    }

    static int addInsuranceCharge()
    {
        return 20;
    }

    void setSenderDetails(String name, long ph, String sLoc, String rLoc, double weight)
    {
        senderName = name;
        phoneNumber = ph;
        senderLocation = sLoc;
        receiverLocation = rLoc;
        parcelWeight = weight;
    }

    double calculateCharge(double parcelWeight)
    {
        double charge;
        if (parcelWeight < 1)
            charge = parcelWeight*50;
        else if (parcelWeight > 5)
            charge = parcelWeight*150;
        else
            charge = parcelWeight*100;
        courierCharge = charge + addInsuranceCharge();
        return courierCharge;
    }

    double calculateCharge(double parcelWeight, String type)
    {
        double charge;
        if (parcelWeight < 1)
            charge = parcelWeight*100;
        else if (parcelWeight > 5)
            charge = parcelWeight*300;
        else
            charge = 200;
        courierCharge = charge + addInsuranceCharge();
        return courierCharge;
    }

    void displayBookingDetails()
    {
        System.out.println();
        System.out.println("--------- YOUR BOOKING DETAILS------------");
        System.out.println("Company Name: "+ companyName);
        System.out.println("Booking_ID: "+bookingId);
        System.out.println("Sender Name: "+ senderName);
        System.out.println("Phone Number: "+ phoneNumber);
        System.out.println("Sender Location: "+ senderLocation);
        System.out.println("Receiver Location: "+ receiverLocation);
    }
}
public class CourierMain
{
    static
        {
        System.out.println("Loading Courier Management System...");
        System.out.println("Company Name : "+ Courier.companyName);
        System.out.println();
    }
    public static void main(String[] a)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sender's name: ");
        String name = sc.nextLine();
        System.out.println("Enter phone number: ");
        long num = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter sender's location: ");
        String sLoc = sc.nextLine();
        System.out.println("Enter receiver's location: ");
        String rLoc = sc.nextLine();
        String book_id = name + "_1";
        System.out.println("Enter parcel weight: ");
        double w = sc.nextDouble();


        Courier c1 = new Courier(book_id);
        c1.setSenderDetails(name, num, sLoc, rLoc,w);


        System.out.println();
        System.out.println("Service Type:");
        System.out.println("1.Standard \n2.Express");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                c1.calculateCharge(w);
                break;
            case 2:
                c1.calculateCharge(w,"Express");
                break;
            default:
                System.out.println("Invalid choice");
        }

        c1.displayBookingDetails();
    
    }
}