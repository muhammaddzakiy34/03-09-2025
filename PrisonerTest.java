public class PrisonerTest {
    public static void main(String[] args) {
        // Slide 8 (Latihan 1 Bagian 1): buat dua objek Tahanan
        Prisoner twitch = new Prisoner("Twitch", 2.08, 4);
        Prisoner bubba  = new Prisoner("Bubba", 2.08, 4);

        System.out.println("=== Setelah pembuatan awal (Slide 8) ===");
        System.out.println("twitch = " + twitch);
        System.out.println("bubba  = " + bubba);

        // Slide 9 (Latihan 1 Bagian 2): uji apakah referensi sama
        System.out.println("\n=== Uji referensi awal (Slide 9) ===");
        System.out.println("bubba == twitch ? " + (bubba == twitch)); // harus false

        // Ubah properti twitch agar sama dengan bubba (tetap objek berbeda)
        twitch.nama = "Bubba";
        twitch.tinggiMeter = 2.08;
        twitch.hukumanTahun = 4;

        System.out.println("\n=== Setelah properti disamakan (Slide 9) ===");
        System.out.println("twitch = " + twitch);
        System.out.println("bubba  = " + bubba);
        System.out.println("bubba == twitch ? " + (bubba == twitch)); // tetap false

        // Cetak "alamat" identitas (identityHashCode)
        System.out.println("\nidentityHashCode:");
        System.out.println("bubba  -> " + System.identityHashCode(bubba));
        System.out.println("twitch -> " + System.identityHashCode(twitch));

        System.out.println("\n=== Kesimpulan: '==' membandingkan referensi, bukan isi ===");
    }
}

