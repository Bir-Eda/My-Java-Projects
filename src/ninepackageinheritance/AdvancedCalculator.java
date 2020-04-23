package ninepackageinheritance;

public class AdvancedCalculator extends Calculator{
     String color;

    public AdvancedCalculator() {
        super();
        this.color = "blue";
       // super.value=0;

    }
    public AdvancedCalculator(String color){
        super();
        this.color=color;

    }
    public double average(int a, int b){
        double average=(a+b)/2;
        return average;
    }
    public int factorial(int a){
        int factorial=1;
        for(int i=a; i>0; i--){
            factorial*=i;
        }
        return factorial;
    }
    public double sqrt(int a){
        return Math.sqrt(a);
    }
    public double pow(int a, int b){
        return (int)Math.pow(a,b);
    }
}
