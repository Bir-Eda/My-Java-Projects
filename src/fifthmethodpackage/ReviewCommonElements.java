package fifthmethodpackage;

public class ReviewCommonElements {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7,8};
        int arr2[]={3,4,9,12,13};
        findCommon(arr1, arr2);
    }
    public static void findCommon(int a[], int b[]){
        for(int i=0; i<a.length; i++){
            for (int j=0; j<b.length; j++){
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
