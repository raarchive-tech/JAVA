public class faktorialIteratif {
    public static long hitungFaktorialIteratif(int n) {
        long hasil = 1;
        if (n < 0) {
            System.out.println("Error: Faktorial tidak didefinisikan untuk angka negatif");
            return -1;   //Mengembalikan -1 sebagai indikasi error
        }

        //Jika n = 0 atau n = 1, hasilnya tetap 1 (loop tidak berjalan)
        //Loop berjalan dari i = 1 hingga i = n
        for (int i = 1; i <= n; i++) {
            hasil = hasil * i;
        }

        return hasil;
    }

    public static void main(String[] args) {
        int angka = 5;

        long hasilFaktorial = hitungFaktorialIteratif(angka);
        if (hasilFaktorial != -1) {
            System.out.println("Angka yang dihitung: " + angka);
            System.out.println("Faktorial (Iteratif) dari " + angka + " adalah: " + hasilFaktorial);
        }
    }
}
