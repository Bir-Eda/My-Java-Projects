package fourteenarraylistpackage;

import java.util.ArrayList;

public class ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> numbers =new ArrayList<Integer>();
        //int[] arr = new int[100];
        //for (int i = 0; i < arr.length; i++) {
         //   arr[i] = (int) (Math.random() * 1000 + 100);
       // }
       // for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);

        for(int i=0; i<100; i++){
            numbers.add((int)(Math.random()*1000));
            System.out.println((numbers.get(i)));

        }
        //Max number
        int max=0;
        for(int i=0; i<numbers.size(); i++){
            if(numbers.get(i)>max){
                max=numbers.get(i);
        }
      }
        System.out.println("Max number: "+max);

        // Min number
        int min=numbers.get(0);
        for(int i=0; i<numbers.size(); i++){
            if(numbers.get(i)<=min){
                min=numbers.get(i);
            }
        }
        System.out.println("min number: "+min);
    }
}
