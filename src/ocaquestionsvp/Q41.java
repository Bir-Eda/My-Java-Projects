package ocaquestionsvp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q41 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("Robb");
        arr.add("Bran");
        arr.add("Rick");
        arr.add("Bran");
        if(arr.remove("Bran")){
            arr.remove("Jon");
        }
        System.out.println(arr);

    }
}
