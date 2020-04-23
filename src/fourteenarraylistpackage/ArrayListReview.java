package fourteenarraylistpackage;

import java.util.ArrayList;

public class ArrayListReview {
    public static void main(String[] args) {
        ArrayList<String>myArr=new ArrayList<>();
        System.out.println(myArr);
        String []arr=new String [0];
        String arr2[]={"a","h","g"};
        arr=arr2;
        System.out.println(arr[1]);
        myArr.add("Java");
        myArr.add("is");
        myArr.add("fun");
        System.out.println(myArr);
        myArr.remove("Java");
        System.out.println(myArr);
        myArr.set(0, "Java");
        System.out.println(myArr);

    }
}
