import java.util.*;

class StudentInfo {

    public void displayInfo() {
        System.out.println("Student Name: John");
        System.out.println("Roll Number: 101");
        System.out.println("Course: Computer Science");
    }
}

public class StudentPackage {

    public static void main(String[] args) {

        StudentInfo s = new StudentInfo();

        s.displayInfo();
    }
}
