package thirdifstatementpackage;

import java.util.Scanner;

public class GenderT {
    public static void main(String[] args) {
        System.out.println("Write your gender : M or F : ");
        Scanner gender = new Scanner(System.in);
        String sex = gender.nextLine();
        if (sex.equals("M")) {
            System.out.println("Male");
        } else if (sex.equals ("F")) {
            System.out.println("Female");
        } else {

            System.out.println("Please M or F");
        }
    }
}
