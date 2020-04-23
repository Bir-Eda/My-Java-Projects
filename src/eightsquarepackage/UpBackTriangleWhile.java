package eightsquarepackage;

public class UpBackTriangleWhile {
    public static void main(String[] args) {
        int c=20;
        do{
            int i=0;
            do{
                System.out.print(" ");
                i++;
            }
            while(i<(20-c));
            int j=0;
            do{
                System.out.print("*");
                j++;
            }
            while(j<c);
            System.out.println();
            c--;
        }while(c>0);
    }
}
