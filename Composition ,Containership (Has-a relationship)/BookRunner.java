class Book {
    private String bookName;
    private String publisher;
    private Person author;
    public Book() {
    }
    public Book(String bookName, String publisher, Person author) {
        this.bookName = bookName;
        this.publisher = publisher;
        this.author = author;
    }
    public void display() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Publisher: " + publisher);
        author.display();
    }
}
class BookRunner {
    public static void main(String[] args) {
    Address address = new Address("10", "456", "Lahore", "54000");
    Person author= new Person("Ahmed", address);
    Book b= new Book("Java Basics", "ABC Publishers", author);
    author.getAddress().setCity("Islamabad");
    b.display();
    }
}







