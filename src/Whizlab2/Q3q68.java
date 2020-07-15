package Whizlab2;

public class Q3q68 {
    public static void main(String[] args) {
        char[]chars={'1','z','o','8','1'};
        StringBuilder sb=new StringBuilder();
        sb.append(chars,0,chars.length-1);
       // System.out.println(sb);
        sb.append('o');
        sb.append("8");
        System.out.println(sb);
    }
}
