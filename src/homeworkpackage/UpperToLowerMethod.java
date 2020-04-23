package homeworkpackage;

public class UpperToLowerMethod {
    public static void main(String[] args) {
    upperToLower();
    lowerToUpper();

    }
    public static void upperToLower(){
        String sentence="Java is fun";
        char cha[]=sentence.toCharArray();
        int size=cha.length;
       int i=1;
       while(i!=size){
           if(cha[i]!=' '){
               cha[i]=(char)(cha[i]-32);
           }
           ++i;
        }
        System.out.println(sentence.toUpperCase());
        System.out.println(cha);
    }
    public static void lowerToUpper(){
        String words="HAPPY BIRTHDAY TO YOU";
        char chr[]=words.toCharArray();
        int len=chr.length;
        int i=0;
        while(i!=len){
            if(chr[i]!=' '){
                chr[i]=(char)(chr[i]-32);
            }
            i++;
        }
        System.out.println(words.toLowerCase());
    }
}
