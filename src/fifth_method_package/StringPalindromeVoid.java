package fifth_method_package;

public class StringPalindromeVoid {
     public static void palindromeWord(String text){

        String reversed = "";
      for(int i=text.length(); i>0; i++){
          reversed+=text.charAt(i); // concatenation operation
      }
      if(reversed.equals(text)){
          System.out.println("Palindrome");
      }
      else{
          System.out.println("Not Palindrome");
      }
    }
    public static void main(String[] args) {
        StringPalindromeVoid.palindromeWord("racecar");
    }
}
