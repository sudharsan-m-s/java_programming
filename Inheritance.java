class Account{
    String accHolder;
    String accNumber;
    Account(String name, String num)
    {
        this.accHolder = name;
        this.accNumber = num;
    }
    void displayDetails()
    {
        System.out.println("Account Holder Name:  "+ accHolder);
        System.out.println("Account Number     :  "+ accNumber);
    }
}
class SavingsAccount extends Account{

    SavingsAccount(String name,String num) 
    {
        super(name,num);
    }
    void displaySavings()
    {
        System.out.println("Account Type: SAVINGS");
    }
}

class CurrentAccount extends Account{

    CurrentAccount(String name, String num) {
        super(name,num);
    }
    void displayCurrent()
    {
        System.out.println("Account Type: CURRENT");
    }
}

class PremiumSavingsAccount extends SavingsAccount{

    PremiumSavingsAccount(String name, String num) {
        super(name,num);
    }

    void displayPremium()
    {
        System.out.println("Account Type : PREMIUM SAVINGS");
    }
}
public class Inheritance
{
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("Sudharsan","100000001");
        CurrentAccount c1 = new CurrentAccount("Surya","100000008");
        PremiumSavingsAccount p1 = new PremiumSavingsAccount("Sudharsan","100000001");
        s1.displaySavings();
        s1.displayDetails();
        c1.displayCurrent();
        c1.displayDetails();
        p1.displayPremium();
        p1.displayDetails();
    }
}
