package twentyonequeuepackage;

import java.util.Stack;

public class StackBooleanBalance {
    public static void main(String[] args) {
        curlyBraceBalanced("{{{{}}}}");
    }
    public static boolean curlyBraceBalanced(String braces) {
        Stack<Character> curlies  = new Stack<Character>();
        for(int i = 0; i < braces.length(); i++) {
            curlies.push(braces.charAt(i));
        }
        System.out.println(curlies);
        int numberOfOpen=0;
        int numberOfClose=0;
        char ch;
        for(int i=0; i<braces.length(); i++){
            ch=curlies.pop();
            if (ch=='{'){
                numberOfOpen++;
            }
            else {
                numberOfClose++;
            }
        }
        if(numberOfOpen==numberOfClose){
            return true;
        }
        else{
            return false;
        }

    }
    }
/*public static boolean isBalanced(String input){
        while(input.length() != (input = input.replaceAll("\\{\\}", "")).length());

        return (input.isEmpty());
    }
 */