package sixteeniteratorpackage;
import java.util.Hashtable;
public class HashTableExampleSecond {
    public static void main(String[] args) {
        Hashtable<Integer , String> table = new Hashtable<>();
        String str = "zero one two three four five six seven eight nine";
        String[] arr = str.split(" ");

        for (int i = 0; i < 9 ; i++) {
            table.put(i+1, arr[i] );
        }
        System.out.println(table);
    }
}
