package fourteenarraylistpackage;
import java.util.Scanner;
public class WithoutArrayThreeVariable {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter three different number. First Number :");
        int first=scan.nextInt();
        System.out.println("Second Number ;");
        int second=scan.nextInt();
        System.out.println("Third Number :");
        int third=scan.nextInt();
        if(first>second && first>third){
            System.out.println("First number is the max number :"+first);
        }
        else if(second>first&&second>third){
            System.out.println("Second number is the max number :"+second);
        }
        else{
            System.out.println("Third number is the max number :"+third);
        }
    }
}
