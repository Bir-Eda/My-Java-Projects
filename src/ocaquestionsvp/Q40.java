package ocaquestionsvp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q40 {
    public static void main(String[] args) {
        String arr[] = {"Hi! ", "How ", "Are ", "You?"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if (arrList.removeIf(a -> {
            System.out.print(a);
            return a.length() <= 2;
        })) {
            System.out.println(" removed");
        }
    }
}
//}     //   ??????????