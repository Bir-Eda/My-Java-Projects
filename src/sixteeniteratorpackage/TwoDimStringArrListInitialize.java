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
        int count;
        HashMap<String, Integer> hm= new HashMap<>();
        for(int i=0; i<myWord.size(); i++){
            for (int j = 0; j < myWord.get(i).size() ; j++) {
                count=0;
                System.out.println(myWord.get(i));
                for (int k = 0; k < myWord.get(i).get(j).length(); k++) {
                    System.out.println(myWord.get(i).get(j));
                    if(Character.isUpperCase(myWord.get(i).get(j).charAt(k))){
                        System.out.println(myWord.get(i).get(j).charAt(k));
                        count++;
                    }
                }
                hm.put(myWord.get(i).get(j),count);
            }
        }
        System.out.println(hm);

        }
        }

