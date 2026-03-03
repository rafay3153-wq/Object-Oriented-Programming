class Account {
    private double balance;
    public Account() {
        balance=0.0;
    }
    public Account(double b) {
        balance=b;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if(amount>0) {
            balance+=amount;
            System.out.println("Deposited: "+amount);
        }
        else {
            System.out.println("Invalid deposit amount!");
        }
    }
    public void withdraw(double amount) {
        if(amount>0 && amount<=balance) {
            balance-=amount;
            System.out.println("WWithdrawn: " + amount);
        }
        else {
            System.out.println("Insufficient balancce or invalid amount!");
        }
    }
}
public class AccountRunner {
    public static void main(String[] args) {
        Account acc1=new Account(5000);
        Account acc2=new Account(acc1.getBalance());
        acc1.deposit(1000);
        acc1.withdraw(2000);
        System.out.println("Account 1 Balance: "+ acc1.getBalance());
        System.out.println("Account 2 Balance: "+ acc2.getBalance());
    }
}