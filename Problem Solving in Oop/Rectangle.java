class SimpleRectangle {
    public double length;
    public double width;
    public SimpleRectangle(double l, double w) {
        length = l;
        width = w;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }
    public void showInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
public class Rectangle {
    public static void main(String[] args) {
        SimpleRectangle rectA = new SimpleRectangle(5, 3);
        SimpleRectangle rectB = new SimpleRectangle(4, 4);
        SimpleRectangle rectC = new SimpleRectangle(8, 6);
        System.out.println(" Rectangle A ");
        rectA.showInfo();
        System.out.println("\n Rectangle B ");
        rectB.showInfo();
        System.out.println("\n Rectangle C ");
        rectC.showInfo();
        System.out.println("\n Area Comparison ");
        System.out.println("Rectangle A area: " + rectA.getArea());
        System.out.println("Rectangle B area: " + rectB.getArea());
        System.out.println("Rectangle C area: " + rectC.getArea());
        if (rectA.getArea() > rectB.getArea()) {
            System.out.println("Rectangle A has larger area than Rectangle B");
        }
        System.out.println("\n Perimeter Calculations ");
        System.out.println("Perimeter of Rectangle A: " + rectA.getPerimeter());
        System.out.println("Perimeter of Rectangle B: " + rectB.getPerimeter());
        System.out.println("Perimeter of Rectangle C: " + rectC.getPerimeter());
    }
}