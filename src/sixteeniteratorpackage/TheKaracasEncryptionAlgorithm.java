package sixteeniteratorpackage;

import java.util.HashMap;

public class TheKaracasEncryptionAlgorithm {
    public static void main(String[] args) {
       // HashMap<String, Integer> phoneBook = new HashMap<>();
        System.out.println(encrypts("apple"));
    }
    public static String encrypts(String str){
        //HashMap<String , String> newWord = new HashMap<>();
        String reversed="";
        for(int i=str.length()-1; i>=0; i--){
            reversed+=str.charAt(i);
        }
        return reversed;

            }


        }