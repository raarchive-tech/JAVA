import java.util.Arrays;
import java.util.Random;

public class perbandingan {
    public static void main(String[] args) {
        int ukuran = 100000;
        int[] data = new int[ukuran];
        Random rand = new Random();

        // Generate data acak
        for (int i = 0; i < ukuran; i++) {
            data[i] = rand.nextInt(ukuran * 10);
        }

        // Bubble Sort
        int[] dataBubble = Arrays.copyOf(data, data.length);
        long waktuMulaiBubble = System.currentTimeMillis();
        bubbleSort(dataBubble);
        long waktuSelesaiBubble = System.currentTimeMillis();
        long waktuEksekusiBubble = waktuSelesaiBubble - waktuMulaiBubble;
        System.out.println("Waktu Eksekusi Bubble Sort: " + waktuEksekusiBubble + " ms");

        // Selection Sort
        int[] dataSelection = Arrays.copyOf(data, data.length);
        long waktuMulaiSelection = System.currentTimeMillis();
        selectionSort(dataSelection);
        long waktuSelesaiSelection = System.currentTimeMillis();
        long waktuEksekusiSelection = waktuSelesaiSelection - waktuMulaiSelection;
        System.out.println("Waktu Eksekusi Selection Sort: " + waktuEksekusiSelection + " ms");

        // Insertion Sort
        int[] dataInsertion = Arrays.copyOf(data, data.length);
        long waktuMulaiInsertion = System.currentTimeMillis();
        insertionSort(dataInsertion);
        long waktuSelesaiInsertion = System.currentTimeMillis();
        long waktuEksekusiInsertion = waktuSelesaiInsertion - waktuMulaiInsertion;
        System.out.println("Waktu Eksekusi Insertion Sort: " + waktuEksekusiInsertion + " ms");

        // Merge Sort
        int[] dataMerge = Arrays.copyOf(data, data.length);
        long waktuMulaiMerge = System.currentTimeMillis();
        mergeSort(dataMerge, 0, dataMerge.length - 1);
        long waktuSelesaiMerge = System.currentTimeMillis();
        long waktuEksekusiMerge = waktuSelesaiMerge - waktuMulaiMerge;
        System.out.println("Waktu Eksekusi Merge Sort: " + waktuEksekusiMerge + " ms");
    }

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // ascending
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        int min_index;
        for (int i = 0; i < n - 1; i++) {
            min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    // Merge Sort
    public static void mergeSort(int[] arr, int kiri, int kanan) {
        if (kiri < kanan) {
            int tengah = (kiri + kanan) / 2;
            mergeSort(arr, kiri, tengah);
            mergeSort(arr, tengah + 1, kanan);
            merge(arr, kiri, tengah, kanan);
        }
    }

    public static void merge(int[] arr, int kiri, int tengah, int kanan) {
        int n1 = tengah - kiri + 1;
        int n2 = kanan - tengah;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[kiri + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[tengah + 1 + j];

        int i = 0, j = 0;
        int k = kiri;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
