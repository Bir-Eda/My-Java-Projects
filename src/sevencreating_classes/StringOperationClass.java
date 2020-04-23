package sevencreating_classes;

public class StringOperationClass {
    String value;
    public StringOperationClass() {
        this.value = "";
    }
    public  StringOperationClass(String value) {
        this.value = value;
    }
    // return reverse
    public String returnReverse() {
        String result="";
        for (int i = this.value.length()-1; i >=0; i--) {
            result+= this.value.charAt(i);
        }
        return result;
    }
    public String returnCapitalized(){
        // first concat first letter and convert that letter to upper
        String result="";
        String firstLetter=""; // this variable for converting to string
        firstLetter+=this.value.charAt(0); // concat first letter with first char
        //System.out.println(result);
        result+=firstLetter.toUpperCase(); // concat first letter (upper case) and result
        //System.out.println(result);
        String letter="";
        for(int i=1; i<this.value.length(); i++){
            if(this.value.charAt(i-1)==' '){
                // chec previous char if it is space first convert to string using concat and then convert to upper
                letter+= this.value.charAt(i); // converting string
                letter=letter.toUpperCase(); // converting upper  and if you put letter+= her bas harfi tekrar yazar JJava gibi
                result+=letter; // concat to result
                letter=""; // reset for the second word
            }
            else{
                result+=this.value.charAt(i);
            }
        }
        return result;
    }
    // return sentence as array
    public String [] returnString(){
        String []result= new String[this.value.length()]; // empty array
        String letter;
        for(int i=0; i<this.value.length(); i++){
            letter=""+this.value.charAt(i);
            result[i]=letter;
            letter="";
        }
        return result;
    }
    // Java i s fun
    public String[] returnSentence() {
        this.value+=" ";
        int numberOfElement = 1;
        for (int i = 0; i < this.value.length(); i++) {
            if (this.value.charAt(i) == ' ') {//filter
                numberOfElement++;
            }
        }
        String words[] = new String[numberOfElement];
        String word="";
        int index=0;
        for(int i=0; i<this.value.length(); i++){
            if(this.value.charAt(i)!=' '){
                word+= this.value.charAt(i);
            }
            else{
                if(index<numberOfElement)
                words[index]=word;
                index++;
                word="";
                System.out.print(index);
            }
        }
        return words;
    }

    @Override
    public String toString() {
        return "StringOperationClass{" +
                "value='" + value + '\'' +
                '}';
    }
}