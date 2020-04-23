package sixtharraypackage;
import java.util.Scanner;
public class ParkingFee {
    public static void main(String[] args) {
calculate();
    }
    public static void calculate(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Are you member Y or N");
        String member=scan.next();

        if(member.equalsIgnoreCase("Y")){
            System.out.println("Please enter your hour");
            int hour=scan.nextInt();
            if(hour>=1&&hour<=2){
                System.out.println("$3");
            }
            else if(hour>=3&&hour<=6){
                System.out.println("$5");
            }
            else if(hour>=7&&hour<=12) {
                System.out.println("$10");
            }
                else{
                System.out.println("$15");
            }
        }else{
            System.out.println("You are not member");
        }
    }
}
