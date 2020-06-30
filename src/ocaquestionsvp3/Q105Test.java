package ocaquestionsvp3;

public class Q105Test {
    int x, y;


    public Q105Test(int x, int y) {
        initialize(x,y); //constructorin altina metodu cagirabilir
        this.x=x;
        this.y=y;
        System.out.println(this.x+""+this.y);
    }
    public void initialize(int x, int y){  // local variablellar metodun icinde kalir.
        this.x=x*x;
        this.y=y*y;
        System.out.println(this.x+" "+this.y);
    }

    public static void main(String[] args) {
        int x=9, y=5;  // main altindaki degerleri goruyor
        Q105Test obj=new Q105Test(3,7);
        System.out.println(obj.x+""+obj.y);
        System.out.println(x+""+y);




    }
}
