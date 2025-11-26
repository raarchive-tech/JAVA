import java.util.ArrayList;

class Produk {
    String nama;
    double harga;

    Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return nama + " (Rp" + harga + ")";
    }
}

public class KeranjangBelanja {
    public static void main(String[] args) {
        // 1. Deklarasi ArrayList untuk keranjang belanja
        ArrayList<Produk> keranjang = new ArrayList<>();

        // 2. Tambah produk baru ke keranjang
        keranjang.add(new Produk("Beras", 50000));
        keranjang.add(new Produk("Telur", 30000));
        keranjang.add(new Produk("Gula", 15000));

        System.out.println("Isi keranjang belanja: " + keranjang);

        // 3. Hapus produk (misalnya "Telur")
        keranjang.remove(1); // hapus indeks ke-1 (Telur)
        System.out.println("Setelah menghapus Telur: " + keranjang);

        // 4. Hitung total harga belanja
        double total = 0;
        for (Produk p : keranjang) {
            total += p.harga;
        }
        System.out.println("Total harga belanja: Rp" + total);
    }
}
