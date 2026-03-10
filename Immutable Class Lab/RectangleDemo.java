final class Rectangle {
    private final int x;
    private final int y;
    private final int width;
    private final int height;
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public int area() {
        return width * height;
    }
}
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(0, 0, 10, 5);
        Rectangle r2 = new Rectangle(5, 5, 15, 10);
        System.out.println("Rectangle 1: (" + r1.getX() + ", " + r1.getY() + "), width: " + r1.getWidth() + ", height: " + r1.getHeight() + ", area: " + r1.area());
        System.out.println("Rectangle 2: (" + r2.getX() + ", " + r2.getY() + "), width: " + r2.getWidth() + ", height: " + r2.getHeight() + ", area: " + r2.area());
    }
}