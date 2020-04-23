package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {
       int []arr={ 1,2,3,4,5,6,7,8};
        System.out.println(convertToArrayList(arr));
        String []array= {"array", "int","Hi"};
        System.out.println(convertToArrayList(array));
}
public static ArrayList<Integer> convertToArrayList(int[]arr){
        ArrayList<Integer> result =new ArrayList<>();

         for(int element : arr){
             result.add(element);
         }
        return result;
    }
    public static ArrayList<String> convertToArrayList(String[]array){
        ArrayList<String> result =new ArrayList<>();

        for(String element : array){
            result.add(element);
        }
        return result;
    }
}