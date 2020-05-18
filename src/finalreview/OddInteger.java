package finalreview;

public class OddInteger {
    public static void main(String args[]) {
        int[] myArray = {1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5};
        System.out.println("Odd numbers in the given array are:: ");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0) {
                System.out.println(myArray[i]);
            }
        }
    }
}
