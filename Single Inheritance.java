import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double basicSalary;

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class PermanentEmployee extends Employee {
    double hra;
    double da;
    double grossSalary;

    void calculateSalary() {
        hra = basicSalary * 0.20;   
        da = basicSalary * 0.10;    
        grossSalary = basicSalary + hra + da;
    }

    void displayDetails() {
        displayEmployee();
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PermanentEmployee emp = new PermanentEmployee();

        System.out.print("Enter Employee ID: ");
        emp.empId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        emp.name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        emp.basicSalary = sc.nextDouble();

        emp.calculateSalary();

        System.out.println("\n--- Employee Details ---");
        emp.displayDetails();

        sc.close();
    }
}
