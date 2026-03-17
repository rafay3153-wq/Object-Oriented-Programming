class studentRecord {
    private String degree;
    public studentRecord() {
        }
    public studentRecord(String deg) {
        degree = deg;
    }
    public String getDegree() {
        return degree;
    }
    public void setDegree(String deg) {
        degree = deg;
    }
}
class employeeRecord {
    private int emp_id;
    private double salary;
    public employeeRecord() {
    }
    public void setEmpId(int id) {
        emp_id = id;
    }
    public int getEmpId() {
        return emp_id;
    }
    public void setSalary(double sal) {
        salary = sal;
    }
    public double getSalary() {
        return salary;
    }
}
class Manager {
    private String title;
    private double dues;
    private employeeRecord emp;
    private studentRecord stu;
    public Manager(String t, double d, employeeRecord e, studentRecord s) {
        title = t;
        dues = d;
        emp = e;
        stu = s;
    }
    public void display() {
        System.out.println("Title is: " + title);
        System.out.println("Dues are: " + dues);
        System.out.println("Employee record is as under:");
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Salary: " + emp.getSalary());
        System.out.println("Student record is as under:");
        System.out.println("Student Degree: " + stu.getDegree());
    }
}
public class Runner {
    public static void main(String[] args) {
        studentRecord s=new studentRecord();
        s.setDegree("MBA");
        employeeRecord e=new employeeRecord();
        e.setEmpId(1);
        e.setSalary(25000);
        Manager m=new Manager("financeManager", 5000, e, s);
        m.display();
    }
}