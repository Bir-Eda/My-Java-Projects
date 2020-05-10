package projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstProjectSurveyPreparing {
    public List<FirstProjectSurveyQuestions> prepSurvey(int number) {
        List<FirstProjectSurveyQuestions> survey = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        String question;
        String question1;
        String question2;
        String question3;

        for(int i=0; i<number; i++){
            System.out.print("Write your question? ");
            question=scanner.nextLine();
            System.out.print("Option1: ");
            question1=scanner.nextLine();
            System.out.print("Option2: ");
            question2=scanner.nextLine();
            System.out.print("Option3: ");
            question3=scanner.nextLine();
            survey.add(new FirstProjectSurveyQuestions(question,question1,question2,question3));

        }
        System.out.println(survey.toString());
        return survey;

    }
    public static void startSurvey(List<FirstProjectSurveyQuestions>survey){
        List<String> answers=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        String answer;
        for(FirstProjectSurveyQuestions sr: survey){
            System.out.println(sr.getQuestion());
            System.out.print("a)" +sr.getOption1()+"\t");
            System.out.print("b)"+ sr.getOption2()+"\t");
            System.out.print("c"+ sr.getOption3()+"\t");
            answer=scanner.next();
            answers.add(answer);
        }
        System.out.println(answers);
    }
}
