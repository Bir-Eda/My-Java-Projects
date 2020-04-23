package fifteenlinkedllistHashMappackage;
import java.util.HashMap;

public class MultiplicationOfAdjacentThirdT {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        finAdjacentMax(arr);
    }

    public static void finAdjacentMax(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length - 1; i++) {
            hm.put(i, arr[i] * arr[i + 1]);
        }
        //System.out.println(hm);
        //max value
        int max=0; // to find max
        int index=0; // to store max values key(index)
        for (int key : hm.keySet()) {
            if (hm.get(key) > max) {
                max = hm.get(key);
                index=key;

            }
        }
        System.out.println("index 1 :\t"+index+"\t\t index 2 :"+(index+1)+"\n Max multiplication is: \t"+arr[index]+"*"+arr[index+1]+"="+max);

    }
}
