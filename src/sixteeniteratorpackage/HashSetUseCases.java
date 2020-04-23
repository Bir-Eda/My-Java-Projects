package sixteeniteratorpackage;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
public class HashSetUseCases {
    public static void main(String[] args) {
        String sentence="can a fish fish a fish can";
        String[] words=(sentence.split(" "));
        System.out.println(Arrays.toString(words));
        HashSet<String> hash= new HashSet<>();

        // now lets add to HashSet
        for(String word: words){
            hash.add(word);
        }


    }

}
