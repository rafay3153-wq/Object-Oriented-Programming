abstract class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract boolean isOutstanding();
}
class Student extends Person {
    private double cgpa;
    public Student(String name, double cgpa) {
        super(name);
        this.cgpa = cgpa;
    }
    @Override
    public boolean isOutstanding() {
        return cgpa >= 3.5;
    }
}
class Professor extends Person {
    private int numberOfPublications;
    public Professor(String name, int numberOfPublications) {
        super(name);
        this.numberOfPublications = numberOfPublications;
    }
    public void setPublications(int num) {
        this.numberOfPublications = num;
    }
    public int getPublications() {
        return numberOfPublications;
    }
    @Override
    public boolean isOutstanding() {
        return numberOfPublications >= 100;
    }
}
public class TestPerson {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        Student s = new Student("Ali", 3.8);
        Professor p = new Professor("Dr. Ahmed", 100);
        people[0] = s;
        people[1] = p;
        for (int i=0; i < people.length; i++) {
            System.out.println(people[i].getName() + " Outstanding: " + people[i].isOutstanding());
        }
    }
}