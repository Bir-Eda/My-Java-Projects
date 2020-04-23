package sixtharraypackage;

public class MyMerge {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={6,7,8,9};
        merge(arr1, arr2);
    }
    public static void merge(int a[], int[]b){
        int lenMege= a.length+b.length;
        int mergeArray[]= new int[lenMege];
        for(int i=0; i<a.length; i++) {
            mergeArray[i] = a[i];
        }
        int index=0;
            for(int k=a.length; k<mergeArray.length; k++){
                mergeArray[k]=b[index];
                index++;


            }
            for(int j=0; j<mergeArray.length; j++){
                System.out.print(mergeArray[j]+" ");
            }
        }
    }

