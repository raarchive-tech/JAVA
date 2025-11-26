import java.util.Arrays;

public class jumpSearch {
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        
        // Tentukan ukuran lompatan
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        // Lompat hingga menemukan rentang yang mungkin berisi target
        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1; // Tidak ditemukan
        }

        // Linear search di dalam blok
        while (prev < Math.min(step, n)) {
            if (arr[prev] == target)
                return prev;
            prev++;
        }

        return -1; // Jika tidak ditemukan
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        int target = 14;

        System.out.println("Array: " + Arrays.toString(arr));
        int result = jumpSearch(arr, target);

        if (result == -1)
            System.out.println("Elemen " + target + " tidak ditemukan.");
        else
            System.out.println("Elemen " + target + " ditemukan pada indeks ke-" + result);
    }
}
