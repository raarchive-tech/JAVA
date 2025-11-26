import java.util.LinkedList;

public class riwayatOjek {
    public static void main(String[] args) {
        LinkedList<String> riwayat = new LinkedList<>();

        //Tambah data
        riwayat.add("Rumah → Kampus");
        riwayat.add("Kampus → Mall");
        riwayat.add("Mall → Rumah");

        //Tampilkan
        System.out.println("=== Riwayat Perjalanan ===");
        for (int i = 0; i < riwayat.size(); i++) {
            System.out.println("Perjalanan ke-" + (i+1) + ": " + riwayat.get(i));
        }

        //Hapus perjalanan paling lama (head)
        System.out.println("\nHapus perjalanan paling lama...");
        riwayat.removeFirst();

        //Tampilkan lagi
        for (String perjalanan : riwayat) {
            System.out.println(perjalanan);
        }
    }
}
