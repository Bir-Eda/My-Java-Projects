package projects;

public class PalindromeThird {
    public static void main(String[] args) {
        String name="Birsen";
        String reverse="";
        for (int i = name.length()-1; i >=0 ; i--) {
            reverse+=name.charAt(i);
        }
        if(name.equals(reverse)){
            System.out.println("Polindrome");
        }
        else{
            System.out.println("is not Polindrome");
        }
    }
}
