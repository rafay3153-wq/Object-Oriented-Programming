public class Student extends Person {
    private String status;
    public Student() {}
    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void display() {
        super.display();
        System.out.println("Status: " + status);
    }
}
