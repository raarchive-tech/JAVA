public class nilaiArray {
    public static void main(String[] args) {
        //Deklarasi Array
        Integer[] nilai = new Integer[5];

        //Nilai Array
        nilai[0] = 75;
        nilai[1] = 90;
        nilai[2] = 85;
        nilai[3] = 88;
        nilai[4] = 91;

        //Tampilkan isi 
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai siswa ke-" + (i + 1) + " adalah " + nilai[i]);
        }

        //Nilai Tertinggi dan total
        int total = 0;
        int max = nilai[0];
        for (int n : nilai) {
            if (n > max) {
                max = n;
            }
            total += n;
        }

        //Nilai Terendah
        int min = nilai[0];
        for (int n2 : nilai) {
            if (n2 < min) {
                min = n2;
            }
        }

        double rataRata = (double) total / nilai.length;
        System.out.println("Nilai Tertinggi adalah " + max);
        System.out.println("Nilai Terendah adalah " + min);
        System.out.println("Rata-rata nilai mahasiswa adalah " + rataRata);
    }
}
