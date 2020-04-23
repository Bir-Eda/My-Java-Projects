package sixtharraypackage;

public class StringDeneme {
    public static String wordGen(){
        String word="";
        int wordL=(int)(Math.random()*5+1);
        for(int i=0; i<wordL; i++){
            word+=(char)(int)((Math.random()*26+97));

        }
        return word;
    }
    public static void main(String[] args) {
        String randomArr[][]=new String[3][7];
        for(int i=0; i<randomArr.length; i++){
            for(int k=0; k<randomArr[i].length; k++){
                randomArr[i][k]=wordGen();
                System.out.print(randomArr[i][k]+" ");
            }
            System.out.println();

        }
    }
}
