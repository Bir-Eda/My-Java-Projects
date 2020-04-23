package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.ArrayList;
public class ArrayListUpperCaseeeeeeeee {
    public static void main(String[] args) {
        String upper = "ABCDEFGHIJKLMNOPRSTUVYZ";
        String letters = "abcdefghijklmnoprstuvyz";
        //System.out.println(letters.charAt((int)(Math.random()*letters.length())));

        ArrayList<String> words = new ArrayList<>(); // Empty String ArrayList
        String word;
        for (int i = 0; i < 10; i++) {
            word = "";
            //to concat.chars
            word += upper.charAt((int) (Math.random() * upper.length()));
            for (int j = 0; j < 5; j++) {
                word += letters.charAt((int) (Math.random() * letters.length()));
            }
            words.add(word);
        }
        System.out.println(words);
    }
}
