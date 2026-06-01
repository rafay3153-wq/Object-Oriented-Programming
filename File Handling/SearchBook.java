import java.io.*;
import java.util.Scanner;
public class SearchBook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the book to search:");
        String searchName=sc.nextLine();
        boolean found=false;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("BookStore"));
            while(true) {
                Book b = (Book) in.readObject();
                if(b.name.equalsIgnoreCase(searchName)) {
                    System.out.println("Book found: " + b);
                    found=true;
                    break;
                }
            }
        } catch (EOFException e) {
            if (!found) {
                System.out.println("Book not found.");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
