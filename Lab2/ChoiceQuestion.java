package Lab2;

import java.util.ArrayList;

public class ChoiceQuestion extends Question {

    private ArrayList<String> choices;

    public ChoiceQuestion(String question, String answer) {
        super(question, answer);
        choices = new ArrayList<String>();
    }
    public void addChoice(String choice,boolean correct){
        choices.add(choice);
        if(correct){
            //convert choices.size()
            String choiceString = "" + choices.size();
            setAnswer(choiceString);
        }
    }
    //this method overrides a method from the subclass
    public void display(){
        super.displayQuestion();

        //display question choices
        for(int i=0; i<choices.size();i++){
            int choiceNumber = i+1;
            System.out.println(choiceNumber + " : " + choices.get(i));
        }

    }
}
