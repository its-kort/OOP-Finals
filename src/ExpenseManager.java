import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExpenseManager {
    private List<BudgetItem> budgetItems;

    public ExpenseManager(List<BudgetItem> budgetItems) {
        this.budgetItems = budgetItems;
    }

    public void addExpense() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter expense category: ");
        String category = scanner.nextLine();

        if (category.isEmpty()) {
            System.out.println("Category cannot be empty. Please try again.");
            return;
        }

        double amount = 0;
        try {
            System.out.print("Enter expense amount: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid amount.");
                scanner.nextLine();
                return;
            }
            amount = scanner.nextDouble();

            if (amount <= 0) {
                System.out.println("Expense amount should be greater than zero. Please try again.");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine();
            return;
        }

        Expense expense = new Expense(category, amount);
        budgetItems.add(expense);
        System.out.println("Expense added: " + category + " - PHP " + amount);
    }

    public void viewExpenses() {
        if (budgetItems.isEmpty()) {
            System.out.println("No expenses recorded yet.");
            return;
        }
        System.out.println("+----------------- Expenses ------------------+");
        System.out.printf("| %-20s | %-20s |", "Category", "Amount");
        System.out.println("");
        for (BudgetItem item : budgetItems) {
            Expense expense = (Expense) item;
            System.out.printf("| %-20s | PHP %-16.2f |", expense.getCategory(), expense.getAmount());
            System.out.println("");
        }
        System.out.println("+---------------------------------------------+");

    }

    public void deleteExpense() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the category of the expense to delete: ");
        String category = scanner.nextLine();

        if (category.isEmpty()) {
            System.out.println("Category cannot be empty. Please try again.");
            return;
        }

        boolean found = false;
        for (int i = 0; i < budgetItems.size(); i++) {
            if (budgetItems.get(i) instanceof Expense) {
                Expense expense = (Expense) budgetItems.get(i);
                if (expense.getCategory().equalsIgnoreCase(category)) {
                    budgetItems.remove(i);
                    System.out.println("Expense deleted: " + category);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Expense not found.");
        }
    }
}