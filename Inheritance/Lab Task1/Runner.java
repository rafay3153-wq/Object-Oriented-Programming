import java.util.Date;
public class Runner {
    public static void main(String[] args) {
        Student s = new Student("Ali", "Karachi", "03001234567", "ali@email.com", "Undergraduate");
        Date hireDate = new Date();
        Employee e = new Employee("Ahmed", "Lahore", "03111234567", "ahmed@email.com", "Office 1", 50000, hireDate);
        Faculty f = new Faculty("Sara", "Islamabad", "03221234567", "sara@email.com", "Office 2", 80000, hireDate, "9am-5pm", "Professor");
        Staff st = new Staff("Usman", "Rawalpindi", "03331234567", "usman@email.com", "Office 3", 30000, hireDate, "Manager");
        System.out.println("----- Student -----");
        s.display();
        System.out.println("\n----- Employee -----");
        e.display();
        System.out.println("\n----- Faculty -----");
        f.display();
        System.out.println("\n----- Staff -----");
        st.display();
    }
}
