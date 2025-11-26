import java.util.LinkedList;

public class tugas {
    public static void main(String[] args) {
    //Deklarasi
    LinkedList<String> tugasku = new LinkedList<>();
    
    //Isi
    tugasku.add("SIM");
    tugasku.add("SIAK");
    tugasku.add("OAK");
    tugasku.add("PBO");
    tugasku.add("ASD");

    tugasku.addLast("Matdis");
    System.out.println("List tugas berdasarkan prioritas: " + tugasku);

    tugasku.add(2, "Bing");
    System.out.println("List tugas berdasarkan prioritas: " + tugasku);


    tugasku.clear();
    System.out.println("List tugas minggu ini: " + tugasku);
    }
}