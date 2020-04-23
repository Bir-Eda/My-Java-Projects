package reviewpackage;

public class MethodDecideOrReject {
    public static void main(String[] args) {
        decideOrAcceptReject("Why All Schools are Holiday?");
    }

        public static void decideOrAcceptReject(String sentence){
            int num=0;
            for(int i=0; i<sentence.length(); i++) {
                if (sentence.charAt(i) >= 65 && sentence.charAt(i) <= 90) {
                    num++;
                }
            }
            System.out.println(num);

                if(num>4){
                    System.out.println("Ok");
                }
                else{
                    System.out.println("Sorry");
                }
            }

    }