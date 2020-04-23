package fourthloopspackage;

import java.util.Scanner;

public class VowelsStudent {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter a string:");
        String a = x.nextLine();
        int i = 0;
        while (i < a.length()) {
            if (a.charAt(i) != 'i' && a.charAt(i) != 'a' && a.charAt(i) != 'u' && a.charAt(i) != 'e') {
                System.out.print(a.charAt(i));
            } else {
                System.out.print("");
            }
            i++;
        }
    }
}
