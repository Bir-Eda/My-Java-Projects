package sixtharraypackage;

public class MergeIntArrT {
    public static void main(String[] args) {
        int array1[]= {1,2,3};
        int array2 []= {8,9,10};
        mergeArrays(array1,array2);
    }

    static void mergeArrays(int a[], int b[]) {
        int lenMergedArray = a.length + b.length;
        int[] mergedArray = new int[lenMergedArray];
        // adding values of the first array (array a)
        for (int i = 0; i < a.length; i++) {
            mergedArray[i] = a[i];

        }
        // adding values of the second array (array b)
        int index=0;
        for (int i =a.length; i < mergedArray.length; i++) {
            mergedArray[i] = b[index];
            index++;

        }
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i]+" ");
        }
    }
}
