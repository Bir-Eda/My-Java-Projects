package sevencreating_classes;

public class Bicycle {
// this part attribute
    int modelSize;
    String modelColor;

    public Bicycle(int size, String color) {
        this.modelSize = size;
        this.modelColor = color;
    }

    public void goFast(){
        System.out.println("Go Fast");
    }
    public void goFasster(){
        System.out.println("Go Faster");
    }
    public void goSlowly() {
        System.out.println( "Go slowly" );
    }
    public void goDown() {
        System.out.println( "Slow Down" );
    }
        public void speedC(int speed){
            if (speed < 20)
                System.out.println("slow");
            else if (speed < 50 )
                System.out.println("normal speed");
            else
                System.out.println("fast");
        }
    }