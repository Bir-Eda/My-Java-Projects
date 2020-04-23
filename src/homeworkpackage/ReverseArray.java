package homeworkpackage;

import java.util.Arrays;

//Reverse Array without using another array. (Array itself)
public class ReverseArray {
    public static void main(String[] args) {
        String [] sentence ={"j","a","v","a"};
        reverseArray(sentence);
        System.out.println(reverseString("Hello World"));
    }
    public static void reverseArray(String []array){
        String []reverseArray= new String[array.length];
        int index=0;
        for(int i=array.length-1; i>0; i--){
            reverseArray[index]=array[i];
            index++;
        }
        System.out.println(Arrays.toString(reverseArray));
        for(String word:reverseArray){
            System.out.println(word);
        }
    }
    public static String reverseString(String sentence){
        String result=" ";
        for(int i=sentence.length()-1; i>=0; i--){
            result+=sentence.charAt(i);
        }
        return result;
    }
}
