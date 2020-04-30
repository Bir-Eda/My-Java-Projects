package fifth_method_package;

public class TopToBottomHello {
    public static void topToBottom(String word){
        for(int i=0; i<word.length(); i++){
            System.out.println(word.charAt(i));
        }

    }
    public static void helloTop(String word){
        for(int i=0; i<word.length(); i++ ){
            System.out.println(word.charAt(i));
        }
    }

    public static void main(String[] args) {
        helloTop("Hello");
    }




    /*public static void topToBottomPrint(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

    }

    public static void main(String[] args) {
        topToBottomPrint("Hello");
    }*/
}
