package interview_questions;

public class SumOfDigit {
    public static void main(String[] args) {
        int n []= {1,2,3,4,5};
       System.out.println(sum(n));
        int num=23;

    }

    public static int sum(int number[]) {
//        int sum = 0;
//        while (number != 0) {
//            sum = sum + number % 10;
//            number = number / 10;
//
//        }
//        return sum;
        int sum=0;
        for (int i = 0; i <number.length ; i++) {
            sum+=number[i];

        }

        return sum;
    }


}
