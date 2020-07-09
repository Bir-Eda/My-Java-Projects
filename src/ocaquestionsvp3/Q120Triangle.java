package ocaquestionsvp3;

import org.w3c.dom.ls.LSOutput;

public class Q120Triangle {
   static  double area; // static olmazsa hata verir
    int b=2, h=3; // static olmadiklari icin mainin icinde gorulmezler

    public static void main(String[] args) {
        double p, b, h;
        if(area==0){
            b=3;
            h=4;
            p=0.5;
            area=p*b*h;


        }
        System.out.println("Area is "+area);
    }
    public void m2(){
        System.out.println(b);
        System.out.println(area);
    }
}
