import java.util.List;
import java.util.ArrayList;

public class BudgetManager {
    private double totalBudget;
    private final List<BudgetItem> budgetItems;

    public BudgetManager() {
        this.budgetItems = new ArrayList<>();
    }

    public void setBudget() {
        Budget budget = new Budget();
        this.totalBudget = budget.setAmount();
    }

    public void manageExpenses() {
        // TODO: Add SubMenus
        ExpenseManager expenseManager = new ExpenseManager(budgetItems);
    }

    public void viewBudget() {
        BudgetView budgetView = new BudgetView(totalBudget, budgetItems);
    }

    public void generateSummary() {
        SummaryReport summaryReport = new SummaryReport(totalBudget, budgetItems);
    }
}
