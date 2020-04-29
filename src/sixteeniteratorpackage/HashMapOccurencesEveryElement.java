package sixteeniteratorpackage;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapOccurencesEveryElement {
    public static void main(String[] args) {
        //HashMap<Integer, Integer> num=new HashMap<>();
        //num.put(1,3);
       // num.put(2,5);
       // System.out.println(num);
        int arr[]={1,1,2,4,3,3,4,5,6,2,3,7,6};
        System.out.println(numberOfOccurences(arr));
    }
    //public static void numberOfOccurences(int arr[])
    public static HashMap<Integer, Integer> numberOfOccurences(int []arr){
        HashMap<Integer, Integer> result =new HashMap<>();
        for(int num : arr){
            if(result.containsKey(num)){
                result.put(num, result.get(num)+1);
            }
            else{
                result.put(num, 1);
            }
        }
        return result;
    }
}
