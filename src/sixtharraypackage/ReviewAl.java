package sixtharraypackage;

public class ReviewAl {
    public static void main(String[] args) {
        int []arr1={1,2,3};
        int []arr2={1,2,3};
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]==arr2[i]){
                System.out.println("Same");
            }
            else{
                System.out.println("Not same");
            }

        }
    }
}
