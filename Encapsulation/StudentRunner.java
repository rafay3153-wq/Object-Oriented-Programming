class Student{
    private String name;
    private int[] resultArray=new int[5];
    public Student(String name,int[] resultArray) {
        this.name=name;
        this.resultArray=resultArray;
    }    
    public double average() {
        int sum=0;
        for (int i=0;i<resultArray.length;i++) {
            sum+=resultArray[i];
        }
        return(double) sum/resultArray.length;
        }
    public String getName() {
        return name;
    }
}
public class StudentRunner{
    public static void main(String[] args) {
        int[] marks1 = {80,75,90,85,70};
        int[] marks2 = {60,65,70,75,80};
        Student std1 = new Student("Ali",marks1);
        Student std2 = new Student("Bilal", marks2);
        double avg1 = std1.average();
        double avg2 = std2.average();
        System.out.println(std1.getName()+"'s Average: " +avg1);
        System.out.println(std2.getName()+"'s Average: "+ avg2);
        if(avg1>avg2) {
            System.out.println(std1.getName() + " has a higher average."); 
        }
            else if (avg2>avg1) {
                System.out.println(std2.getName() + " has a higher average."); 
            }
            else {
                System.out.println("Both students have the same average.");
            }
            Student std3=new Student(std1.getName(),marks2);
            System.out.println(std3.getName()+"'s Average:" + std3.average());
        }
    }
    


