package interview_questions;

public class Palindrome {
    public static void main(String[] args) {
//        System.out.println(isPolindrome("kazak"));
//        System.out.println(isPolindromeSecond("hagsfd"));
//        System.out.println(pal(12322));
        System.out.println(isPlndrm("Merhaba"));
    }

    public static boolean isPolindrome(String str) {
        if (str.equals(new StringBuilder(str).reverse().toString())) {
            return true;
        }
        return false;
    }


    public static boolean isPolindromeSecond(String str){
        if(!(str.equals(new StringBuilder(str).reverse().toString()))){
            return false;
        }
        return true;
    }


    public static boolean pal(int num){
        int org_num=num;
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if(org_num==rev){
           // System.out.println(org_num+ " polindrom");
            return true;
        }
        return false;

        }


        public static boolean isPlndrm(String str){
        if(str.equals(new StringBuilder(str).reverse().toString())){
            return true;
        }
        return false;
        }

    }


