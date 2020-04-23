package reviewpackage;

public class Duplicate {
    public static void main(String[] args) {
        String myArray[]={"abc", "bef", "cde", "abc", "ddd","cde"};
        printDuplicate(myArray);
    }
    public static void printDuplicate(String []array){

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){

                if(array [j].equals(array[i])){

                    System.out.println(array[j]);
                }
            }

                }
    }
}

