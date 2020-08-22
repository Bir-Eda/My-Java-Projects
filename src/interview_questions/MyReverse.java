package interview_questions;

public class MyReverse {
    public static void main(String[] args) {
       System.out.println(reverse("Birsen"));
        System.out.println(secondReverse("gokyuzu"));

    }
    public static String reverse(String text){
        String reverse="";
        for(int i=text.length()-1; i>=0; i--){
            reverse+=text.charAt(i);
        }
        return reverse;
    }
   public static String secondReverse(String name){
        String str= new StringBuilder(name).reverse().toString();
        return str;
   }
}
