package ocaquestionsvp;

public class Q18 {
    public static void main(String[] args) {
        String [][] arr=new String [5][2];
        arr[0]=new String [2];
        arr[1]=new String[5];
        int m=97;
        for(int a=0; a<arr.length; a++){
            for(int b=0; b<arr.length; b++){
                arr[a][b]=""+m;
                m++;
               // System.out.println();
            }
        }
        for(String [] ca:arr){
            for(String c: ca){
                System.out.println(c+" ");
            }
            System.out.println();
        }
    }
}
