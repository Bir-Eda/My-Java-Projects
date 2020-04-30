package fifth_method_package;

public class ASCIINumbersWithMethod {
    public static void ASCII(){
        for(int i=100; i<=1000; i++){
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        ASCII();
        printNum();
    }
    public static void printNum(){
        int start=100;
        while(start<=1000){
            System.out.println(start);
            start++;
        }
    }
}
