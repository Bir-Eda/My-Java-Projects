package interview_questions;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello World"));
    }

    public static String reverseString(String text) {
       // String s="unfortunately";
        String reverse="";
        for(int i=text.length()-1;i>=0;i--){
            reverse+=text.charAt(i);
            //System.out.println(i);



        }
        return reverse;
//        if(s.equals(reverse)){
//            System.out.println("palindrome");
//        }else{
//            System.out.println("not palindrome");
//        }
    }




    }







