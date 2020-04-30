package fifth_method_package;

public class ABC {
    public static void abc(){
        String x="abc";
        for(char i=0; i<3; i++){
            for (char j= 1; j<i; j++);
            System.out.println("a"+"b"+"c");
        }
    }

    public static void main(String[] args) {
        abc();
    }
}
