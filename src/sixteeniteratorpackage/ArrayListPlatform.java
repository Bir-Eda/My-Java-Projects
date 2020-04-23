package sixteeniteratorpackage;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListPlatform {
    public static void main(String[] args) {
        ArrayList<Integer> myArr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int number=1;
        while (number!=0){
            System.out.println("Enter number :");
            number = scan.nextInt();
            myArr.add(number);
            System.out.println(myArr);


        }
    }
}

