import java.util.Scanner;

public class AgeException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        String input = sc.nextLine();

        try {
            int age = Integer.parseInt(input);

            int result = 100 / age;

            System.out.println("Age = " + age);
            System.out.println("100 / Age = " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number!");

        } catch (ArithmeticException e) {
            System.out.println("Error: Age cannot be zero!");
        }

        sc.close();
    }
}
