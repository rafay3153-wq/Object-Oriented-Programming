abstract class Employee {
    private String fristName;
    private String lastName;
    private String socialSecurityNumber;
    public Employee(String fristName, String lastName, String socialSecurityNumber) {
        this.fristName = fristName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public String toString() {
        return String.format("%s %s\nsocial security number: %s", fristName, lastName, socialSecurityNumber);   
    }
    public abstract double earnings();
}
class SalariedEmployee extends Employee {
    private double weeklySalary;
    public SalariedEmployee(String fristName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(fristName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }
    @Override
    public double earnings() {
        return weeklySalary;
    }
}
class HourlyEmployee extends Employee {
    private double wage;
    private double hours;
    public HourlyEmployee(String fristName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(fristName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }
    @Override
    public double earnings() {
        if (hours <= 40) {
            return wage * hours;
        } else {
            return 40 * wage + (hours - 40) * wage * 1.5;
        }
    }
}
class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;
    public CommissionEmployee(String fristName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(fristName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }
}
class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    public BasePlusCommissionEmployee(String fristName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(fristName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }
}
public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        for (int i=0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
            System.out.printf("earned: $%,.2f\n\n", employees[i].earnings());
        }
    }
}
