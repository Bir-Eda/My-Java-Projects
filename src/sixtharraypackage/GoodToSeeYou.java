package sixtharraypackage;

public class GoodToSeeYou {
    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 3, 4, 5, 6, 7};
        String arrString[] = {"hello", "java", "good", "to", "see", "you"};

        for (int number : arrayInt) {
            System.out.println(number);
        }
        for (String word : arrString) {
            System.out.print(word);
        }
        int a=(1>3)? 3+4: 6+9;  //condition ?, if :, else;
    }
}
