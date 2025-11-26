import java.util.Scanner;

public class inputAngka{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        System.out.println("Masukkan sebuah angka: ");
        angka = input.nextInt();

        for (int i = 1; i <= angka; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }
        }
    }
}
