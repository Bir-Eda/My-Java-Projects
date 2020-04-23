package sixtharraypackage;

public class MergeDeneme {
    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 4,9};
        int array2[] = {8, 2, 5, 9, 7, 15, 67};

        int merge[] = new int[12];
        for (int i = 0; i <= 4; i++) {
            merge[i] = array1[i];
        }

        for (int k = 0; k <= 6; k++) {
            merge[k + 5] = array2[k];


        }
        // System.out.println(merge[5]);
        for (int l = 0; l < 12; l++) {
            System.out.print(merge[l] + " ");
        }
    }
}
