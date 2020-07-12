package ocaquestionsvp3;

public class Q115 {
    public static void main(String[] args) {
        String str1="Java";
        String []str2={"J", "a", "v", "a"};
        String str3="";
        for(String str:str2) {
            str3 = str3 + str;
        }
        System.out.println(str3);
            boolean b1=(str1.equals(str3));
            boolean b2=(str1==str3);
       // System.out.println(b1+",  "+b2);


    }
//        String obj6=new String("Java");
//        String obj7=new String("Java");
//        System.out.println(obj6.equals(obj7));
//        System.out.println(obj6==obj7);


//        System.out.println(str1.equals(str3));
//        System.out.println(str1==str3);

//        for(String str:str2){
//            str3=str3+str;
//            //System.out.println(str3);
//        }
       // System.out.println(str3);
//        boolean b1=(str1.equals(str3));
//        boolean b2=(str1==str3);
//        System.out.println(b1+",  "+b2); // bi ve b2 farkli esitliklere bakiyor
    }
