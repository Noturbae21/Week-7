import java.util.Scanner;

public class Story {
    private Scene startScene;
    private Character player;
    private Scanner scanner;

    public Story(Scene startScene, Character player) {
        this.startScene = startScene;
        this.player = player;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        play();
    }

    public void play() {
        Scene currentScene = startScene;

        while (currentScene != null) {
            currentScene.displayScene();
            System.out.print("Pilih A/B/C (atau ketik 'INFO' untuk melihat status): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("INFO")) {
                System.out.println("Nama: " + player.getName());
                System.out.println("Health: " + player.getHealth());
                System.out.println("XP: " + player.getXP());
                System.out.println("Item: " + player.getItem());
                continue;
            }

            Scene next = currentScene.makeChoice(input, player);
            if (next == null) continue;

            currentScene = next;
        }

        System.out.println("\nGame Selesai! Terima kasih sudah bermain.");
        System.out.println("Status akhir: HP=" + player.getHealth() + ", XP=" + player.getXP());
    }
}
