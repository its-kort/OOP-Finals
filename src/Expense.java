public class Expense extends BudgetItem {
    private double amount;
    private String deadline;

    public Expense(String category, double amount, String deadline) {
        super(category);
        this.amount = amount;
        this.deadline = deadline;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public double calculateCost() {
        return amount;
    }
}
