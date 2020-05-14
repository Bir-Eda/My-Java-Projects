package finalreview;

public class StringClass {
    public static void main(String[] args) {
        String a="abc";
        String b="abc";
        System.out.println(a==b); // true or false
        String c= new String("abc");
        Object d= new String("abc");
        System.out.println(c==d); // true or false ama burada false cikacak cunku iki yeni object creat ettigimiz icin ikisini de ayri ayri gorecek.

        System.out.println(c.equals(d));
        System.out.println("abc".compareTo("def"));
        System.out.println(10+10);
        System.out.println("10"+10);
        System.out.println(""+10+10);
        System.out.println('0'+'0');


    }
}
