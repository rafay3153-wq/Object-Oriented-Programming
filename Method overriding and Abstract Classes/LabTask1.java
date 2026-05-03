class Movie {
    private String rating;
    private int IdNumber;
    private String title;
    public Movie(String rating, int IdNumber, String title) {
        this.rating = rating;
        this.IdNumber = IdNumber;
        this.title = title;
    }
    public String getRating() {
        return rating;
    }
    public int getIdNumber() {
        return IdNumber;
    }
    public String getTitle() {
    return title;
        }   
    public void setRating(String rating) {
        this.rating = rating;
        }
    public void setIdNumber(int IdNumber) {
        this.IdNumber = IdNumber;
        }   
    public void setTitle(String title) {
        this.title = title;
        }
        public boolean equals(Object obj) {
            Movie m=(Movie) obj;
            return this.IdNumber==m.IdNumber;
        }
        public double calculateFees(int days) {
            return days * 2.0;
        }
}
class Action extends Movie {
    Action(String rating, int IdNumber, String title) {
        super(rating, IdNumber, title);
    }
    public double calculateFees(int days) {
        return days * 3.0;
    }
}
class Comedy extends Movie {
    Comedy(String rating, int IdNumber, String title) {
        super(rating, IdNumber, title);
    }
    public double calculateFees(int days) {
        return days * 2.5;
    }
}
class Drama extends Movie {
    Drama(String rating, int IdNumber, String title) {
        super(rating, IdNumber, title);
    }
    public double calculateFees(int days) {
        return days * 2.0;
    }
}
public class LabTask1 {
    public static void main(String[] args) {
        Movie m1 = new Action("PG-13", 101, "Action Movie");
        Movie m2 = new Comedy("PG", 102, "Comedy Movie");
        Movie m3 = new Drama("R", 103, "Drama Movie");
        System.out.println(m1.getTitle() + " Fees for 5 days: $" + m1.calculateFees(5));
        System.out.println(m2.getTitle() + " Fees for 5 days: $" + m2.calculateFees(5));
        System.out.println(m3.getTitle() + " Fees for 5 days: $" + m3.calculateFees(5));
        Movie m4 = new Action("PG-13", 101, "Action Movie");
        System.out.println("m1 equals m4: " + m1.equals(m4));
    }
}