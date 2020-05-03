package twentyjavastringprocessingrecursionpackage;

public class NumberOfWords {
    public static void main(String[] args) {
        System.out.println(countLetter("saveChangesInTheEditor"));
    }

    public static int countLetter(String s) {
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) count++;
        }
        return count;
    }
}
