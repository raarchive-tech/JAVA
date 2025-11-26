import java.util.Arrays;

public class bubbleSortA {
    public static void sort (int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];      //Proses tukar posisinya
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

        public static void main (String[] args) {
            int[] data = {5,2,4,3,1};
            System.out.println("Sebelum Sorting: " + Arrays.toString(data));
            sort(data);
            System.out.println("Setelah Sorting dengan Bubble Sort: "+ Arrays.toString(data));
    }
}