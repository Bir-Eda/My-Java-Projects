package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveStringArrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("Java ", "SQL ", "Selenium "));
        System.out.println(arr);
        System.out.println("Enter item to remove : ");
        String item = scan.next();
        ArrayList<String> newList = new ArrayList<>();
        for (String element : arr) {
            if (!element.equals(item)) {
                newList.add(element);
            }
        }
        System.out.println(newList);
    }

    /*public static ArrayList<String> removeItem(ArrayList<String> list, String item) {
        ArrayList<String> updatedList = new ArrayList<>();
        for (String item : list) {
            if (!item.equals(RemoveToItem)) {
                updatedList.add(item);
            }
        }
    } */
}
