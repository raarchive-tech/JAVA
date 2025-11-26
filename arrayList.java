import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        // 1. Deklarasi dan Inisialisasi ArrayList
        //    ArrayList bersifat dinamis, jadi kita tidak perlu menentukan ukuran di awal.
        //    ArrayList hanya bisa menyimpan objek, jadi kita gunakan Integer untuk nilai numerik.
        ArrayList <Integer> suhuHarian = new ArrayList<>();

        // 2. Mengisi Elemen ArrayList Menggunakan Metode add() untuk menambahkan elemen.
        System.out.println("---- Mengisi Nilai ArrayList dengan Suhu derajat celcius----");
        suhuHarian.add(20);
        suhuHarian.add(26);
        suhuHarian.add(24);
        suhuHarian.add(28);
        suhuHarian.add(27);
        suhuHarian.add(22);
        suhuHarian.add(23);
        
    

        System.out.println("Suhu pada hari Senin: " + suhuHarian.get(0));
        System.out.println("Suhu pada hari Selasa: " + suhuHarian.get(1));
        System.out.println("Suhu pada hari Rabu: " + suhuHarian.get(2));
        System.out.println("Suhu pada hari Kamis: " + suhuHarian.get(3));
        System.out.println("Suhu pada hari Jumat: " + suhuHarian.get(4));
        System.out.println("Suhu pada hari Sabtu: " + suhuHarian.get(5));
        System.out.println("Suhu pada hari Minggu: " + suhuHarian.get(6));

        System.out.println("\n----------------------------------");

        // 4. Cara Singkat Deklarasi & Inisialisasi Tidak Berlaku Untuk ArrayList
        //    Namun, kita bisa langsung menambahkan elemen saat deklarasi dengan bantuan Collections.
        //    Contoh untuk String
        ArrayList <String> namaHari = new ArrayList<> ();
        namaHari.add("Senin");
        namaHari.add("Selasa");
        namaHari.add("Rabu");
        namaHari.add("Kamis");
        namaHari.add("Jumat");
        namaHari.add("Sabtu");
        namaHari.add("Minggu");

        System.out.println("---- Contoh ArrayList String----");
        System.out.println("Hari " + namaHari.get(0) + " suhunya adalah " + suhuHarian.get(0) + " derajat celcius");
        System.out.println("Jumlah hari: " + namaHari.size());
    }   
}