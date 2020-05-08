package twentyonequeuepackage;

import java.util.LinkedList;
import java.util.Queue;

public class QueueQuestion {
    public static void main(String[] args) {
        Queue<Integer> obj = new LinkedList<Integer>();

        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        int value;
        for (int i = 0; i < 10; i++) {
            value=obj.poll();
            System.out.print("Removed :"+value+"\t Queue :"+ obj);
            obj.add(value);
            System.out.println("\t After added :"+obj);
        }
        System.out.println(ceasarCipher("abcdefghijklmnoprstuvyz"));
    }
    public static String ceasarCipher(String word){
        String result="";
        Queue<Integer> key = new LinkedList<>();
        key.add(3);
        key.add(1);
        key.add(7);
        key.add(4);
        key.add(2);
        key.add(5);
        char ch;
        int keyValue;
        for (int i = 0; i < word.length() ; i++) {
            ch = word.charAt(i);  // chara donusturdu
            keyValue = key.poll();
            ch += keyValue;
            result += ch;
            key.add(keyValue);
        }
        return result;
    }
}