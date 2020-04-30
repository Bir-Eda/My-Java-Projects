package fifth_method_package;
import java.util.Scanner;
public class SelfishnessT {
    public static void main(String[] args) {
    evaluateSelfishness();
    }
    public static void evaluateSelfishness(){
        String questions[]={"Level your selfishness (0-10): ",
                            "You are the most important person is this world (0-10):",
                            "You never share (0-10):"};
        int answer[]= new int[questions.length];
        Scanner scan= new Scanner(System.in);
        for(int i=0; i<questions.length; i++){
            System.out.println(questions[i]);
            answer[i]= scan.nextInt();
        }
        //System.out.println(Arrays.toString(answer));
        int total=0;
        for(int score:answer){
            total+=score;
        }
        if(total<=10){
            System.out.println("Not selfis. You are awesome");
        }
        else if(total<=30){
            System.out.println("Selfish. It is ok!!");
        }
        else{
            System.out.println("Super selfish. Shame on you ");
        }
    }
}
