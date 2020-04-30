package nineteenenumpackage;

public class EnumSecondExample {
    public static void main(String[] args) {
        Level myEnum = Level.WINTER;
        Level myEnum2 = Level.SPRING;
        Level myEnum3 = Level.SUMMER;
        Level myEnum4 = Level.AUTUMN;
        System.out.println(myEnum);
        System.out.println(myEnum2);
        System.out.println(myEnum3);
        System.out.println(myEnum4);
    }
    enum Level{
        WINTER,
        SPRING,
        SUMMER,
        AUTUMN,

    }
}
