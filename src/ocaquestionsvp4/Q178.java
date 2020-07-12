package ocaquestionsvp4;

public class Q178 {
    public static void main(String[] args) {
        int ans;
        try{
            int num=10;
            int div=0;
            ans=num/div;
        }
        catch(ArithmeticException ae){
            ans=0;
        }
        catch(Exception e){
            System.out.println("Invalid");
        }
      //  System.out.println("answer"+ans);
    }
}
