package ocaquestionsvp3;

public class Q165 {
    public static void main(String[] args) {
        int x=100;
        int a=x++;
      //  System.out.println("a="+ a);

        int b=++x;
      //  System.out.println("b="+ b);

        int c=x++;
       // System.out.println("c="+c);

        int d=(a<b)?(a<c)? a: (b<c)?b:c:x;
         //System.out.println("d="+ d);


        if(a<b){
            if(a<c){
                System.out.println(a);
            }
            else if(b<c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }
        else{
            System.out.println(x);
        }


    }
}
