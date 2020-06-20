package exercises;

public class StringBuilder {
    public static void main(String[] args) {
        palindrome("madam");
    }
    public static void palindrome(String text){
        java.lang.StringBuilder sb=new java.lang.StringBuilder(text);
        System.out.println(sb.reverse());
        if(sb.equals(text)) {

            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");  //   ?????????
        }

    }
}
