package ocaquestionsvp;

public class Q18 {
    public static void main(String[] args) {
        String [][] arr=new String [5][4];
        arr[0]=new String [2];
        arr[1]=new String[5];

        int i=97;
        for(int a=0; a<arr.length; a++){
            for(int b=0; b<arr[a].length; b++){
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
//     String arr[][]= {{"A","B","C","D","E"} , {"F","G","H","I","J"}};
//         chs [a][b]
//        chs[0][0]=97,
//        chs[0][1]=98,
//        chs[0][2]=99,
//        chs[0][3]=100,
//        chs[0][4]=101,

//        chs[1][0]=97,
//        chs[1][1]=98,
//        chs[1][2]=99,
//        chs[1][3]=100,
//        chs[1][4]=101,
