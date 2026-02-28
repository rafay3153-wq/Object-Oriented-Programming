class SimpleCar {
    public String brand;
    public String model;
    public String color;
    public int speed;
    public SimpleCar(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.speed = 0;
    }
    public void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }
}
public class TestCar {
    public static void main(String[] args) {
        SimpleCar myCar = new SimpleCar("Suzuki", "Mehran", "Red");
        SimpleCar friendCar = new SimpleCar("Toyota", "Camry", "Blue");
        System.out.println("=== My Car ===");
        myCar.showInfo();
        myCar.showInfo();
        System.out.println("\n=== Friend's Car ===");
        friendCar.showInfo();
        friendCar.showInfo();
    }
}