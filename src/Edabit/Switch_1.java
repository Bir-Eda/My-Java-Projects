package Edabit;

public class Switch_1 {
    public static void main(String[] args) {
        char ch='p';
        switch(ch){
            case 'a':
            case 'e':
            case 'o':
            case 'u':
            case 'i':
                System.out.println(ch+" is vowel");
                break;
            default:
                System.out.println(ch+" is consonant");
                break;
        }
    }
}
