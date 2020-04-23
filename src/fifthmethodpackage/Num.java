package fifthmethodpackage;

public class Num {
    public static void printNL() {
        for (int i = 1; i < 5; i++) {
            System.out.print(i + "\t");
            for (char j = 97; j < 102; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printNL();
    }

}
