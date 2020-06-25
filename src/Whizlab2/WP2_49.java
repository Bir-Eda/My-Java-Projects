package Whizlab2;

public class WP2_49 {
    public static void main(String[] args) {
          I i= new I(){};  //  ?????????
        String []arr=new String[]{"BHjk"};
            i.print();
            I.method();
        }
    }

interface I{
    public default void print(){
        System.out.println("I");
    }
    static void method(){
        System.out.println("Static");
    }
}
