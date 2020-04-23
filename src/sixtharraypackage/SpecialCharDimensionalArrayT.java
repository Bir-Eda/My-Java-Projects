package sixtharraypackage;

public class SpecialCharDimensionalArrayT {
    public static void main(String[] args) {
        char []myChar={'T','o','d','a','y','\0' ,'i' , 's','\0' , 'f','u','n','d','a','y','\1'};
        System.out.println(countNumberOfChar(myChar));
    }
    public static int countNumberOfChar(char[]fileArray){
        int numberOfChars=0;
        for(int i=0; i<fileArray.length; i++){
            if(fileArray[i]!='\0'||fileArray[i]!='\1'){
                numberOfChars++;
            }

        }
        return numberOfChars;

    }
}
