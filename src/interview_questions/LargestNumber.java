package interview_questions;

public class LargestNumber {
    public static void main(String[] args) {


        //  scannerla denemek istersek yukarai scanner koyacagiz



        int num1=5, num2=10, num3=15;


        if(num1>num2 && num1>num3){
            System.out.println(num1);
        }
        else if(num2>num3 && num2>num1){
            System.out.println(num2);
        }
        else{
            System.out.println(num3);
        }
    }

}
