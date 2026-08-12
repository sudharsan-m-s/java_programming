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
        System.out.println();
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
        System.out.println();
    }
}

class CurrentAccount extends Account{

    CurrentAccount(String name, String num) {
        super(name,num);
    }
    void displayCurrent()
    {
        System.out.println("Account Type: CURRENT");
        System.out.println();
        
    }
}

class PremiumSavingsAccount extends SavingsAccount{

    PremiumSavingsAccount(String name, String num) {
        super(name,num);
    }

    void displayPremium()
    {
        System.out.println("Account Type : PREMIUM SAVINGS");
        System.out.println();
    }
}
public class Inheritance
{
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("Sudharsan","100000001");
        CurrentAccount c1 = new CurrentAccount("Surya","100000008");
        PremiumSavingsAccount p1 = new PremiumSavingsAccount("Devadas","100000002");
        s1.displaySavings();
        s1.displayDetails();
        c1.displayCurrent();
        c1.displayDetails();
        p1.displayPremium();
        p1.displayDetails();
    }
}
