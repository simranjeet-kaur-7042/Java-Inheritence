//Description: Model a banking system with different account types using hierarchical inheritance. BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
// Tasks:Define a base class BankAccount with attributes like accountNumber and balance.
// Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
// Implement a method displayAccountType() in each subclass to specify the account type.

class BankAccount{
    long accountNumber;
    double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs." + balance);
    }

}
class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(long accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountInfo() {
        super.displayAccountInfo(); 
        System.out.println("Account Type: Savings");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount{
    private double withdrawalLimit;

    public CheckingAccount(long accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountInfo() {
        super.displayAccountInfo(); 
        System.out.println("Account Type: Checking");
        System.out.println("Withdrawal Limit: Rs." + withdrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount{
    private int tenure;

    public FixedDepositAccount(long accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Account Type: Fixed Deposit");
        System.out.println("Tenure: " + tenure + " months");
    }
}
public class BankAccountDetails {
    public static void main(String[] args) {
        BankAccount sa = new SavingsAccount(1001, 5000.0, 3.5);
        BankAccount ca = new CheckingAccount(1002, 3000.0, 1000.0);
        BankAccount fda = new FixedDepositAccount(1003, 10000.0, 12);

        sa.displayAccountInfo();
        System.out.println();
        ca.displayAccountInfo();
        System.out.println();
        fda.displayAccountInfo();
    }
}