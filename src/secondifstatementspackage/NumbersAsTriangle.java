package secondifstatementspackage;

public class NumbersAsTriangle {
    public static void main(String[] args) {
        printNumbersTriangle(createIntArray(10, 10));
    }
    public static int[][] createIntArray(int rows, int cols) {
        int numbersArray[][]= new int [rows][cols];
        int number=1;
        for (int i = 0; i < numbersArray.length; i++) {  //numbersArray.length yerine rows
            for (int j = 0; j <numbersArray[i].length; j++) {  // numbersArray.length yerine cols kullanabilirsin
                numbersArray[i][j] = number;
                number++;
            }
        }
        return numbersArray;
    }
    public static void printNumbersTriangle(int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("\t"+numbers[i][j]);
            }
            System.out.println();
        }

    }
}
