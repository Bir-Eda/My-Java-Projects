package sixtharraypackage;

public class TenByTenArr {
    public static void main(String[] args) {
        int[][] myNumbers = generateArray(10);
        printArrayElements(myNumbers);
    }

    public static void array() {
        int[][] x = new int[10][10];
        int y = 1;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = y;
                y++;
            }
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print("\t" + x[i][j]);
            }
            System.out.println();
        }
    }

    //T
    public static int[][] generateArray(int arraySize) {
        int counter = 1;
        int[][] arr = new int[arraySize][arraySize];  // creating empty array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = counter;
                counter++;
            }
        }
        return arr;
    }

    public static void printArrayElements(int[][] arr) {
        for (int[] numberArray : arr) {
            for (int number : numberArray) {
                System.out.format("%5d", number);
            }
            System.out.println();
        }
    }
}
