public class Character {
    String name;
    int health;
    int Xp;
    String Item;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
        this.Xp = 0;
        this.Item = "Foto Dennis";
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }

    public void addScore(int Xp) {
        this.Xp += Xp;
    }
}
