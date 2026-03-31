import java.util.Date;
public class Employee extends Person {
    protected String office;
    protected double salary;
    protected Date dateHired;
    public Employee() {}
    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    public void setOffice(String office) {
        this.office = office;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }
    public String getOffice() {
        return office;
    }
    public double getSalary() {
        return salary;
    }
    public Date getDateHired() {
        return dateHired;
    }
    public void display() {
        super.display();
        System.out.println("Office: " + office);
        System.out.println("Salary: " + salary);
        System.out.println("Date Hired: " + dateHired);
    }
}
