package ocaquestionsvp;

public class Q31Vehicle {
    int x;
    Q31Vehicle(){
        this(10);
    }
    Q31Vehicle(int x){
        this.x=x;
    }
}
class Car extends Q31Vehicle{
    int y;
    Car(){
        super();
       // this(20);
    }
    Car(int y){
        this.y=y;
    }
    public String toString(){
        return super.x+":"+this.y;
    }
}
