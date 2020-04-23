package sixtharraypackage;

public class MathOperations {
    public static void main(String[] args) {
        addTwoDoubleVoid(3,4);
        addTwoIntVoid(3,4);
        addTwoDoubleVoid(3,4.0);
        addTwoCharsVoid('a','b');
        addTwoCharsVoid('5','6');
        addTwoCharsNoParameter();
        addTwoStringsVoid("Hello ","World");
    }
    public static void addTwoIntVoid(int number1,int number2){
        System.out.println(number1+number2);
    }
    public static int addTwo(int number1, int number2){
        return number1+number2;
    }
    public static void addTwoDoubleVoid(double number1, double number2){
        System.out.println(number1+number2);
    }
    public static double addTwoDouble(double number1,double number2){
        return number1+number2;
    }
    public static void addTwoCharsVoid(char char1,char char2){
        System.out.println(char1+char2);
    }
    public static void addTwoCharsNoParameter(){
        System.out.println('k'+'l');
    }
    public static void addTwoStringsVoid(String string1,String string2){
        System.out.println(string1+string2);
    }

}
