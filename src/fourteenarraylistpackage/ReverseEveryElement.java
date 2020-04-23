package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseEveryElement {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>(Arrays.asList("array ", "constructor ", "extends ", "implement ", "overriding "));
        for(int i=arr.size()-1; i>=0; i--){
            System.out.print(reverseEveryElement(arr.get(i)));
        }
        //System.out.println(reverseEveryElement("abcdef"));
    }
    public static String reverseEveryElement(String str){
        String reversed="";
       // StringBuilder myBldr=new StringBuilder(str);
       // reversed=myBldr.reverse().toString();
        for(int i=str.length()-1; i>=0; i--){
            reversed+=str.charAt(i);
        }
        return reversed;
    }
}
