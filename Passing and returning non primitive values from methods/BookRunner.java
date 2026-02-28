class Book {
    private String author;
    private String[] chapterNames;
    public Book() {
        author="";
        chapterNames=new String[100];
    }
    public Book(String author,String[] chapterNames) {
        this.author=author;
        this.chapterNames=new String[100];
        for (int i=0;i<chapterNames.length;i++) {
            this.chapterNames[i] = chapterNames[i];
        }
    }
    public void setAuthor(String author) {
        this.author=author;
    }
    public void setChapterNames(String[] chapterNames) {
        for (int i=0;i<chapterNames.length;i++) {
            this.chapterNames[i]=chapterNames[i];
        }
    }
    public String getAuthor() {
        return author;
    }
    public String[] getChapterNames() {
        return chapterNames;
    }
    public boolean compareBooks(Book b) {
        return this.author.equals(b.author);
    }
    public Book compareChapterNames(Book b) {
        int count1 = 0;
        int count2 = 0;
    for (int i=0; i<this.chapterNames.length;i++){
        if(this.chapterNames[i] !=null) {
            count1++;
        }
    }
    for (int i=0;i<b.chapterNames.length;i++) {
        if(b.chapterNames[i]!=null) {
            count2++;
        }
    } 
    if (count1 >= count2) {
        return this;
    }
    else{
        return b;
       }
    }
}
public class BookRunner {
    public static void main(String[] args) {
        Book book1=new Book();
        book1.setAuthor("John");
        String[] chapters1={"Intro", "OOP Basics"};
        book1.setChapterNames(chapters1);
        String[] chapters2={"Intro","Java","Encapsulation"};
        Book book2=new Book("Ali",chapters2);
        if(book1.compareBooks(book2)) {
            System.out.println("Both books have the same author.");
        }
        else {
            System.out.println("Authors are different.");
        }
        Book largerBook=book1.compareChapterNames(book2);
        System.out.println("Book with more chapters is written by: " + largerBook.getAuthor());
    }
}
