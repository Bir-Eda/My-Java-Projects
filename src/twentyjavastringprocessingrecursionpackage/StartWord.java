package twentyjavastringprocessingrecursionpackage;

public class StartWord {
    public static void main(String[] args) {
        startWord("hippo", "hi");
        //startWord("hippo", "xhi");
        startWord("hippo", "i");
    }
    public static void startWord(String str, String word) {
        int lenStr = str.length();
        int lenWord = word.length();
        String temp;
        if (lenStr >= lenWord) {
            temp = str.substring(1, lenWord);
            if (word.substring(1).equals(temp)) {
                System.out.println(str.charAt(0) + temp);
            } else {
                System.out.println(" ");
            }
        }
        else{
                System.out.println(" ");
            }
        }
    }

