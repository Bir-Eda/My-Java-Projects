package fifteenlinkedllistHashMappackage;

import java.util.HashMap;

public class OccurencesNew {
    public static void main(String[] args) {
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        myMap.put(1,4);
        System.out.println(myMap);
        myMap.put(1,5);
        System.out.println(myMap);
        int arr[]={1,1,2,4,3,3,4,5,6,2,3,7,6};
        findFrequencies(arr);
    }
    public static void findFrequencies(int []arr){
        HashMap<Integer, Integer> freq=new HashMap<>() ;
        for(int num : arr){
            if(freq.containsKey(num)){
                freq.put(num,1);
            }
            else{
                freq.put(num,freq.get(num+1));
            }
        }
        for(int key : freq.keySet()){
            System.out.println("Number "+ key+" "+freq.get(key)+" times seen in the array");
        }
    }

}
