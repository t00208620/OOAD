package Lab2;

public class Question {
    private String question;
    private String answer;


    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;

    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public void displayQuestion(){
        System.out.println(question);
    }
    public boolean isCorrect(String response){
        return response.equals(answer);
    }
}
