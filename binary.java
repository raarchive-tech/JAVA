public class binary {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        System.out.println(binarySearch(arr, 40));
    }

    static int binarySearch(int []numbers, int numberToFind) {
        int low = 0;
        int high = numbers.length - 1;

        while(low <= high) {
            int middlePosition = (low + high) /2;
            int middleNumber = numbers[middlePosition];
            System.out.println("middlePosition " + middlePosition);

            if (numberToFind == middleNumber) {
                return middlePosition;
            }

            if (numberToFind < middleNumber) {
                high = middlePosition - 1;
                System.out.print("high " + high);
            }

            else {
                low = middlePosition + 1;
                System.out.println("low " + low);
            }
        }

        return -1;
    }
}
