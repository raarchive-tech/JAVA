import java.util.ArrayList;
import java.util.Scanner;

public class pTugas {

    // ================================
    // MODEL DATA
    // ================================
    static class Tugas {
        String namaMatkul;
        String deskripsi;
        String deadline;  // DD-MM-YYYY
        boolean isDone;

        public Tugas(String namaMatkul, String deskripsi, String deadline) {
            this.namaMatkul = namaMatkul;
            this.deskripsi = deskripsi;
            this.deadline = deadline;
            this.isDone = false;
        }
    }

    // DATA
    static ArrayList<Tugas> daftarTugas = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    // ================================
    // MAIN MENU PROGRAM
    // ================================
    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n===== SISTEM PENGELOLAAN TUGAS KULIAH =====");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Tampilkan Semua Tugas");
            System.out.println("3. Urutkan Tugas (Merge Sort Deadline)");
            System.out.println("4. Cari Tugas (Binary Search Nama Matkul)");
            System.out.println("5. Hitung Total Tugas (Rekursi)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // clear buffer

            switch (pilihan) {
                case 1 -> tambahTugas();
                case 2 -> tampilkanTugas();
                case 3 -> urutkanTugasDeadline();
                case 4 -> cariTugas();
                case 5 -> hitungTugas();
                case 0 -> System.out.println("Keluar...");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    // ================================
    // MENU 1: TAMBAH TUGAS
    // ================================
    public static void tambahTugas() {
        System.out.print("Nama Mata Kuliah : ");
        String matkul = input.nextLine();

        System.out.print("Deskripsi Tugas  : ");
        String desk = input.nextLine();

        System.out.print("Deadline (DD-MM-YYYY): ");
        String deadline = input.nextLine();

        daftarTugas.add(new Tugas(matkul, desk, deadline));
        System.out.println("Tugas berhasil ditambahkan!");
    }

    // ================================
    // MENU 2: TAMPILKAN TUGAS
    // ================================
    public static void tampilkanTugas() {
        if (daftarTugas.isEmpty()) {
            System.out.println("Belum ada tugas.");
            return;
        }

        System.out.println("\n===== DAFTAR TUGAS =====");
        for (int i = 0; i < daftarTugas.size(); i++) {
            Tugas t = daftarTugas.get(i);
            System.out.println((i + 1) + ". " + t.namaMatkul +
                    " | " + t.deskripsi +
                    " | Deadline: " + t.deadline);
        }
    }

    // ================================
    // KONVERSI TANGGAL -> INT
    // ================================
    public static int toIntDate(String d) {
        String[] p = d.split("-");
        return Integer.parseInt(p[2] + p[1] + p[0]); // YYYYMMDD
    }

    // ================================
    // MERGE SORT - DEADLINE
    // ================================
    public static void urutkanTugasDeadline() {
        if (daftarTugas.size() <= 1) {
            System.out.println("Tugas terlalu sedikit untuk diurutkan!");
            return;
        }

        daftarTugas = mergeSortDeadline(daftarTugas);
        System.out.println("\nTugas berhasil diurutkan berdasarkan DEADLINE terdekat!");
        tampilkanTugas();
    }

    public static ArrayList<Tugas> mergeSortDeadline(ArrayList<Tugas> list) {
        if (list.size() <= 1) return list;

        int mid = list.size() / 2;
        ArrayList<Tugas> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<Tugas> right = new ArrayList<>(list.subList(mid, list.size()));

        left = mergeSortDeadline(left);
        right = mergeSortDeadline(right);

        return mergeDeadline(left, right);
    }

    public static ArrayList<Tugas> mergeDeadline(ArrayList<Tugas> left, ArrayList<Tugas> right) {
        ArrayList<Tugas> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (toIntDate(left.get(i).deadline) < toIntDate(right.get(j).deadline)) {
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }

        while (i < left.size()) result.add(left.get(i++));
        while (j < right.size()) result.add(right.get(j++));

        return result;
    }

    // ================================
    // MERGE SORT - NAMA MATA KULIAH
    // ================================
    public static ArrayList<Tugas> mergeSortNama(ArrayList<Tugas> list) {
        if (list.size() <= 1) return list;

        int mid = list.size() / 2;
        ArrayList<Tugas> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<Tugas> right = new ArrayList<>(list.subList(mid, list.size()));

        left = mergeSortNama(left);
        right = mergeSortNama(right);

        return mergeNama(left, right);
    }

    public static ArrayList<Tugas> mergeNama(ArrayList<Tugas> left, ArrayList<Tugas> right) {
        ArrayList<Tugas> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).namaMatkul.compareToIgnoreCase(right.get(j).namaMatkul) < 0) {
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }

        while (i < left.size()) result.add(left.get(i++));
        while (j < right.size()) result.add(right.get(j++));

        return result;
    }

    // ================================
    // MENU 4: BINARY SEARCH (NAMA MATKUL)
    // ================================
    public static void cariTugas() {
        if (daftarTugas.isEmpty()) {
            System.out.println("Tidak ada tugas untuk dicari.");
            return;
        }

        // List untuk binary search harus SORTED BY NAME
        ArrayList<Tugas> sortedByName = mergeSortNama(new ArrayList<>(daftarTugas));

        System.out.print("Masukkan nama mata kuliah yang dicari: ");
        String key = input.nextLine().toLowerCase();

        int hasil = binarySearch(sortedByName, key, 0, sortedByName.size() - 1);

        if (hasil != -1) {
            Tugas t = sortedByName.get(hasil);
            System.out.println("\nTugas ditemukan:");
            System.out.println(t.namaMatkul + " | " + t.deskripsi + " | Deadline: " + t.deadline);
        } else {
            System.out.println("Tugas TIDAK ditemukan!");
        }
    }

    public static int binarySearch(ArrayList<Tugas> list, String key, int left, int right) {
        if (right < left) return -1;

        int mid = (left + right) / 2;
        String nama = list.get(mid).namaMatkul.toLowerCase();

        if (nama.equals(key)) return mid;
        else if (nama.compareTo(key) > 0)
            return binarySearch(list, key, left, mid - 1);
        else
            return binarySearch(list, key, mid + 1, right);
    }

    // ================================
    // MENU 5: REKURSI JUMLAH TUGAS
    // ================================
    public static void hitungTugas() {
        int total = hitungJumlah(daftarTugas.size());
        System.out.println("Total tugas saat ini: " + total);
    }

    public static int hitungJumlah(int n) {
        if (n == 0) return 0;
        return 1 + hitungJumlah(n - 1);
    }
}
