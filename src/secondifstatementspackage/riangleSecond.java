package secondifstatementspackage;

import java.util.Scanner;

public class riangleSecond {
    public static void main(String []args){
        System.out.println("What is triangle of the perimeter?");
        Scanner triangle = new Scanner(System.in);
        int edge1 = triangle.nextInt();
        int edge2 = triangle.nextInt();
        int edge3 = triangle.nextInt();
        System.out.println( edge1+edge2+edge3);

    }
}
