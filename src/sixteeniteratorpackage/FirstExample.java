package sixteeniteratorpackage;
import java.util.Iterator;
import java.util.ArrayList;

public class FirstExample {
    public static void main(String[] args) {
        ArrayList<Integer> digits = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if ((i % 2 == 1)) {
                digits.add(i);
            }
        }

        Iterator<Integer> iterator = digits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

