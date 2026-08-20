class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class ATM {

    public static void main(String[] args) {

        double balance = 5000;
        double withdrawAmount = 6000;

        System.out.println("Available Balance: " + balance);
        System.out.println("Withdrawal Amount: " + withdrawAmount);

        try {

            if (withdrawAmount > balance) {
                throw new InsufficientBalanceException(
                    "Insufficient Balance! You cannot withdraw " + withdrawAmount
                );
            }

            balance = balance - withdrawAmount;

            System.out.println("Withdrawal Successful!");
            System.out.println("Remaining Balance: " + balance);

        } catch (InsufficientBalanceException e) {

            System.out.println("Exception: " + e.getMessage());
        }
    }
}
