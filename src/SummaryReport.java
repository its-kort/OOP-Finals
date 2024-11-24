import java.util.List;

public class SummaryReport {
    private final double totalBudget;
    private final List<BudgetItem> budgetItems;

    public SummaryReport(double totalBudget, List<BudgetItem> budgetItems) {
        this.totalBudget = totalBudget;
        this.budgetItems = budgetItems;
    }

    public void generate() {
        
    }
}
