package sixteeniteratorpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreateStringLL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>(Arrays.asList("Java", "is", "extremely", "fun"));
        List<Integer> length = new LinkedList<>();
        for (String word : list) {
            length.add(word.length());
        }
        System.out.println(list);
        System.out.println(length);
        int index = length.indexOf(Collections.max(length)); // very important
        int index1 = length.indexOf(Collections.min(length)); // very important

        System.out.println("The largest word is :" + "\"" + list.get(index) + "\"" + " with the length " + length.get(index));
        System.out.println("The shortes word is :" + "\"" + list.get(index1) + "\"" + " with the length " + length.get(index1));

        }
    }

