package sixtharraypackage;

public class Merge {
    public static void mergeArrayFind(int a[], int []b) {
        int lenMergeArr = a.length + b.length;
        int[] mergeArray = new int[lenMergeArr];
        for (int i = 0; i < a.length; i++) {
            mergeArray[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            mergeArray[i] = b[i];
        }
        int index = 0;
        for (int i = a.length; i < mergeArray.length; i++) {
            mergeArray[i] = b[index];
            index++;
        }
        for (int i = 0; i < mergeArray.length; i++) {
            System.out.print(mergeArray[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr1[]={2,5,3,8};
        int arr2[]={1,5,8};
        mergeArrayFind(arr1, arr2);
    }
}
