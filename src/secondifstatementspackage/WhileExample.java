package secondifstatementspackage;
import java.util.Scanner;
public class WhileExample {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Type any number between 1&10 inclusively:");
        int number = myScan.nextInt();
        if(number<=10 && number!=0){
            while(number>0){
                number++;
            }
            System.out.println("The number is between 1%10");
        }
        else{
            System.out.println("The number is out of range");
        }

    }
}

