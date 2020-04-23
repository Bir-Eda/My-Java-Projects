package eightsquarepackage;

public class DoWhileSecond {
    public static void main(String[] args) {
        int row =1, column;
        int i;
        do{
            i=6;
            do{
                System.out.print("");
                i--;
            }
            while(i>=row);
            column =1;

            do{
                System.out.print(column+" ");
                column++;
            }
            while(column<= row);
            System.out.println(" ");
            row++;
        }
        while(row<=6);

    }
}
