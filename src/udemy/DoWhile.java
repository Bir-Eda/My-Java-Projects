package udemy;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan= new Scanner((System.in));
        System.out.println("Enter a number");
        int toplam=0;
        int i=12;
        int m=20;
        do{
            System.out.println(i+m);
            i++;
        }
        while(i<m);
    }
}
