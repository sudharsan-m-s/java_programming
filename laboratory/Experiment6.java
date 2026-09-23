interface RemoteControl
{
    public void turnON();
    public void turnOFF();
}

abstract class Appliance
{
    abstract void displayAppliance();
}

class SmartTV extends Appliance implements RemoteControl
{
    @Override
    public void turnON()
    {
        System.out.println("TV turned ON");
    }
    @Override
    public void turnOFF()
    {
        System.out.println("TV turned OFF");
    }
    public void displayAppliance()
    {
        System.out.println("Appliance : Smart TV");
    }
}

public class InterfacesMain {
    public static void main(String[] args) {

        // Dynamic Method Dispatch
        Appliance a = new SmartTV();

        a.displayAppliance();

        // Parent reference cannot directly access interface methods
        SmartTV tv = (SmartTV) a;

        tv.turnON();
        tv.turnOFF();
    }
}
