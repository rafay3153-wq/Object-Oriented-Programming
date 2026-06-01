import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList<>();
        System.out.println("Initial size of all: "+a1.size());
        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        a1.add(1,"A2");
        System.out.println("Size of a1 after additions: "+a1.size());
        System.out.println("Contents of a1: "+a1);
        a1.remove(2);
        System.out.println("Size of a1 after deletion: "+a1.size());
        System.out.println("Contents of a1: "+a1);
    }
}
