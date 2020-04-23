package fifthmethodpackage;
import java.util.Scanner;
public class Selfishness {
        public static void main(String[] args) {
            surveyApplications();
        }
        public static void surveyApplications(){
            String [] surveyQuestions = {"How perfect you are 1-10",
                    "I am not listen others 1-10",
                    "I am not help others 1-10",
                    "I am not care others 1-10"};
            int [] answer = new int [surveyQuestions.length];
            Scanner scanner = new Scanner(System.in);
            int answers;
            for (int i = 0; i <surveyQuestions.length ; i++) {
                System.out.println(surveyQuestions[i]);
                answers = scanner.nextInt();
                if(answers<11 && answers>0){
                    answer[i]=answers;
                }
                else {
                    System.out.println("Please between 1-10");
                }
            }
            int score=0;
            for(int answerOne:answer){
                score = score+answerOne;
            }
            System.out.println("Your selfishness score is : "+ score);
            if(score<11){
                System.out.println("You are not selfish");
            }
            else if(score<31){
                System.out.println("You are selfish");
            }
            else{
                System.out.println("You are super selfish");
            }
        }
    }