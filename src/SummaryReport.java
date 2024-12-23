import java.util.List;

public class SummaryReport {
    private final double totalBudget;
    private final List<BudgetItem> budgetItems;

    public SummaryReport(double totalBudget, List<BudgetItem> budgetItems) {
        this.totalBudget = totalBudget;
        this.budgetItems = budgetItems;
    }

    public void generate() {

        double totalExpenses = 0;
        for (BudgetItem item : budgetItems) {
            totalExpenses += item.calculateCost();
        }

        System.out.println("+-------------- Budget Summary ---------------+");
        System.out.printf("Total Budget: PHP %.2f\n", totalBudget);
        System.out.printf("Total Expenses: PHP %.2f\n", totalExpenses);
        System.out.printf("Remaining Budget: PHP %.2f\n ", totalBudget - totalExpenses);
        System.out.print("+---------------------------------------------+");

        System.out.println("");
        if (budgetItems.isEmpty()) {
            System.out.println("No expenses recorded.");
            return;
        }

        System.out.println("+----------------- Breakdown -----------------+");
        for (BudgetItem item : budgetItems) {
            System.out.printf("| %-20s | PHP %-16.2f |", item.getName(), item.calculateCost());
            System.out.println("");

        }
        System.out.println("+---------------------------------------------+");

    }
}