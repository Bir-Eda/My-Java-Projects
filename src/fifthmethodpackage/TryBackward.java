package fifthmethodpackage;

public class TryBackward {
    public static void backwardABC(){
        String word= "abc";
        for(int i=word.length()-1; i>=0; i--){
            System.out.print(word.charAt(i));
        }
        System.out.println();

    }
    public static String backwardNumber(String text) {
        String number = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            number=number+text.charAt(i);
        }
        return number;
    }


    public static void main(String[] args) {
        backwardABC();
        String number =TryBackward.backwardNumber("1234");
        System.out.println(number);

    }
}
