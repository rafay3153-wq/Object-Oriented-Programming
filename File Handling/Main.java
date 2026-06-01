import java.io.*;
class Person implements Serializable {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
class Book implements Serializable {
    String name;
    String publisher;
    Person author;

    public Book(String name, String publisher, Person author) {
        this.name = name;
        this.publisher = publisher;
        this.author = author;
    }
    
    public String toString() {
        return "Book Name: " + name + ", Publisher: " + publisher + ", Author: " + author;
    }
}
public class Main {
    public static void main(String[] args) {
       try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("BookStore"));
            Book b1 = new Book("Java", "ABC", new Person("Ali"));
            Book b2 = new Book("OOP", "XYZ", new Person("Ahmed"));
            Book b3 = new Book("Database", "Tech", new Person("Sara"));
            Book b4 = new Book("Networking", "IT House", new Person("Ayesha"));
            Book b5 = new Book("AI", "Future", new Person("Hamza"));
            out.writeObject(b1);
            out.writeObject(b2);
            out.writeObject(b3);
            out.writeObject(b4);
            out.writeObject(b5);
            out.close();
            System.out.println("Books written successfully.");
       } catch (IOException e) {
        System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}