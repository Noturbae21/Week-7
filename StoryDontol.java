import java.util.Scanner;

class Character {
    private String name;
    private int health;
    private int XP;
    private String item;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
        this.XP = 0;
        this.item = "Usp Silencer"; // starter item default
    }

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
        this.item = item;
    }
}

class Scene {
    private String description;
    private String choiceA, choiceB, choiceC;
    private Scene nextSceneA, nextSceneB, nextSceneC;
    private int damageA, damageB, damageC;
    private int XPA, XPB, XPC;

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

    public void displayScene() {
        System.out.println("\n" + description);
        System.out.println("A. " + choiceA);
        System.out.println("B. " + choiceB);
        System.out.println("C. " + choiceC);
    }

    public Scene makeChoice(String choice, Character player) {
        switch (choice.toUpperCase()) {
            case "A":
                player.takeDamage(damageA);
                player.addXP(XPA);
                return nextSceneA;
            case "B":
                player.takeDamage(damageB);
                player.addXP(XPB);
                return nextSceneB;
            case "C":
                player.takeDamage(damageC);
                player.addXP(XPC);
                return nextSceneC;
            default:
                System.out.println("Pilihan tidak valid. Coba lagi.");
                return null;
        }
    }
}

class Story {
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

public class StoryDontol {
    public static void main(String[] args) {
        // Placeholder scenes
        Scene scene10 = new Scene("Placeholder", "", null, 0, 0, "", null, 0, 0, "", null, 0, 0);
        Scene scene9 = new Scene("Placeholder", "", null, 0, 0, "", null, 0, 0, "", null, 0, 0);
        Scene scene8 = new Scene("Placeholder", "", null, 0, 0, "", null, 0, 0, "", null, 0, 0);
        Scene scene7 = new Scene("Placeholder", "", null, 0, 0, "", null, 0, 0, "", null, 0, 0);
        Scene scene6 = new Scene("Placeholder", "", null, 0, 0, "", null, 0, 0, "", null, 0, 0);
        Scene scene5 = new Scene("Placeholder", "", null, 0, 0, "", null, 0, 0, "", null, 0, 0);
        Scene scene4 = new Scene("Placeholder", "", null, 0, 0, "", null, 0, 0, "", null, 0, 0);
        Scene scene3 = new Scene("Placeholder", "", null, 0, 0, "", null, 0, 0, "", null, 0, 0);
        Scene scene2 = new Scene("Placeholder", "", null, 0, 0, "", null, 0, 0, "", null, 0, 0);

        // Scene 10
        scene10 = new Scene("Kamu dan rekanmu berhasil mengikuti Dennis ke luar Mall lalu memojokkannya. Rekanmu bertanya “Kita apakan dia”",
                "1. Bawa kembali ke Jenderal Adit", null, 0, 20,
                "2. Hilangkan nyawa Dennis di tempat", null, 10, 10,
                "3. Biarkan dia kabur karena kamu terlalu baik", null, 0, 0);

        scene9 = new Scene("Kamu mendapat pesan dari jenderal adit bahwa ada rekan yang bisa kamu ajak kerja sama.",
                "1. Suruh rekan antri Starbucks", scene10, 0, 0,
                "2. Minta bantuan rekan untuk membuntuti Dennis", scene10, 0, 15,
                "3. Ikuti Dennis sendiri", scene10, 10, 5);

        scene8 = new Scene("Setelah sampai ke Ramayana Kamu melacak lokasi Dennis dengan menyadap CCTV Mall, dan ternyata dia ada di lantai Satu.",
                "1. Menyamar jadi warga biasa", scene9, 0, 10,
                "2. Masuk naik RX King", scene9, 5, 5,
                "3. Masuk dengan pakaian tempur", scene9, 10, 0);

        scene7 = new Scene("Dennis ternyata ada di Ramayana Bungurasih beli nastar.",
                "1. Kembali lapor ke Jenderal Adit", scene8, 0, 0,
                "2. Curi kendaraan musuh dan kejar Dennis", scene8, 0, 10,
                "3. Jalan kaki ke Ramayana", scene8, 5, 5);

        scene6 = new Scene("Kamu melanjutkan pencarian Dennis.",
                "1. Lihat LOG presensi", scene7, 0, 5,
                "2. Interogasi penjaga", scene7, 5, 10,
                "3. Teriak lewat speaker", scene7, 10, 0);

        scene5 = new Scene("Alarm berbunyi! 3 penjaga berlari ke arahmu!",
                "1. Sembunyi di ruangan server", scene6, 0, 0,
                "2. Lempar flashbang & headshot", scene6, 5, 15,
                "3. Tembak lampu & pakai night vision", scene6, 0, 20);

        scene4 = new Scene("Kamu tiba di dalam base, ada 3 jalur.",
                "1. Kiri (ambil shotgun)", scene5, 0, 10,
                "2. Tengah (santai)", scene5, 10, 0,
                "3. Kanan (gelap, aktifkan night vision)", scene5, 5, 5);

        scene3 = new Scene("Kamu tiba di Outer base Dennis, ada dua penjaga.",
                "1. Headshot ala COD", scene4, 0, 10,
                "2. Cari jalan lain", scene4, 0, 5,
                "3. Lewat atap dengan grappling hook", scene4, 0, 10);

        scene2 = new Scene("Kamu di helikopter menuju base Dennis.",
                "1. Loncat sekarang", null, 100, 0,
                "2. Tunggu mendarat", scene3, 0, 0,
                "3. Ngeteh dulu gassih", scene3, 0, 10);

        Scene scene1 = new Scene("Kamu dipanggil Jenderal Adit dan ditanya apakah mau ikut misi rahasia.",
                "1. Ya, saya bersedia", scene2, 0, 0,
                "2. Ga mau malas", null, 0, 0,
                "3. Gebukin Adit (dituduh mata-mata)", null, 50, 0);

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama karaktermu: ");
        String playerName = input.nextLine();

        Character player = new Character(playerName, 100);
        Story game = new Story(scene1, player);
        game.start();
    }
}
