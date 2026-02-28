class Time {
    public int hour;
    public int minute;
    public int second;
    public Time(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }
    public void showTime() {
        System.out.print(" " + hour + ":" + minute + ":" + second);
    }
}
public class TimeCheck {
    public static void main(String[] args) {
        Time t1 = new Time(10, 30, 45);
        Time t2 = new Time(23, 59, 59);
        System.out.println("Time 1:");
        t1.showTime();
        System.out.println("Time 2:");
        t2.showTime();
    }
}
