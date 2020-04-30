package nineteenenumpackage;

public class FirstEnumExample {
    public static void main(String[] args) {
        Level myEnumVar=Level.LOW;
        System.out.println(myEnumVar);
    }
    enum Level{
        LOW,
        MEDIUM,
        HIGH,
    }
}
