abstract class Shape {
    protected int numberOfLines;
    protected String penColor;
    protected String fillColor;

    public Shape(int numberOfLines, String penColor, String fillColor) {
        this.numberOfLines = numberOfLines;
        this.penColor = penColor;
        this.fillColor = fillColor;
    }
    abstract void draw(); 
}
class Circle extends Shape {
        public Circle(String penColor,String fillColor) {
            super(0,penColor,fillColor); }
            void draw() {
                System.out.println("Drawing Circle with Pen Color: "+penColor+" and Fill Color: "+fillColor);
            }
        }
class Square extends Shape {
        public Square(String penColor,String fillColor) {
            super(4,penColor,fillColor);
        }
        void draw() {
            System.out.println("Drawing square with Pen Color: "+penColor+" and Fill Color: "+fillColor);
        }
    }
class Triangle extends Shape {
        public Triangle(String penColor,String fillColor) {
            super(3,penColor,fillColor);
        }
        void draw() {
            System.out.println("Drawing triangle with Pen Color: "+penColor+" and Fill Color: "+fillColor);
        }
    }
public class LabTask3 {
        public static void main(String[] args) {
            Shape c= new Circle("Black","Red");
            Shape s= new Square("Blue","Green");
            Shape t= new Triangle("Yellow","Purple");
            c.draw();
            s.draw();
            t.draw();
        }
    }