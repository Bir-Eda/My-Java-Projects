package whizlabspackage;

import java.util.Arrays;

public class Q5q6 {
    public static void main(String[] args) {
        int array[]={2,5,9,5,0,3};

        // {2,5,0,3,5,9}  {0,2,3,5,5,9}
        Arrays.sort(array, 2,6);


        System.out.println(array[2]+array[5]);
    }
}
