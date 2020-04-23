package sixtharraypackage;

public class CreateRanNum {
    public static void main(String[] args) {
    createArrayWithRandom(9);

}

    public static void createArrayWithRandom(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 4000 + 1000);
        }
        // just to see the array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }
}
