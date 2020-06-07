package codingbat;

import java.sql.SQLOutput;

public class Q911 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Whizlab");
        char[]ch=new char[6];
        sb.getChars(1,5, ch, 1);
        for(char c:ch){
            System.out.print(c);

        }

        }
    }

