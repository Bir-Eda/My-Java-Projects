package sixtharraypackage;

public class Common {
    public static void main(String[] args) {
        int arr1[]={4,7,12,8,34,91};
        int arr2[]={5,83,91,2,8,12};
        findCommons(arr1,arr2);
    }
    static void findCommons(int a[], int b[]){
        for(int i=0; i<a.length; i++){
            int counter=0;
            for(int j=0; j<b.length; j++) {
                if (a[i] == b[j]) {
                    counter++;
                }
            }
            if(counter>0){
                    System.out.println(a[i]);
                }
            }
        }
    }


