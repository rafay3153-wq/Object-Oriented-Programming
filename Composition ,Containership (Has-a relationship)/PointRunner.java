class Point{
    private double x,y;
    public Point() {
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void display() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
class Line {
    private Point startPoint;
    private Point endPoint;
    public Line() {
    }
    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    public double length() {
        double x1=startPoint.getX();
        double y1=startPoint.getY();
        double x2=endPoint.getX(); 
        double y2=endPoint.getY();
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }
}
class PointRunner {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(6, 7);
        Line l1 = new Line(p1, p2);
        System.out.println("Length of the line: " + l1.length());
    }
}