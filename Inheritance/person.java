public class person {
    protected String name; protected String id; protected int phone;
    public person() {
        name="NaginaNazar"; id="sp14bcs039"; phone=1234;
    }
    public person(String a, String b, int c) {
        name=a; id=b; phone=c;
    }
    public void setName(String a) {
        name=a;
    }
    public void setId(String b) {
        id=b;
    }
    public void setPhone(int c) {
        phone=c;
    }
    public String getName() {
        return name;
    }    public String getId() {
        return id;
    }    public int getPhone() {
        return phone;
    }
    public void display() {
        System.out.println("Name: "+name+", ID: "+id+", Phone: "+phone);
    }
}