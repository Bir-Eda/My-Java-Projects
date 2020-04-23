package ninepackageinheritance;

public class Child extends Parent {
    int y;
    Child(int y, int x){
        super(x); // parent class attribute x initialized using by constructor
        this.y=y;
    }
}
