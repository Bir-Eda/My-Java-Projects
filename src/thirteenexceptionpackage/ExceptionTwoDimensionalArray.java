package thirteenexceptionpackage;
import java.util.Scanner;
public class ExceptionTwoDimensionalArray {
    public static void main(String[] args) {
        twoDimensionalArray();
    }

    public static void twoDimensionalArray() {
        String arr[][]={{"Java", "OOP", "Abstraction"}, {"Encapsulation", "Inheritance"},{"Interfaces"}};
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter index 1:");    //^  before danger
        int a=scan.nextInt();                      //
        System.out.println("Enter index 2:");
        int b=scan.nextInt();

        try {
            System.out.println(arr[a][b]);  //danger zone
            System.out.println("Item retrieved successfully");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("invalid index number");
        }
        catch(Exception e){
            System.out.println("Invalid index");  // solution part
        }
        //System.out.println("Item retrieved successfully");
    }
}
