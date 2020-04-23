package fifthmethodpackage;

public class ReversePalindrome {
    public static boolean isPalindrome(String text){
        boolean result= true;
        int end=text.length()-1;
        for(int i=0; i<=end;i++){
            if(text.charAt(1)!=text.charAt(end)){
                result=false;

            }
            end--;
        }
        return result;
    }

    public static void main(String[] args) {

        isPalindrome("Hello");
    }
}
