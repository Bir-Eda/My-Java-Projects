package eightsquarepackage;

public class WhileSquare {
    public static void main(String[] args) {
        int i=1;
        int j;
        while(i<=10){
            j=0;
            while(j<=10){
                System.out.print("*  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
