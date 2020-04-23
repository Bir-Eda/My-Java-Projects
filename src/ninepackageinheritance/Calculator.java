package ninepackageinheritance;

public class Calculator {
    protected int value;

    public Calculator(){
        this. value=0;
        System.out.println("Value :"+ this.value);
    }
    protected int add(int num1, int num2){  // public void add yazabilirsin
       return num1+num2;
    }
    private int divided(int num1, int num2){
        return num1/num2;
    }
    public int subtract(int num1, int num2){
        return num1-num2;

    }
    int multip(int num1, int num2){
        return num1*num2;
    }

}
