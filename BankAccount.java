
public class BankAccount implements Measurable {

    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public double getMeasure() {
        return balance;
    }

    @Override
    public String getName() {
        return "Bank Account";
    }
}
