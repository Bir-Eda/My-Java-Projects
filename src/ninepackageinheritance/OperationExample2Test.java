package ninepackageinheritance;

public class OperationExample2Test {
    public static void main(String[] args) {
        OperationExample2 parent=new OperationAdvance();
        parent.add(4,8);
        OperationAdvance child=new OperationAdvance();
        child.SumProduct(5,8,12);
        parent.multiply(3,7);
        child.multiply(4,8);
        System.out.println(parent.a+" "+parent.b+" "+parent.c);
        OperationExample2 parent2=new OperationExample2(55);
        System.out.println(parent2.a);
        System.out.println(parent2.b);
        System.out.println(parent2.c);







    }
}
