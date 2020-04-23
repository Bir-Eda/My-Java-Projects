package fourthloopspackage;

public class StringNumbersLoopHex {
    public static void main(String[] args) {
        String number="1241D343F";
        boolean hex=false;
        for(int i=0; i<9; i++) {
            if (number.charAt(i) == 'A' || number.charAt(i) == 'D') {
                hex = true;
            } else {
                hex = false;
            }
        }
        if(hex){
            System.out.println("Hexadecimal");
        }
        else{
            System.out.println("Not Hexademical");
        }

    }
}
