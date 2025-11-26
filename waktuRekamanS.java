import java.util.Stack;

public class waktuRekamanS {
    public static void main(String[] args) {
        Stack<String> waktu = new Stack<>();

        //Tambah data
        waktu.push("10:00:00");
        waktu.push("10:00:05");
        waktu.push("10:00:10");

        System.out.println("Waktu rekaman cctv terbaru: " + waktu.peek());
        
        //Isi keseluruhan
        System.out.println("Seluruh waktu rekaman cctv: " + waktu);

        //Menghapus data
        waktu.pop();
        waktu.pop();

        if (waktu.isEmpty()) {
            System.out.println("Tumpukan kosong, tidak ada data yang bisa diambil");
        } else {
            System.out.println("Waktu rekaman cctv: " + waktu);
        }
    }
}
