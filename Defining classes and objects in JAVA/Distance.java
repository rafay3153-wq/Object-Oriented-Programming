public class Distance {
    public int feet;
    public int inches;
    
    public Distance() {
        feet = 0;
        inches = 0;
    }
    
    public Distance(int ft, int in) {
        feet = ft;
        inches = in;
    }
    
    public void display() {
        System.out.println(feet + " feet " + inches + " inches");
    }

    public static void main(String[] args) {

        Distance d1 = new Distance();
        System.out.print("Distance 1: ");
        d1.display();
    
        Distance d2 = new Distance(5, 8);
        System.out.print("Distance 2: ");
        d2.display();
        
        Distance d3 = new Distance(3, 15);
        System.out.print("Distance 3: ");
        d3.display();
    }
}