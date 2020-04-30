package fifth_method_package;

public class ASCIINumbersWithCharacter {
    public static void printASCIIAll(){
        for(int i= 0; i<256; i++){
            System.out.println("Number:" +i+" "+"Character:"+(char)i);
        }
    }
    public static void printNum(){
        int start = 100;
        while(start<=1000){
            System.out.println(start);
            start++;
        }
    }

    public static void main(String[] args) {
        printASCIIAll();
        printNum();
    }
}
