package ocaquestionsvp;

public class Q39 {
    public static void main(String[] args) {
        String shirts[][]=new String [2][2];
        shirts[0][0]="red";
        shirts[0][1]="blue";
        shirts[1][0]="small";
        shirts[1][1]="medium";
        //for(int i=0; i<2; i++){
          //  for(int j=0; j<2;j++){
        for(String []a:shirts){
            for(String b: a){
                System.out.println(b+":");
               // System.out.println(shirts[i][j]);
            }
        }

    }
}
