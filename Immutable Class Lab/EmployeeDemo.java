final class Employee {
    private final String name;
    private final int id;
    private final double salary;
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
    public double calculateTax() {
        double taxRate = 0.10;
        return salary * taxRate;
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ali", 101, 50000);
        Employee emp2 = new Employee("Bob", 102, 60000);
        System.out.println("Employee 1: " + emp1.getName() + ", ID: " + emp1.getId() + ", Salary: " + emp1.getSalary());
        System.out.println("Employee 2: " + emp2.getName() + ", ID: " + emp2.getId() + ", Salary: " + emp2.getSalary());
        System.out.println(emp1.getName() + "'s Tax: " + emp1.calculateTax());
        System.out.println(emp2.getName() + "'s Tax: " + emp2.calculateTax());
    }
}