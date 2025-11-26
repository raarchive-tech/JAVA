public class tipeData {
    public static void main(String[] args) {
        //Deklarasi variabel dengan tipe data eksplisit
        int x = 10;
        String nama = "Budi";
        double pi = 3.14;
        String kalimat = "Belajar Algoritma";
        boolean isMahasiswa = false;

        System.out.println(x);
        System.out.println("x: " + ((Object)x).getClass().getSimpleName());
        System.out.println("nama: " + nama.getClass().getSimpleName());
        System.out.println("pi: " + ((Object)pi).getClass().getSimpleName());
        System.out.println("kalimat: " + kalimat.getClass().getSimpleName());
        System.out.println("isMahasiswa: " + ((Object)isMahasiswa).getClass().getSimpleName());
    }
    
}
