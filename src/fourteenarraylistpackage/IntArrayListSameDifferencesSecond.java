package fourteenarraylistpackage;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class IntArrayListSameDifferencesSecond {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(2, 4, 6, 9,12));
        sameDifference(myList);

    }
    public static void sameDifference(ArrayList<Integer> Arr) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < Arr.size() - 1; i++) {
            for (int j = i + 1; j < Arr.size(); j++) {
                newList.add((Math.abs(Arr.get(i) - Arr.get(j))));
            }
        }
        System.out.println(newList);
        System.out.print("Same differences are:");
        for (int i = 0; i < newList.size() - 1; i++) {
            for (int j = i + 1; j < newList.size(); j++) {
                if (newList.get(i).equals(newList.get(j))) {
                    System.out.print(newList.get(i)+"\t");
                }
            }
        }
    }

}
