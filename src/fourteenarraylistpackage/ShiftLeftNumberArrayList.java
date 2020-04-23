package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class ShiftLeftNumberArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<Integer>(Arrays.asList(4,6,9,10,45));
        shift(obj, 3);


    }
    public static void shift (ArrayList<Integer> arr, int num){
        ArrayList<Integer> myArr=new ArrayList<>();
        System.out.println("Input Array : "+arr);
        for(int i=num; i<arr.size(); i++){
            myArr.add(arr.get(i));

        }
        System.out.println("Output Array :"+myArr);
        // implement the question ??
    }

}
