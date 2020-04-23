package sevencreating_classes;

public class PChild extends Parent {
    int y;
    PChild(int y, int x){
        super(x); // Parent class attr x initialized using by Constructor
        this.y=y;
    }
    void callThisMethod(){
        int a=super.getX();
        a++;
    }
}
