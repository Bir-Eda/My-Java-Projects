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
        super();
        // this(20);
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
     //  Car y =new Car();
        System.out.println(y);

      // int result=obj.y;
       // System.out.println(result);
        //System.out.println(y); // eger new crain icinde herhangi bir deger olsaydi line 19 daki y yi cagiracakti
    }
}
