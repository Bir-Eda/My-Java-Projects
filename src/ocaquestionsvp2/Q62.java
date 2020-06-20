package ocaquestionsvp2;

public class Q62 {
    public static void main(String[] args) {
        int ans=1;  // static metotta mutlaka bir deger vermek lazim int ans =1; gibi
        try{         // try catch main icinde calisir
            int num=10;
            int div=0;
              ans= num/div;
        }
        catch(ArithmeticException ae){
          ans=0;

        }
        catch(Exception e){
            System.out.println("Invalid cal");
        }
        System.out.println("Answer ="+ans);
    }
}
