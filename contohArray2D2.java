import java.util.Scanner;

public class contohArray2D2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Input ukuran array dari user
        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        int [][] matriks = new int[baris][kolom];
        int jumlah = 0;

        // 2. Mengisi data otomatis ke dalam array
        int nilai = 1;
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks[i][j] = nilai;
                // ubah elemen matriks
                // matriks[3][3] = 10;
                jumlah += matriks[i][j];
                nilai++;
            }
        }

        // 3. Menampilkan isi matriks
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }

        //4. Menampilkan hasil perhitungan
        int totalElemen = baris * kolom;
        double rataRata = (double) jumlah / totalElemen;

        System.out.println("-----------------------");
        System.out.println("Jumlah semua elemen: " + jumlah);
        System.out.println("Jumlah elemen dalam array: " + totalElemen);
        System.out.println("Rata-rata elemen: " + rataRata);
    }
}