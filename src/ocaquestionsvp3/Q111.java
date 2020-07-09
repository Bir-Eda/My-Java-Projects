package ocaquestionsvp3;

public class Q111 {
    public static void main(String[] args) {
        byte x=1;
        // boolean
       // short x=1;
        //Integer x=new Integer("1");
    //String x="1";  // String ile casein uyusmasi lazim
        switch(x){  // case 1 demek switchin icindeki sayi x in 1 sayisini gostermesi lazim
            case 1:  // case 1
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }
    }
}
//double, long ve float ve boolean olamaz
// case String bir deger olamaz cunku sout icinde String istiyor
