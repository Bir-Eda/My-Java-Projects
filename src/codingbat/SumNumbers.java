package codingbat;

public class SumNumbers {
    public static void main(String[] args) {
        System.out.println(sumNumbers("abc123xyz"));
        System.out.println(sumNumbers("aa11b33"));
        System.out.println(sumNumbers("7 11"));
    }
    public static int sumNumbers(String str) {
        String temp="";
        int len=str.length();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (Character.isDigit(str.charAt(i))) {
                if(i<len-1 && Character.isDigit(str.charAt(i+1))){
                    temp=temp+str.charAt(i);
                }
                else{
                    temp+=str.charAt(i);
                    sum=sum+Integer.parseInt(temp);
                    temp="";
                }
            }
        }
        return sum;
    }
}
