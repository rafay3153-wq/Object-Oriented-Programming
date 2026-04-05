class Character {
    protected String name;
    protected int level;
    protected int hp;
    public Character() {
        this.name = "Unknown";
        this.level = 1;
        this.hp = 100;
    }
    public Character(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }
}
class PlayerCharacter extends Character {
    private int playerLevel;
    private int energyPoints;
    public PlayerCharacter() {
        super();
        this.playerLevel = 1;
        this.energyPoints = 50;
    }
    public PlayerCharacter(String name, int level, int hp, int playerLevel, int energyPoints) {
        super(name, level, hp);
        this.playerLevel = playerLevel;
        this.energyPoints = energyPoints;
    }
    public void display() {
        System.out.println("Player Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("HP: " + hp);
        System.out.println("Player Level: " + playerLevel);
        System.out.println("Energy Points: " + energyPoints);
    }
}
class NonPlayerCharacter extends Character {
    private String behaviorPattern;
    private int difficultyLevel;
    public NonPlayerCharacter() {
        super();
        this.behaviorPattern = "Neutral";
        this.difficultyLevel = 1;
    }
    public NonPlayerCharacter(String name, int level, int hp, String behaviorPattern, int difficultyLevel) {
        super(name, level, hp);
        this.behaviorPattern = behaviorPattern;
        this.difficultyLevel = difficultyLevel;
    }
    public void display() {
        System.out.println("NPC Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("HP: " + hp);
        System.out.println("Behavior Pattern: " + behaviorPattern);
        System.out.println("Difficulty Level: " + difficultyLevel);
    }
}
public class Main {
    public static void main(String[] args) {
        PlayerCharacter p1 = new PlayerCharacter();
        p1.display();
        PlayerCharacter p2 = new PlayerCharacter("Hero", 5, 150,10,80);
        p2.display();
        NonPlayerCharacter npc = new NonPlayerCharacter("Bot", 3, 120, "Aggressive", 2);
        npc.display();
    }
}