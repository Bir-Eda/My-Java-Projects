package sixteeniteratorpackage;
import java.util.Arrays;
import java.util.LinkedHashSet;
public class RemoveDuplicateNum {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5, 1, 3, 5};
        System.out.println( Arrays.toString(numbers) );
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(numbers) );
        Integer[] numbWithoutDupl = linkedHashSet.toArray(new Integer[] {});
        System.out.println( Arrays.toString(numbWithoutDupl) );
    }
}