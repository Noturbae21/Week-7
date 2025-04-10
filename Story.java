import java.util.Scanner;

public class Story {
    Scene currentScene;
    Character player;

    public Story(Scene startScene, Character player) {
        this.currentScene = startScene;
        this.player = player;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (currentScene != null) {
            System.out.println("\n====================");
            System.out.println(currentScene.description);
            if (currentScene.option1Text == null) break;

            System.out.println("1. " + currentScene.option1Text);
            System.out.println("2. " + currentScene.option2Text);
            System.out.println("3. " + currentScene.option3Text);
            System.out.print("Pilih opsi (1-3): ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    player.takeDamage(currentScene.option1Damage);
                    player.addScore(currentScene.option1Score);
                    currentScene = currentScene.option1Scene;
                    break;
                case 2:
                    player.takeDamage(currentScene.option2Damage);
                    player.addScore(currentScene.option2Score);
                    currentScene = currentScene.option2Scene;
                    break;
                case 3:
                    player.takeDamage(currentScene.option3Damage);
                    player.addScore(currentScene.option3Score);
                    currentScene = currentScene.option3Scene;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.println("❤️ HP: " + player.health + " | ⭐ Skor: " + player.score);

            if (player.health <= 0) {
                System.out.println("Kamu kehabisan HP! GAME OVER.");
                break;
            }
        }

        System.out.println("\n=== AKHIR PERMAINAN ===");
        System.out.println("Nama: " + player.name);
        System.out.println("Skor akhir: " + player.score);
        System.out.println("HP akhir: " + player.health);
    }
}
