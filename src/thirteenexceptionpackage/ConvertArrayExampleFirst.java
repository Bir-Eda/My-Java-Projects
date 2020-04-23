package thirteenexceptionpackage;

import java.util.Arrays;

public class ConvertArrayExampleFirst {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {4, 5, 6}, {7, 8}};
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println(Arrays.toString(arr));//to show how Arrays.toString() works
        try {        //1  4  7  Oooooops kisim
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[j][i] + "\t");
                //try {
                //  System.out.print(arr[j][i] + "\t");
                // } catch (ArrayIndexOutOfBoundsException e) {
            }
            System.out.println();
        }
         }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Oooops");
            }
        finally{
            System.out.println("Hello world");
        }
        for(int i=0 ; i<arr.length;i++){         // 1 4 7 oops2
            for(int j=0;j<arr[0].length;j++){    // 2 5 8 oops2
                try{                             // 3 6 oops2  kismi
                    System.out.print(arr[j][i]+"\t");
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.print("oops2");
                }
            }
           System.out.println();
        }
    }
}
