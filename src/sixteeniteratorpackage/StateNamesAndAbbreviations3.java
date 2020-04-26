package sixteeniteratorpackage;
import java.util.ArrayList;
import java.util.List;
public class StateNamesAndAbbreviations3 {
    public static void main(String[] args) {
        String states[] = {"Arizona","CA", "NY", "Nevada"};
        filterStateNames(states,"abb");
    }
    public static void filterStateNames(String[] arr,String word) {
        String result = " ";
        if (word == "abb") {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() <= 2) {
                    result += arr[i];
                    System.out.println(result);
                } else {
                    result = result;
                    System.out.println(result);
                }
            }
        } else if (word == "full") {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() > 2) {
                    result = word;
                }
                System.out.println(result);
            }
        } else {
            System.out.println("Invalid");
        }
    }
            }
