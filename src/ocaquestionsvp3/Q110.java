package ocaquestionsvp3;

public class Q110 {
    public static void main(int[]args){
        System.out.println("int main"+args[0]);  // args [0]
     }
    public static void main(Object[]args){
        System.out.println("Object main"+args[0]); //
    }
    public static void main(String[]args){  // java main metodun overloading olmasina izin verir
        System.out.println("String main"+args[0]); // run yapinca her zaman orjinaline bakacak ve String yazacak
    }
}
// javac MainTest.java
//java MainTest 1 2 3
// 1  args[0]
//2  args[1]
// 3 args[2] yi gosterir