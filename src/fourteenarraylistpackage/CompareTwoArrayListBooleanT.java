package fourteenarraylistpackage;
import java.util.ArrayList;
import java.util.Arrays;
public class CompareTwoArrayListBooleanT {
    public static void main(String[] args) {
        ArrayList<Integer> orr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 8)); // tum sayilarin tutmasi lazim degilse yanlis olur
        ArrayList<Integer> orr2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 8));
        System.out.println(compareArrList(orr1, orr2));

    }

    public static boolean compareArrList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean result = true;
        for (int i = 0; i < list2.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                result = false;
            }
        }
            return result;
    }
}