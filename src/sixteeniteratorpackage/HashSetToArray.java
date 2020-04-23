package sixteeniteratorpackage;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetToArray {
    public static void main(String[] args) {
        HashSet<String> hashSet= new HashSet<>();
        hashSet.add("Ali");
        hashSet.add("Beli");
        hashSet.add("Cadi");
        hashSet.add("Deli");
        hashSet.add("Elif");
        hashSet.add("Ali");
        hashSet.add("Beli");
        hashSet.add("Cadi");
        hashSet.add("Deli");

        String[]value=new String[hashSet.size()];
        hashSet.toArray(value);
        System.out.println(Arrays.toString(value));

    }
}
