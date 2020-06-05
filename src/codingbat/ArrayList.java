package codingbat;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Integer> ints=new java.util.ArrayList<>();
        ints.add(1);
        ints.add(3);
        ints.add(4);
        ints.add(2,3);
        System.out.println(ints);
        ints.removeIf(e->e<3);
        System.out.println(ints);

    }
}
