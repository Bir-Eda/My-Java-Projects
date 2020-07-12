package ocaquestionsvp2;

public class Q62 {
    public static void main(String[] args) {
      //  int ans=1;  // static metotta mutlaka bir deger vermek lazim int ans =1; gibi
        try{         // try catch main icinde calisir
            int num=10;
            int div=0;
            int  ans= num/div;
            System.out.println(ans);
        }
        catch(Exception ae){
      //  catch(ArithmeticException ae){
         // ans=0;  // chatin icine yeniden deger atayamayiz sadece sout yapabiliriz
            System.out.println("invalid");
        }
       // catch(ArithmeticException e){
            System.out.println("Invalid cal");
        }
      //  System.out.println("Answer ="+ans);


    }

