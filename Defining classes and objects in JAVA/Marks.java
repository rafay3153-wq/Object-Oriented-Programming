public class Marks {
    private int mark1;
    private int mark2;
    private int mark3;
    
    public Marks() {
        mark1 = 0;
        mark2 = 0;
        mark3 = 0;
    }
    
    public Marks(int m1, int m2) {
        mark1 = m1;
        mark2 = m2;
        mark3 = 0;
    }
    
    public int calculateSum() {
        return mark1 + mark2 + mark3;
    }
    
    public void display() {
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
        System.out.println("Sum: " + calculateSum());
    }
    
    public static void main(String[] args) {
        System.out.println("=== Testing No-Argument Constructor ===");
        Marks m1 = new Marks();
        m1.display();
        System.out.println();
        
        System.out.println("=== Testing Two-Argument Constructor (85, 90) ===");
        Marks m2 = new Marks(85, 90);
        m2.display();
        System.out.println();
        
        System.out.println("=== Testing Two-Argument Constructor (75, 82) ===");
        Marks m3 = new Marks(75, 82);
        System.out.println("Sum: " + m3.calculateSum());
    }
}