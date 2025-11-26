public class faktorialrecursive {
    public static int faktorial(int n) {
        // 1. Base Case (Kondisi Berhenti)
        if (n == 0) {
            return 1;
        }

        // 2. Recursive Step (Langkah Rekursif)
        else {
            return n * faktorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int angka = 5;  //Angka yang akan dihitung faktorialnya

        if (angka < 0) {
            System.out.println("Faktorial tidak didefinisikan untuk angka negatif");
        } else {
            int hasil = faktorial(angka);
            System.out.println("Faktorial dari " + angka + " adalah: " + hasil);
        }
    }
}
