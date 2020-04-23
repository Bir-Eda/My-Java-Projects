package fifthmethodpackage;

public class FirstMethod {
    public static void displayHelloWorld(){
        System.out.println("Hello world");
    }
    public static void printSome(){
        int x= 0;
        do{
            System.out.println("Hello world");
            x++;
        }
        while(x<10);
    }
    public static void printNumbers(){
        for(int i=1; i<=100; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        displayHelloWorld();
        displayHelloWorld(); // bir kere daha yazarsan iki kere hello world yazar
        FirstMethod.printNumbers();//printNumbers da once printSome yaziyordu. biz onun basina
        //FirstMethod class adini yazarak baska bir metod yani printNUmbers i cagirdik
        printSome();
        printNumbers();
        printNumbers(); // print numbersi iki kere yazdigi icin 20 kere hello world yazdi
        printNumbers();
    }
}
