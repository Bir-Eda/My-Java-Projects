package fifteenlinkedllistHashMappackage;
import java.util.ArrayList;
import java.util.HashMap;

public class DigitRepeatNumber {
    public static void main(String[] args) {
        HashMap<String, Integer> myHashMap = new HashMap<>();

        findRepeat("1234123512334234341");

    }

    public static void findRepeat(String number) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < number.length() - 3; i++) {
            a.add(number.substring(i, (i + 3)));
        }
        System.out.println(a);

    }
}