package ocaquestionsvp;

public class Q47 {
    public static void main(String[] args) {

        String[] str = {"A", "B"};
      //  String[] str = new String[2];
        int idx = 0;
        for (String s : str) {
              str[idx].concat(" element " + idx);
            idx++;
        }
        for (idx = 0; idx < str.length; idx++) {
            System.out.println(str[idx]);

            // }
//        String name="Ali";
//        String name1="Cem";
//        String name2="Merve";
//                name.concat("HI"+"Vav"+name1);
//        System.out.println(name2);
        }
    }
}

