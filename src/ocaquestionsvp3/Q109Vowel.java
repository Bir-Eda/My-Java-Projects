package ocaquestionsvp3;

public class Q109Vowel {
    private char var;

    public static void main(String[] args) {
        char var1='a';
        char var2=var1;
        var2='e';
        Q109Vowel obj1=new Q109Vowel();
        Q109Vowel obj2=obj1;
        obj1.var='o';
        obj2.var='i';  // var`in degeri i oldugu icin i yazacak
        System.out.println(var1+", "+var2);
        System.out.println(obj1.var+", "+obj2.var);
    }
}
