import java.util.Date;
public class Staff extends Employee {
    private String title;
    public Staff() {}
    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }
    public void setTitle(String title) {
        this.title = title;
    }  
    public String getTitleString() {
        return title;
    }
    public void display() {
        super.display();
        System.out.println("Title: " + title);
    }  
}
