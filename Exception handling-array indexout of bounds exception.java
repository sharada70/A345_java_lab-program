import java.util.Scanner;

public class TrainCodes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] trains = {"TN01", "TN02", "TN03", "TN04", "TN05"};

        System.out.print("Enter train index (0-4): ");
        int index = sc.nextInt();

        try {
            System.out.println("Train Code = " + trains[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid train index!");
        }

        sc.close();
    }
}
