package secondifstatementspackage;
    import java.util.Scanner;
    public class CalculateAreaOfRectangle {
        public static void main(String[]args){
            System.out.println("What is the lenght?");
            Scanner inp = new Scanner(System.in);
            int lenght = inp.nextInt();

            System.out.println("What is the height?");
            int height = inp.nextInt();

            float area = lenght * height;
            System.out.println("The area of the regtangle is :" + area);
        }
    }
