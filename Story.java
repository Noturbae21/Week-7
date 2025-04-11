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
            System.out.println("\n====================");
            currentScene.displayScene();

            if (currentScene.isEnding()) {
                break;
            }

            System.out.print("Pilih A/B/C atau ketik INFO: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("INFO")) {
                System.out.println(" HP: " + player.getHealth());
                System.out.println(" XP: " + player.getXP());
                System.out.println(" Item: " + (player.getItem() == null ? "-" : player.getItem()));
                continue;
            }

            Scene next = currentScene.makeChoice(input, player);
            
            // Cek kalau HP habis
            if (player.getHealth() <= 0) {
                System.out.println("\n Kamu kehabisan HP. GAME OVER!");
                break;
            }

            if (next == null) {
                System.out.println("Pilihan tidak valid, coba lagi!");
            } else {
                currentScene = next;
            }
        }

        // Akhir permainan
        System.out.println("\n=== AKHIR PERMAINAN ===");
        System.out.println("Nama: " + player.getName());
        System.out.println("HP: " + player.getHealth());
        System.out.println("XP: " + player.getXP());
        System.out.println("Item: " + (player.getItem() == null ? "-" : player.getItem()));
    }
}
