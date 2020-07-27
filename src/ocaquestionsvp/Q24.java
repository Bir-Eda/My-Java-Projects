package ocaquestionsvp;

public class Q24 {
    public static void main(String[] args) {
        String []str=new String[2]; // String degeri null, nullu concat yapamaz

        int idx=0;

        for(String s:str){
          str[idx].concat("element"+idx);
           idx++;

        }
        for(idx=0; idx<str.length; idx++){
            System.out.println(str[idx]);
        }


//        String name=null;
//        String nm="Cem";
//
//        String result=name.concat(nm);
//        System.out.println(result);
    }
}
