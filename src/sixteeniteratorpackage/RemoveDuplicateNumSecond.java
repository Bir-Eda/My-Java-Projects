package sixteeniteratorpackage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class RemoveDuplicateNumSecond {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 4, 5, 5, 5, 88));
        removeDup(mylist);
    }
    public static void removeDup(ArrayList<Integer> arr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int number : arr) {
            hs.add(number);
        }
        System.out.println(hs);
    }
}
