package reviewpackage;
import java.util.Scanner;
public class MethodDecideStringT {
    public static void main(String[] args) {
        suggestDestination();
    }
    public static void suggestDestination(){
      Scanner scan=new Scanner(System.in);
      String destination;
        System.out.println("Sea or Mountain? :");
      String answer=scan.next();
      if(answer.equalsIgnoreCase("Sea")) {
          System.out.println("East or West? :");
          answer = scan.next();
          if (answer.equalsIgnoreCase("East")) {
              destination = "Florida";
          } else if (answer.equalsIgnoreCase("West")) {
              destination = "California";
          }
      }
      else if(answer.equalsIgnoreCase("Mountain")){
          System.out.println("Midland or North? :");
          answer=scan.next();
          if(answer.equalsIgnoreCase("Midland")){
              destination="Kansas";
          }
          else if(answer.equalsIgnoreCase("North")){
              destination="Vermont";
          }
          else{
              System.out.println("Wrong input");
          }

      }
      else{
          System.out.println("Wrong input");
      }

    }
}
