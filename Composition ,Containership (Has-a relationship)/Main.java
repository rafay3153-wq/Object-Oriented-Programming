class Address {
    private String streetNo;
    private String houseNo;
    private String city;
    private String code;
    public Address() {
    }
    public Address(String streetNo, String houseNo, String city, String code) {
        this.streetNo = streetNo;
        this.houseNo = houseNo;
        this.city = city;
        this.code = code;
    }
    public String getStreetNo() {
        return streetNo;
    }
    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }
    public String getHouseNo() {
        return houseNo;
    }
    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void display() {
        System.out.println("Street No: " + streetNo);
        System.out.println("House No: " + houseNo);
        System.out.println("City: " + city);
        System.out.println("Code: " + code);
    }
}
class Person {
    private String name;
    private Address address;
    public Person() {
    }
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }  
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void display() {
        address.display();
    }
}
public class Main {
    public static void main(String[] args) {
        Address a = new Address("12", "456", "Karachi", "75000");
        Person p = new Person("Ali", a);
        p.display();
    }
}