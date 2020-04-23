package secondifstatementspackage;

import java.util.Scanner;

public class IntroductionApp {
    public static void main (String[] args){
        System.out.println("First name?");
        Scanner girdi = new Scanner(System.in);
        String name = girdi.nextLine();
        System.out.println("How old are you?");
        int age = girdi.nextInt();
        System.out.println("Place of birth?");
        String city = girdi.nextLine();
        System.out.println("What is your weight?");
        float weight = girdi.nextFloat();
        System.out.println("Your name is:" + name + ". Your age is:" + age + ". Your place of birth is:" + city + ". Your weight is:" + weight);
    }
}
