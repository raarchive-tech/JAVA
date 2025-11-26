import java.util.Scanner;

public class inputArray1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input ukuran array
        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        int [][] matriks = new int[baris][kolom];

        // Mulai dari 30
        int nilaiAwal = baris*kolom*10;

        // Isi elemen array
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if (i == baris-1 && j == kolom-1) {
                    // Elemen terakhir khusus diisi 7
                    matriks[i][j] = 7;
                } else {
                    matriks[i][j] = nilaiAwal;
                    nilaiAwal -= 10;
                }
            }
        }

        // Menampilkan isi array
        System.out.println("\nIsi Matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
