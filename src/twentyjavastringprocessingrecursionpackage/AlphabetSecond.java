package twentyjavastringprocessingrecursionpackage;

public class AlphabetSecond {
    public static void main(String[] args) {
        doCeasarCipper("abcdxyz");
        doThatWayCeasarCipher("deghfj");
    }

    public static void doCeasarCipper(String word) {
        char ch;
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            //ch += 3;
            ch=(char) ((ch-'a' +3)%26+'a');
            System.out.print(ch);
        }
    }
    public static void  doThatWayCeasarCipher(String word) {
        String original = "abcdefghijklmnopqrstuvwxyz";
        String ciphered = "defghijklmnopqrstuvwxyzabc";
        int index = 0;
        for (int i = 0; i < word.length(); i++) {
            index = original.indexOf(word.charAt(i));
            System.out.print(ciphered.charAt(index));
        }
    }
    }
