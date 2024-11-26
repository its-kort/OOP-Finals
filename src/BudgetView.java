import java.util.List;

public class BudgetView {
    private final double totalBudget;
    private final List<BudgetItem> budgetItems;

    public BudgetView(double totalBudget, List<BudgetItem> budgetItems) {
        this.totalBudget = totalBudget;
        this.budgetItems = budgetItems;
    }

    public void display() {
        System.out.printf("Total Budget: PHP %.2f", totalBudget);
        System.out.println("");

        double totalSpent = 0;
        double remainingBudget = totalBudget;

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
        
        remainingBudget -= totalSpent;

        System.out.println("Summary:");
        System.out.printf("Total Spent: PHP %.2f", totalSpent);
        System.out.printf("\nRemaining Budget: PHP %.2f\n", remainingBudget);

        if (totalSpent > totalBudget) {
            System.out.printf("Warning: You have exceeded your budget by PHP %.2f\n", (totalSpent - totalBudget));
        } else if (totalSpent > totalBudget * 0.9) {
            System.out.println("Warning: You are nearing your budget limit!");
        } else {
            System.out.println("You are within your budget.");
        }
    }
}