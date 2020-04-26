package sixteeniteratorpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertStrArrayListToStrArray {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<String>(List.of("Java","is", "super", "fun"));
        String arr[]=new String[str.size()];
        arr=str.toArray(arr);
        System.out.println(Arrays.toString(arr));

    }
}
