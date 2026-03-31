public class Computer {
    protected int wordSize;
    protected int memorySize;
    protected int storageSize;
    protected int speed;
    public Computer(){
        wordSize = 0;
        memorySize = 0;
        storageSize = 0;
        speed = 0;
    }
    public Computer(int wordSize, int memorySize, int storageSize, int speed){
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.speed = speed;
    }
    public void display(){
        System.out.println("Word Size (bits): " + wordSize);
        System.out.println("Memory Size (MB): " + memorySize);
        System.out.println("Storage Size (MB): " + storageSize);
        System.out.println("Speed (MHz): " + speed);
    }
}