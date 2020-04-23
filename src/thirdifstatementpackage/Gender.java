package thirdifstatementpackage;

import java.util.Scanner;

public class Gender {
    public static void main(String[] args) {

        System.out.println("write your gender:  M  or  F ");
        Scanner w = new Scanner(System.in);
        String gender = w.nextLine();

        if (gender.equals("M")){
            System.out.println("You signed Male ");

        }
        else {
            System.out.println("You signed Female");
        }

    }

}
