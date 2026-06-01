import java.io.*;
public class DisplayBooks {
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("BookStore"));
            while(true) {
                Book b = (Book) in.readObject();
                System.out.println(b); }

            } catch (EOFException e) {
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error reading from file: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }
