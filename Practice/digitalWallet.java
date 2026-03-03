class Wallet {
    private double balance;
    private String currency;
    Wallet(double b, String c) {
        balance = b;
        currency = c;
    }
    void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added " + amount + " " + currency);
            System.out.println("New balance: " + balance + " " + currency);
        } else {
            System.out.println("Invalid amount. Please enter positive value.");
        }
    }
    void spendMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter positive value.");
            return;
        }
        
        if (amount > balance) {
            System.out.println("Insufficient balance!");
            System.out.println("Available: " + balance + " " + currency);
            System.out.println("Required: " + amount + " " + currency);
        } else {
            balance -= amount;
            System.out.println("Spent " + amount + " " + currency);
            System.out.println("Remaining balance: " + balance + " " + currency);
        }
    }
    public void showBalance() {
        System.out.println("\n= Wallet Balance =");
        System.out.println("Balance: " + balance + " " + currency);
        System.out.println("======================\n");
    }
}
  public class digitalWallet {
    public static void main(String[] args) {
        Wallet w = new Wallet(5000, "PKR");
        w.showBalance();
        w.addMoney(2000.0);
        w.spendMoney(1000.0);
        w.showBalance();
        w.spendMoney(150.0); 
        w.spendMoney(25.0); 
        w.showBalance();
    }  
  }
