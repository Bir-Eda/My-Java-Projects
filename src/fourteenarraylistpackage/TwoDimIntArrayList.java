package fourteenarraylistpackage;
import java.util.ArrayList;
import java.util.Arrays;
public class TwoDimIntArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> num1 = new ArrayList<>(10);
        ArrayList<Integer> toInsert1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        num1.add(new ArrayList<>(toInsert1));
        ArrayList<Integer> toInsert2 = new ArrayList<>(Arrays.asList(6,7,8,9,10));
        num1.add(new ArrayList<>(toInsert2));
        System.out.println(toInsert1);
        System.out.println(toInsert2);

    }

    }


