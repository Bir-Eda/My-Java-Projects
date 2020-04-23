package fourteenarraylistpackage;

import java.util.ArrayList;

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> myArr=new ArrayList<>();
        System.out.println(myArr);
        String [] arr=new String[2];
        String []arr2= {"quak","wavv","eyy"};
        arr=arr2;
        System.out.println(arr[0]); // 0. inci indexi yazar
        myArr.add("Sunday");
        myArr.add("is");
        myArr.add("Fun");
        System.out.println(myArr);
        myArr.add("day");
        System.out.println(myArr);
        myArr.remove("day"); // day yazisini kaldirdi
        System.out.println(myArr); //(Sunday is fun) oldu
        myArr.set(0, "Java"); //  0.inci indexin yerine java kelimesini koydu
        System.out.println(myArr); //( is yerine 0`inci elemana Java koydu set yerine baska birsey koyar (Replaced yapti)

    }
}
