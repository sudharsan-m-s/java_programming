//Experiment 3 
import java.util.Scanner;
class Student{
    int studentId;
    String studentName;
    String dept;
    int age;
    double percentage;

    Student(int id, String n, String d, int a, double p)
    {
        this.studentId = id;
        this.studentName = n;
        this.dept = d;
        this.age = a;
        this.percentage = p;
    }
}
public class StudentMain 
{
    public static void main(String[] a)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Student_ID: ");
    int id = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter Student Name: ");
    String name = sc.nextLine();
    System.out.println("Enter Department: ");
    String dept = sc.nextLine();
    System.out.println("Enter your Age: ");
    int age = sc.nextInt();
    System.out.println("Enter your Percentage: ");
    double p = sc.nextDouble();

    Student s= new Student(id,name,dept,age,p);

    System.out.println("Student_ID             : "+ id);
    System.out.println("Student Name           : "+ name);
    System.out.println("Department             : "+ dept);        
    System.out.println("Student Age            : "+ age);
    System.out.println("Student's Percentage   : "+ p+"%");
    System.out.println();
    
    sc.close(); 
    } 
}