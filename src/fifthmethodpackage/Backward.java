package fifthmethodpackage;

public class Backward {
    public static void backward(){
        String text="abc";
        for(int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));

        }
        System.out.println();
    }
    public static void backNumber(){
        String number= "1234";
        for(int i=number.length()-1;i>=0; i--){
            System.out.print(number.charAt(i));
        }
    }

    public static void main(String[] args) {
        backward();
        backNumber();
    }
}
