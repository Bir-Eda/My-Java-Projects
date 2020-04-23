package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertStringArrayListToStrList {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>(Arrays.asList("array ", "constructor ", "extends ", "implement ", "overriding "));
       String array[]=new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            array[i] = arr.get(i);
        }
        System.out.println(Arrays.toString(array));

        int []num={1,2,3,4,5,6,7};
        System.out.print(convertSecond(num));
    }
    public static ArrayList<Integer>convertSecond(int []arr){
        ArrayList<Integer> result=new ArrayList<>();
       for(int number : arr){
            result.add(number);
        }
        return result;
    }
}
