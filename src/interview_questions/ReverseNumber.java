package interview_questions;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=8251;
        StringBuilder sb= new StringBuilder();
        sb.append(num);
        System.out.println(sb.reverse());


        int numSecond=12345;
        StringBuffer sbuff= new StringBuffer(String.valueOf(numSecond));
        System.out.println(sbuff.reverse());


        String text="Birsen";
        StringBuilder sbl=new StringBuilder();
        sbl.append(text);
        System.out.println(sbl.reverse());



    }

}
