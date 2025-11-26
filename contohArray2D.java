public class contohArray2D {
    public static void main(String[] args) {
        // 1. Deklarasi dan inisialisasi array 2 dimensi 3x4 (3 baris, 4 kolom) 
        // int [][]matriks = new int[3] [4]; 
        // int jumlah = 0; 

        int [][] matriks = {{3,3,4}, {5,4,3}, {8,6,2}, {7,2,1}};
        int jumlah = 0;
   
        //2. Mengisi data ke dalam array
        // int nilai = 1; 
        // System.out.println("Mengisi data ke dalam matriks..."); 
        // for (int i = 0; i < matriks.length; i++) { // Loop untuk baris 
        //     for (int j = 0; j < matriks[i].length; j++) { // Loop untuk kolom
        //         matriks[i][j] = nilai;
        //         jumlah += matriks[baris][kolom];
        //         nilai++; // Nilai akan bertambah 1, 2, 3, dst. 
        //     }
        // }        
            
        // System.out. println("Data berhasil diisi!"); 
        // System.out.println("-----------------------"); 
    
        //3. Menampilkan isi array 
        System.out.println("Menampilkan isi matriks:"); 
        for (int i = 0; i < matriks.length; i++) { // Loop untuk baris
            for (int j = 0; j < matriks[i].length; j++) { // Loop untuk kolom
                System.out. print(matriks [i][j] + "\t"); // \t untuk tab 
                jumlah += matriks[i][j];
            }
            System.out. println(); // Pindah baris setelah satu baris selesai 
        } 
        System.out.print("Jumlah elemen semua data di array 2 Dimensi adalah: " + jumlah);
    }
}    
