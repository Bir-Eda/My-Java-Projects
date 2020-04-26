package sixteeniteratorpackage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class CreateIntArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(1000));
        }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);

        System.out.println("Min number is : "+arr.get(0));
        System.out.println("Max number is : "+arr.get(arr.size()-1));
        System.out.println("Median is : "+ arr.get(arr.size()/2));
        System.out.println("Largest 3 : "+ arr.get(arr.size()-1)+"\t" + arr.get(arr.size()-2) +"\t"+ arr.get(arr.size()-3));
        System.out.println("Minimum 3 : "+arr.get(0)+"\t"+arr.get(1)+"\t"+arr.get(2));
    }
}
