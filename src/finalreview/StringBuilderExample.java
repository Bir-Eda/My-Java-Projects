package finalreview;

public class StringBuilderExample {
    public static void main(String[] args) {
        String x="w";
        StringBuilder builder=new StringBuilder("abcdefg");
        builder.setCharAt(0, 'z');
        System.out.println(builder);
        builder.delete(0, builder.length());
        System.out.println(builder);
        builder.append(x);
        System.out.println(builder);
        builder=new StringBuilder(x);
    }
}
