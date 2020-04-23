package fourteenarraylistpackage;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;

public class ArrayListRandT {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random rnd = new Random();
        //System.out.println(rnd.nextInt(1000));
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(1000));
        }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);

        System.out.println("Min number is : "+arr.get(0));
        System.out.println("Second Min number is : "+arr.get(1));// ikinci kucuk numara
        System.out.println("Third Min number is : "+arr.get(2)); // ucuncu

        System.out.println("Max number is : "+arr.get(arr.size()-1));
        System.out.println("Second Max number is : "+arr.get(arr.size()-2)); // sondan bir onceki max number

        System.out.println("Median is : "+ arr.get(arr.size()/2));
        //System.out.println( Collections.min(arr));
        //System.out.println( Collections.max(arr));
        }
    }
/*
ArrayList<Integer> arr=new ArrayList<>();
ArrayList<Integer> largest=new ArrayList<>();
largest.add(arr.get(arr.size()-1));
largest.add(arr.get(arr.size()-2));
largest.add(arr.get(arr.size()-3));
System.out.println("Largest 3 numbers: "+largest);
ArrayList<Integer> smallest=new ArrayList<>();
smallest.add(arr.get(0));
smallest.add(arr.get(1));
smallest.add(arr.get(2));
System.out.println("Smallest 3 numbers: "+smallest);
 */