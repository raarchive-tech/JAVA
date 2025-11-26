import java.util.Scanner;

class Tugas {
    String matkul;
    String namaTugas;
    String deadline;
    boolean isDone; // NEW → status selesai

    public Tugas(String matkul, String namaTugas, String deadline) {
        this.matkul = matkul;
        this.namaTugas = namaTugas;
        this.deadline = deadline;
        this.isDone = false; // default belum selesai
    }

    public String toString() {
        return matkul + " | " + namaTugas + " | Deadline: " + deadline;
    }
}

public class pTugas2 {
    static Scanner sc = new Scanner(System.in);
    static Tugas[] list = new Tugas[100];
    static int count = 0;

    // ================================
    //      ADD TUGAS
    // ================================
    static void addTugas() {
        System.out.print("Masukkan mata kuliah: ");
        String mk = sc.nextLine();
        System.out.print("Masukkan nama tugas: ");
        String nt = sc.nextLine();
        System.out.print("Masukkan deadline (YYYY-MM-DD): ");
        String dl = sc.nextLine();

        list[count] = new Tugas(mk, nt, dl);
        count++;

        System.out.println("Tugas berhasil ditambahkan!");
    }

    // ================================
    //      TAMPILKAN TUGAS
    // ================================
    static void showTugas() {
        System.out.println("\n===== LIST TUGAS BELUM SELESAI =====");

        boolean ada = false;
        for (int i = 0; i < count; i++) {
            if (!list[i].isDone) {
                System.out.println((i+1) + ". " + list[i]);
                ada = true;
            }
        }
        if (!ada) System.out.println("Tidak ada tugas! Semua selesai.");
    }

    // ================================
    //      MERGE SORT DEADLINE
    // ================================
    static void mergeSortDeadline(Tugas[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSortDeadline(arr, l, mid);
            mergeSortDeadline(arr, mid + 1, r);
            mergeDeadline(arr, l, mid, r);
        }
    }

    static void mergeDeadline(Tugas[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        Tugas[] L = new Tugas[n1];
        Tugas[] R = new Tugas[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[l + i];
        for (int i = 0; i < n2; i++) R[i] = arr[m + 1 + i];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (L[i].deadline.compareTo(R[j].deadline) <= 0) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // ================================
    //      SORT NAMA (UNTUK SEARCH)
    // ================================
    static void mergeSortNama(Tugas[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSortNama(arr, l, mid);
            mergeSortNama(arr, mid + 1, r);
            mergeNama(arr, l, mid, r);
        }
    }

    static void mergeNama(Tugas[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        Tugas[] L = new Tugas[n1];
        Tugas[] R = new Tugas[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[l + i];
        for (int i = 0; i < n2; i++) R[i] = arr[m + 1 + i];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (L[i].namaTugas.compareToIgnoreCase(R[j].namaTugas) <= 0) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // ================================
    //      BINARY SEARCH
    // ================================
    static int binarySearch(String key) {
        int left = 0, right = count - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = key.compareToIgnoreCase(list[mid].namaTugas);

            if (cmp == 0) return mid;
            else if (cmp > 0) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    // ================================
    //      TANDAI TUGAS SELESAI
    // ================================
    static void tandaiSelesai() {
        showTugas();
        System.out.print("\nPilih nomor tugas yang selesai: ");
        int pilih = sc.nextInt();
        sc.nextLine(); // buffer

        int index = pilih - 1;

        if (index >= 0 && index < count) {
            list[index].isDone = true;
            System.out.println("Tugas ditandai selesai!");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    // ================================
    //             MAIN MENU
    // ================================
    public static void main(String[] args) {
        int menu;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Lihat Tugas");
            System.out.println("3. Urutkan Tugas (Deadline)");
            System.out.println("4. Cari Tugas (Nama)");
            System.out.println("5. Tandai Tugas Selesai");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1 -> addTugas();
                case 2 -> showTugas();
                case 3 -> {
                    mergeSortDeadline(list, 0, count - 1);
                    System.out.println("Tugas berhasil diurutkan!");
                }
                case 4 -> {
                    mergeSortNama(list, 0, count - 1);
                    System.out.print("Cari nama tugas: ");
                    String key = sc.nextLine();
                    int result = binarySearch(key);

                    if (result != -1) System.out.println("Ditemukan: " + list[result]);
                    else System.out.println("Tidak ditemukan.");
                }
                case 5 -> tandaiSelesai();
            }

        } while (menu != 0);
    }
}
