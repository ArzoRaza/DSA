class Account{
    String name;
    int Account;
    int balance;

    public Account(String name, int Account, int balance){
        this.name = name;
        this.Account = Account;
        this.balance = balance;
    }

    public void DesplayDetails(){
        System.out.println("Account Name: " + name);
        System.out.println("Account Number: " + Account);
        System.out.println("Balance: " + balance);
    }
}

public class NewBank{
    public static void main(String[] args) {
        Account account1 = new Account("Md Akbar Ali", 123456789, 2000);

        account1.DesplayDetails();
    }
}