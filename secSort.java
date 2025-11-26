public class secSort {
    public static void main(String[] args) {
        int[] data = {64, 25, 12, 22, 11 };

        System.out.print("Array sebelum diurutkan: ");
        cetakArray(data); 
        
        selectionSort(data);

        System.out.print("Array setelah diurutkan (Ascending): ");
        cetakArray(data); 
    }
    
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        int min_index; 
        for (int i = 0; i < n - 1; i++) {
            min_index = i; 
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j; // Update indeks jika ditemukan yang lebih kecil
                }
            }
        
            // SWAP
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;

            System.out.print("Iterasi Ke- "+(i+1)+": ");
            cetakArray(arr);
        }
    }
 
    public static void cetakArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}