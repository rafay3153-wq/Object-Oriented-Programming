class commissionEmployee {
    protected String FirstName;
    protected String LastName;
    protected String SSN;
    protected double grossSale;
    protected double commonRate;
    public Object display;

    public commissionEmployee() {
        FirstName = "Nagina";
        LastName = "Nazar";
        SSN = "S003";
        grossSale = 1234;
        commonRate = 12.5;
    }

    public commissionEmployee(String a, String e, String b, double c, double d) {
        FirstName = a;
        LastName = e;
        SSN = b;
        grossSale = c;
        commonRate = d;
    }

    public void setFN(String a) {
        FirstName = a;
    }

    public void setLN(String e) {
        LastName = e;
    }

    public void setSSN(String b) {
        SSN = b;
    }

    public void setGS(double c) {
        grossSale = c;
    }

    public void setCR(double d) {
        commonRate = d;
    }

    public String getFN() {
        return FirstName;
    }

    public String getSSN() {
        return SSN;
    }

    public double getGS() {
        return grossSale;
    }

    public double getCR() {
        return commonRate;
    }

    public double earnings() {
        return grossSale * commonRate;
    }

    public void display() {
        System.out.println("first name:" + FirstName + " last name:" + LastName + " SSN:" + SSN + " Gross Sale:"
                + grossSale + " and common Rate:" + commonRate);
    }
}

class BasePlusCommEmployee extends commissionEmployee {
    private double salary;

    BasePlusCommEmployee() {
        salary = 48000;
    }

    BasePlusCommEmployee(String A, String E, String B, double C, double D, double S) {
        super(A, E, B, C, D);
        salary = S;
    }

    public double earnings() {
        return super.earnings() + salary;
    }

    public void display() {
        super.display();
        System.out.println("Salary : " + salary);
    }
}

public class OverrideRunnerTest {
    public static void main(String args[]) {
        BasePlusCommEmployee b = new BasePlusCommEmployee("ali", "ahmed", "25-kkn", 100, 5.2, 25000);
        double earn = b.earnings();
        System.out.println("Earning of employee is " + earn);
    }
}
