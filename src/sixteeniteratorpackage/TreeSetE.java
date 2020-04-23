package sixteeniteratorpackage;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetE {
    public static void main(String[] args) {
        phoneBook(1234567891, "Esra");
    }
    public static void phoneBook(int number, String name) {
        TreeSet<String> ts = new TreeSet<>();
        // ts.add(name);
        String num = "";
        String nums = num + number;
        String numbers = "";
        for(int i=3; i<6; i++){
            numbers+=nums.charAt(i);
        }
        ts.add(numbers);
        String numbers2 = "";
        for (int i = 3; i < 6; i++) {
            numbers2 += nums.charAt(i);
        }
        String numbers3 = "";
        ts.add(numbers2);
        for (int i = 6; i < nums.length(); i++) {
            numbers3 += nums.charAt(i);
        }
        ts.add(numbers3);
        System.out.println(ts);
        Iterator<String> iter = ts.iterator();
        System.out.print(name + ":");
        while (iter.hasNext()) {
            System.out.print(iter.next() + "\t");
        }
    }

    }
