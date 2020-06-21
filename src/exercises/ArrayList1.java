package exercises;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Object>list =new ArrayList<>();
        list.add("Ali");
        list.add("Kazim");
        list.add(8);
        System.out.println(list);
        list.set(1, "Veli");
        list.add(2, 20);

        for(Object obj:list){
            System.out.print(" "+ obj);
        }
    }
}
