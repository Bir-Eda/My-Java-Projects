package interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>(Arrays.asList(2, 4, 11, 13, 6, 7, 8));
        System.out.println(returnMax(x));
        System.out.println(returnMax2(x));
    }

    // find max value
    public static int returnMax(ArrayList<Integer> array) {
        int max = 0;
      //  for(int i=0; i<array.size(); i++){
         //   if(array.get(i)>max){
       // max=array.get(i);

        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
    public static int returnMax2(ArrayList<Integer> array) {
        int last=0;
        Collections.sort(array);  // sort ettik kucukten buyuge siraladik
       // last=array.get(array.size()-1);  // find second max icin -2 olacak
          last=array.get(array.size()-2);
        return last;
    }
}
