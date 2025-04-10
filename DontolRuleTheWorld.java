// import java.util.Scanner;

// public class DontolRuleTheWorld{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         // Scene 1

//         System.out.println("📞  Kamu mendapat panggilan dari Jendral Besar a");
//         System.out.println("Kamu tiba di ruangan jendral...");
//         System.out.print("Jendral Adit: \"Siapa nama kamu, prajurit?\" > ");
//         String nama = scanner.nextLine();

//         System.out.println("Jendral Adit: \"Oke " + nama + ", apakah kamu bersedia untuk membantuku menjalankan misi rahasia?\"");
//         System.out.println("1. Ya, saya bersedia");
//         System.out.println("2. Ga mau, malas");
//         System.out.println("3. *Menggulingkan presiden*");

//         System.out.print("> ");
//         int pilihan1 = scanner.nextInt();
//         scanner.nextLine(); // flush

//         if (pilihan1 == 2) {
//             System.out.println("Kamu terlalu mager. Misi gagal. GAME OVER.");
//             return;
//         } else if (pilihan1 == 3) {
//             System.out.println("Kamu dianggap mata-mata Denis. Kamu ditangkap dan diinterogasi. GAME OVER.");
//             return;
//         }

//         // Scene 2

//         System.out.println("\n🚁 Kamu berada di helikopter, OTW ke base Denis.");
//         System.out.println("1. Loncat langsung dari heli");
//         System.out.println("2. Tunggu heli mendarat di tempat aman");
//         System.out.println("3. Ngeteh dulu gasih");

//         System.out.print("> ");
//         int pilihan2 = scanner.nextInt();
//         scanner.nextLine(); // flush

//         if (pilihan2 == 1) {
//             System.out.println("Kamu loncat dan jatuh tanpa persiapan. Misi gagal. GAME OVER.");
//             return;
//         } else if (pilihan2 == 3) {
//             System.out.println("☕ Kamu minum teh dan merasa lebih tenang. (+XP)");
//         }

//         // Scene 3

//         System.out.println("\n🎯 Kamu tiba di outer base Denis. Misi kill Denis dimulai!");
//         System.out.println("Senjata awal: USP Silencer");
//         System.out.println("Kamu melihat 2 penjaga di depan gerbang.");

//         System.out.println("1. Headshot dua penjaga ala COD movement");
//         System.out.println("2. Cari jalan lain");
//         System.out.println("3. Masuk melalui atap pakai grappling hook");

//         System.out.print("> ");
//         int pilihan3 = scanner.nextInt();
//         scanner.nextLine(); // flush

//         if (pilihan3 == 1) {
//             System.out.println("🔫 Kamu berhasil headshot keduanya. Stealth +100!");
//         } else if (pilihan3 == 2) {
//             System.out.println("🛤️ Kamu menemukan jalur samping yang lebih aman.");
//         } else if (pilihan3 == 3) {
//             System.out.println("🪢 Kamu masuk dari atap dengan grappling hook. Aksi keren!");
//         }

//         System.out.println("\n✅ Scene 3 selesai. Misi berlanjut...");
//         // Lanjut ke Scene 4 kalau mau
//         // tes tes

//         System.out.println("Kamu berhasil menyusup ke dalam base Denis. Sekarang kamu harus mencari Denis.");
//         System.out.println("1. Cari di ruang kontrol");
//     }
// }
