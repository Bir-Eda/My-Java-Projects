package sixteeniteratorpackage;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveStringArrayList {
    public static void main(String[] args) {
        ArrayList<String> myList=new ArrayList<>(Arrays.asList("java", "fun", "fun", "java", "happy"));
        ArrayList<String> newList = new ArrayList<>();
        for (String letter : myList) {
            if (!newList.contains(letter)) {
                newList.add(letter);
            }
        }
        System.out.println(newList);
    }
}
