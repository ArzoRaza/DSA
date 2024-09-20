class Account{
    String name;
    long accountNo;
    long balance;

    public Account(String name, long accountNo, long balance){
        this.name = name;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void ResultShowTime(){
        System.out.println("Account Name: " + name);
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Balance: " + balance);
    }
}

public class NewBank{
    public static void main(String[] args) {
        Account account1 = new Account("Md Akbar Ali", 1022022090877L, 5000);

        account1.ResultShowTime();
    }
}