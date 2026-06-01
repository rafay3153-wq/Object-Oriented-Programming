import java.io.Serializable;
public class Account implements Serializable {
    int accNo;
    String name;
    String pin;
    double balance;

    public Account(int accNo, String name, String pin, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }
}
