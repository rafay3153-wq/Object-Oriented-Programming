class Account {
    private double balance;
    
    public Account() {
        balance = 0.0;
    }
    
    public Account(double initialBalance, String accountType) {
        balance = initialBalance;
        System.out.println("Account created: " + accountType);
    }
    
    public void deposit(double amount) {
        if(amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }
    
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.deposit(1000);
        acc1.withdraw(500);
        System.out.println("Account 1 balance: " + acc1.getBalance());
        
        Account acc2 = new Account(5000, "Savings");
        acc2.deposit(2000);
        acc2.withdraw(1000);
        System.out.println("Account 2 balance: " + acc2.getBalance());
        }
    }
