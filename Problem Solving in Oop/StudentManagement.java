class Student {
    public String studentID;
    public String name;
    public int age;
    public String department;
    public double cgpa;
    public String[] courseList = new String[5];
    private int courseCount = 0;
    public void registerCourse(String courseName) {
        if (courseCount < 5) {
            courseList[courseCount] = courseName;
            courseCount++;
            System.out.println(name + " has registered for: " + courseName);
        } else {
            System.out.println("Registration full! " + name + " cannot register for more than 5 courses.");
        }
    }
    public void showInfo() {
        System.out.println("\n Student Information ");
        System.out.println("ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.print("Courses: ");
        if (courseCount > 0) {
            System.out.print(courseList[0]);
            for (int i = 1; i < courseCount; i++) {
                System.out.print(", " + courseList[i]);
            }
        }
        System.out.println();
    }
    public void attendClass() {}
    public void study() {}
}
public class StudentManagement {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentID = "035";
        student1.name = "Rafay";
        student1.age = 20;
        student1.department = "Computer Science";
        student1.cgpa = 3.9;
        student1.registerCourse("Object Oriented Programming");
        student1.registerCourse("Data Structures");
        student1.registerCourse("Database Systems");
        student1.registerCourse("Software Engineering");
        student1.registerCourse("Programming Fundamentals");
        student1.showInfo();
        Student student2 = new Student();
        student2.studentID = "015";
        student2.name = "Ajmal";
        student2.age = 21;
        student2.department = "Electrical Engineering";
        student2.cgpa = 3.8;
        student2.registerCourse("Discrete Mathematics");
        student2.registerCourse("Calculus");
        student2.registerCourse("Bioinformatics");
        student2.registerCourse("Sociology");
        student2.registerCourse("Functional English");
        student2.showInfo();
    }
}