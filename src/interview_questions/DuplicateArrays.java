package interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DuplicateArrays {
    public static void main(String[] args) {
//        int arr[] = {3, 5, 1, 8, 2, 5, 1};
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] == arr[i + 1]) {
//                System.out.println(arr[i]);
//            }
//        }

        String array[] = {"b", "b", "e", "e", "o"};
        System.out.println(dublicate(array));
        System.out.println(dublicate2(array));
        System.out.println(dublicate3(array));
    }

    public static String dublicate(String arr[]) {
        Arrays.sort(arr);
        String dubl = " ";
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals(arr[i + 1])) {
                dubl += " " + arr[i];
            }

        }
        return dubl;
    }

    public static String dublicate2(String arr[]) {
        String dub = " ";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    dub += " " + arr[i];
                }
            }
        }
        return dub;
    }

    public static String dublicate3(String arr[]) {
        HashSet<String> set=new HashSet<>();
        String dub = " ";
        for(String names:arr){
            if(set.add(names)==false){
                dub+=" "+names;
            }
        }

        return dub;
    }
}
