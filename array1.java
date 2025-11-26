public class array1 {
    public static void main(String[] args) {
        // 1. Deklarasi dan Inisialisasi Array
        //    Mendeklarasikan sebuah array dengan tipe data integer bernama 'tarifParkir' dengan 5 elemen.
        int[] tarifParkir = new int[5];

        // 2. Mengisi Elemen Array
        //    Mengisi setiap elemen array dengan nilai.
        System.out.println("---- Mengisi Nilai Array ----");
        tarifParkir[0] = 2000;
        tarifParkir[1] = 4000;
        tarifParkir[2] = 6000;
        tarifParkir[3] = 8000;
        tarifParkir[4] = 10000;

        System.out.println("Tarif parkir selama 1 jam: " + tarifParkir[0]);
        System.out.println("Tarif parkir selama 2 jam: " + tarifParkir[1]);
        System.out.println("Tarif parkir selama 3 jam: " + tarifParkir[2]);
        System.out.println("Tarif parkir selama 4 jam: " + tarifParkir[3]);
        System.out.println("Tarif parkir selama 5 jam: " + tarifParkir[4]);

        System.out.println("\n----------------------------");

        // 3. Menampilkan Semua Elemen Array Menggunakan Perulangan (loop)
        System.out.println("---- Menampilkan Semua Nilai dengan Loop----");
        for (int i = 0; i < tarifParkir.length; i++) {
            System.out.println("Tarif parkir selama " + (i + 1) + " jam " + ": " + tarifParkir[i]);
        }

        System.out.println("\n----------------------------");

        // 4. Cara Singkat Deklerasi & Inisialisasi
        //    Anda bisa langsung menginisialisasi nilai saat deklarasi.
        Integer[] tarifParkir1 = {2000, 4000, 6000, 8000, 10000};

        System.out.println("------------------------------");
        System.out.println( "Tarif pada jam pertama adalah: " + tarifParkir1[0]);
        System.out.println("Maksimal tarif parkir adalah: " + tarifParkir1[4]);
    }
}