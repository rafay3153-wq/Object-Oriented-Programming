class SmartDevice {
    String brand;
    int batteryLevel;
    int volume;
    boolean isOn;

    SmartDevice(String b, int battery, int vol, boolean power) {
        brand = b;
        batteryLevel = battery;
        volume = vol;
        isOn = power;
        System.out.println("A new " + brand + " device has been created.");
    }

    void powerOn() {
        if (!isOn) {
            isOn = true;
            System.out.println(brand + " is now ON.");
        } 
        else {
            System.out.println(brand + " is already ON.");
        }
    }

    void powerOff() {
        isOn = false;
        System.out.println("Device powered OFF");
    }

    void increaseVolume() {
        if (isOn) {
            if (volume < 100) {
                volume += 10;
                if (volume > 100) volume = 100;
                System.out.println("Volume increased to " + volume + "%");
            } 
            else {
                System.out.println("Volume already at maximum.");
            }
        } 
        else {
            System.out.println("Cannot adjust volume. Device is OFF.");
        }
    }

    void useApp() {
        if (isOn) {
            if (batteryLevel > 5) {
                batteryLevel -= 5;
                System.out.println("Using app, Battery now at " + batteryLevel + "%");
                if (batteryLevel <= 10) {
                    System.out.println("Warning: Low battery! Please charge.");
                }
            } else {
                System.out.println("Battery too low to use apps. Please charge.");
                powerOff(); 
            }
        } else {
            System.out.println("Cannot use apps. Device is OFF.");
        }
    }

    void charge() {
        System.out.println("Charging device");
        batteryLevel = 100;
        System.out.println("Device fully charged.");
    }

    void showStatus() {
        System.out.println("Brand: " + brand);
        System.out.println("Battery: " + batteryLevel);
        System.out.println("Volume: " + volume);
        System.out.println("Power: " + isOn);
        System.out.println("---------------------");
    }
}

public class smartDeviceTest {
    public static void main(String[] args) {
        SmartDevice phone = new SmartDevice("Samsung", 50, 10, false);
       
        phone.showStatus();

        phone.powerOn();
        phone.increaseVolume();
        phone.useApp();
        phone.charge();

        phone.showStatus();
        phone.powerOff();
    }
}