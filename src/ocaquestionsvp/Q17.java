package ocaquestionsvp;

public class Q17 {
    public static void main(String[] args) {
        int arr[][] = new int[3][4];
        arr[0] = new int[]{1, 2, 3, 4};
        arr[1] = new int[]{1, 3, 8, 0, 8};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);

//                for (int[] a : arr) {
//                    for (int i : a) {
//                        System.out.print(i + "");

                    }
                    System.out.println();
                }
            }

        }



