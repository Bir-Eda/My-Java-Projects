package secondifstatementspackage;

import java.util.Scanner;

public class IfReview2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Where are you going Europe, Africa, Asia, America");
        String place=scan.next();
        if(place.equalsIgnoreCase( "Europe")){
            System.out.println("Gate A");
        }else if(place.equalsIgnoreCase("Africa")){
            System.out.println("Gate B");
        }else if(place.equalsIgnoreCase("Asia")){

        }else if(place.equalsIgnoreCase("America")){
            System.out.println("Gate D");
        }else{
            System.out.println("Go to other Gate");

        }
    }
}
