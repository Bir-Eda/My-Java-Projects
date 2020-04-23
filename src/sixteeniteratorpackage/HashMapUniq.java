package sixteeniteratorpackage;
import java.util.HashMap;
public class HashMapUniq {
    public static void main(String[] args) {
    int arr1[]={1,2,3,4,5,3,5};
    int arr2[]={4,2,3,6,7,3};
        System.out.println(UniqueNumbers(arr1, arr2));
    }

    public static boolean UniqueNumbers(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map1 = new HashMap();
        HashMap<Integer, Integer> map2 = new HashMap();
        for (int i = 0; i < arr1.length; i++) {
            if (map1.containsKey(arr1[i])) {
                map1.put(arr1[i], map1.get(arr1[i]) + 1);
            } else {
                map1.put(arr1[i], 1);
            }
        }
        System.out.println(map1);
        for (int i = 0; i < arr2.length; i++) {
            if (map2.containsKey(arr2[i])) {
                map2.put(arr2[i], map2.get(arr2[i]) + 1);
            } else {
                map2.put(arr2[i], 1);
            }
        }
        System.out.println(map2);
        boolean result = false;
        if (map1.size() == map2.size()) {
            result = true;
        }
        return result;
    }
}
