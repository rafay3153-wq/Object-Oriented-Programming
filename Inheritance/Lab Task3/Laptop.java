public class Laptop extends Computer {
    private double length;
    private double width;
    private double height;
    private double weight;
    public Laptop(){
        super();
        length = 0.0;
        width = 0.0;
        height = 0.0;
        weight = 0.0;
    }
    public Laptop(int wordSize, int memorySize, int storageSize, int speed, double length, double width, double height, double weight){
        super(wordSize, memorySize, storageSize, speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
    public void display(){
        super.display();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }
}
