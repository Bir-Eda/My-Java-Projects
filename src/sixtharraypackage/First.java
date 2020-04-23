package sixtharraypackage;

public class First {
    public static void main(String[] args) {

    int [] myArray= {12,34,69,25,36,71,98,13,42,52,75};
    int arrayLen=myArray.length;
    int half=arrayLen/2+1;
    int[]firstHalf= new int[half];
        for(int i=0; i<half; i++){
        firstHalf[i]=myArray[i];
    }
    int [] secondHalf=new int[arrayLen-half];
    int index=0;
        for(int i=half; i<myArray.length; i++){
        secondHalf[index]=myArray[i];
        index++;
    }
        System.out.println("First Half:");
        for(int i=0; i<firstHalf.length; i++){
        System.out.println(firstHalf[i]);
    }
        System.out.println("Second Half:");
        for(int i=0; i<secondHalf.length; i++){
        System.out.println(secondHalf[i]);
    }
}
}
