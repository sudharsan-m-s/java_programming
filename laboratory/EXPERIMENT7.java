import java.util.Scanner;
import employee.Employee;

public class EXPERIMENT7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Employee name: ");
            String name = scanner.nextLine();

            System.out.print("Employee salary: ");
            double salary = scanner.nextDouble();

            Employee employee = new Employee(id, name, salary);
            employee.displayEmployee();
        }
    }
}
