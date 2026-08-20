import java.util.Scanner;

class Student {
    int rollNo;
    String name;

    void getStudentDetails(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
    }
}

class Marks extends Student {
    int m1, m2, m3, m4, m5;

    void getMarks(Scanner sc) {
        System.out.println("Enter marks for 5 subjects:");

        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();
    }
}

class Result extends Marks {
    int total;
    double average;
    char grade;

    void calculateResult() {
        total = m1 + m2 + m3 + m4 + m5;
        average = total / 5.0;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    void displayResult() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Result r = new Result();

        r.getStudentDetails(sc);
        r.getMarks(sc);
        r.calculateResult();
        r.displayResult();

        sc.close();
    }
}
