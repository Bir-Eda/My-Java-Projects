package ocaquestionsvp2;

public class Q53 {
    public static void main(String[] args) {
        double discount=0;
        int qty=Integer.parseInt(args[0]);
        if(qty>=90){
            System.out.println("discount=0.5");
        } else if(qty>80 && qty<90){
            System.out.println("discount=0.2");
        }
        else{
            System.out.println("not");
        }


//        int y=5;
//
//        if(false&& y++==11){
//            System.out.println(y);
//        }
//        else if(true||--y==4){
//            System.out.println(y);
//        }
//        else{
//            System.out.println(y);
//        }

    }
}
