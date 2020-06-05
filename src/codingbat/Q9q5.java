package codingbat;

import java.util.ArrayList;
import java.util.List;

public class Q9q5 {
    public static void main(String[] args) {
        List<String> str=new ArrayList<>();
        str.add("A");
        str.add("B");
        str.add("C");

        String []arr=new String[2];
        arr = str.toArray(arr); // Stringi arraya cevir demek  concat
       String a="Ali";
       String s2=a.concat(" Mert");
        System.out.println(s2);

        for(String s:arr){
            System.out.println(s);
        }
    }
}
