public class sequential {
    public static void main(String[] args) {
        int[] listArray ={0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
        int search = 1;

        for (int i = 0; i < listArray.length; i++) {
            if (listArray[i] == search) {
                System.out.printf("'%d' is found at index '%d' %n", search, i);
            }
        }
    }
}
