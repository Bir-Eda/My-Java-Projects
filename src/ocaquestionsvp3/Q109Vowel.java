package ocaquestionsvp3;

public class Q109Vowel {
    private char var;

    public static void main(String[] args) {
        char var1='a';
        char var2=var1; // var2 nin degeri a oldu
        var2='e';  // son hali e oldugu icin onu aliriz

        Q109Vowel obj1=new Q109Vowel();
        Q109Vowel obj2=obj1;  // obj2 yi onb 1 e atadigi icin obj1 in degeri obj2 nin degeri olur gosterir
        Q109Vowel obj3=obj1;
        obj1.var='o';
        obj2.var='i';  // var`in degeri i oldugu icin i yazacak
        obj3.var= 'u';  // obj3 u obj1 e esitledigi icin en son obj3 e  verdigimiz degeri gosterecek

        System.out.println(var1+", "+var2);
        System.out.println(obj1.var+", "+obj2.var+", "+obj3.var);
    }
}
