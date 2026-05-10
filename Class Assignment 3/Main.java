import java.util.ArrayList;
abstract class MediaItem {
    private int id;
    protected String title;
    protected double duration;
    public MediaItem(int id, String title, double duration) {
        this.id = id;
        this.title = title;
        this.duration = duration;
    }
    public abstract void play();
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public double getDuration() {
        return duration;
    }
    public String toString() {
        return "Id=" + id + ", Title='" + title + "', Duration=" + duration + "}";
    }
}
interface Downloadable {
    void download();
}
interface Ratable {
    void rate(int stars);
}
class Song extends MediaItem implements Downloadable, Ratable {
    private String artist;
    public Song(int id, String title, double duration, String artist) {
        super(id, title, duration);
        this.artist = artist;
    }
    public void play() {
        System.out.println("Playing song: " + title + " by " + artist);
    }
    public void download() {
        System.out.println("Downloading song: " + title);
    }
    public void rate(int stars) {
        System.out.println("Rating song: " + title + " with " + stars + " stars");
    }
    public String getArtist() {
        return artist;
    }
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (obj == null || getClass() != obj.getClass()) 
            return false;
        Song other = (Song) obj;
        return this.getId() == other.getId() && this.getTitle().equals(other.getTitle());
    }
}
class Podcast extends MediaItem implements Downloadable {
    private String host;
    public Podcast(int id, String title, double duration, String host) {
        super(id, title, duration);
        this.host = host;
    }
    public void play() {
        System.out.println("Playing podcast: " + title + " hosted by " + host);
    }
    public void download() {
        System.out.println("Downloading podcast: " + title);
    }
    public String getHost() {
        return host;
    }
     public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (obj == null || getClass() != obj.getClass()) 
            return false;
        Podcast other = (Podcast) obj;
        return this.getId() == other.getId() && this.getTitle().equals(other.getTitle());
    }
}
class Movie extends MediaItem implements Ratable {
    private String director;
    public Movie(int id, String title, double duration, String director) {
        super(id, title, duration);
        this.director = director;
    }
    public void play() {
        System.out.println("Playing movie: " + title + " directed by " + director);
    }
    public void rate(int stars) {
        System.out.println("Rating movie: " + title + " with " + stars + " stars");
    }
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (obj == null || getClass() != obj.getClass()) 
            return false;
        Movie other = (Movie) obj;
        return this.getId() == other.getId() && this.getTitle().equals(other.getTitle());
    }
}
class PlayList<T extends MediaItem> {
    private ArrayList<T> items = new ArrayList<>();
    public void addItem(T item) {
        items.add(item);
    }
    public void playAll() {
        System.out.println("Playing all items in the playlist:");
        for (T item : items) {
            item.play();
        }
    }
    public ArrayList<T> getItems() {
        return items;
    }
}
public class Main {
    public static void main(String[] args) {
        Song s1= new Song (1, "Believer", 3.5, "Imagine Dragons");
        Movie m1= new Movie(3, "Inception", 148.0, "Christopher Nolan");
        Podcast p1= new Podcast(2, "Tech Talk", 40.0, "Ali");
        PlayList<MediaItem> library = new PlayList<>();
        library.addItem(s1);
        library.addItem(m1);
        library.addItem(p1);
        library.playAll();
        for (MediaItem item : library.getItems()) {
            item.play();
        }
        System.out.println("\nDownloading all downloadable items:");
        for (MediaItem item : library.getItems()) {
            if (item instanceof Downloadable) {
                Downloadable d=((Downloadable) item);
                d.download();
            }
        }
        MediaItem item=s1;
        if (item instanceof Song) {
            Song s =((Song) item);
            System.out.println(s.getArtist());
        }
    }
}