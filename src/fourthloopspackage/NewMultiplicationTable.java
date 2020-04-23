package fourthloopspackage;

public class NewMultiplicationTable {
    public static void main(String[] args) {
        System.out.println();
        for(int i = 1; i<=10;i++){
            System.out.print("\t "+i);
        }
        System.out.println();
        for(int j =1; j <=10; j++){
            System.out.print("x");
        }
        System.out.println();
        for(int k =1 ; k<=10; k++) {
            System.out.print(k + " :\t");
            for (int l = 1; l <= 10; l++)
                if ((k * l) <= 10) {
                    System.out.print(" " + (k * l) + " ");
                } else
                    System.out.print((k * l) + " ");
        }
        System.out.println();
    }
}
