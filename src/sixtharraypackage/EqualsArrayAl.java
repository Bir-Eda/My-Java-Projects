package sixtharraypackage;

public class EqualsArrayAl {
    public static void main(String[] args) {
        int []arr1={1,4,8,23,98};
        int arr2[]={5,8,90,21,6,1};
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]+" ");
                }
            }
        }
        int[][]arr3={{1,3,45,64},{65,45,12,34,90}};
        for(int i=0; i<arr3.length-1; i++){
            for(int j=0; j<arr3[i].length; j++){
                for(int k=0; k<arr3[i+1].length; k++){
                if(arr3[i][j]==arr3[i+1][k]) {
                    System.out.println(arr3[i][j] + " ");
                }
                }
            }
        }
    }
}
