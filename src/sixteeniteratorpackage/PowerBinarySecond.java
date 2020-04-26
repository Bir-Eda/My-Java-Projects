package sixteeniteratorpackage;
import java.util.LinkedList;
import java.util.Arrays;
public class PowerBinarySecond {
        public static void main (String[]args){
            int arr[] = {1, 0, 1};
            returnBinary(arr);
        }
        public static void returnBinary ( int[] arr){
            LinkedList<Integer> list = new LinkedList<Integer>();
            for (int nums : arr) {
                list.add(nums);
            }
            LinkedList<Integer> list2 = new LinkedList<>();
            for (int i = list.size()-1; i>=1; i++) {
                list2.add((int) Math.pow(2, i));
            }
            int result;
            int finalR = 0;
            for (int i = 0; i < list.size(); i++) {
                result = list.get(i) * list2.get(i);
                finalR += result;
            }
            System.out.println(finalR);
        }
    }