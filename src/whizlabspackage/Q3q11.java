package whizlabspackage;

public class Q3q11 {
    public static void main(String[] args) {
        String s="AB";
        String ss="";
        //System.out.println(ss.length());
        if(ss.length()!=0) // if curly braces yoksa bir alt sirayi okumaz ondan sonrakileri okur
            ss+="C";
            ss+="D";
            s+=ss;
        System.out.println(s);

    }
}
