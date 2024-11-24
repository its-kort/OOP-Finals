import java.util.InputMismatchException;
import java.util.Scanner;

public class PennyWise {
    static void menu() {
        System.out.println("+---------------------------------+");
        System.out.println("|                                 |");
        System.out.println("|            PennyWise            |");
        System.out.println("|      A Budget Tracker App       |");
        System.out.println("|                                 |");
        System.out.println("+---------------------------------+");
        System.out.println("|                                 |");
        System.out.println("| [1] Set Budget                  |");
        System.out.println("| [2] Manage Expenses             |");
        System.out.println("| [3] View Budget                 |");
        System.out.println("| [4] Generate Budget Summary     |");
        System.out.println("| [5] Exit                        |");
        System.out.println("|                                 |");
        System.out.println("+---------------------------------+");

    }

    static void exit() {
        System.out.println("+---------------------------------+");
        System.out.println("|                                 |");
        System.out.println("|       Thank you for using       |");
        System.out.println("|            PennyWise!           |");
        System.out.println("|                                 |");
        System.out.println("+---------------------------------+");
        System.out.println("|                                 |");
        System.out.println("|             Members:            |");
        System.out.println("|       Cheng, Louise Althea      |");
        System.out.println("|         Bagayan, Jasper         |");
        System.out.println("|       Deslate, Kurt Nicolo      |");
        System.out.println("|     Reyes, Anneliese Gaille     |");
        System.out.println("|                                 |");
        System.out.println("+---------------------------------+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BudgetManager budgetManager = new BudgetManager();

        try {
            while (true) {
                menu();

                System.out.println("Enter Option: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        budgetManager.setBudget();
                        break;

                    case 2:
                        budgetManager.manageExpenses();
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
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please try again.\n");
            main(args);
        }

    }
}
