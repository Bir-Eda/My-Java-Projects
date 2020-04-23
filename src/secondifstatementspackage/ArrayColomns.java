package secondifstatementspackage;

public class ArrayColomns {
    public static int [][] colomns(int [][] arr) {
        int [][]array=new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
                // for(int ){

            }
            System.out.println();
        }
        return arr;
    }

    public static void main(String[] args) {
        int number[][]={{1,2},{3,4}};
        colomns(number);
    }
}
