package sevencreating_classes;

public class DesignACipher {
    String name;
    int number;
    DesignACipher(String name, int number){
        this.name=name;
        this.number=number;
    }
    DesignACipher(){
        this.name="eda";
        this.number=1;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumber(){
        return number;
    }
   // getName yapmadik cunku numberi kaybetmek istemiyoruz
    public String cipherText(){
        String result="";
        char letter;
        for(int i=0; i<this.name.length(); i++) {
            letter = this.name.charAt(i);
            letter +=this.number;
            result+=letter;
        }
        return result;
        }
        public String deCipherText(){
            String result="";
            char letter;
            for(int i=0; i<this.name.length(); i++){
                letter=this.name.charAt(i);
                letter-=this.number;
                letter+=letter;

            }
            return result;
        }
    }
