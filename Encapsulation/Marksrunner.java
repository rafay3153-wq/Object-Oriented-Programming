class Marks {
    private int marks1;
    private int marks2;
    private int marks3;
    public void setMarks1(int m1) {
        marks1=m1;
    }
    public void setMarks2(int m2) {
        marks2=m2;
    }
    public void setMarks3(int m3) {
        marks3=m3;
    }
    public int getMarks1() {
        return marks1;
    }
    public int getMarks2() {
        return marks2;
    }
    public int getMarks3() {
        return marks3;
    }
}
public class Marksrunner {
    public static void main(String[] args) {
        Marks student1=new Marks();
        student1.setMarks1(85);
        student1.setMarks2(90);
        student1.setMarks3(78);
        System.out.println("Marks 1: " + student1.getMarks1());
        System.out.println("Marks 2: " + student1.getMarks2());
        System.out.println("Marks 3: "+ student1.getMarks3());
    }
}