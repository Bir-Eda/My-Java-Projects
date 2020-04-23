package homeworkpackage;

public class FirstLetterConvertUpperCase {
    public static void main(String[] args) {
        String sentence="everything is good even perfect";
        char chr[]=sentence.toCharArray();
        int len=chr.length;
        chr[0]=(char)(chr[0]-32);
        int i=1;
        while(i!=len){
            if(chr[i]==' '){
                chr[i+1]=(char)(chr[i+1]-32);
            }
            i++;
        }
        System.out.println(sentence);
        System.out.println(chr);
    }
}