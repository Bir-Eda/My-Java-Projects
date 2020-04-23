package sixtharraypackage;

public class NoSpace {
    public static String noSpace(String space) {
        String result = "";
        for (int i = 0; i < space.length(); i++) {
            if (space.charAt(i) != ' ') {
                result += space.charAt(i);
            } else{
                result += '-';
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println(noSpace("Today we are Java warrious"));
    }
}
