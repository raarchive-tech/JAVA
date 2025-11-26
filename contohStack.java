import java.util.Stack;

public class contohStack {
    public static void main(String[] args) {
        Stack<String> belanjaan = new Stack<>();

        // Menaruh piring ke tumpukan
        belanjaan.push("Jas Hujan");
        belanjaan.push("Sepatu Boot");
        belanjaan.push("Sendal");
        belanjaan.push("Payung");

        System.out.println("Tumpukan barang belanjaan: " + belanjaan);

        // Mengambil belanjaan dari tumpukan (yang terakhir ditaruh akan keluar duluan)
        System.out.println("Barang yang sudah diambil: " + belanjaan.pop());
        System.out.println("Tumpukan belanjaan sekarang: " + belanjaan);

        // Melihat belanjaan paling atas
        System.out.println("Belanjaan paling atas: " + belanjaan.peek());

        //Mengambil semua belanjaan satu per satu
        while (!belanjaan.isEmpty()) {
            System.out.println("Barang yang sudah diambil: " + belanjaan.pop());
        }

        System.out.println("Apakah Belanjaan sudah kosong?" + belanjaan.isEmpty());
    }
}