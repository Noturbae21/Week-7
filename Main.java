import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memperkenalkan karakter  
        //narasi dari awal permainan 
        //INput nama karter juga

        System.out.print("""
                Kamu berada di sebuah ruangan yang sangat gelap dengan lampu yang sangat terang, menyorot ke matamu dan.....

                seseorang berkata "Hey, beritahu aku siapa kamu"

                ------- Masukkan nama karaktermu: """);


                // dimulai dari scene 10 karena, jika scene 1 didahulukan dan lanjut scene 2,
                // scene 2 tidak terbaca karena beum di deklarasi

        // Input nama karakter
        String playerName = input.nextLine();
        Character player = new Character(playerName, 100);

        // ENDING
        Scene endingGood = new Scene("======Dennis diadili oleh Adit. Dunia diselamatkan, Kamu pun ngopi di pinggiran sambil Ngangkang======\nEnding Baik!");
        Scene endingNeutral = new Scene("======Dennis kabur. Dunia tetap dalam bayang misteri======\nEnding Netral.");
        Scene endingBad = new Scene("======Dennis wafat... dan menyisakan kekacauan global, dan antek antek nya masih berkeliaran======\nEnding Buruk.");
        Scene endingAneh = new Scene("======Kamu dijadikan LEGO dan diolah jadi pakan lele======\nEnding Aneh.");

        // SCENE 10
        Scene scene10 = new Scene("Kamu dan rekanmu berhasil mengikuti Dennis ke luar Mall lalu memojokkannya. Rekanmu pun bertanya 'Kita apakan dia'",
                "Bawa kembali ke Jenderal Adit", endingGood, 0, 20,
                "Hilangkan nyawa Dennis di tempat", endingBad, 0, 10,
                "Biarkan dia kabur karena kamu terlalu baik", endingNeutral, 0, 0);
        
        // SCENE 9
        Scene scene9 = new Scene("Kamu mendapat pesan dari jenderal Adit bahwa ada rekan yang bisa kamu ajak kerja sama.\nkamu pun bertemu dengan rekan yang dimaksud",
                "Suruh rekan antri Starbucks", scene10, 20, 0,
                "Minta bantuan rekan untuk membuntuti Dennis", scene10, 20, 15,
                "Ikuti Dennis sendiri", scene10, 10, 5);

        // SCENE 8
        Scene scene8 = new Scene("Setelah sampai ke Ramayana kamu melacak Dennis lewat CCTV. Ternyata dia ada di lantai satu.",
                "Menyamar jadi warga biasa", scene9, 20, 10,
                "Masuk naik RX King", scene9, 5, 5,
                "Masuk dengan pakaian tempur", scene9, 10, 0);

        // SCENE 7
        Scene scene7 = new Scene("Dennis ternyata ada di Ramayana Bungurasih beli nastar...\nSungguh aneh melihat dia di tempat umum.",
                "Kembali lapor ke Jenderal Adit dan minta kendaraan", scene8, 0, 0,
                "Curi kendaraan musuh dan kejar Dennis", scene8, 0, 10,
                "Jalan kaki ke Ramayana", scene8, 20, 5);

        // SCENE 6
        Scene scene6 = new Scene("Kamu melanjutkan pencarian Dennis. Dia tidak ada di kantor.\n kamu memiliki beberapa opsi untuk menggali informasi",
                "Lihat LOG presensi", scene7, 0, 5,
                "Interogasi penjaga", scene7, 5, 10,
                "Teriak lewat speaker", scene7, 20, 0);

        // SCENE 5
        Scene scene5 = new Scene("Alarm berbunyi! 3 penjaga berlari ke arahmu! (Panik panik woi)",
                "Sembunyi di ruangan server", scene6, 0, 0,
                "Lempar flashbang & headshot ala player cod propeler", scene6, 5, 15,
                "Tembak lampu & pakai night vision", scene6, 0, 20);

        // SCENE 4
        Scene scene4 = new Scene("Kamu tiba di dalam base.\n kamu kebingungan dengan daerah tersebut dan ada 3 jalur",
                "Kiri (ambil shotgun)", scene5, 0, 10,
                "Tengah (santai)", scene5, 20, 0,
                "Kanan (gelap, aktifkan night vision)", scene5, 5, 5);

        scene4.setItemForChoices("Shotgun", null, null);

        // SCENE 3
        Scene scene3 = new Scene("Kamu tiba di Outer base Dennis, ada dua penjaga terlihat dari kejauhan berdiri didepan pintu base",
                "Headshot ala COD", scene4, 10, 10,
                "Cari jalan lain", scene4, 20, 5,
                "Lewat atap dengan grappling hook", scene4, 0, 10);

        // SCENE 2
        Scene scene2 = new Scene("Kamu berangkat naik helikopter menuju lokasi musuh (base dontol).",
                "Loncat sekarang", null, 100, 0,
                "Tunggu mendarat", scene3, 0, 10,
                "Ngeteh dulu gasih", scene3, 0, 10);

        // SCENE 1
        Scene scene1 = new Scene("Jadi kamu anak baru ya .Panggil aku jendarl adit bintang 5, Sekarang Dunia sedang kacau. Bisakah kamu membantu saya untuk nangkep kriminal kelas kakap yg bernama dontol AKA DENIS?.",
                "Ya, saya bersedia", scene2, 0, 0,
                "Ga mau malas mau turu", endingAneh, 90, 0,
                "Gebukin Adit (dituduh mata-mata)", endingAneh, 90, 0);

        scene1.setItemForChoices("USP 45", null, null);

        // Start Game dengan scene1 dan karakter player
        Story game = new Story(scene1, player);
        game.start(); // start game
    }
}
