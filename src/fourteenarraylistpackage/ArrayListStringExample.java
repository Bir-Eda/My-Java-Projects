package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListStringExample {
    public static void main(String[] args) {
        String sentence="Java is fun";
            ArrayList<Character> myArr = new ArrayList<>();
           for(int i=0; i<sentence.length(); i++){
               myArr.add(sentence.charAt(i));
               // (myArr.add)=method   // sentence.charAt(i)= parameter argument

           }
        System.out.println(myArr);

           }
        }
