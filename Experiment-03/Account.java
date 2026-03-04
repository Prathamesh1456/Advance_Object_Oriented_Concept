import java.util.Scanner;
class BankAccount{
    public double Balance;
    BankAccount(double b){
        Balance=b;
    }
    void deposit(double amount)
    {
        Balance+=amount;
        System.out.println("Deposited: "+ amount);
        System.out.println("Total Balance"+Balance);
    }
    void withdrawn(double amount)
    {
        if(amount>Balance){
            System.out.println("Minimum Account Balance");
        }
        else{
            Balance-=amount;
            System.out.println("Withdrawn: "+ amount);
            System.out.println("Total Balance"+Balance);

        }
    }
}
class savingAccount extends BankAccount{
    savingAccount(double b) {
        super(b); 
    }
    @Override
    void withdrawn(double amount)
    {
        if(Balance-amount<100){
            System.out.println("Transaction Fails! Mininum balance of 100 must be maintained");
        }
        else{
            Balance-=amount;
            System.out.println("Withdrawn: "+ amount);
            System.out.println("Total Balance"+Balance);
        }
    }
}
public class Account {
    public static void main(String[] args) {
        double initBalance;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your initial Amount: ");
        initBalance=sc.nextDouble();
        savingAccount sa=new savingAccount(initBalance);
        int choice ;
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        sa.deposit(depositAmount);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        sa.withdrawn(withdrawAmount);
                        break;
                    case 3:
                        System.out.println("Current Balance: " + sa.Balance);
                        break;
                    case 4:
                        System.out.println("Exiting program");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
        } while (choice != 4); 
    }   
}