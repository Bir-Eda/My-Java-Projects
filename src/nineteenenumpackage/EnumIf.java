package nineteenenumpackage;

public class EnumIf {
    public enum season {
        June,
        March,
        December,
        September,


    }

    public static void main(String[] args) {
        season myEnum = season.June;
        if (myEnum == season.June) {
            System.out.println("Summer time");
        } else if (myEnum == season.March) {
            System.out.println("Welcome Spring");
        } else if (myEnum == season.December) {
            System.out.println("Snow time");
        } else {
            System.out.println("Fall leaves");
        }
    }
}
