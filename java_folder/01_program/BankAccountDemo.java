import java.util.Date;

class Account{
    private int accountId;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

//    Constructor Initializing
    public Account(int accountId, double balance, double annualInterestRate) {
        this.accountId = accountId;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }

//    Methods to get Account Id
    public int getAccountId() {
        return accountId;
    }

//    Method to get balance
    public double getBalance(){
        return balance;
    }

//    Method to set balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
//    Method to get Iterest
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

//    Method to set Interest
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

//    Method to get date the account was created
    public Date getDateCreated() {
        return dateCreated;
    }

//    Method to deposite the ammount into the account
    public void deposit(double amount) {
        if (amount > 0){
            balance += amount;
            System.out.println("Rs: " + amount + " Deposited Successfully. Currunt balance is Rs: " + balance);
        }else{
            System.out.println("Deposited amount should be positive");
        }
    }

//    Method to withdraw an amount from accont
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Rs: " + amount + " Withdraw Successfully. Currunt balance is Rs: " + balance);
        }else{
            System.out.println("Withdraw amount should be positive." );
        }
    }

//    Method to get monthly interest rate
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

//    Method to calculate monthly interest amount
    public double getMonthlyInterestAmount() {
        return balance * (getMonthlyInterestRate() / 100);
    }

//    Method to apply mothly Interest amount to the balance
    public void applyMonthlyInterest() {
        double interest = getMonthlyInterestAmount();
        balance += interest;
        System.out.println("Monthly Interest is Rs: " + interest + "New balace is Rs: " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Account account = new Account(100, 5000, 5.0);

        System.out.println("Account Create on " + account.getDateCreated());
        System.out.println("Account Id " + account.getAccountId());
        System.out.println("Initial Balance Rs:  " + account.getBalance());
        System.out.println("Anual Interest Balance Rs:  " + account.getAnnualInterestRate());


        account.deposit(1000);
        account.withdraw(2000);

        account.applyMonthlyInterest();

        System.out.println("Final amount is Rs: " + account.getBalance());
        System.out.println("Final Interest is Rs: " + account.getMonthlyInterestAmount());
    }
}