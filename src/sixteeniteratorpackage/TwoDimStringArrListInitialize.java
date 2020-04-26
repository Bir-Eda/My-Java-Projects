package sixteeniteratorpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class TwoDimStringArrListInitialize {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> myWord = new ArrayList<>();
        ArrayList<String> row = new ArrayList<>(Arrays.asList("Java", "is", "fun", "forever", "always", "fun"));
        for(int i=0; i<5; i++){
            myWord.add(new ArrayList<>());
            myWord.get(i).addAll(row);

        }
        for(ArrayList<String> line : myWord){
            System.out.println(line);
        }
        Iterator<ArrayList<String>> iter= myWord.iterator();
        int counter;
        while(iter .hasNext()){
            counter=0;
            for(String word: iter.next()) {
                for (int i = 0; i < word.length(); i++) {
                    if (Character.isUpperCase(word.charAt(i))) {
                        counter++;
                    }
                }
            }
                System.out.println("Total upper for this line  "+counter);
            }
        }
    }

