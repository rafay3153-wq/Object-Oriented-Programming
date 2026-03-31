public class Publication {
    protected String title;
    protected double price;
    public Publication() {
        title = " ";
        price = 0.0;
    }
    public Publication(String title, double price) {
        this.title = title;
        this.price = price;
    }
    public void set(String title, double price) {
        this.title = title;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }  
}
