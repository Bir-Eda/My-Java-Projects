package sixteeniteratorpackage;
import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;

public class RemoveDuplicateNumT {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 1, 2, 3, 1, 3, 4, 2));
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(arrayList);
        arrayList.clear();
        arrayList.addAll(hashSet);
        System.out.println(arrayList);
    }

    }
