public class Runner {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(64, 8192, 512000, 3200, 35.5, 24.0, 1.8, 2.2);
        System.out.println("Laptop Details:");
        laptop1.display();
        Laptop laptop2 = new Laptop();
        System.out.println("\nDefault Laptop:");
        laptop2.display();
    }
}
