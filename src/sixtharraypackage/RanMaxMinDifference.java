package sixtharraypackage;

public class RanMaxMinDifference {
    public static void ranMet() {
        int arr[][] = new int[3][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 1000 + 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int maxNum = 0;
            int minNum = 1000;

            for (int j = 0; j < arr[i].length; j++) {
                if (maxNum < arr[i][j]) {
                    maxNum = arr[i][j];

                }
                if (minNum > arr[i][j]) {
                    minNum = arr[i][j];
                }

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            System.out.println("The Biggest number of row" + i + " is" + maxNum);
            System.out.println("The  number of row" + i + " is" + minNum);
            System.out.println("Max diff is :"+ (maxNum-minNum));
        }
    }
    public static void main(String[] args) {
        ranMet();
    }
}
