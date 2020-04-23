package thirteenexceptionpackage;

public class NextLetterTest {
    public static void main(String[] args) {
        NextLetter myLetter=new NextLetter();
        System.out.println(myLetter.sentence);
        myLetter.printNextLetters();
        NextLetter myLtr=new NextLetter("Java is fun");
        System.out.print(myLtr.sentence);
        myLtr.printNextLetters();
    }
}

