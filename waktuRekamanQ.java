import java.util.LinkedList;
import java.util.Queue;

public class waktuRekamanQ {
    public static void main(String[] args) {
        Queue<String> waktu = new LinkedList<>();

        //Isi elemen
        waktu.add("01/10/2025");
        waktu.add("02/10/2025");
        waktu.add("03/10/2025");

        System.out.println("Waktu rekaman cctv paling awal: " + waktu.peek());
        System.out.println("Seluruh waktu rekaman cctv: " + waktu);

        waktu.poll();
        waktu.poll();
        waktu.poll();

        System.out.println("Seluruh waktu rekaman cctv: " + waktu);
        
        if (waktu.isEmpty()) {
            System.out.println("Data rekaman kosong");
        } else {
            System.out.println("Waktu rekaman cctv: " + waktu);
        }
    }
}
