package ocaquestionsvp;

 class C {
     public C(){
         System.out.print("C");
     }
}
class B extends C{
     public B(){
       //  super();
         System.out.print(" B");
     }
 }
 public class Q9 extends B{

     public Q9(){
        // super();
         System.out.print(" A");
     }

     public static void main(String[] args) {
        // Q9 a= new Q9();
       //  B b=new B();
         C c=new C();
     }
 }

// obj parenttan olusunca sadece kendini yazar,
// obj childdan olusunca hem parenti hemde child i yazar
