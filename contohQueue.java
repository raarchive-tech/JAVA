import java.util.LinkedList;
import java.util.Queue;

public class contohQueue {
    public static void main(String[] args) {
        //Mendeklarasikan Queue menggunakan Linkedlist
        Queue<Integer> nomorAntrian = new LinkedList<>();

        //1. Operasi Enqueue (menambahkan elemen ke akhir queue)
        nomorAntrian.add(1);
        nomorAntrian.add(2);
        nomorAntrian.add(3);
        nomorAntrian.add(4);
        nomorAntrian.add(5);
        nomorAntrian.add(6);
        System.out.println("Susunan nomor antrian adalah: " + nomorAntrian);

        //2. Operasi Peek (melihat elemen didepan queue)
        Integer nomorTerdepan = nomorAntrian.peek();
        System.out.println("Nomor dari susunan terdepan adalah: " + nomorTerdepan);

        //3. Operasi Dequeue (memanggil dan menghapus elemen dari depan)
        Integer nomorDilayani = nomorAntrian.poll();
        System.out.println("Nomor antrian yang dilayani: " + nomorDilayani);
        System.out.println("Antrian saat ini: " + nomorAntrian);

        //4. Operasi is-emphty
        System.out.println("Apakah antrian kosong? " + nomorAntrian.isEmpty());
    }  
}
