package sixtharraypackage;

public class TenByTenRowSum {
    public static void main(String[] args) {
        int [][]numbers=TenByTenArr.generateArray(10);
        printRowSum(numbers);
    }

    public static void printRowSum(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum=sum+arr[i][j];
            }
            System.out.println("Sum of row "+i+";"+sum);
        }
    }
}


