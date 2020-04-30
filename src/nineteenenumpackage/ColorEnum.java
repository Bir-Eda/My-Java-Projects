package nineteenenumpackage;

import java.util.Arrays;

public class ColorEnum {
    public enum color {
        Maroon(155, 200, 180),
        Teal(10, 230, 50),
        Zero_Gravity(10, 20, 30);
        private int red;
        private int green;
        private int blue;


        color(final int red, final int green, final int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        public int red() {
            return this.red;
        }

        public int green() {
            return this.green;
        }

        public int blue() {
            return this.blue;
        }

        public int[] colors() {
            int allColors[] = new int[3];
            allColors[0] = this.blue;
            allColors[1] = this.green;
            allColors[2] = this.red;
            return allColors;
        }
    }

    public static void main(String[] args) {
        color mycolor= color.Maroon;
        System.out.println(Arrays.toString(mycolor.colors()));
    }
}
