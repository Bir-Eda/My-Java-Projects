package fifth_method_package;

import java.util.Scanner;

public class PalindromeSay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Say something");
        String word = scan.next();
        System.out.println(word);

      /*  public static String some(String any) {
        String result="";
        for (int i = any.length() - 1; i >= 0; i--) {
            System.out.print(any.charAt(i));

            if(result.equals("kazak")){
                System.out.println("word is polindrome");
            }else
                {
                    System.out.println("word is not polindrome");
            }
        }
        return result;*/
    }
}
