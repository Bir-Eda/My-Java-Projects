package nineteenenumpackage;

public class Enum {
    public enum Levels {
        TOP, MEDIUM(10), BOTTOM(20,30);
        int i, j;

        private Levels() {

        }

        private Levels(int i){

    }
    private Levels(int i, int j) {
        this.i = i;
        this.j = j;
    }
    }

    public static void main(String[] args) {
        System.out.println(Levels.TOP.i);
        System.out.println(Levels.TOP.j);


    }
}
