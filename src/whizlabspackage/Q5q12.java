package whizlabspackage;

public class Q5q12 {
    public static void main(String[] args) {
        int arr[][] = {{1, 11}, {1}, {1, 11}};
        //for (int x = 0; x < arr.length; x++) {
        for (int[] a : arr) {

            for (int b : a) {

                System.out.println(b);
                //for(int y=0; y<arr[x].length; y++ )
                // for (int y : arr) {


               // System.out.println(arr[x][y]);
            }
        }
    }
}

