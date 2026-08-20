import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-3): ");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("You selected One");
                break;

            case 2:
                System.out.println("You selected Two");
                break;

            case 3:
                System.out.println("You selected Three");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
