package twentyjavastringprocessingrecursionpackage;

public class Alphabet {
    public static void main(String[] args) {
        System.out.println(addEnd("abcdefgh"));

    }
    public static StringBuilder addEnd(String arr){
      StringBuilder str= new StringBuilder(arr);
      for(int i=0; i<str.length(); i++){
          str.setCharAt(i, (char)(str.codePointAt(i)+3));
      }
      return str;
    }

}
