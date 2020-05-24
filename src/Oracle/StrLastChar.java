package Oracle;

public class StrLastChar {
    public static void main(String[] args) {
        System.out.println(lastChar("Last", "chars"));
    }
    public static String lastChar(String a, String b){
    if(a.length()>0){
        a=a.substring(0,1);
    }else{
        a="@";
    }if(b.length()>0){
        b=b.substring(b.length()-1);
    }
else{
        b="@";
    }
return a+b;
}
    }

