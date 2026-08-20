//Experiment 2
abstract class Employee
{
    static String companyName = "ABC Company";
    public String dept;
    private double salary; 
    protected String designation;
    String location;
    Employee(String d, double s, String ds, String loc)
    {
        this.dept = d;
        this.salary = s;
        this.designation = ds;
        this.location = loc;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    abstract void displayRole();

    void displayDetails() {
        System.out.println("Company     : " + companyName);
        System.out.println("Department  : " + dept);
        System.out.println("Salary      : " + salary);
        System.out.println("Designation : " + designation);
        System.out.println("Location    : " + location);
    }

}

class Developer extends Employee {

    Developer(String d, double s, String ds, String loc) {

        super(d, s, ds, loc);
    }

    // Implementation of abstract method
    @Override
    void displayRole() {
        System.out.println("Role        : Software Developer");
    }
}

public class AbstractEmployee
{
    public static void main(String[] args) {
        Developer emp = new Developer("IT",50000,"Developer","Chennai");

        emp.displayDetails();
        emp.displayRole();

        System.out.println("Current Salary: " + emp.getSalary());

        emp.setSalary(60000);

        System.out.println("Updated Salary: " + emp.getSalary());
    }
}
