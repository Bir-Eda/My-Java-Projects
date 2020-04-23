package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class StringArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>(Arrays.asList("abc", "sdf", "chg", "adg", "bnh"));
        System.out.println(remove(array));
    }

    public static ArrayList<String> remove(ArrayList<String> arr) {
        ArrayList<String> rem = new ArrayList<>();
        //for (int i = 0; i < arr.size(); i++) {
            for(String word : arr){
            if (!(word.contains("a")|| word.contains("e")) || word.contains("i")){
               rem.add(word);

            }
        }
        return rem;
    }
}