package ninepackageinheritance;

public class OperationExample2 {
    public int a,b,c;
    public OperationExample2(){
        this.a=10;
        this.b=20;
        this.c=30;
    }
    public OperationExample2(int a){
        this.a=a;
        this.b=20;
        this.c=30;
    }
    public OperationExample2(int a, int b) {
        this.a = a;
        this.b = b;
        this.c = 30;
    }
    public OperationExample2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void add(int a, int b){
        System.out.println(a+b);

    }
    private void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public void multiply(int a, int b){
        System.out.println(a*b);
    }
}
