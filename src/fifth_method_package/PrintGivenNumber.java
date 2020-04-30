package fifth_method_package;

public class PrintGivenNumber {
    public static void numberPrint(int number){
        for(int i=1; i<=3; i++){
            for(int j=0; j<5; j++){
                System.out.print(number+"\t");
                number++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        numberPrint(1);
    }

}
