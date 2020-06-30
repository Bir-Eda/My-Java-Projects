package ocaquestionsvp3;

public class Q102 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java"); // toString() kullanmak zorundayiz
        String s="Java";

        if(sb.toString().equals(s.toString())){
            System.out.println("Match 1");
        }
        else if(sb.equals(s)){
            System.out.println("Match 2");
        }
        else{
            System.out.println("No Match");
        }
    }
}
// stringbuilderin ozelligi referans variable`a bakar
//== ve .equals da referansa bakar ()
// stringbuilderin kendisi objecttir
// sb ise referanstir
// String content(icerik) olarak javaya bakar
// sb`yi toString ole contente bakacak hale getirmis