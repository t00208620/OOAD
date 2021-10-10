package Lab2;

import java.util.Scanner;

public class ChoiceQuestionDriver {
    private static int score;
    public static void main(String[] args) {


        ChoiceQuestion cq1 = new ChoiceQuestion("What is the capital of Ireland", "Dublin");
        cq1.addChoice("Rome",false);
        cq1.addChoice("Paris",false);
        cq1.addChoice("London",false);
        cq1.addChoice("Dublin",true);

        presentQuestion(cq1);


        ChoiceQuestion cq2 = new ChoiceQuestion("What is the capital of Canada", "Ottawa");
        cq2.addChoice("Toronto",false);
        cq2.addChoice("Halifax",false);
        cq2.addChoice("Ottawa",true);
        cq2.addChoice("Vancouver",false);

        presentQuestion(cq2);

        Scanner input = new Scanner(System.in);
        Question q3 = new Question("What year was Java made? ", "1995");

        presentQuestion(q3);
        String answer = input.next();
        q3.isCorrect(answer);



    }
    public static void presentQuestion(ChoiceQuestion q){
        q.display();
        System.out.println("Your answer: ");
        Scanner input = new Scanner(System.in);
        String response = input.next();


        if(q.isCorrect(response)){
            score++;
        }

        System.out.println(q.isCorrect(response));
    }

    public static void presentQuestion(Question q){
        q.displayQuestion();
        System.out.println("Your answer: ");
        Scanner input = new Scanner(System.in);
        String response = input.next();


        if(q.isCorrect(response)){
            score++;
        }

        System.out.println(q.isCorrect(response) + "Your score was " + score);
    }
}