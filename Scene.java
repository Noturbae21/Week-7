    // atribut dari scene

public class Scene {
    private String description;
    private String choiceA, choiceB, choiceC;
    private Scene nextSceneA, nextSceneB, nextSceneC;
    private int damageA, damageB, damageC;
    private int XPA, XPB, XPC;
    private String itemA, itemB, itemC;

    // end atribut scene

    //Counstructor untuk scene dengan pilihan

    // Constructor untuk scene biasa 1.
    public Scene(String description,
                 String choiceA, Scene nextSceneA, int damageA, int XPA,
                 String choiceB, Scene nextSceneB, int damageB, int XPB,
                 String choiceC, Scene nextSceneC, int damageC, int XPC) {
        this.description = description;
        this.choiceA = choiceA;
        this.nextSceneA = nextSceneA;
        this.damageA = damageA;
        this.XPA = XPA;
        this.choiceB = choiceB;
        this.nextSceneB = nextSceneB;
        this.damageB = damageB;
        this.XPB = XPB;
        this.choiceC = choiceC;
        this.nextSceneC = nextSceneC;
        this.damageC = damageC;
        this.XPC = XPC;
    }

    // Constructor khusus ending (gak punya pilihan)2.

    // end constructor


    // method
    // Method untuk scene ending
    public Scene(String description) {
        this.description = description;
        this.choiceA = null;
        this.choiceB = null;
        this.choiceC = null;
    }

    // Method untuk scene biasa
    public void setItemForChoices(String itemA, String itemB, String itemC) {
        this.itemA = itemA;
        this.itemB = itemB;
        this.itemC = itemC;
    }

    //Method (ini ditampilkan di terminal)

    public void displayScene() {
        System.out.println("\n" + description);
        if (choiceA != null) {
            System.out.println("A. " + choiceA);
            System.out.println("B. " + choiceB);
            System.out.println("C. " + choiceC);
        }
    }

    //Metod Kalo ending selesai

    public Scene makeChoice(String choice, Character player) {
        if (choiceA == null) return null; // kalau ending scene, langsung selesai

        switch (choice.toUpperCase()) {
            case "A":
                player.takeDamage(damageA);
                player.addXP(XPA);
                if (itemA != null) player.setItem(itemA);
                return nextSceneA;
            case "B":
                player.takeDamage(damageB);
                player.addXP(XPB);
                if (itemB != null) player.setItem(itemB);
                return nextSceneB;
            case "C":
                player.takeDamage(damageC);
                player.addXP(XPC);
                if (itemC != null) player.setItem(itemC);
                return nextSceneC;
            default:
                System.out.println("Pilihan tidak valid.");
                return null;
        }
    }

    public boolean isEnding() {
        return choiceA == null;
    }
}   //Selesai Method
