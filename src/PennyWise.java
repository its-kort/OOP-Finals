import java.util.Scanner;
import java.util.InputMismatchException;

public class PennyWise {

    public static void menu() {
        System.out.println("+---------------------------------+");
        System.out.println("|            PennyWise            |");
        System.out.println("|  Your Personal Expense Tracker  |");
        System.out.println("+---------------------------------+");
        System.out.println("| [1] Set Budget                  |");
        System.out.println("| [2] Manage Expenses             |");
        System.out.println("| [3] View Budget Breakdown       |");
        System.out.println("| [4] Generate Budget Summary     |");
        System.out.println("| [5] Exit                        |");
        System.out.println("+---------------------------------+");
    }

    public static void exit() {
        System.out.println("+---------------------------------+");
        System.out.println("|       Thank you for using       |");
        System.out.println("|            PennyWise!           |");
        System.out.println("+---------------------------------+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BudgetManager budgetManager = new BudgetManager();
        int choice = 0;

        do {
            menu();
            System.out.print("Enter Option: ");

            try {
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        budgetManager.setBudget();
                        break;

                    case 2:
                        budgetManager.manageExpensesMenu();
                        break;

                    case 3:
                        budgetManager.viewBudget();
                        break;

                    case 4:
                        budgetManager.generateSummary();
                        break;

                    case 5:
                        exit();
                        scanner.close();
                        return;

                    default:
                        System.out.println("Incorrect option. Please try again.\n");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }
}