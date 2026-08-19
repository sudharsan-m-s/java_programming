class Vehicle
{
    int vehicleNo;
    String brand;
    double price;
    Vehicle(int n, String b, double p)
    {
        this.vehicleNo = n;
        this.brand = b;
        this.price = p;
    }
    void displayVehicleDetails()
    {
        System.out.println("Vehicle No:      "+vehicleNo);
        System.out.println("Vehicle Brand:   "+brand);
        System.out.println("Vehicle Price:   "+price);
    }
    double calculateDiscount()
    {
        return 0.05*price;
    }
}

class ElectricCar extends Vehicle 
{
    double batteryCapacity;
    double evBonusDiscount;

    public ElectricCar(int n, String b, double p, double bc, double dis) {
        super(n,b,p);
        this.batteryCapacity = bc;
        this.evBonusDiscount = dis;
    }
    void displayElectricCarDetails()
    {
        super.displayVehicleDetails();
        System.out.println("Battery Capacity    :"+batteryCapacity);
        System.out.println("EV Bonus Discount   :"+evBonusDiscount);
    }
    void calculateFinalPrice()
    {
        double discount = super.calculateDiscount() + evBonusDiscount;
        double fp = (super.price - discount);
        System.out.println("Vehicle Discount(5%)    :"+ super.calculateDiscount());
        System.out.println("Final Price             :"+fp);
    }   
}
public class EVMain
{
    public static void main(String[] args) {
        ElectricCar e1 = new ElectricCar(1011,"Benz",475000.30,60,45000);
        e1.displayElectricCarDetails();
        e1.calculateFinalPrice();
    }
}