package secondifstatementspackage;

import java.util.Scanner;

public class feviewecision {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Does animal breathe air Y, N");
        String breathe=scan.next();
        if(breathe.equalsIgnoreCase("Y")){
            System.out.println("Does the animal lay egg? Y or N");
            String layEgg=scan.next();
            if(layEgg.equalsIgnoreCase("Y")){
                System.out.println("Bird");
            }else{
                System.out.println("Mammal");
            }
        }else{
            System.out.println("Fish");
        }
    }

}
