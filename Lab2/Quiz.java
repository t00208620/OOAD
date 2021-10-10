package Lab2;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Question q1 = new Question("What year was Java made? ", "1995");
        Question q2 = new Question("What is the capital of Ireland? ", "Dublin");
        Question q3 = new Question("Who made created JavaScript? ", "Brendan Eich");

        q1.displayQuestion();
        String answer = input.next();
        q1.isCorrect(answer);

        if(q1.isCorrect(answer)){
            System.out.println("Correct Answer");
        }else
        {
            System.out.println("Incorrect answer");
        }


    }
}
