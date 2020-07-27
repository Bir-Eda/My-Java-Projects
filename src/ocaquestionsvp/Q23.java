package ocaquestionsvp;

public class Q23 {
    public static void main(String[] args) {
        int[] stack = {10, 20, 30};
        int size = 3;
        int idx = 0;

        do {
            idx++;
            System.out.println(idx);
        }

        while (idx < size - 1);
        System.out.println(idx);
        System.out.println("Top element: "+stack[idx]);
}
}


