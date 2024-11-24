import java.util.List;
import java.util.ArrayList;

public class BudgetManager {
    private double budget;
    private final List<Expense> expenses;

    public BudgetManager() {
        this.expenses = new ArrayList<>();
    }

    public void setBudget() {
        Budget budget = new Budget();
        this.budget = budget.setAmount();
    }

    public void manageExpenses() {
        // TODO: Add SubMenus
        ExpenseManager expenseManager = new ExpenseManager();
    }

    public void viewBudget() {
        BudgetView budgetView = new BudgetView();
    }

    public void generateSummary() {
        SummaryReport summaryReport = new SummaryReport();
    }
}
