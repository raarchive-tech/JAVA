public class Quiz {
    public static void main(String[] args) {
        //1. Deklarasi Array
        double [] suhu = new double[7];

        //2. Masukkan Nilai Arrray
        suhu[0] = 28.5;
        suhu[1] = 29.0;
        suhu[2] = 27.8;
        suhu[3] = 30.1;
        suhu[4] = 31.5;
        suhu[5] = 29.8;
        suhu[6] = 28.9;

        //3. Tampilkan Suhu
        for (int i = 0; i < suhu.length; i++) {
        System.out.println("Suhu pada hari ke-" + (i+1) +  " adalah " + (suhu[i]) + " derajat celcius");
        }

        //4. Hitung Jumlah Suhu
        int jumlahSuhu = suhu.length;
        System.out.println("Jumlah suhu adalah: " + jumlahSuhu);
        
        //5. Total suhu dalam satu minggu
        double total = 0;
        for (double r : suhu) {
            total += r;
        }

        //5. Hitung rata-rata
        double rataRata = (double) total / jumlahSuhu;
        System.out.println("Rata-rata suhu mingguan adalah " + rataRata);
    }
}
