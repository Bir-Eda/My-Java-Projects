package twentyjavastringprocessingrecursionpackage;

public class NumberAsStringWithoutZeroSecond {
    public static void main(String[] args) {
        String number="230.00";
        System.out.println(removeZero(number));
    }
        public static double removeZero(String n){
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i)!= 0) break;
            sb.deleteCharAt(i);
        }
        for (int i = sb.length() - 1; i > 0; i--) {
            if (sb.charAt(i) != 0) break;
            sb.deleteCharAt(i);
        }
        return Double.parseDouble(sb.toString());
    }
}










