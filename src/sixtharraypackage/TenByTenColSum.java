package sixtharraypackage;

public class TenByTenColSum {
    public static void main(String[] args) {
        int[][] numbers = TenByTenArr.generateArray(10);
        printColSum(numbers);
    }

    public static void printColSum(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[j][i];
                //System.out.println("Sum of col " + j + ";" + sum);

            }
            System.out.println(sum);

        }
    }
}
