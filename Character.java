
    // Atribut karakter

public class Character {
    private String name;
    private int health;
    private int XP;
    private String item;

    //end atribut

    // Constructor untuk karakter dengan nama dan kesehatan dan experience awal

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
        this.XP = 0;
        this.item = "-";
    }

    // end constructor

    // method dmg exp name health item

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) this.health = 0;
    }
 
    public void addXP(int additionalXP) {
        this.XP += additionalXP;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getXP() {
        return XP;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        if (item != null) {
            this.item = item;
            System.out.println(" Kamu mendapatkan item: " + item);
        }
    }
}
    // end method
