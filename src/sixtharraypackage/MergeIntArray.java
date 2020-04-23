package sixtharraypackage;

public class MergeIntArray {
    public static void mergeArray( int a[], int b[]) {
        int []newArray= new int[a.length+b.length];
        int m=0;
        for (int i = 0; i < a.length; i++) {
            newArray[m] = a[i];
            m++;
        }
        for (int k = 0; k < b.length; k++) {
            newArray[m]=b[k];
            m++;
        }
        for( m=0; m<newArray.length; m++){
            System.out.print(newArray[m]);
            if(m!=newArray.length-1){   // burasi nedir
                System.out.print(", ");
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {6, 7, 8, 9};
        mergeArray(a,b);
    }
}
