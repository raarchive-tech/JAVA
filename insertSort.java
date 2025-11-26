public class insertSort {
    public static void main(String[] args) {
        int[] data = {64, 25,12, 22, 11};

        System.out.println("Array sebelum diurutkan: ");
        cetakArray(data);

        insertionSort(data);

        System.out.println("Array setelah diurutkan (Ascending): ");
        cetakArray(data);
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j+ 1] = arr[j];
                j = j -1;
            }

            arr[j + 1] = temp;
            System.out.print("Iterasi ke-" + (i) + ": ");
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
