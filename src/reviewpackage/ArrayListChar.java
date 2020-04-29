package reviewpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListChar {
    public static void main(String[] args) {
        String sentence="Java is always fun";
        ArrayList<Character> myChar=new ArrayList<Character>();

        for(int i=0; i<sentence.length();i++){
            myChar.add(sentence.charAt(i));
        }
        System.out.println(myChar);
        System.out.println("---------2");

        String newSentence="ksjshdgdydtrevabxnfkeos";
        ArrayList<String> myWords=new ArrayList<String>();
        String word;
        for(int i=0; i<8; i++){
            word="";
            for(int j=0; j<5; j++){
                word=word+newSentence.charAt((int)(Math.random()*newSentence.length()));
            }
            myWords.add(word);
        }
        System.out.println(myWords);
        System.out.println("-----------------3");

        ArrayList<Integer> mylist=new ArrayList<Integer>(Arrays.asList(3,5,9,34,21,56,2));
        ArrayList<Integer> bos=new ArrayList<>();
        for(int i=mylist.size()-1; i>=0; i--){
            bos.add(mylist.get(i));
        }
        System.out.println(bos);
        System.out.println("________________4");
    }
}
