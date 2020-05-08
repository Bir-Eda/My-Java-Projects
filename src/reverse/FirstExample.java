package reverse;

public class FirstExample {
    public static void main(String[] args) {
        String s="unfortunately";
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse=reverse+s.charAt(i);
        }
        if(s.equals(reverse)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
