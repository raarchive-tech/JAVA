public class contohBubsort {
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2};

        System.out.print("Array sebelum diurutkan: ");
        cetakArray(data); 
        
        bubbleSort(data);

        System.out.print("Array setelah diurutkan (Ascending): ");
        cetakArray(data); 
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
         int temp;
       
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Proses Penukaran (Swap)
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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