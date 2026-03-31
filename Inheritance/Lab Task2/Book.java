public class Book extends Publication {
    private int pageCount;
    public Book() {
        super();
        pageCount = 0;
    }
    public Book(String title, double price, int pageCount) {
        super(title, price);
        this.pageCount = pageCount;
    }
    public void set(String title, double price, int pageCount) {
        super.set(title, price);
        this.pageCount = pageCount;
    }
    public int getPageCount() {
        return pageCount;
    }
    public void display() {
        super.display();
        System.out.println("Page Count: " + pageCount);
    }
}
