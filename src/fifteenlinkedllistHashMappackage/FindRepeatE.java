package fifteenlinkedllistHashMappackage;
import java.util.HashMap;
import java.util.ArrayList;
public class FindRepeatE {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        findRepeat("1234123512334234341");

    }

    public static void findRepeat(String number) {
        HashMap<String, Integer> map = new HashMap<>();

        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < number.length()- 3; i++) {
            a.add(number.substring(i, (i + 3)));
        }
        System.out.println(a);
        int count = 0;
        for (int i = 0; i < a.size()-1; i++) {
            for (int j =i+1; j < a.size(); j++) {
                if (a.get(i).equals(a.get(j))) {
                    count++;
                    map.put(a.get(i), count-1);
                }
            }
        }
        System.out.println(map);
    }
}
