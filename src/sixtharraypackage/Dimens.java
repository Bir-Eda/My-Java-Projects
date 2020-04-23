package sixtharraypackage;

public class Dimens {
    public static void main(String[] args) {
        int[][] myNum = {{1, 8, 3, 4}, { 9, 6,7}};
        for (int i = 0; i < myNum.length; i++) {
            for (int k = 0; k < myNum[i].length; k++) {
                System.out.print(myNum[i][k]);
            }
            System.out.println();
        }
    }
}
