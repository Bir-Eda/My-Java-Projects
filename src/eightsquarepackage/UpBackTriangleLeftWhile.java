package eightsquarepackage;

public class UpBackTriangleLeftWhile {
    public static void main(String[] args) {
        int k=20;
        while(k>0){
            int i=0;
            while(i<(20-k)){
                System.out.print(" ");
                i++;
            }
            int j=0;
            while(j<k){
                System.out.print("*");
                j++;
            }
            System.out.println();
            k--;

        }
    }
}
