package sixteeniteratorpackage;

import java.util.*;

public class ReverseIntArrayList {
    public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println(numbers);

        // String remove arraylist
        List<String>words = new ArrayList<>(List.of("Apple", "Banana", "Peach", "Strawberry"));
        Collections.sort(words, Collections.reverseOrder());
        System.out.println(words);
        String x="";
        for(int i=0; i<words.size(); i++){
            StringBuilder reversed = new StringBuilder(words.get(i));
            reversed.reverse();
            x+=reversed;
            words.set(i, x); // stringbuilder
            x="";
        }
        System.out.println(words);
    }
}
