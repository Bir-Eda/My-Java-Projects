package ninepackageinheritance;

public class OperationAdvance extends OperationExample2 {
    public OperationAdvance(){
        super();
    }
    public OperationAdvance(int a){
        super(20,40);
    }
    public void SumProduct(int a, int b, int c) {
        System.out.println((a+b)*c);
    }

}
