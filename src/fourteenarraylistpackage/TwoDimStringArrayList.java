package fourteenarraylistpackage;
import java.util.ArrayList;
import java.util.Arrays;

public class TwoDimStringArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> myArr1 = new ArrayList<>();
        ArrayList<String> myWord = new ArrayList<>(Arrays.asList("How are you"));
        //ArrayList<ArrayList<String>> myArr2 = new ArrayList<>();
        ArrayList<String> myWord2 = new ArrayList<>(Arrays.asList("Not bad not good"));
        myArr1.add(myWord);
        myArr1.add(myWord2);
        myArr1.get(0).add("minicik");
        myArr1.get(1).add("WAVVVV");
        System.out.println(myArr1);
        findUpperCases(myArr1);
        findLoverCases(myArr1);

    }

    public static void findUpperCases(ArrayList<ArrayList<String>> arr) {
        int counterWord;
        int counterRow;
        for (int i = 0; i < arr.size(); i++) { // to fetch 1 dim String arrays
            counterRow = 0;
            for (int j = 0; j < arr.get(i).size(); j++) {  // to fetch String elements
                counterWord = 0;
                for (int k = 0; k < arr.get(i).get(j).length(); k++) {  //// to fetch chars
                    if (Character.isUpperCase(arr.get(i).get(j).charAt(k))) {
                        counterWord++;
                    }
                }
                counterRow += counterWord;

            }
            System.out.println("There are " + counterRow + " Upper cases at row " + (i));
        }
    }

    public static void findLoverCases(ArrayList<ArrayList<String>> arr) {
        int counterWord;
        int counterRow;
        for (int i = 0; i < arr.size(); i++) { // to fetch 1 dim String arrays
            counterRow = 0;
            for (int j = 0; j < arr.get(i).size(); j++) {  // to fetch String elements
                counterWord = 0;
                for (int k = 0; k < arr.get(i).get(j).length(); k++) {  //// to fetch charsw
                    if (Character.isLowerCase(arr.get(i).get(j).charAt(k))) {
                        counterWord++;
                    }
                }
                counterRow += counterWord;
            }
            System.out.println("There are " + counterRow + " Lower cases at row " + (i));
        }
    }


}