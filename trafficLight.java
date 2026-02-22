class TrafficLight {
    String color;
    int timer;

    TrafficLight(String c, int t) {
        color = c;
        timer = t;
        System.out.println("Traffic light created with color " + color + " and timer " + timer + " seconds.");
    }

   void changeColor() {
        switch(color) {
            case "RED":
                color = "GREEN";
                timer = 30;  
                System.out.println("Light changed to GREEN. Timer set to " + timer + " seconds.");
                break;
            case "GREEN":
                color = "YELLOW";
                timer = 5;  
                System.out.println("Light changed to YELLOW. Timer set to " + timer + " seconds.");
                break;
            case "YELLOW":
                color = "RED";
                timer = 30;  
                System.out.println("Light changed to RED. Timer set to " + timer + " seconds.");
                break;
            default:
                color = "RED";
                timer = 30;
        }
    }
    void resetTimer(int seconds) {
        if (seconds > 0) {
            timer = seconds;
            System.out.println("Timer reset to " + timer + " seconds for " + color + " light.");
        } else {
            System.out.println("Invalid timer value. Using default.");
        }
    }
    void showStatus() {
        System.out.println("\n== Traffic Light Status ==");
        System.out.println("Current Color: " + color);
        System.out.println("Timer: " + timer + " seconds");
        System.out.println("============================\n");
    }
}
public class trafficLight {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("RED", 30);
        light.showStatus();

        light.changeColor();
        light.showStatus();

        light.changeColor();
        light.showStatus();

        light.resetTimer(45);
        light.showStatus();

        light.changeColor();
        light.showStatus();
    }
}