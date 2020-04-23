package sixtharraypackage;

public class Elements {
    public static void main(String[] args) {
        String words[]={"abvcgd", "ksh","kj","idhen", "n","ve"};
        int counter=0;
        for(int i=0; i<words.length; i++){
            if(words[i].length()<4){
               counter++;
                System.out.println(words[i]);
            }

        }
        System.out.println(counter);

    }
}
