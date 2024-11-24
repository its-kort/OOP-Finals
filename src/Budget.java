import java.util.InputMismatchException;
import java.util.Scanner;

public class Budget {
    private double amount;

    public double setAmount() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your weekly/monthly budget: ");
            amount = scanner.nextDouble();
            
            if (amount <= 0) {
                System.out.println("Budget cannot be set to less than or equal to zero. Please try again.");
                setAmount();
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please try again.\n");
            setAmount();
        }
        
        scanner.close();
        return amount;

    }

    public double getAmount() {
        return amount;
    }
}
