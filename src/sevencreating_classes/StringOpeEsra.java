package sevencreating_classes;

public class StringOpeEsra {
    String value;
    public StringOpeEsra(String value) {
        this.value=value;
    }
    public String reverse(String value){
        String newA=" ";
        for(int i=value.length()-1; i>=0; i--){
            newA+=value.charAt(i);
        }
        return newA;
    }
    public char firstCapital(String value){
        String newVal=value.toUpperCase();
        char newWord=newVal.charAt(0);
        return newWord;
    }
    public String returnStringArray(String value){
        String [] newArr=new String [value.length()];
        for(int i=0; i< value.length(); i++){
            newArr[i]+=value.charAt(i);
        }
        for(String letter:newArr){
            System.out.print(letter);
        }
        return value;
    }

}
