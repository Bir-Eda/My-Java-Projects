package twentyonequeuepackage;

import java.util.Stack;

public class StackSecond {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("Java");
        stack.push("is");
        stack.push("fun");
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }

    }
