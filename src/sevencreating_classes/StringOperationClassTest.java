package sevencreating_classes;
import java.util.Arrays;
public class StringOperationClassTest {
    public static void main(String[] args) {
        StringOperationClass myString = new StringOperationClass("I am thinking about Java that is fun or not");
        System.out.println(myString.returnReverse());
        System.out.println(myString.returnCapitalized());
        System.out.println(Arrays.toString(myString.returnString()));
        System.out.println(Arrays.toString(myString.returnSentence()));
    }
}
