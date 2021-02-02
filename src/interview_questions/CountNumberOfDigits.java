package interview_questions;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        int num=1258123889;
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println(count);
        System.out.println(countDigit(num));
    }
    //  genel method
    public static int countDigit(int num){
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count;

    }
}
