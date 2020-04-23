package sixtharraypackage;

import java.util.Scanner;

public class VirtualChatProg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "";

        while (!answer.equalsIgnoreCase("you won")) {
            System.out.println("talk liitle bit");

            answer = scan.next();
            if (!answer.equalsIgnoreCase("you won")){
                System.out.println("You said" + answer);
            }
        }  //if(answer.equals("you won")){
        System.out.println("I knew I will win");

    }
}
