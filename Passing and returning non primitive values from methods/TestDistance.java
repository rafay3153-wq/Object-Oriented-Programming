class Distance {
    private int feet;
    private int inches;
    public Distance() {
        this.feet=0;
        this.inches=0;
    }
    public Distance(int feet, int inches) {
        this.feet=feet;
        this.inches=inches;
    }
    public void setFeet(int feet) {
        this.feet=feet;
    }
    public void setInches(int inches) {
        this.inches=inches;
    }
    public int getFeet() {
        return feet;
    }
    public int getInches() {
        return inches;
    }
    public void display() {
        System.out.println(feet + " feet " + inches + " inches");
    }
    public Distance add(Distance d) {
        int totalFeet = this.feet + d.feet;
        int totalInches = this.inches + d.inches;
        if (totalInches>=12) {
            totalFeet+=totalInches/12;
            totalInches%=12;
        }
    return new Distance(totalFeet,totalInches);
    }
}   
    public class TestDistance{
public static void main(String[] args) {
    Distance d1 = new Distance(5,8);
    Distance d2 = new Distance(3,9);
    System.out.print("Distance 1: ");
    d1.display();
    System.out.print("Distance 2: ");
    d2.display();
    Distance d3=d1.add(d2);
    System.out.print("Added Distance: ");
    d3.display();
    }
}
