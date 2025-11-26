import java.util.Scanner;

public class inputArray2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input ukuran array
        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        int [][] matriks = new int[baris][kolom];
        int jumlah = 120;

        //Isi elemen array
        for(int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++){
                if (i == baris-1 && j == kolom-1) {
                    matriks [i][j] = 7;
                } else {
                    matriks[i][j] = jumlah;
                    jumlah -= 10;
                }
            }
        }

        //Menampilkan isi
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++){
                System.out.print(matriks[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
