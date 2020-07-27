package ocaquestionsvp;

public class Q18 {
    public static void main(String[] args) {
        String [][] arr=new String [5][2]; //  {7} {7}  {7}  {7}  {7}
        arr[0]=new String [2];
        arr[1]=new String[5];

        int i=97;
        for(int a=0; a<arr.length; a++){
            for(int b=0; b<arr.length; b++){ // arr[i].length deseydi tamam ama yeni deger 5 ve
                arr[a][b]=""+i;
                i++;

            }
        }
        for(String [] ca:arr){
            for(String c: ca){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}





