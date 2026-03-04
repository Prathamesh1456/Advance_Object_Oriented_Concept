class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void balanceEnquiry() {
        System.out.println("Current Balance:  " + balance);
    }

    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Deposit amount cannot be negative!");
        }

        balance += amount;
        System.out.println(" " + amount + " deposited successfully.");
    }

    public void withdraw(double amount)
            throws NegativeNumberException, LowBalanceException {

        if (amount < 0) {
            throw new NegativeNumberException("Withdrawal amount cannot be negative!");
        }

        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance!");
        }

        balance -= amount;
        System.out.println(" " + amount + " withdrawn successfully.");
    }
}

public class BankApp {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        System.out.println("Initial Account Details:");
        account.balanceEnquiry();

        try {
            System.out.println("\nDepositing 2000...");
            account.deposit(2000);

            System.out.println("\nWithdrawing 3000...");
            account.withdraw(3000);

            System.out.println("\nWithdrawing 10000...");
            account.withdraw(10000);

        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (LowBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nFinal Account Details:");
        account.balanceEnquiry();
    }
}