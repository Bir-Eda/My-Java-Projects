package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
public class TwoDimStringArrayListEvryElement {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> myArr1 = new ArrayList<>();
        ArrayList<String> myWord = new ArrayList<>(Arrays.asList(" How", " aRe", " yOu"));
        //ArrayList<ArrayList<String>> myArr2 = new ArrayList<>();
       // ArrayList<String> myWord2 = new ArrayList<>(Arrays.asList("Not bad not good"));
        myArr1.add(myWord);
        //myArr1.add(myWord2);
        findEveryElementUpperCases(myArr1);

    }

    public static void findEveryElementUpperCases(ArrayList<ArrayList<String>> arr) {

        int counterWord;
        for (int i = 0; i < arr.size(); i++) { // to fetch 1 dim String arrays

            for (int j = 0; j < arr.get(i).size(); j++) {  // to fetch String elements
                counterWord = 0;
                for (int k = 0; k < arr.get(i).get(j).length(); k++) {  //// to fetch charsw
                    if (Character.isUpperCase(arr.get(i).get(j).charAt(k))) {
                        counterWord++;
                    }
                }

                System.out.println("There are " + counterWord + " Upper cases in every word" + arr.get(i).get(j));
            }
        }

    }
}