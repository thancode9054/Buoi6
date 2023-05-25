package Bai4;



public class Account {
    private long accountNumber;
    private String accountName;
    private double balance;
    private static final double INTEREST_RATE = 0.035;

    public Account() {
        this.accountNumber = 0;
        this.accountName = "";
        this.balance = 50000;
    }

    public Account(long accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 50000;
    }

    public Account(long accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {

        return "Account [Account Number= " + accountNumber + ", accountName= " + accountName + ", balance= "
                + balance
                + "]";
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.Current balance: " + balance);
        } else {
            System.out.println("Invalid amount . please enter deposit value ");
        }
    }

    public void withdraw(double amount, double withdrawalFee) {
        if (amount > 0) {
            if (amount <= balance + withdrawalFee) {
                balance -= amount + withdrawalFee;
                System.out.println("withdraw successfull. Current balance:  " + balance);
            } else {
                System.out.println("Insufficient funds!");
            }
        } else {
            System.out.println("Invalid amount . Please enter deposit value");
        }
    }

    public void mature() {
        balance += balance * INTEREST_RATE;
        System.out.println("Acount mature . Current balance: " + balance);
    }

    public void transfer(Account destinatiAccount, double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                destinatiAccount.deposit(amount);
            } else {
                System.out.println("Insufficient funds");
            }
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }
}