package ocaquestionsvp2;

public class Q71 {
    public static void main(String[] args) {
        int [][]arr=new int[2][4];
        arr[0]=new int[]{1,3,5,7};
        arr[1]=new int[]{1,3};

        for(int i=0; i<arr.length;i++){
       // for(int []a:arr){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
