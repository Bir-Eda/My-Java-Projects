package fifteenlinkedllistHashMappackage;
import java.util.HashMap;
public class MultiplicationOfAdjacentThird {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        int num = arr.length;
        adjMultiply(arr, num);
    }

    public static void adjMultiply(int arr[], int num) {
        for (int i = 0; i < num - 1; i++) {
            int curr = arr[i];
            arr[i] = arr[i] * arr[i + 1];
            System.out.print("\t" + arr[i]);
        }
    }
}