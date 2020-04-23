package sixtharraypackage;

public class Color {public static void main(String[] args) {
    String[] color = {"blue", "pink", "white"};
    System.out.println(color[0]);

    System.out.println("--------\n");
    String city[] = {"Boston", "Atlanta", "Miami"};
    for (int i = 0; i < city.length; i++) {
        System.out.println(city[i]);
    }
    for (int i= city.length - 1; i >= 0; i--) {
        System.out.println(city[i]);
    }
}
}
