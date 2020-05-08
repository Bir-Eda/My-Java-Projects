package palindrome;

import java.util.Arrays;

public class SecondExample {
    public static void main(String[] args) {
        String as = "Yigit";
        char[] ch = as.toCharArray();
        int size = ch.length;
        char[] a = new char[as.length()];
        int i = 0;
        while (i != size) {
            a[size - i - 1] = ch[i];
            i++;
        }
        if(Arrays.equals(ch, a)){
        System.out.println("Palindrome");
    }
    else{
            System.out.println("Not Palindrome");
        }
}
}
