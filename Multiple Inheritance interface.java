interface Student {
    void studentDetails();
}

interface Sports {
    void sportsDetails();
}

class Result implements Student, Sports {

    public void studentDetails() {
        System.out.println("Student Name: Arun");
        System.out.println("Roll Number: 101");
    }

    public void sportsDetails() {
        System.out.println("Sport: Cricket");
        System.out.println("Score: 85");
    }
}

public class Main {
    public static void main(String[] args) {

        Result r = new Result();

        r.studentDetails();
        r.sportsDetails();
    }
}
