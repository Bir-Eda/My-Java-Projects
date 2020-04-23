package fourteenarraylistpackage;

import java.util.ArrayList;

public class ArrayListRandomStringT {
    public static void main(String[] args) {
        String letters="abcdefghijklmnoprstuvyz";
        //System.out.println(letters.charAt((int)(Math.random()*letters.length())));
        ArrayList<String> words=new ArrayList<>(); // Empty String ArrayList
        String word;
        for(int i=0; i<10; i++){
            word="";
            for(int j=0; j<5; j++){  //to concat.chars
                word+=letters.charAt((int)(Math.random()*(letters.length())));
            }
            words.add(word);
           words.set(i, words.get(i).toUpperCase());


        }
        System.out.println(words);
    }
}
