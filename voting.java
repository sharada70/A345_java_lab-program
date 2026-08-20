class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

public class Voting {

    public static void main(String[] args) {

        int age = 16;

        System.out.println("Age: " + age);

        try {

            if (age < 18) {
                throw new InvalidAgeException(
                    "Invalid Age! You must be 18 or above to vote."
                );
            }

            System.out.println("You are eligible to vote.");

        } catch (InvalidAgeException e) {

            System.out.println("Exception: " + e.getMessage());
        }
    }
}
