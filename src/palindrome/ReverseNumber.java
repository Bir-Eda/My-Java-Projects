package palindrome;

public class ReverseNumber {
    public static void main(String[] args) {
        isPalindrome(125);

    }
    public static void isPalindrome(int number){
        int sum=0;
        int remaining=0;
        int temp;
        temp=number;
        while(number>0){
            remaining=number%10;
            sum=(sum*10)+remaining;
            number=number/10;
        }
        System.out.println(sum);
        if(temp==sum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}