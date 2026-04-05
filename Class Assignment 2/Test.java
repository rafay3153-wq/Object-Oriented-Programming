class Character {
     protected String name;
     protected int level;
     protected int hp;
     public Character(String name, int level, int hp) {
         this.name = name;
         this.level = level;
         this.hp = hp;
     }
     public void attack() {
         System.out.println(name + " performs a basic attack!");
     }
 }
 class PlayerCharacter extends Character {
    private String weapon;
    public PlayerCharacter(String name, int level, int hp, String weapon) {
        super(name, level, hp);
        this.weapon = weapon;
    }
    public void attack() {
        System.out.println(name + " attacks using weapon: " + weapon);
    }
 }
 class NonPlayerCharacter extends Character {
    private String behaviorPattern;
    public NonPlayerCharacter(String name, int level, int hp, String behaviorPattern) {
        super(name, level, hp);
        this.behaviorPattern = behaviorPattern;
    }
    public void attack() {
        System.out.println(name + " (" + behaviorPattern + ") performs AI attack!");
    }
 }
public class Test {
    public static void main(String[] args) {
        Character c1 = new PlayerCharacter("Hero", 5, 150, "Sword");
        Character c2 = new NonPlayerCharacter("Goblin", 3, 100, "Aggressive");
        
        c1.attack();
        c2.attack();
    }
}