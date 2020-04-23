package sixtharraypackage;

public class ForEachLoopArr {
    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String arrayString[] = {"Hello", "Java", "It", "Is", "good"};

        for (int number : arrayInt) {
            System.out.print(number+"\n");
        }
        for (String word : arrayString) {
            System.out.print(word);
        }
        //int a = (1 > 3) ? 3 + 4 : 6 + 9;
    }
}
