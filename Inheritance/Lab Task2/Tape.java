public class Tape extends Publication {
    private int playingTime;
    public Tape() {
        super();
        playingTime = 0;
    }
    public Tape(String title, double price, int playingTime) {
        super(title, price);
        this.playingTime = playingTime;
    }
    public void set(String title, double price, int playingTime) {
        super.set(title, price);
        this.playingTime = playingTime;
    }
    public int getPlayingTime() {
        return playingTime;
    }
    public void display() {
        super.display();
        System.out.println("Playing Time (minutes): " + playingTime);
    }
}
