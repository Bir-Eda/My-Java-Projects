package sixteeniteratorpackage;
import java.util.Iterator;
import java.util.TreeMap;
public class TreeMapUniq {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 4, 4};
        int[] arr2 = {5, 7, 9, 6};
        System.out.println(findUniq(arr1, arr2));

    }

    public static boolean findUniq(int arr1[], int arr2[]) {
        TreeMap<Integer, Integer> num1 = new TreeMap<>();
        TreeMap<Integer, Integer> num2 = new TreeMap<>();

        for (int i = 0; i < arr1.length; i++) {
            if (num1.containsKey(arr1[i])) {
                num1.put(arr1[i], num1.get(arr1[i]) + 1);
            } else {
                num1.put(arr1[i], 1);
            }
        }
        System.out.println(num1);
        for (int i = 0; i < arr2.length; i++) {
            if (num2.containsKey(arr2[i])) {
                num2.put(arr2[i], num2.get(arr2[i]) + 1);
            } else {
                num2.put(arr2[i], 1);
            }
        }
        System.out.println(num2);
        boolean result = false;
        if (num1.size() == num2.size()) {
            result = true;
        }
        return result;

    }
}
