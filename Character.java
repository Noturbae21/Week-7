public class Character {
    String name;
    int health;
    int score;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
        this.score = 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }

    public void addScore(int score) {
        this.score += score;
    }
}
