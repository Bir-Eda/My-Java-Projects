package sixtharraypackage;

public class CommonExercise {
    public static void commonEl(int a[], int []b){
        for(int i=0; i<a.length; i++){
            for( int k=0; k<b.length; k++){
                if(a[i]==b[k]){
                    System.out.println(a[i]);
                }
            }
        }

        int as[]={1,2,3};
        int az []={4,5,6,3};

    }

    public static void main(String[] args) {
        int arr1[]={17,23,5,3,8};
        int arr2[]={2,5,8,4};
        commonEl(arr1, arr2);
    }
}
