import java.util.ArrayList;

public class Quiz2 {
    public static void main(String[] args) {
        //1. Deklarasi Arraylist
        ArrayList <String> namaHewan = new ArrayList<>();

        //2. Isi Arraylist
        namaHewan.add("ayam");
        namaHewan.add("kambing");
        namaHewan.add("sapi");
        namaHewan.add("zebra");

        //3. Tampilkam Arraylist (a)
        System.out.println("Nama-nama hewan: " + namaHewan);

        //4. Mengakses dan Mencetak Elemen Zebra (b)
        System.out.println(namaHewan.get(3));

        //5. Mengubah Elemen (c)
        namaHewan.set(0, "bebek");

        //6. Tampilkan Isi Arraylist Setelah Diubah (d)
        System.out.println("Nama-nama hewan setelah diubah: " + namaHewan);
    }
}
