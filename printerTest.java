class Printer {
    int inkLevel;
    int paperCount;
    boolean isOn;

    Printer(int ink, int paper, boolean power) {
        inkLevel = ink;
        paperCount = paper;
        isOn = power;
    }

    void powerOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Printer is now ON.");
        } 
        else {
            System.out.println("Printer is already ON.");
        }
    }

    void powerOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Printer is now OFF.");
        }
        else {
            System.out.println("Printer is already OFF.");
        }
    }

    void printPages(int n) {
        if (!isOn) {
            System.out.println("Cannot print. Printer is OFF.");
            return;
        }
        if (paperCount < n) {
            System.out.println("Not enough paper! Required: " + n + ", Available: " + paperCount);
            return;
        }
        if (inkLevel < n * 2) {  
            System.out.println("Not enough ink! Cannot print.");
            return;
        }
        paperCount -= n;
        inkLevel -= n * 2;
        System.out.println("Printing " + n + " page(s). Done!");
        if (paperCount < 10) {
            System.out.println("Warning: Low paper! Only " + paperCount + " sheets left.");
        }
        if (inkLevel < 20) {
            System.out.println("Warning: Low ink! Only " + inkLevel + "% remaining.");
        }
    }

    void refillInk() {
        inkLevel = 100;
         System.out.println("Ink refilled to 100%.");
    }

    void addPaper(int n) {
        paperCount += n;
        System.out.println("Added " + n + " sheets. Total paper: " + paperCount);
    }

    void showStatus() {
        System.out.println("\nPrinter Status: ");
        System.out.println("Power: " + isOn);
        System.out.println("Ink: " + inkLevel + "%");
        System.out.println("Paper: " + paperCount + " sheets");
        System.out.println("======================\n");
    }
}
public class printerTest {
    public static void main(String[] args) {
        Printer p1 = new Printer(50,30,false);
        p1.showStatus();

        p1.powerOn();
        p1.printPages(5);
        p1.showStatus();

        p1.printPages(10);
        p1.showStatus();
        p1.refillInk();
        p1.addPaper(30);

        p1.printPages(30);
        p1.showStatus();

        p1.powerOff();
    }
}