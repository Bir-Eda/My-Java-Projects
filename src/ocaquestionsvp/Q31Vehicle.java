package ocaquestionsvp;

 class Q31Vehicle {
    int x;
    Q31Vehicle(){
        this(10);
    }
    Q31Vehicle(int x){
        this.x=x;
    }
}
class Car extends Q31Vehicle {
    int y;

    Car()  {
     //   super();
        this(20);
    }
    Car(int y) {
        this.y = y; // yukardaki line 13 teki y ye refor eder
    }

    public String toString() {
        return super.x + ":" + this.y;
    }
}
    class Test{
    public static void main(String[] args) {
        Q31Vehicle y= new Car();// constrocturda variable olmayani cagiracak
        System.out.println(y);

      // int result=obj.y;
       // System.out.println(result);
        //System.out.println(y); // eger new carin icinde herhangi bir deger olsaydi line 19 daki y yi cagiracakti
    }

    //    0         5           3
  //    8^2=64    8^1=8       8^0=1
  //    0*64=0    5*8=40      3*1=3  -->  0+40+3=43




}
