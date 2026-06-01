import java.io.*;
import java.util.*;
public class ATMSystem {
    static final String FILE_NAME = "Accounts.dat";
    public static void createAccount() {
        try {
            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            for (int i = 1; i <= 10; i++) {
                Account a = new Account(i, "User" + i, "1234", 1000);
                out.writeObject(a);
            }
            out.close();
            System.out.println("Accounts created successfully.");
        } catch (IOException e) {
            System.out.println("Error creating accounts.");
        }
    }
    public static ArrayList<Account> readAccounts() {
        ArrayList<Account> list = new ArrayList<>();
        try {
            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream(FILE_NAME));
            while (true) {
                Account a = (Account) in.readObject();
                list.add(a);
            }
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading accounts.");
        } catch (Exception e) {
            System.out.println("Error reading accounts.");
        }
        return list;
    }
    public static void writeAccounts(ArrayList<Account> list) {
        try {
            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            for (Account a : list) {
                out.writeObject(a);
            }
            out.close();
        } catch (IOException e) {
            System.out.println("Error writing accounts.");
        }
    }
    public static void deposit(int accNo, double amount) {
        ArrayList<Account> list = readAccounts();
        for (Account a : list) {
            if (a.getAccNo() == accNo) {
                a.balance += amount;
                System.out.println("Deposit successful. New balance: " + a.balance);
            }
        }
        writeAccounts(list);
    }
    public static void withdraw(int accNo, double amount) {
        ArrayList<Account> list = readAccounts();
        for (Account a : list) {
            if (a.getAccNo() == accNo) {
                if (a.balance >= amount) {
                    a.balance -= amount;
                    System.out.println("Withdraw successful. New balance: " + a.balance);
                } else {
                    System.out.println("Insufficient funds.");
                }
            }
        }
        writeAccounts(list);
    }
    public static void balanceInquiry(int accNo) {
        ArrayList<Account> list = readAccounts();
        for (Account a : list) {
            if (a.getAccNo() == accNo) {
                System.out.println("Current balance: " + a.balance);
            }
        }
    }
    public static void transfer(int fromAcc, int toAcc, double amount) {
        ArrayList<Account> list = readAccounts();
        Account sender = null;
        Account receiver = null;
        for (Account a : list) {
            if (a.getAccNo() == fromAcc) {
                sender = a;
            }
            if (a.getAccNo() == toAcc) {
                receiver = a;
            }
        }
        if (sender != null && receiver != null) {
            if (sender.balance >= amount) {
                sender.balance -= amount;
                receiver.balance += amount;
                System.out.println("Transfer successful.");
            } else {
                System.out.println("Insufficient funds.");
            }
        }
        writeAccounts(list);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        createAccount();
        int choice;
        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance Inquiry");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Account No: ");
                int acc = input.nextInt();
                System.out.print("Amount: ");
                double amt = input.nextDouble();
                deposit(acc, amt);
            }
            else if (choice == 2) {
                System.out.print("Account No: ");
                int acc = input.nextInt();
                System.out.print("Amount: ");
                double amt = input.nextDouble();
                withdraw(acc, amt);
            }
            else if (choice == 3) {
                System.out.print("Account No: ");
                int acc = input.nextInt();
                balanceInquiry(acc);
            }
            else if (choice == 4) {
                System.out.print("From Account: ");
                int from = input.nextInt();
                System.out.print("To Account: ");
                int to = input.nextInt();
                System.out.print("Amount: ");
                double amt = input.nextDouble();
                transfer(from, to, amt);
            }
        } while (choice != 5);
        System.out.println("Thank you for using ATM System.");
        input.close();
    }
}