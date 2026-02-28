public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    
    public Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }
    
    public Time(int h, int m) {
        if(h >= 0 && h <= 23) {
            hours = h;
        } else {
            hours = 0;
            System.out.println("Invalid hours! Set to 0");
        }
        
        if(m >= 0 && m <= 59) {
            minutes = m;
        } else {
            minutes = 0;
            System.out.println("Invalid minutes! Set to 0");
        }
        
        seconds = 0;
    }
    
    public void display() {
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }

    public static void main(String[] args) {
        Time t1 = new Time();
        System.out.print("Time 1 (default): ");
        t1.display();
        
        Time t2 = new Time(14, 30);
        System.out.print("Time 2 (valid): ");
        t2.display();
        

        Time t3 = new Time(25, 70);
        System.out.print("Time 3 (invalid): ");
        t3.display();
    }
}