import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ENDING SCENES
        Scene endingGood = new Scene("Dennis diadili oleh adit.");
        Scene endingNeutral = new Scene("Dunia akan kembali menghadapi konflik.");
        Scene endingBad = new Scene("dennis wafat dan meninggalkan misteri.");
        Scene endingAneh = new Scene("Kamu pun dijadikan lego oleh orang orang di sana dan diolah jadi pakan lele");

        // SCENE 10
        Scene scene10 = new Scene(
                "Kamu dan rekanmu berhasil mengikuti Dennis ke luar Mall lalu memojokkannya. Rekanmu pun bertanya “Kita apakan dia”",
                "1. Bawa kembali ke Jenderal Adit", endingGood, 0, 20,
                "2. Hilangkan nyawa Dennis di tempat", endingBad, 10, 10,
                "3. Biarkan dia kabur karena kamu terlalu baik", endingNeutral, 0, 0
        );

        // SCENE 9
        Scene scene9 = new Scene(
                "Kamu mendapat pesan dari jenderal adit bahwa ada rekan yang bis~a kamu ajak kerja sama.",
                "1. Suruh rekan antri Starbucks", scene10, 0, 0,
                "2. Minta bantuan rekan untuk membuntuti Dennis", scene10, 0, 15,
                "3. Ikuti Dennis sendiri", scene10, 10, 5
        );

        // SCENE 8
        Scene scene8 = new Scene(
                "Setelah sampai ke Ramayana Kamu melacak lokasi Dennis dengan menyadap CCTV Mall, dan ternyata dia ada di lantai Satu.",
                "1. Menyamar jadi warga biasa", scene9, 0, 10,
                "2. Masuk naik RX King", scene9, 5, 5,
                "3. Masuk dengan pakaian tempur", scene9, 10, 0
        );

        // SCENE 7
        Scene scene7 = new Scene(
                "Dennis ternyata ada di Ramayana Bungurasih beli nastar.... \n\nSungguh aneh melihat orang seperti dia jalan jalan di tempat umum pikirmu",
                "1. Kembali lapor ke Jenderal Adit dan minta kendaraan", scene8, 0, 0,
                "2. Curi kendaraan musuh dan kejar Dennis", scene8, 0, 10,
                "3. Jalan kaki ke Ramayana", scene8, 5, 5
        );

        // SCENE 6
        Scene scene6 = new Scene(
                "Kamu melanjutkan pencarian Dennis. Dia tidak ada di kantor dan kamu pun berusaha menggali Informasi",
                "1. Lihat LOG presensi", scene7, 0, 5,
                "2. Interogasi penjaga", scene7, 5, 10,
                "3. Teriak lewat speaker", scene7, 10,0
        );

        // SCENE 5
        Scene scene5 = new Scene(
                "Alarm berbunyi! 3 penjaga berlari ke arahmu!",
                "1. Sembunyi di ruangan server", scene6, 0, 0,
                "2. Lempar flashbang & headshot", scene6, 5, 15,
                "3. Tembak lampu & pakai night vision", scene6, 0, 20
        );

        // SCENE 4
        Scene scene4 = new Scene(
                "Kamu tiba di dalam base, ada 3 jalur.",
                "1. Kiri (ambil shotgun)", scene5, 0, 10,
                "2. Tengah (santai)", scene5, 10, 0,
                "3. Kanan (gelap, aktifkan night vision)", scene5, 5, 5
        );

        // SCENE 3
        Scene scene3 = new Scene(
                "Kamu tiba di Outer base Dennis, ada dua penjaga.",
                "1. Headshot ala COD", scene4, 0, 10,
                "2. Cari jalan lain", scene4, 0, 5,
                "3. Lewat atap dengan grappling hook", scene4, 0, 10
        );

        // SCENE 2
        Scene scene2 = new Scene(
                """
                Kamu mendapatkan sesuatu: .Kamu berankat naik helikopter sesuai lokasi yang ditandai Jenderal Adit
                 sesampainya di sana kamu mencari cara untuk""",
                "1. Loncat sekarang", scene3, 100, 0,
                "2. Tunggu mendarat", scene3, 0, 0,
                "3. Ngeteh dulu gassih", scene3, 0, 10
        );

        // SCENE 1
        Scene scene1 = new Scene(
                "Jadi kamu anak baru ya, jadi dengarkan aku dunia sedang tidak baik baik saja. konflik dan tangisan adalah sarapan sehari-hari...\ntugasmu adalah menangkap Dennis, dia adalah kunci untuk menyelesaikan konflik ini" ,
                "1. Ya, saya bersedia", scene2, 0, 0,
                "2. Ga mau malas", scene2, 0, 0,
                "3. Gebukin Adit (dituduh mata-mata)", endingAneh, 50, 0
        );

        Scanner input = new Scanner(System.in);
        System.out.print("""
                          Kamu berapa di sebuah ruangan yang sangat gelap dengan lampu yang sangat terang, menyorot ke matamu dan..... \n\nseseorang berkata "Hey beritahu aku siapa kamu"
                         
                          ------- Masukkan nama karaktermu: -----------""");
        String playerName = input.nextLine();

        Character player = new Character(playerName, 100);
        Story game = new Story(scene1, player);
        game.start();
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       