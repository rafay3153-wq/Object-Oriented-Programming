class CircleTest {

    private int radius; 

    public CircleTest() {
        radius = 1;
    }

    public CircleTest(int r) {
        radius = r;
    }

    public double calculateCircumference() {
        return 2 * 3.14159 * radius;
    }
    public class Circle {
    public static void main(String[] args) {

        CircleTest c1 = new CircleTest();
        System.out.println("Circle 1 circumference: " + c1.calculateCircumference());
        
        CircleTest c2 = new CircleTest(7);
        System.out.println("Circle 2 circumference: " + c2.calculateCircumference());
        }
    }
}