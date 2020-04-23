package sevencreating_classes;

import java.util.Arrays;

public class DimensionalClassTest {
    public static void main(String[] args) {
        DimensionalArrayClass myObj = new DimensionalArrayClass();
        int[]array1=myObj.returnArray();
        System.out.println(Arrays.toString(array1));
        myObj.printOddIndexes(array1);
       DimensionalArrayClass myObj1= new DimensionalArrayClass(30);
       int []array2= myObj1.returnArray();
        System.out.println();
        System.out.println(Arrays.toString((array2)));
        myObj1.printOddIndexes(array2);


    }
}
