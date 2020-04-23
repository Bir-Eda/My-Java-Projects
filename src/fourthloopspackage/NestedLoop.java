package fourthloopspackage;

public class NestedLoop {
    public static void main(String[] args) {
        System.out.print(" ");
        for (int i = 1; i <=10; i++) {
            System.out.printf("\t"+i);
        }
        System.out.println("\n--------------------------------------------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ":\t"+"");
            for (int j = 1; j <= 10; j++) {
                System.out.printf(i*j + "\t");
            }
            System.out.println("");
        }
    }
    //use just plain print for the first line, then for loops for 2nd line those dashes, then 3rd line the for loops and so on

}
