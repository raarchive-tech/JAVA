import java.util.Arrays;
import java.util.Random;

public class timeDifferent {
    public static void main(String[] args) {
        int ukuran = 100000;
        int[] data = new int [ukuran];
        Random rand = new Random();

        for (int i = 0; i < ukuran; i++) {
            data[i] = rand.nextInt(ukuran * 10);
        }

        //Bubble Sort
        int[] dataBubble = Arrays.copyOf(data, data.length);
        long waktuMulaiBubble = System.currentTimeMillis();
        bubbleSort(dataBubble);
        long waktuSelesaiBubble = System.currentTimeMillis();

        long waktuEksekusiBubble = waktuSelesaiBubble - waktuMulaiBubble;
        System.out.println("Waktu Eksekusi Selection Sort: " + waktuEksekusiBubble + " ms");

        //Selection Sort
        int[] dataSelection = Arrays.copyOf(data, data.length);
        long waktuMulaiSelection = System.currentTimeMillis();
        selectionSort(dataSelection);
        long waktuSelesaiSelection = System.currentTimeMillis();

        long waktuEksekusiSelection = waktuSelesaiSelection - waktuMulaiSelection;
        System.out.println("Waktu Eksekusi Selection Sort: " + waktuEksekusiSelection + " ms");

        //Insertion Sort
        int[] dataInsertion = Arrays.copyOf(data, data.length);
        long waktuMulaiInsertion = System.currentTimeMillis();
        insertionSort(data);
        long waktuSelesaiInsertion = System.currentTimeMillis();

        long waktuEksekusiInsertion = waktuSelesaiInsertion - waktuMulaiInsertion;
        System.out.println("Waktu Eksekusi Insertion Sort: " + waktuEksekusiInsertion + " ms");
    }

    //Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];      //Proses tukar posisinya
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }    
    }

    //Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        int min_index;
        for (int i = 0; i < n - 1; i++) {
            min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j; //Update index jika ada yang lebih kecil
                }
            }
        //Swap
        int temp = arr[min_index];
        arr[min_index] = arr[i];
        arr[i] = temp;
        }
    }

    //Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j+ 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = temp;
        }
    }
}