package fifth_method_package;

public class Try3Numbers {
    public static void numbers() {
        int number = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(number + "\t");
                number++;
            }
            System.out.println();
        }
    }

    public static void numbers2() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "\t");
            for (char j = 97; j < 102; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
    public static void whileNumber(){
        int x = 1;
        while (x <= 5) {
            System.out.print(x + "\t");
            for (char j = 97; j < 102; j++) {
                System.out.print(j + "\t");
            }
            x=x+1;
            System.out.println();
        }


    }
    public static void main (String[]args){
        numbers();
        numbers2();
        whileNumber();
    }
}
