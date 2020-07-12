package ocaquestionsvp2;
 class Q63C2 {
  public void displayC2() {
   System.out.println("C2");
  }
 }
 interface I{
  public void displayI();
  }
  class C1 extends Q63C2 implements I{
   public void displayI(){
    System.out.println("C1");
   }
   public static void main(String[] args) {
    Q63C2 o1=new C1();

    I o2=new C1();
    //float k=(float)1.2;
    Q63C2 s= (C1)o2;  // clasidan olusturdugu objeyi yine objeye esitlemeye calisiyo, once cast etmesi gerekirdi

  //  I t=o1;  // interface e cast yapmasi lazim ki hata vermesin

 //   t.displayI();

    s.displayC2();
   }
  }
// Q63C2 s=(Q63C2) o2;


