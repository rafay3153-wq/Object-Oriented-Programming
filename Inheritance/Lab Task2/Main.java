import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book b=new Book();
        System.out.println("Enter Book Details:");
        System.out.print("Title: ");
        String btitle = input.nextLine();
        System.out.print("Price: ");
        double bprice = input.nextDouble();
        System.out.print("Page Count: ");
        int pages = input.nextInt();
        input.nextLine();
        b.set(btitle, bprice, pages);
        Tape t=new Tape();
        System.out.println("\nEnter Tape Details:");
        System.out.print("Title: ");
        String tTitle = input.nextLine();
        System.out.print("Price: ");
        double tPrice = input.nextDouble();
        System.out.print("Playing Time (minutes): ");
        int time = input.nextInt();
        input.nextLine();
        t.set(tTitle, tPrice, time);
        System.out.println("\n--- Book Details ---");
        b.display();
        System.out.println("\n--- Tape Details ---");
        t.display();
        input.close();
    }
}