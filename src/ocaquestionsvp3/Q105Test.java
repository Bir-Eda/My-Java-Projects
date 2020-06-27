package ocaquestionsvp3;

public class Q105Test {
    int x, y;


    public Q105Test(int x, int y) {
        initialize(x,y);
    }
    public void initialize(int x, int y){
        this.x=x+x;
        this.y=y+y;
    }

    public static void main(String[] args) {
        int x=9, y=5;
        Q105Test obj=new Q105Test(x, y);
        System.out.println(x+" "+y);
    }
}
