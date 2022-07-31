package Homework3;

public class FinancialRecord {
    private double incomes;
    private double expenses;


    public FinancialRecord(double incomes, double expenses) {
        this.incomes = incomes;
        this.expenses = expenses;
    }

    public double getIncomes() {
        return incomes;
    }

    public void setIncomes(double incomes) {
        this.incomes = incomes;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }
}

