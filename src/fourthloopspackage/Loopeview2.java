package fourthloopspackage;

public class Loopeview2 {
    public static void main(String[] args) {
        String sentence = "we are in love with java";
        int counter = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'e' || sentence.charAt(i) == 'a' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o') {
                counter++;
            }
        }
        System.out.println("Total "+counter+" Vowels" +"\n");


        int index = 0;
        String myStr = "I love Java but it is little diffucult";
        while (index < myStr.length()) {
            if ((myStr.charAt(index) == 'u' || myStr.charAt(index) == 'i' ||  myStr.charAt(index) == 'e' || myStr.charAt(index) == 'a' ||myStr.charAt(index) == 'o')) {
                System.out.print((myStr.charAt(index)+" "));
            }
            index++;
        }

    }
}
